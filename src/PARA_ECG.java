import com.sun.org.apache.xpath.internal.SourceTree;
import org.omg.CORBA.INTERNAL;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class PARA_ECG {


    int[] ECG_fiv_II = new int[1024];
    int i,j = 0;

    private byte HrD8;
    private byte HrG8;
    private short HR;
    private byte Patient_Type;
    private byte job_mode; //工作模式
    private byte ECG_Msg; //ECG过载信息
    private byte ECG_DLMsg;//ECG导联信息
    private byte LA_FallMsg;//LA导联脱落信息
    private byte RA_FallMsg;
    private byte LL_FallMsg;
    private byte RL_FallMsg;

    private int ECG_Oder; //ECG波形数据顺序

    private byte thr_I_D8; //3导联低8位
    private byte thr_I_G8;

    private int  thr_I;
    private int  thr_II;
    private int  thr_III;

    private byte thr_II_D8;
    private byte thr_II_G8;
    private byte thr_III_D8;
    private byte thr_III_G8;

    private int  fiv_I;
    private int  fiv_II;
    private int  fiv_III;
    private int  fiv_AVR;
    private int  fiv_AVL_;
    private int  fiv_AVF;
    private int  fiv_V_;
    private byte fiv_I_D8;
    private byte fiv_I_G8;
    private byte fiv_II_D8;
    private byte fiv_II_G8;
    private byte fiv_III_D8;
    private byte fiv_III_G8;
    private byte fiv_AVR_D8;
    private byte fiv_AVR_G8;
    private byte fiv_AVL_D8;
    private byte fiv_AVL_G8;
    private byte fiv_AVF_D8;
    private byte fiv_AVF_G8;
    private byte fiv_V_D8;
    private byte fiv_V_G8;

    public void setECG_fiv_II(int[] ECG_fiv_II)
    {
        this.ECG_fiv_II = ECG_fiv_II;
    }
    public int[] getECG_fiv_II()
    {
        return ECG_fiv_II;
    }

    public void setHR(short HR)
    {
        this.HR = HR;
    }
    public short getHR()
    {
        return HR;
    }


    //写入文件
    public void inputfile(int data)
    {
        FileWriter fw = null;
        try
        {
            File f = new File("C:\\Users\\814-2\\Desktop\\ECG_5_I.txt");
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


    public PARA_ECG(byte data[])
    { 
       // System.out.print("--------ECG");
        switch (data[3])
        {
            case 0x31:
                this.Patient_Type =(byte) (data[4] & 0x07); if(Patient_Type == 0) System.out.println("--------成人");
                this.job_mode = (byte)(data[4] & 0x70); System.out.println("--------工作模式 "+job_mode);
                this.ECG_DLMsg = (byte) (data[8] & 0x03); if(ECG_DLMsg == 0) System.out.println("-------- 3导联模式"); else if(ECG_DLMsg == 1) System.out.println("-------- 5导联模式"); else if(ECG_DLMsg == 2) System.out.println("-------- 12导联");
                this.LA_FallMsg = (byte)(data[9] & 0x01); if(LA_FallMsg == 0) System.out.println("-------- LA 正常"); else if(LA_FallMsg == 1) System.out.println("-------- LA 脱落");
                this.RA_FallMsg = (byte)(data[9] & 0x02); if(RA_FallMsg == 0) System.out.println("-------- RA 正常"); else if(RA_FallMsg == 1) System.out.println("-------- RA 脱落");
                this.LL_FallMsg = (byte)(data[9] & 0x04); if(LL_FallMsg == 0) System.out.println("-------- LL 正常"); else if(LL_FallMsg == 1) System.out.println("-------- LL 脱落");
                this.RL_FallMsg = (byte)(data[9] & 0x08); if(RL_FallMsg == 0) System.out.println("-------- RL 正常"); else if(RL_FallMsg == 1) System.out.println("-------- RL 脱落");

                this.ECG_Msg = (byte)(data[5] & 0x01) ; if(ECG_Msg == 0) System.out.println("-------- I 正常"); else if (ECG_Msg == 1) System.out.println("-------- I 过载");
                this.ECG_Msg = (byte)((data[5] & 0x02) >> 1); if(ECG_Msg == 0) System.out.println("-------- II 正常"); else if (ECG_Msg == 1) System.out.println("-------- II 过载");
                this.ECG_Msg = (byte)((data[5] & 0x04) >>2); if(ECG_Msg == 0) System.out.println("-------- III 正常"); else if (ECG_Msg == 1) System.out.println("-------- III 过载");
                this.ECG_Msg = (byte)((data[5] & 0x08) >> 3); if(ECG_Msg == 0) System.out.println("-------- AVR 正常"); else if (ECG_Msg == 1) System.out.println("-------- AVR 过载");
                this.ECG_Msg = (byte)((data[5] & 0x16) >> 4); if(ECG_Msg == 0) System.out.println("-------- AVL 正常"); else if (ECG_Msg == 1) System.out.println("-------- AVL 过载");

                this.ECG_Msg = (byte)(data[6] & 0x01); if(ECG_Msg == 0) System.out.println("-------- V1 正常"); else if (ECG_Msg == 1) System.out.println("--------V1 过载");
                this.ECG_Msg = (byte)((data[6] & 0x02) >> 1); if(ECG_Msg == 0) System.out.println("--------V2 正常"); else if (ECG_Msg == 1) System.out.println("-------- V2 过载");
                this.ECG_Msg = (byte)((data[6] & 0x04) >> 2); if(ECG_Msg == 0) System.out.println("-------- V3 正常"); else if (ECG_Msg == 1) System.out.println("-------- V3 过载");
                this.ECG_Msg = (byte)((data[6] & 0x08) >> 3); if(ECG_Msg == 0) System.out.println("-------- V4 正常"); else if (ECG_Msg == 1) System.out.println("-------- V4 过载");
                this.ECG_Msg = (byte)((data[6] & 0x16) >> 4); if(ECG_Msg == 0) System.out.println("-------- V5 正常"); else if (ECG_Msg == 1) System.out.println("-------- V5 过载");
                this.ECG_Msg = (byte)((data[6] & 0x32) >> 5); if(ECG_Msg == 0) System.out.println("-------- V6   正常"); else if (ECG_Msg == 1) System.out.println("-------- V6 过载");


            case 0x33:
            //    this.HrD8 = data[4]; System.out.println('\n'+"--------HrD8 "+HrD8);
            //    this.HrG8 = data[5]; System.out.println("--------HrG8 "+HrG8);
                this.HR = (short) (((data[5] & 0xFF) << 8)|(data[4] & 0xFF));
                System.out.println("--------HR: "+HR);
            case 0x3E: //三导联模式
                this.thr_I = ((data[7] & 0xFF) << 8) | (data[6] & 0xFF);
                this.thr_II = ((data[7] & 0xFF) << 8) | (data[6] & 0xFF);
                this.thr_II = (short)(((data[7]) << 8) | (data[6]));
            //    System.out.print(" "+thr_II);
            //    System.out.println(Integer.toBinaryString(data[7])+" ---  "+Integer.toBinaryString(data[6])+" ---  "+Integer.toBinaryString(thr_II));
            //    this.thr_III = ((data[7] & 0xFF) << 8) | (data[6] & 0xFF);
             //   System.out.print(data[6]+"  --  "+data[7]+"  --  ");

            //    this.inputfile(thr_II);


            /*        this.thr_I_D8 =data[6]&0xFF;
                    System.out.print(" " + thr_I_D8);
                    this.thr_I_G8 = data[7]&0xFF;
                    System.out.print(" " + thr_I_G8); */
                //    }
                //    this.thr_I = (((data[7] & 0xFF) << 8) | (data[6] & 0xFF)); System.out.println("--------thr_I "+thr_I);
                // this.thr_III_D8 = (byte) (data[6]&0xFF); System.out.println("--------thr_III_D8 "+thr_III_D8);
                // this.thr_III_G8 = (byte) (data[7]&0xFF); System.out.println("--------thr_III_G8 "+thr_III_G8);


/*
                this.thr_II_D8 = data[6];
                this.thr_II_G8 = data[7];
                this.thr_II = (((thr_II_G8 & 0xff) << 8) | (thr_II_D8 & 0xff));
                System.out.println(" --thr_II :" + thr_II);

                this.thr_III_D8 = data[6];
                this.thr_III_G8 = data[7];
                this.thr_III = (((thr_III_G8 & 0xff) << 8) | (thr_III_D8 & 0xff));
                System.out.println(" --thr_III : "+ thr_III);
*/
            case 0x3F://五导联波形数据
                this.fiv_I_D8 = data[6];
                this.fiv_I_G8 = data[7];
                this.fiv_I = (short)(((data[7] & 0xff) << 8) | (data[6] & 0xff));
            //    System.out.print(" " + fiv_I);
            //    this.inputfile(fiv_I);

                this.fiv_II_D8 = data[8];
                this.fiv_II_G8 = data[9];
                this.fiv_II = (short)(((data[9] & 0xff) << 8) | (data[8] & 0xff));
            //    System.out.print(" " + fiv_II);
             //   this.inputfile(fiv_II);
                ECG_fiv_II[i++] = fiv_II;
            //    System.out.print(" "+ECG_fiv_II[j++]);
            //    th.start();


                this.fiv_III_D8 = data[10];
                this.fiv_III_G8 = data[11];
                this.fiv_III = (short)(((data[11] & 0xff) << 8) |(data[10] & 0xff));
            //    System.out.println(" --fiv_III :" + fiv_III);


            default:break;
        }
    }
}
