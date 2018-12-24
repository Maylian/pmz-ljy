import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.LinkedList;

public class PARA_SPO2 {
 //   private byte Frame_header =Test.FRAME_Header;

    private static int i = 0;

    private int SPO2; //血氧饱和度
    private int PR;
    private byte Singal_th;//信号强度

    private byte DL;//导联状态
    private byte PULSE;//脉搏
    private byte pulse_voice;//脉搏声音
    private byte PI;//弱灌注信息
    private byte II;//干扰信息（interference information ）
    private byte SPI;//停博信息
    private byte Patient;//病人类型

    private byte SPR_Length; //血氧脉率帧长
    private byte SPW_Length; //血氧波形帧长

    private int spo2wavedata; //SPO2波形数据
    private short spo2_Bar; //spo2棒图数据
    private byte spo2_voice; //脉搏声音




 /*   public void setFrame_header(byte Frame_header){ this.Frame_header = Frame_header;}
    public byte getFrame_header() { return Frame_header;}*/


    public int getSPO2(){ return SPO2;}
    public int getPR(){ return PR;}

    public int getSpo2wavedata()
    {
        return spo2wavedata;
    }
    public short getSpo2_Bar()
    {
        return spo2_Bar;
    }
    public byte getSpo2_voice()
    {
        return spo2_voice;
    }



    public void setSPR_Length(byte SPR_Length)
    {
        this.SPW_Length = SPR_Length;
    }
    public byte getSPR_Length()
    {
        return SPR_Length;
    }
    public void setSPW_Length(byte SPW_Length)
    {
        this.SPW_Length = SPW_Length;
    }
    public byte getSPW_Length()
    {
        return SPW_Length;
    }

    public byte getDL() { return DL; }
    public byte getPULSE(){return PULSE;}
    public byte getPulse_voice(){return pulse_voice;};
    public byte getPI(){return PI;}
    public byte getII(){return II;}
    public byte getSPI(){return SPI;}
    public byte getPatient(){return Patient;}




    //写入文件
   /* public void inputfile(int data)
    {
        FileWriter fw = null;
        try
        {
            File f = new File("C:\\Users\\814-2\\Desktop\\SPO2原6.txt");
            fw = new FileWriter(f,true);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.print(data+" ");
        pw.flush();
        try
        {
            fw.flush();
            pw.close();
            fw.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }*/


    public PARA_SPO2(ArrayList list)
    {
      //  ConstantValue.flag = 1;
    //    System.out.println("调用SPO2");
        switch ((byte)(list.get(3)))
        {
            case 0x32:
                this.PR = (byte)(list.get(8));
                this.SPO2 = ((byte)(list.get(9))&0xff);
                System.out.println(" -----脉率 = "+PR+"     血压饱和度 = " +SPO2);
                ConstantValue.spo2_flag = 1;
                break;
            case 0x33:
                this.spo2wavedata = ((byte)(list.get(4))&0xff);
                this.spo2_Bar = (short)((byte)list.get(4)&0x1f);
                this.spo2_voice = (byte) ((byte)list.get(4)&0x40);
            //    System.out.println("----------------------棒图"+spo2_Bar);
             //    System.out.print(" s "+spo2wavedata);
            //    this.inputfile(spo2wavedata);
                ConstantValue.spo2_flag = 2;
                break;
            default:
                ConstantValue.spo2_flag = 3;
                break;
        }
    }
}
