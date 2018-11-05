
public class ConstantValue {

    public static final byte Frame_Header = (byte)0xFF; //帧头
    public static int flag; //用于json封装和解析
    public static int sign;
    private static int ceshi;

    public static int spo2_flag;
    public static int nibp_flag;
    public static int resp_flag;
    public static int ecg_flag;
    public static int temp_flag;



 //   private PARA_SPO2 para_spo2 = new PARA_SPO2();

    public static int i = 0;
    public static int[] SPO2wave = new int[20];


}
