
public class ConstantValue {

    public static final byte Frame_Header = (byte)0xFF; //帧头
    public static int flag; //用于json封装和解析
    public static int sign;


 //   private PARA_SPO2 para_spo2 = new PARA_SPO2();

    public static int i = 0;
    public static int[] SPO2wave = new int[20];

    public void setSPO2data(int data)
    {
        while (i == 20)
        {
            i = 0;
        }
        this.SPO2wave[i] = data;
        i++;
    }

}
