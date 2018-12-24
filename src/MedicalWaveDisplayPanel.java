import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MedicalWaveDisplayPanel extends JPanel {
    public Surface surf;
    JPanel infoPanel; //information on this control...
    private String lock;
    private Lock m_lock = new ReentrantLock();
    private PaintLockService m_pls = new PaintLockService();
//    private LinkedList<Object> list = new LinkedList<>(); //获取的数据存储的载体


    private int i = 0;
    private int[] SPO2wave = new int[10];
    private int[] ECGwave = new int[10];
    private int[] RESPwave = new int[10];

    public MedicalWaveDisplayPanel() {
        lock = new String();
        setLayout(new BorderLayout());
        setBorder(new TitledBorder(new EtchedBorder(), "Medical Info Panel"));
        add(surf = new Surface(this.m_pls));//new Surface(this.m_pls)

        return;
    }

    public void paint(Graphics g) {
        //paint方法不需要编写代码调用，只需要重写。
        super.paint(g);//paint重写时,先调用此语句
        return;
    }

    public int DispStart()//绘制方格
    {
        this.surf.start();
        return 0;
    }

    public int DispStop() {
        this.surf.stop();
        return 0;
    }


    public synchronized void putSPO2data(int spo2) {
        while (i == 10) {
            i = 0;
            this.SetSpo2WaveData(SPO2wave);
        }
        if (spo2 == 255 | spo2 <10) spo2 = 227;
        SPO2wave[i++] = spo2;

    }

    public synchronized void putECGdata(int ecg) {
        while (i == 10) {
            i = 0;
            this.SetECG_WaveData(ECGwave);
        }

        ECGwave[i++] = ecg;

    }

    public synchronized void putRESPdata(int resp) {
        while (i == 10) {
            i = 0;
            this.SetRESPWaveData(RESPwave);
        }
      //  if (resp == 255 | resp <10) resp = 128;
        RESPwave[i++] = resp;
    }

    public synchronized int SetECG_WaveData(int[] data)//MedicalWaveFrame调用
    {
        float _fMax = 600.0f;
        float _fMin = -350.0f;
        float _fNormalize = _fMax - _fMin;

        float _f = 0.0f;
        //    System.out.println("wait ecg_data push");
        //m_lock.lock();

        //滤波
         MovingAverageFilter filter_II = new MovingAverageFilter();
        int[] ECGdata =filter_II.movingAverageFilter(data);

        while (m_pls.hasValue == true) {
            //      System.out.println("ECG_Panel await();");
            m_pls.await();
        }
        this.surf.datalength= ECGdata.length;
        for (int _i0 = 0; _i0 < ECGdata.length; _i0++) {
            _f = (ECGdata[_i0] - _fMin) / _fNormalize;
            this.surf.data[_i0] = _f;//32行

        }
        m_pls.SetHasValue(true);
        m_pls.signal();//唤醒一个等待线程。

        //    System.out.println("data push finish");

        return 0;
    }

    public synchronized int SetSpo2WaveData(int[] data0) {

        //  float Min = Arrays.stream(data0).min().getAsInt();
        //   float Max = Arrays.stream(data0).max().getAsInt();

        float Max = 230.0f;
        float Min = -10.0f;
        float Mid = Max - Min;
        float f = 0.0f;

        while (m_pls.hasValue == true) {
            m_pls.await();
        }
        this.surf.datalength= data0.length;
            for (int i = 0; i < data0.length; i++) {
            //   f = (data0[i] - Min)/Mid;
            f = (Max - data0[i]) / Mid;
        //    this.inputfile(f);
                /*this.inputfile(data0[i]);
                this.inputfile1(f);*/
        //        System.out.println("先 "+data0[i]+"后----"+f);

            this.surf.data[i] = f;
        }

        //    System.out.println("wait spo2 data push");
      /*  while (m_pls.hasValue = true)
        {
            m_pls.await();
        } */
/*
        for(int i = 0;i < data0.length; i++)
        {
            f = (data0[i] - Min)/Mid;
            this.surf.data[i] = f;
        }
*/
        m_pls.SetHasValue(true);
        m_pls.signal();

        //    System.out.println("data push finish");
        return 0;
    }

    public synchronized int SetRESPWaveData(int[] data0) {

        //  float Min = Arrays.stream(data0).min().getAsInt();
        //  float Max = Arrays.stream(data0).max().getAsInt();

        float Max = 200.0f;
        float Min = 70.0f;
        float Mid = Max - Min;
        float f = 0.0f;
        //    System.out.println("resp data push");
        while (m_pls.hasValue == true) {
            //    System.out.println("resp_Panel await();");
            m_pls.await();
        }
        this.surf.datalength= data0.length;
        for (int i = 0; i < data0.length; i++) {
            f = (data0[i] - Min) / Mid;
            //   f = (Max - data0[i])/Mid;
        //    System.out.println("先 "+data0[i]+"后----"+f);
          /*  this.inputfile(data0[i]);
            this.inputfile1(f);*/
            this.surf.data[i] = f;
        }
        m_pls.SetHasValue(true);
        m_pls.signal();
        return 0;
    }

    public void inputfile(float data) {
        FileWriter fw = null;
        try {
            File f = new File("C:\\Users\\814-2\\Desktop\\SPO2_前6.txt");
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.print(data + " ");
        pw.flush();
        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void inputfile1(float data) {
        FileWriter fw = null;
        try {
            File f = new File("C:\\Users\\814-2\\Desktop\\SPO2_后6.txt");
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.print(data + " ");
        pw.flush();
        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}