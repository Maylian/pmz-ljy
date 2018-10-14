import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PARA_NIBP {

    private byte NIBP_FrameHeader = ConstantValue.Frame_Header;
    private byte SBP_D7;//收缩压
    private byte SBP_G2;
    private byte DBP_D7;//舒张压
    private byte DBP_G2;
    private byte MAP_D7;//平均动脉压=（收缩+2*舒张）/3
    private byte MAP_G2;
    private int SBP;
    private int DBP;
    private int MAP;

    private byte PRE_G8;//压力数据高8
    private byte PRE_D8;//压力数据低8
    private int PRE;
    private byte MSU_time_G8;//自动测量 测量时间高8位
    private byte MSU_time_D8;
    private int MSU_time;
    private byte NextMSU_G7;//下一次测量时间高7位
    private byte NextMSU_D7;
    private int NextMSU;


    public float NIBP_Wave;

    public void setNIBP_FrameHeader(byte NIBP_FrameHeader)
    {
        this.NIBP_FrameHeader = NIBP_FrameHeader;
    }
    public byte getNIBP_FrameHeader()
    {
        return NIBP_FrameHeader;
    }

    public void setPRE(int PRE)
    {
        this.PRE = PRE;
    }
    public int getPRE()
    {
        return PRE;
    }

    public void setSBP(int SBP)
    {
        this.SBP = SBP;
    }
    public int getSBP()
    {
        return SBP;
    }

    public void setMAP(int MAP)
    {
        this.MAP = MAP;
    }
    public int getMAP()
    {
        return MAP;
    }

    public void setDBP(int DBP)
    {
        this.DBP = DBP;
    }
    public int getDBP()
    {
        return DBP;
    }


    public PARA_NIBP(byte data[])
    {
        ConstantValue.flag = 1;
       // System.out.println("--开始NIBP");
        switch (data[3])
        {
            case 0x31:
                this.MSU_time_G8 = data[7];
                this.MSU_time_D8 = data[8];
                System.out.println(" 测量时间 : "+MSU_time_G8+":"+MSU_time_D8);
 //血压测量参数帧
            case 0x32:
            //    Serial_Port serial_port = new Serial_Port();
            //    serial_port.Return_Upframe(data); //上行应答
                /*switch (data[4])
                {
                    case 0x00:
                        System.out.println("正常"); break;
                    case 0x01:
                        System.out.println("预留"); break;
                    case 0x02:
                        System.out.println("自检失败"); break;
                    case 0x03:
                        System.out.println("软件过压"); break;
                    case 0x04:
                        System.out.println("袖带类型错误"); break;
                    case 0x05:
                        System.out.println("起始压力过高"); break;
                    case 0x06:
                        System.out.println("袖带松"); break;
                    case 0x07:
                        System.out.println("漏气"); break;
                    case 0x08:
                        System.out.println("气压错"); break;
                    case 0x09:
                        System.out.println("信号弱"); break;
                    case 0x0A:
                        System.out.println("超出测量范围"); break;
                    case 0x0B:
                        System.out.println("信号干扰"); break;
                    case 0x0C:
                        System.out.println("辅助过压警告"); break;
                    case 0x0D:
                        System.out.println("系统失败"); break;
                    case 0x0E:
                        System.out.println("测量超时"); break;
                    default:
                        break;
                }*/
                this.SBP_D7 = data[5]; System.out.println("--------收缩压_D7 "+SBP_D7);
                this.MAP_D7 = data[6]; System.out.println("--------平均压_D7 "+MAP_D7);
                this.DBP_D7 = data[7]; System.out.println("--------舒张压_D7 "+DBP_D7);
                this.SBP_G2 = (byte) (data[8] & 0x03); System.out.println("--------收缩压_G2 "+SBP_G2);
                this.MAP_G2 = (byte) ((data[8] & 0x0c) >> 2); System.out.println("--------平均压_G2 "+MAP_G2);
                this.DBP_G2 = (byte) ((data[8] & 0x30) >> 4); System.out.println("--------舒张压_G2 "+DBP_G2);
               // this.SBP = ((SBP_G2 & 0xFF) << 7) | SBP_D7;
               // this.MAP = ((MAP_G2 & 0xFF) << 5) | MAP_D7;
               // this.DBP = ((DBP_G2 & 0xFF) << 3) | DBP_D7;
                this.SBP = (((data[8] & 0x03) << 7) | data[5]);
                this.MAP = (((data[8] & 0x0c) << 5) | data[6]);
                this.DBP = (((data[8] & 0x30) << 3) | data[7]);
                System.out.println("  收缩压 =  "+SBP+"   平均压 =  "+MAP+"   舒张压 =  "+DBP);

                this.NextMSU_D7 = (byte) (data[11] & 0xFF);
                this.NextMSU_G7 = (byte) (data[12] & 0xFF);
                this.NextMSU = ((NextMSU_G7 & 0xFF) << 7) | ( NextMSU_D7 & 0xFF);

            case 0x33:  //压力数据帧
            //    this.PRE_G8 = data[4]; System.out.print("--------PRE_G8 "+PRE_G8+"   "+"  PREG_16 "+Integer.toHexString(data[4])+"   "+data[4]);
                this.PRE =  ((data[4] & 0xFF) << 8)            //    this.PRE_D8 = data[5]; System.out.print("--------PRE_D8 "+PRE_D8+"   "+"  PRED_16 "+Integer.toHexString(data[5])+"   "+data[5]);
                        | (data[5] & 0xFF);
             //   System.out.println("  袖带压 = "+PRE);

                default:break;

        }
    }
}
