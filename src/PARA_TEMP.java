import org.omg.PortableInterceptor.INACTIVE;

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
        return (BT1/10.0);
    }
    public double getBT2()
    {
        if(BT2 == 600)
            return 0.0;
        else
            return (BT2/10.0);
    }



    public PARA_TEMP(byte data[])
    {
     //   System.out.println(" 体温");
        switch (data[3])
        {
            case 0x31:
                this.T1_ProType = (byte) (data[4] & 0x01);
                if (T1_ProType == 0) System.out.println("--------Probe_Type -YSI-2.252K探头");
                else if(T1_ProType == 1) System.out.println("-------- T1-CY_10K探头 ");

                this.T2_ProType = (byte)((data[4] & 0x10) >> 4);
                if (T2_ProType == 0) System.out.println("--------Probe_Type -YSI-2.252K探头");
                else if(T2_ProType == 1) System.out.println("-------- T2-CY_10K探头 ");

                this.T1_StaMsg = (byte) ((data[4] & 0x0C) >> 2);
                if (T1_StaMsg == 0) System.out.println("-------- T1-正常");
                else if (T1_StaMsg == 1) System.out.println("-------- T1-探头脱落");
                else if (T1_StaMsg == 2) System.out.println("------- T1-超测量范围上限");
                else if (T1_StaMsg == 3) System.out.println("-------- T1-超测量范围下限");

                this.T2_StaMsg = (byte)((data[4] & 0xC0) >> 6);
                if (T2_StaMsg == 0) System.out.println("-------- T2-正常");
                else if (T2_StaMsg == 1) System.out.println("-------- T2-探头脱落");
                else if (T2_StaMsg == 2) System.out.println("------- T2-超测量范围上限");
                else if (T2_StaMsg == 3) System.out.println("-------- T2-超测量范围下限");

                this.BT1 = ((data[5] & 0x03) << 8)|(data[6] & 127);
               // System.out.println("--------BT1  "+BT1);
                System.out.println("--------BT1  "+BT1/10.0);

                this.BT2 =  ((data[5] & 0x30) << 4)|(data[7] & 127);
               // System.out.println("--------BT2  "+BT2);
                System.out.println("--------BT2  "+BT2/10.0);

            default: break;
        }
    }
}
