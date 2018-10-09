import com.sun.org.apache.regexp.internal.RE;

public class PARA_RESP {

    private byte RR; //呼吸率
    private int RR_Wave;
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

    public PARA_RESP(byte[] data)
    {
        // System.out.println("--开始RESP");
        switch (data[3])
        {
            case 0x34:
                this.RR = data[5];
            //System.out.println("--------RR "+RR);
            case 0x35:
                this.RR_Wave = data[4]&0xFF;
            //System.out.print(" "+RR_Wave);
            default:break;
        }
    }
}











