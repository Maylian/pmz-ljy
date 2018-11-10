import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class PARA_TEMP {

 //   private static final byte Frame_Header = Test.FRAME_Header;

    private int BT1; //通道1温度
    private int BT2;


    private byte T1_ProType; //体温1探头类型
    private byte T2_ProType;
    private byte T1_StaMsg; //体温1的状态信息
    private byte T2_StaMsg;

    public void setBT1(int BT1)
    {
        this.BT1 = BT1;
    }
    public double getBT1()
    {
        if(BT1 == 600)
            return 0.0;
        else
            return (BT1/10.0);
    }
    public double getBT2()
    {
        if(BT2 == 600)
            return 0.0;
        else
            return (BT2/10.0);
    }

    public byte getT1_StaMsg(){return T1_StaMsg;}
    public byte getT2_StaMsg(){return T2_StaMsg;}

    public PARA_TEMP(ArrayList list)
    {
     //   System.out.println(" 体温");
        switch ((byte)list.get(3))
        {

            case 0x31:
                this.BT1 = (((byte)list.get(5)&0x03) << 8) | ((byte)list.get(6)&0xFF);
                this.BT2 = (((byte)list.get(5)&0x30) << 4) | ((byte)list.get(7)&0xff);
               /* System.out.println("--------BT1  "+BT1/10.0);
                System.out.println("--------BT2  "+BT2/10.0);*/
                ConstantValue.temp_flag = 1;
                break;
            default:
                ConstantValue.temp_flag = 2;
                break;
        }
    }
}
