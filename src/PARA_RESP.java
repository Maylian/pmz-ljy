import com.sun.org.apache.regexp.internal.RE;

public class PARA_RESP {

    private byte RR; //呼吸率
    private int RR_Wave;
    private byte Patient;//病人类型
    private byte StifleId;//窒息标识
    private byte Resp_Warning;//报警信息
    private int[] RESP_WAVE = new int[128];

    public byte getRR()
    {
        return RR;
    }

    public void setRESP_WAVE(int[] RESP_WAVE)
    {
        this.RESP_WAVE = RESP_WAVE;
    }
    public int[] getRESP_WAVE()
    {
        return RESP_WAVE;
    }
    public byte getPatient(){return Patient;}
    public byte getStifleId(){return StifleId;}
    public byte getResp_Warning(){return  Resp_Warning;}

    public PARA_RESP(byte[] data)
    {
        // System.out.println("--开始RESP");
        switch (data[3])
        {
            case 0x31:
                this.Patient = (byte) (data[4] & 0x01);
                if(Patient == 0) {System.out.println("------成人----");}
                else if(Patient == 1) System.out.println("----小儿----");
                else if(Patient == 2)  System.out.println("----新生儿----");

                this.StifleId = (byte)((data[4] & 0x40)>>6);
                if(StifleId == 0) {System.out.println("------无窒息----");}
                else if(StifleId == 1) System.out.println("----小儿----");



            case 0x34:
                this.StifleId = (byte)(data[4] & 0x01);
                if(StifleId == 0) {System.out.println("------无窒息----");}
                else if(StifleId == 1) System.out.println("----窒息----");

                this.Resp_Warning = (byte)((data[4] & 0x28)>>2);
                if(Resp_Warning == 0) {System.out.println("------正常----");}
                else if(Resp_Warning == 1) System.out.println("----导联脱落----");
                else if(Resp_Warning == 2)  System.out.println("----自学习----");
                else if(Resp_Warning == 3)  System.out.println("----参数越下线----");
                else if(Resp_Warning == 4)  System.out.println("----参数越上线----");
                else if(Resp_Warning == 5)  System.out.println("----噪声----");


                this.RR = data[5];
            //System.out.println("--------RR "+RR);

            case 0x35:
                this.RR_Wave = data[4]&0xFF;
            //System.out.print(" "+RR_Wave);
            default:break;
        }
    }
}











