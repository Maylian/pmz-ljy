import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystem;
import java.util.LinkedList;

public class PARA_SPO2 {
 //   private byte Frame_header =Test.FRAME_Header;
    ConstantValue c = new ConstantValue();
    PaintLockService pls = new PaintLockService();


    private static int i = 0;

    private byte SPO2; //血氧饱和度
    private byte PR;
    private byte Singal_th;//信号强度

    private byte DL;
    private byte PULSE;//脉搏
    private byte pulse_voice;//脉搏声音
    private byte Patient;//病人类型

    private byte SPR_Length; //血氧脉率帧长
    private byte SPW_Length; //血氧波形帧长

    private static int SPO2_data[] = new int[20];
    private int SPO2_WAVE[] = new int[20]; //SPO2波形数据
    private int spo2wavedata;




 /*   public void setFrame_header(byte Frame_header){ this.Frame_header = Frame_header;}
    public byte getFrame_header() { return Frame_header;}*/

    public void setSPO2(byte SPO2) { this.SPO2 = SPO2;}
    public byte getSPO2(){ return SPO2;}
    public void setPR(byte PR) { this.PR = PR;}
    public byte getPR(){ return PR;}

    public void setSPO2_WAVE(int[] SPO2_WAVE)
    {
        this.SPO2_WAVE = SPO2_WAVE;
    }

    public int[] getSPO2_WAVE()
    {
        return SPO2_WAVE;
    }
    public int getSpo2wavedata()
    {
        return spo2wavedata;
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



    //写入文件
    public void inputfile(int data)
    {
        FileWriter fw = null;
        try
        {
            File f = new File("C:\\Users\\814-2\\Desktop\\SPO2.txt");
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

    }


    public PARA_SPO2(byte data[])
    {
        ConstantValue.flag = 1;
    //    System.out.println("调用SPO2");
        switch (data[3])
        {
            case 0x32:
                this.SPR_Length = data[1];
            //    System.out.println(" --------0x32_lenth = "+SPR_Length);
                this.DL = (byte)(data[4] & 0x01);
                if(DL == 0) {System.out.println("--------DL---正常");}
                else System.out.println("--------DL---脱落");

                this.PULSE = (byte)(data[4] & 0x02);
                if (PULSE == 0) {System.out.println("--------PULSE---");}
                else System.out.println("--------PULSE---搜索脉搏");

                this.Patient = (byte)(data[4] & 0x60);
                if(Patient == 0){ System.out.println("------成人----");}
                else if(Patient == 1) System.out.println("----小儿----");

                this.Singal_th = data[5];
                //System.out.println("--------Singal_th "+Singal_th);
                this.PR = data[8];   System.out.println("--------PR----"+PR);
                this.SPO2 = data[9]; System.out.println("--------SPO2--"+SPO2);
                break;
            case 0x33:
                this.SPW_Length = data[1];
                this.spo2wavedata = data[4]&0xFF;
                /*SPO2_data[i] = data[4]&0xFF;
                i++;
                if(i == 20)
                {
                    i = 0;
                    this.setSPO2_WAVE(SPO2_data);
                }*/




            //    System.out.println(" 0x33_lenth = "+SPW_Length);
            //    this.SPO2_data = data[4]&0xFF;
            //    this.setSPO2_data(data[4]&0xFF);


             //   this.SPO2_wave[i++] = SPO2_data;
            //    this.SPO2_WAVE[i] = SPO2_data;


            //    this.inputfile(SPO2_data);
            //   System.out.print(" "+SPO2_WAVE[j++]);

                this.pulse_voice = (byte) ((data[5] & 0x40) >> 6);
            /*    if (pulse_voice == 0) System.out.println("--------无脉搏声音");
                else if (pulse_voice == 1)  System.out.println("--------有脉搏声音");*/
            break;

            default:
                break;
        }
    }
}
