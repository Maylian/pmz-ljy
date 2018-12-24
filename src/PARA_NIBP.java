import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class PARA_NIBP {

    private byte NIBP_FrameHeader = ConstantValue.Frame_Header;
    private byte SBP_D7;//收缩压
    private byte DBP_D7;//舒张压
    private byte MAP_D7;//平均动脉压=（收缩+2*舒张）/3

    private int SBP;
    private int DBP;
    private int MAP;
    private byte SBP_G2;
    private byte DBP_G2;
    private byte MAP_G2;

    private byte PRE_G8;//压力数据高8
    private byte PRE_D8;//压力数据低8
    private int PRE;

    private byte MSU_time_G8;//自动测量 测量时间高8位
    private byte MSU_time_D8;
    private int MSU_time;
    private byte NextMSU_G7;//下一次测量时间高7位
    private byte NextMSU_D7;
    private int NextMSU;

    private int MSU_mode; //测量模式
    private byte G2;//三个的高两位

    private byte YCH;//异常信息


    public float NIBP_Wave;

    public void setNIBP_FrameHeader(byte NIBP_FrameHeader)
    {
        this.NIBP_FrameHeader = NIBP_FrameHeader;
    }
    public byte getNIBP_FrameHeader()
    {
        return NIBP_FrameHeader;
    }

    public int getPRE()
    {
        return PRE;
    }
    public int getSBP()
    {
        return SBP;
    }
    public int getMAP()
    {
        return MAP;
    }
    public int getDBP()
    {
        return DBP;
    }
    public int getMSU_mode()
    {
        return MSU_mode;
    }


    public PARA_NIBP(ArrayList list)
    {
      /*  ConstantValue.flag = 1;
       // System.out.println("--开始NIBP");
       */

        switch ((byte)(list.get(3)))
        {
            case 0x31:
                this.MSU_mode = ((byte)list.get(5)&0x03);
                ConstantValue.nibp_flag = 1;
                break;
            case 0x32:
                this.YCH = (byte)list.get(4);
                System.out.println("********"+YCH);
                /*if (YCH == 0) System.out.println("-----正常");
                else if (YCH == 2) System.out.println("-----自检失败");
                else if (YCH == 3) System.out.println("-----软件过压");
                else if (YCH == 4) System.out.println("-----袖带类型错误");
                else if (YCH == 6) System.out.println("-----袖带松或没接");
                else if (YCH == 7) System.out.println("-----漏气");
                else if (YCH == 8) System.out.println("-----气压错");
                else if (YCH == 9) System.out.println("-----信号弱");
                else if (YCH == 10) System.out.println("-----超出测量范围弱");*/
                this.SBP_D7 = (byte)list.get(5);
                this.G2 = (byte)list.get(8);
                this.SBP = ((G2&0x03) << 7) | SBP_D7;
                this.MAP_D7 = (byte)list.get(6);
                this.MAP = ((G2&0x0C) << 5) | MAP_D7;
                this.DBP_D7 = (byte)list.get(7);
                this.DBP = ((G2&0x30) << 3) | DBP_D7;
                //  this.SBP = (((byte)list.get(8)&0x03) << 7)|((byte)list.get(5)&0x7F);
                //  this.MAP = (((byte)list.get(8)&0x0C) << 5)|((byte)list.get(6)&0x7F);
                //   this.DBP = (((byte)list.get(8)&0x30) << 3)|((byte)list.get(7)&0x7F);
                System.out.println(" -------------------------收缩压 = "+SBP+"   平均压 = "+MAP+"   舒张压 = "+DBP);
                System.out.println(Integer.toHexString((byte)list.get(0))+" "+Integer.toHexString((byte)list.get(1))+" "+Integer.toHexString((byte)list.get(2))+" "+Integer.toHexString((byte)list.get(3))+" "+Integer.toHexString((byte)list.get(4))+" "+Integer.toHexString((byte)list.get(5))+" "+Integer.toHexString((byte)list.get(6))+" "+Integer.toHexString((byte)list.get(7))+" "+Integer.toHexString((byte)list.get(8))+" "+Integer.toHexString((byte)list.get(9))+" "+Integer.toHexString((byte)list.get(10))+" "+Integer.toHexString((byte)list.get(11))+" "+Integer.toHexString((byte)list.get(12))+" "+Integer.toHexString((byte)list.get(13)));
                ConstantValue.nibp_flag = 2;
                break;
            case 0x33:
                this.PRE_G8 = (byte)list.get(4);
                this.PRE_D8 = (byte)list.get(5);
                this.PRE = (((PRE_G8&0xFF) << 8) | PRE_D8&0xFF);
              //  System.out.println("PRE = "+PRE);
                ConstantValue.nibp_flag = 3;
                break;
            case 0x37:
                System.out.println("参数异常反馈帧");
                System.out.println(Integer.toHexString((byte)list.get(0))+" "+Integer.toHexString((byte)list.get(1))+" "+Integer.toHexString((byte)list.get(2))+" "+Integer.toHexString((byte)list.get(3))+" "+Integer.toHexString((byte)list.get(4))+" "+Integer.toHexString((byte)list.get(5)));
                ConstantValue.nibp_flag = 6;
                break;
            default:
                ConstantValue.nibp_flag = 4;
                break;
        }
    }
}
