import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * Created by JFormDesigner on Sat Sep 08 12:05:31 CST 2018
 */



/**
 * @author pmz
 */
public class MainMedicalWaveFrame extends JFrame implements Runnable{

    public Thread m_thread;
    public boolean go_thread = false;

    public int pre,sbp,map,dbp,msu_mode,spo2,pr,rr,dl,pluse,ii,spi,pi,t1_stamsg,t2_stamsg;
    public double bt1,bt2;
    public short hr,spo2_bar,spo2_voice;

    Date time = new Date(); //获取系统当前时间
    SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm"); //血压测量时间
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd"); //系统显示时间
    SimpleDateFormat dateFormat3 = new SimpleDateFormat("hh:mm:ss");

    // 得到显示器屏幕的宽高
   public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    public int height = Toolkit.getDefaultToolkit().getScreenSize().height;




    /// AudioClip spvoice =  java.applet.Applet.newAudioClip(this.getClass().getResource(6.m4a));

   // static AudioClip spo2_bit = Applet.newAudioClip(class.getClassLoader().getResource());





    public MainMedicalWaveFrame() {
        initComponents();

        // 得到窗口的宽高,居中显示
     //  this.setBounds((width - this.getWidth()) / 2, (height - this.getHeight()) / 2, this.getWidth(), this.getHeight());

    }



       //病人信息设置
    private void PatientInfoActionPerformed(ActionEvent e) {
        JLabel l1 =  new JLabel("床号");
        JLabel l2 = new JLabel("姓名");
        JLabel l3 = new JLabel("性别");
        JLabel l4 = new JLabel("病人类型");
        JTextField t1 = new JTextField("2");
        JTextField t2 = new JTextField("张三");
        JTextField t3 = new JTextField("男");
        JTextField t4 = new JTextField("成人");
        JButton b1 = new JButton("更新病人");
        JLabel l9 = new JLabel();

        //======== d1 ========
        JDialog d1 = new JDialog();
        d1.setVisible(true);
        d1.setTitle("病人信息设置");
        d1.setLocation(530,219);
        d1.setSize(500,400);

        //======== l1 ========
        {
            d1.add(l1);
            l1.setFont(l1.getFont().deriveFont(l1.getFont().getSize() + 5f));
            l1.setBounds(new Rectangle(new Point(80, 50), l1.getPreferredSize()));
        }
        //======== l2 ========
        {
            d1.add(l2);
            l2.setFont(l2.getFont().deriveFont(l2.getFont().getSize() + 5f));
            l2.setBounds(new Rectangle(new Point(80, 100), l2.getPreferredSize()));
        }
        //======== l3 ========
        {
            d1.add(l3);
            l3.setFont(l3.getFont().deriveFont(l3.getFont().getSize() + 5f));
            l3.setBounds(new Rectangle(new Point(80, 150), l3.getPreferredSize()));
        }
        //======== l4 ========
        {
            d1.add(l4);
            l4.setFont(l4.getFont().deriveFont(l4.getFont().getSize() + 5f));
            l4.setBounds(new Rectangle(new Point(80, 200), l4.getPreferredSize()));
        }
        //======== t1 ========
        {
            d1.add(t1);
            t1.setFont(t1.getFont().deriveFont(t1.getFont().getSize() + 5f));
            t1.setBounds(200, 50, 100, t1.getPreferredSize().height);
        }
        //======== t2 ========
        {
            d1.add(t2);
            t2.setFont(t2.getFont().deriveFont(t2.getFont().getSize() + 5f));
            t2.setBounds(200, 100, 100, t1.getPreferredSize().height);
        }
        //======== t3 ========
        {
            d1.add(t3);
            t3.setFont(t3.getFont().deriveFont(t3.getFont().getSize() + 5f));
            t3.setBounds(200, 150, 100, t1.getPreferredSize().height);
        }
        //======== t4 ========
        {
            d1.add(t4);
            t4.setFont(t4.getFont().deriveFont(t4.getFont().getSize() + 5f));
            t4.setBounds(200, 200, 100, t1.getPreferredSize().height);
        }
        //======== b1 ========
        {
            d1.add(b1);
            b1.setFont(b1.getFont().deriveFont(b1.getFont().getSize() + 5f));
            b1.setBounds(120, 250, 150, b1.getPreferredSize().height);
            d1.add(l9);
        }

    }




    // 发送启动测量命令
    private void StarNibpMouseClicked(MouseEvent e) {
        try {
            byte[] startbytes = Serial_Port.hexStrToBinaryStr("FF 04 46 02 01 4C");
            Serial_Port.outputStream.write(startbytes);
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    // 发送停止测量命令
    private void StopNibpMouseClicked(MouseEvent e) {
        try {
            byte[] stopbytes = Serial_Port.hexStrToBinaryStr("FF 04 46 02 00 4B");
            Serial_Port.outputStream.write(stopbytes);
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    private void m4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void HRSetMouseClicked(MouseEvent e) {
        HRWarning setHR = new HRWarning();
        //setHR.setVisible(true);
    }

    private void NIBPSetMouseClicked(MouseEvent e) {
        NIBPWarning setNIBP = new  NIBPWarning();
    }

    private void SPO2SetMouseClicked(MouseEvent e) {
        SPO2Warning setSPO2 = new  SPO2Warning();
    }

    private void TEMPSetMouseClicked(MouseEvent e) {
        TEMPWarning setTEMP = new  TEMPWarning();
    }

    private void RESPSetMouseClicked(MouseEvent e) {
        RESPWarning setRESP = new  RESPWarning();
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1InfoDisplay = new JPanel();
        ECGwavePanel1 = new MedicalWaveDisplayPanel();
        ECGwavePanel2 = new MedicalWaveDisplayPanel();
        Spo2WavePanel = new MedicalWaveDisplayPanel();
        RESPwavePanel = new MedicalWaveDisplayPanel();
        ECGdataPanel = new JPanel();
        e1 = new JLabel();
        e2 = new JLabel();
        e3 = new JLabel();
        e4 = new JLabel();
        e5 = new JLabel();
        e6 = new JLabel();
        e7 = new JLabel();
        e8 = new JLabel();
        e9 = new JLabel();
        e10 = new JLabel();
        e11 = new JLabel();
        e0 = new JLabel();
        NIBPdataPanel = new JPanel();
        n1 = new JLabel();
        n2 = new JLabel();
        n3 = new JLabel();
        n4 = new JLabel();
        n5 = new JLabel();
        n6 = new JLabel();
        n7 = new JLabel();
        n8 = new JLabel();
        n9 = new JLabel();
        n10 = new JLabel();
        panel1 = new JPanel();
        l1 = new JLabel();
        l2 = new JLabel();
        SPO2dataPanel = new JPanel();
        s1 = new JLabel();
        s2 = new JLabel();
        s3 = new JLabel();
        s4 = new JLabel();
        s5 = new JLabel();
        s6 = new JLabel();
        s7 = new JLabel();
        s8 = new JLabel();
        spo2_Bar1 = new JProgressBar();
        RESPdataPanel = new JPanel();
        r2 = new JLabel();
        r3 = new JLabel();
        r4 = new JLabel();
        panel3 = new JPanel();
        t1 = new JLabel();
        t2 = new JLabel();
        t3 = new JLabel();
        t4 = new JLabel();
        t5 = new JLabel();
        t6 = new JLabel();
        t7 = new JLabel();
        t8 = new JLabel();
        t9 = new JLabel();
        t10 = new JLabel();
        t11 = new JLabel();
        t12 = new JLabel();
        panel2 = new JPanel();
        warningText = new JTextField();
        f1 = new JLabel();
        f2 = new JLabel();
        f3 = new JLabel();
        f4 = new JLabel();
        f5 = new JLabel();
        menuBar1 = new JMenuBar();
        m4 = new JMenu();
        m41 = new JMenuItem();
        m42 = new JMenuItem();
        m43 = new JMenu();
        mI1 = new JMenuItem();
        mI2 = new JMenuItem();
        mI3 = new JMenuItem();
        mI4 = new JMenuItem();
        m47 = new JMenuItem();
        m3 = new JMenu();
        StarMI = new JMenuItem();
        StopMI = new JMenuItem();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1InfoDisplay ========
        {
            panel1InfoDisplay.setBackground(Color.black);
            panel1InfoDisplay.setMinimumSize(new Dimension(1024, 768));
            panel1InfoDisplay.setLayout(null);

            //---- ECGwavePanel1 ----
            ECGwavePanel1.setBackground(Color.black);
            ECGwavePanel1.setBorder(new TitledBorder(new EtchedBorder(), "   II", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 12), Color.green));
            panel1InfoDisplay.add(ECGwavePanel1);
            ECGwavePanel1.setBounds(0, 85, 760, 175);

            //---- ECGwavePanel2 ----
            ECGwavePanel2.setBackground(Color.black);
            ECGwavePanel2.setBorder(new TitledBorder(new EtchedBorder(), "   I", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 12), Color.green));
            panel1InfoDisplay.add(ECGwavePanel2);
            ECGwavePanel2.setBounds(0, 260, 760, 175);

            //---- Spo2WavePanel ----
            Spo2WavePanel.setBackground(Color.black);
            Spo2WavePanel.setBorder(new TitledBorder(new EtchedBorder(), "  PLETH", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 12), Color.cyan));
            panel1InfoDisplay.add(Spo2WavePanel);
            Spo2WavePanel.setBounds(0, 435, 760, 165);

            //---- RESPwavePanel ----
            RESPwavePanel.setBackground(Color.black);
            RESPwavePanel.setBorder(new TitledBorder(new EtchedBorder(), "  RESP", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 12), Color.yellow));
            panel1InfoDisplay.add(RESPwavePanel);
            RESPwavePanel.setBounds(0, 600, 760, 165);

            //======== ECGdataPanel ========
            {
                ECGdataPanel.setBackground(Color.black);
                ECGdataPanel.setForeground(Color.green);
                ECGdataPanel.setBorder(new TitledBorder(null, "ECG", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                    new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16), Color.green));
                ECGdataPanel.setLayout(null);

                //---- e1 ----
                e1.setText(" 1");
                e1.setFont(e1.getFont().deriveFont(e1.getFont().getSize() + 32f));
                e1.setForeground(Color.green);
                e1.setHorizontalAlignment(SwingConstants.LEFT);
                ECGdataPanel.add(e1);
                e1.setBounds(15, 40, 140, 85);

                //---- e2 ----
                e2.setText("120");
                e2.setFont(e2.getFont().deriveFont(e2.getFont().getSize() + 4f));
                e2.setForeground(Color.green);
                e2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        HRSetMouseClicked(e);
                    }
                });
                ECGdataPanel.add(e2);
                e2.setBounds(160, 45, 40, e2.getPreferredSize().height);

                //---- e3 ----
                e3.setText("50");
                e3.setForeground(Color.green);
                e3.setFont(e3.getFont().deriveFont(e3.getFont().getSize() + 4f));
                ECGdataPanel.add(e3);
                e3.setBounds(160, 70, 40, e3.getPreferredSize().height);

                //---- e4 ----
                e4.setText("OFF");
                e4.setFont(e4.getFont().deriveFont(e4.getFont().getSize() + 5f));
                e4.setForeground(Color.green);
                ECGdataPanel.add(e4);
                e4.setBounds(280, 20, 55, e4.getPreferredSize().height);

                //---- e5 ----
                e5.setText("PACE");
                e5.setFont(e5.getFont().deriveFont(e5.getFont().getSize() + 5f));
                e5.setForeground(Color.green);
                e5.setBackground(Color.blue);
                ECGdataPanel.add(e5);
                e5.setBounds(220, 20, 55, e5.getPreferredSize().height);

                //---- e6 ----
                e6.setText("ST1");
                e6.setForeground(Color.green);
                e6.setFont(e6.getFont().deriveFont(e6.getFont().getSize() + 5f));
                ECGdataPanel.add(e6);
                e6.setBounds(220, 50, 55, e6.getPreferredSize().height);

                //---- e7 ----
                e7.setText("OFF");
                e7.setFont(e7.getFont().deriveFont(e7.getFont().getSize() + 5f));
                e7.setForeground(Color.green);
                ECGdataPanel.add(e7);
                e7.setBounds(280, 50, 55, 23);

                //---- e8 ----
                e8.setText("ST2");
                e8.setForeground(Color.green);
                e8.setFont(e8.getFont().deriveFont(e8.getFont().getSize() + 5f));
                ECGdataPanel.add(e8);
                e8.setBounds(220, 80, 55, 23);

                //---- e9 ----
                e9.setText("OFF");
                e9.setFont(e9.getFont().deriveFont(e9.getFont().getSize() + 5f));
                e9.setForeground(Color.green);
                ECGdataPanel.add(e9);
                e9.setBounds(280, 80, 55, 23);

                //---- e10 ----
                e10.setText("PVCs");
                e10.setFont(e10.getFont().deriveFont(e10.getFont().getSize() + 5f));
                e10.setForeground(Color.green);
                ECGdataPanel.add(e10);
                e10.setBounds(220, 115, 55, 23);

                //---- e11 ----
                e11.setText("OFF");
                e11.setFont(e11.getFont().deriveFont(e11.getFont().getSize() + 5f));
                e11.setForeground(Color.green);
                ECGdataPanel.add(e11);
                e11.setBounds(280, 115, 55, 23);

                //---- e0 ----
                e0.setText("HR");
                e0.setForeground(Color.green);
                e0.setFont(e0.getFont().deriveFont(e0.getFont().getSize() + 4f));
                ECGdataPanel.add(e0);
                e0.setBounds(new Rectangle(new Point(25, 25), e0.getPreferredSize()));

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < ECGdataPanel.getComponentCount(); i++) {
                        Rectangle bounds = ECGdataPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = ECGdataPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    ECGdataPanel.setMinimumSize(preferredSize);
                    ECGdataPanel.setPreferredSize(preferredSize);
                }
            }
            panel1InfoDisplay.add(ECGdataPanel);
            ECGdataPanel.setBounds(765, 80, 340, 155);

            //======== NIBPdataPanel ========
            {
                NIBPdataPanel.setBorder(new TitledBorder(null, "NIBP", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                    new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16), Color.white));
                NIBPdataPanel.setBackground(Color.black);
                NIBPdataPanel.setLayout(null);

                //---- n1 ----
                n1.setText("16:53");
                n1.setFont(n1.getFont().deriveFont(n1.getFont().getSize() + 5f));
                n1.setForeground(Color.white);
                NIBPdataPanel.add(n1);
                n1.setBounds(70, 15, 60, 23);

                //---- n2 ----
                n2.setText("2");
                n2.setFont(n2.getFont().deriveFont(n2.getFont().getSize() + 38f));
                n2.setForeground(Color.white);
                n2.setHorizontalTextPosition(SwingConstants.CENTER);
                n2.setHorizontalAlignment(SwingConstants.LEFT);
                NIBPdataPanel.add(n2);
                n2.setBounds(10, 43, 110, 67);

                //---- n3 ----
                n3.setText("/");
                n3.setForeground(Color.white);
                n3.setFont(n3.getFont().deriveFont(n3.getFont().getSize() + 38f));
                NIBPdataPanel.add(n3);
                n3.setBounds(120, 40, 21, 70);

                //---- n4 ----
                n4.setText("2");
                n4.setForeground(Color.white);
                n4.setFont(n4.getFont().deriveFont(n4.getFont().getSize() + 38f));
                n4.setHorizontalAlignment(SwingConstants.LEFT);
                NIBPdataPanel.add(n4);
                n4.setBounds(145, 40, 110, 70);

                //---- n5 ----
                n5.setText("2");
                n5.setFont(n5.getFont().deriveFont(n5.getFont().getSize() + 17f));
                n5.setForeground(Color.white);
                n5.setHorizontalAlignment(SwingConstants.CENTER);
                NIBPdataPanel.add(n5);
                n5.setBounds(150, 125, 105, 50);

                //---- n6 ----
                n6.setText("(       )");
                n6.setFont(n6.getFont().deriveFont(n6.getFont().getSize() + 13f));
                n6.setForeground(Color.white);
                NIBPdataPanel.add(n6);
                n6.setBounds(170, 130, 70, 34);

                //---- n7 ----
                n7.setText("NN");
                n7.setForeground(Color.white);
                n7.setFont(n7.getFont().deriveFont(n7.getFont().getSize() + 3f));
                NIBPdataPanel.add(n7);
                n7.setBounds(285, 30, 45, 20);

                //---- n8 ----
                n8.setText("188");
                n8.setForeground(Color.white);
                n8.setFont(n8.getFont().deriveFont(n8.getFont().getSize() + 3f));
                n8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        NIBPSetMouseClicked(e);
                    }
                });
                NIBPdataPanel.add(n8);
                n8.setBounds(285, 50, 45, 20);

                //---- n9 ----
                n9.setText("90");
                n9.setForeground(Color.white);
                n9.setFont(n9.getFont().deriveFont(n9.getFont().getSize() + 3f));
                NIBPdataPanel.add(n9);
                n9.setBounds(285, 70, 45, 20);

                //---- n10 ----
                n10.setText("\u6d4b\u91cf\u6a21\u5f0f");
                n10.setForeground(Color.white);
                n10.setFont(n10.getFont().deriveFont(n10.getFont().getSize() + 4f));
                NIBPdataPanel.add(n10);
                n10.setBounds(5, 130, 100, 34);

                //======== panel1 ========
                {
                    panel1.setLayout(null);

                    //---- l1 ----
                    l1.setText("\u8896\u5e26\u538b");
                    l1.setFont(l1.getFont().deriveFont(l1.getFont().getSize() + 4f));
                    panel1.add(l1);
                    l1.setBounds(15, 60, 80, 20);

                    //---- l2 ----
                    l2.setText("000");
                    l2.setFont(l2.getFont().deriveFont(l2.getFont().getSize() + 13f));
                    panel1.add(l2);
                    l2.setBounds(90, 45, 85, 54);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel1.getComponentCount(); i++) {
                            Rectangle bounds = panel1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel1.setMinimumSize(preferredSize);
                        panel1.setPreferredSize(preferredSize);
                    }
                }
                NIBPdataPanel.add(panel1);
                panel1.setBounds(95, 45, 185, 130);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < NIBPdataPanel.getComponentCount(); i++) {
                        Rectangle bounds = NIBPdataPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = NIBPdataPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    NIBPdataPanel.setMinimumSize(preferredSize);
                    NIBPdataPanel.setPreferredSize(preferredSize);
                }
            }
            panel1InfoDisplay.add(NIBPdataPanel);
            NIBPdataPanel.setBounds(765, 235, 340, 180);

            //======== SPO2dataPanel ========
            {
                SPO2dataPanel.setBorder(new TitledBorder(null, "SPO2", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                    new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16), Color.cyan));
                SPO2dataPanel.setBackground(Color.black);
                SPO2dataPanel.setLayout(null);

                //---- s1 ----
                s1.setText("%");
                s1.setFont(s1.getFont().deriveFont(s1.getFont().getStyle() | Font.BOLD, s1.getFont().getSize() + 7f));
                s1.setForeground(Color.cyan);
                SPO2dataPanel.add(s1);
                s1.setBounds(125, 75, 30, 40);

                //---- s2 ----
                s2.setText("3");
                s2.setFont(s2.getFont().deriveFont(s2.getFont().getSize() + 45f));
                s2.setForeground(Color.cyan);
                s2.setHorizontalAlignment(SwingConstants.LEFT);
                SPO2dataPanel.add(s2);
                s2.setBounds(10, 25, 115, 91);

                //---- s3 ----
                s3.setText("2");
                s3.setFont(s3.getFont().deriveFont(s3.getFont().getSize() + 45f));
                s3.setForeground(Color.cyan);
                s3.setHorizontalAlignment(SwingConstants.LEFT);
                SPO2dataPanel.add(s3);
                s3.setBounds(195, 40, 105, 75);

                //---- s4 ----
                s4.setText("90");
                s4.setForeground(Color.cyan);
                s4.setFont(s4.getFont().deriveFont(s4.getFont().getSize() + 4f));
                SPO2dataPanel.add(s4);
                s4.setBounds(125, 45, 40, 22);

                //---- s5 ----
                s5.setText("100");
                s5.setForeground(Color.cyan);
                s5.setFont(s5.getFont().deriveFont(s5.getFont().getSize() + 4f));
                s5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        SPO2SetMouseClicked(e);
                    }
                });
                SPO2dataPanel.add(s5);
                s5.setBounds(125, 25, 40, 22);

                //---- s6 ----
                s6.setText("PR");
                s6.setFont(s6.getFont().deriveFont(s6.getFont().getSize() + 10f));
                s6.setForeground(Color.cyan);
                SPO2dataPanel.add(s6);
                s6.setBounds(200, 10, 45, 30);

                //---- s7 ----
                s7.setText("120");
                s7.setForeground(Color.cyan);
                s7.setFont(s7.getFont().deriveFont(s7.getFont().getSize() + 4f));
                SPO2dataPanel.add(s7);
                s7.setBounds(300, 20, 35, 22);

                //---- s8 ----
                s8.setText("50");
                s8.setForeground(Color.cyan);
                s8.setFont(s8.getFont().deriveFont(s8.getFont().getSize() + 4f));
                SPO2dataPanel.add(s8);
                s8.setBounds(300, 45, 35, 22);

                //---- spo2_Bar1 ----
                spo2_Bar1.setOrientation(SwingConstants.VERTICAL);
                spo2_Bar1.setMaximum(15);
                spo2_Bar1.setForeground(Color.cyan);
                spo2_Bar1.setAlignmentX(-0.5F);
                spo2_Bar1.setBackground(Color.black);
                spo2_Bar1.setBorderPainted(false);
                SPO2dataPanel.add(spo2_Bar1);
                spo2_Bar1.setBounds(165, 15, 25, 100);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < SPO2dataPanel.getComponentCount(); i++) {
                        Rectangle bounds = SPO2dataPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = SPO2dataPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    SPO2dataPanel.setMinimumSize(preferredSize);
                    SPO2dataPanel.setPreferredSize(preferredSize);
                }
            }
            panel1InfoDisplay.add(SPO2dataPanel);
            SPO2dataPanel.setBounds(765, 415, 340, 120);

            //======== RESPdataPanel ========
            {
                RESPdataPanel.setBorder(new TitledBorder(null, "RESP", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                    new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16), Color.yellow));
                RESPdataPanel.setBackground(Color.black);
                RESPdataPanel.setLayout(null);

                //---- r2 ----
                r2.setText("30");
                r2.setForeground(Color.yellow);
                r2.setFont(r2.getFont().deriveFont(r2.getFont().getSize() + 4f));
                r2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        RESPSetMouseClicked(e);
                    }
                });
                RESPdataPanel.add(r2);
                r2.setBounds(195, 15, 35, 25);

                //---- r3 ----
                r3.setText("8");
                r3.setForeground(Color.yellow);
                r3.setFont(r3.getFont().deriveFont(r3.getFont().getSize() + 4f));
                RESPdataPanel.add(r3);
                r3.setBounds(195, 40, 35, 22);

                //---- r4 ----
                r4.setText("text");
                r4.setForeground(Color.yellow);
                r4.setFont(r4.getFont().deriveFont(r4.getFont().getSize() + 30f));
                RESPdataPanel.add(r4);
                r4.setBounds(15, 30, 150, 65);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < RESPdataPanel.getComponentCount(); i++) {
                        Rectangle bounds = RESPdataPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = RESPdataPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    RESPdataPanel.setMinimumSize(preferredSize);
                    RESPdataPanel.setPreferredSize(preferredSize);
                }
            }
            panel1InfoDisplay.add(RESPdataPanel);
            RESPdataPanel.setBounds(765, 535, 340, 100);

            //======== panel3 ========
            {
                panel3.setBackground(Color.black);
                panel3.setBorder(new TitledBorder(null, "TEMP", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                    new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 16), Color.white));
                panel3.setLayout(null);

                //---- t1 ----
                t1.setText("T1");
                t1.setFont(t1.getFont().deriveFont(t1.getFont().getSize() + 9f));
                t1.setForeground(Color.white);
                panel3.add(t1);
                t1.setBounds(10, 35, 30, 35);

                //---- t2 ----
                t2.setText("2");
                t2.setFont(t2.getFont().deriveFont(t2.getFont().getSize() + 26f));
                t2.setForeground(Color.white);
                panel3.add(t2);
                t2.setBounds(50, 20, 110, 55);

                //---- t3 ----
                t3.setText("T2");
                t3.setFont(t3.getFont().deriveFont(t3.getFont().getSize() + 9f));
                t3.setForeground(Color.white);
                panel3.add(t3);
                t3.setBounds(10, 95, 30, 35);

                //---- t4 ----
                t4.setText("2");
                t4.setFont(t4.getFont().deriveFont(t4.getFont().getSize() + 26f));
                t4.setForeground(Color.white);
                panel3.add(t4);
                t4.setBounds(50, 85, 110, 55);

                //---- t5 ----
                t5.setText("39.0");
                t5.setForeground(Color.white);
                t5.setFont(t5.getFont().deriveFont(t5.getFont().getSize() + 6f));
                t5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        TEMPSetMouseClicked(e);
                    }
                });
                panel3.add(t5);
                t5.setBounds(165, 25, 40, 24);

                //---- t6 ----
                t6.setText("\u2103");
                t6.setForeground(Color.white);
                t6.setFont(t6.getFont().deriveFont(t6.getFont().getSize() + 8f));
                panel3.add(t6);
                t6.setBounds(210, 15, 35, 25);

                //---- t7 ----
                t7.setText("36.0");
                t7.setForeground(Color.white);
                t7.setFont(t7.getFont().deriveFont(t7.getFont().getSize() + 6f));
                panel3.add(t7);
                t7.setBounds(165, 50, 40, 24);

                //---- t8 ----
                t8.setText("39.0");
                t8.setForeground(Color.white);
                t8.setFont(t8.getFont().deriveFont(t8.getFont().getSize() + 6f));
                panel3.add(t8);
                t8.setBounds(165, 90, 40, 24);

                //---- t9 ----
                t9.setText("36.0");
                t9.setForeground(Color.white);
                t9.setFont(t9.getFont().deriveFont(t9.getFont().getSize() + 6f));
                panel3.add(t9);
                t9.setBounds(165, 115, 40, 24);

                //---- t10 ----
                t10.setText("TD");
                t10.setForeground(Color.white);
                t10.setFont(t10.getFont().deriveFont(t10.getFont().getSize() + 5f));
                panel3.add(t10);
                t10.setBounds(240, 65, 45, 23);

                //---- t11 ----
                t11.setText("2.0");
                t11.setForeground(Color.white);
                t11.setFont(t11.getFont().deriveFont(t11.getFont().getSize() + 5f));
                panel3.add(t11);
                t11.setBounds(290, 100, 45, 28);

                //---- t12 ----
                t12.setText("0.0");
                t12.setForeground(Color.white);
                t12.setFont(t12.getFont().deriveFont(t12.getFont().getSize() + 5f));
                panel3.add(t12);
                t12.setBounds(240, 100, 45, 28);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel1InfoDisplay.add(panel3);
            panel3.setBounds(765, 635, 340, 140);

            //======== panel2 ========
            {
                panel2.setBackground(Color.gray);
                panel2.setLayout(null);

                //---- warningText ----
                warningText.setBackground(Color.darkGray);
                panel2.add(warningText);
                warningText.setBounds(895, 5, 140, 35);

                //---- f1 ----
                f1.setText("0000-00-00");
                f1.setFont(f1.getFont().deriveFont(f1.getFont().getSize() + 2f));
                panel2.add(f1);
                f1.setBounds(10, 0, 105, 20);

                //---- f2 ----
                f2.setText("00:00:00");
                f2.setFont(f2.getFont().deriveFont(f2.getFont().getSize() + 2f));
                panel2.add(f2);
                f2.setBounds(15, 20, 90, 20);

                //---- f3 ----
                f3.setText("\u5e8a\u53f7");
                f3.setFont(f3.getFont().deriveFont(f3.getFont().getSize() + 8f));
                panel2.add(f3);
                f3.setBounds(120, 5, 60, 40);

                //---- f4 ----
                f4.setText("2");
                f4.setFont(f4.getFont().deriveFont(f4.getFont().getSize() + 6f));
                panel2.add(f4);
                f4.setBounds(190, 5, 55, 40);

                //---- f5 ----
                f5.setText("\u6210\u4eba");
                f5.setFont(f5.getFont().deriveFont(f5.getFont().getSize() + 8f));
                panel2.add(f5);
                f5.setBounds(255, 5, 70, 40);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1InfoDisplay.add(panel2);
            panel2.setBounds(0, 30, 1120, 45);

            //======== menuBar1 ========
            {
                menuBar1.setForeground(Color.white);
                menuBar1.setBackground(new Color(102, 102, 102));
                menuBar1.setBorder(new LineBorder(Color.darkGray));

                //======== m4 ========
                {
                    m4.setText("\u4e3b\u83dc\u5355");
                    m4.setFont(m4.getFont().deriveFont(m4.getFont().getSize() + 7f));
                    m4.setBackground(new Color(153, 153, 153));
                    m4.setForeground(Color.black);
                    m4.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            m4MouseClicked(e);
                        }
                    });

                    //---- m41 ----
                    m41.setText("\u75c5\u4eba\u4fe1\u606f\u8bbe\u7f6e");
                    m41.setFont(m41.getFont().deriveFont(m41.getFont().getSize() + 4f));
                    m41.setBackground(new Color(153, 153, 153));
                    m41.setForeground(Color.black);
                    m41.addActionListener(e -> PatientInfoActionPerformed(e));
                    m4.add(m41);

                    //---- m42 ----
                    m42.setText("\u62a5\u8b66\u8bbe\u7f6e");
                    m42.setFont(m42.getFont().deriveFont(m42.getFont().getSize() + 4f));
                    m42.setForeground(Color.black);
                    m42.setBackground(new Color(153, 153, 153));
                    m4.add(m42);

                    //======== m43 ========
                    {
                        m43.setText("\u6570\u636e\u56de\u987e");
                        m43.setBackground(new Color(153, 153, 153));
                        m43.setFont(m43.getFont().deriveFont(m43.getFont().getSize() + 4f));
                        m43.setForeground(Color.black);

                        //---- mI1 ----
                        mI1.setText("NIBP\u6d4b\u91cf\u56de\u987e");
                        mI1.setBackground(new Color(153, 153, 153));
                        mI1.setForeground(Color.black);
                        mI1.setFont(mI1.getFont().deriveFont(mI1.getFont().getSize() + 3f));
                        m43.add(mI1);

                        //---- mI2 ----
                        mI2.setText("\u5fc3\u7535\u6ce2\u5f62\u56de\u987e");
                        mI2.setBackground(new Color(153, 153, 153));
                        mI2.setFont(mI2.getFont().deriveFont(mI2.getFont().getSize() + 3f));
                        mI2.setForeground(Color.black);
                        m43.add(mI2);

                        //---- mI3 ----
                        mI3.setText("\u8109\u640f\u6ce2\u5f62\u56de\u987e");
                        mI3.setBackground(new Color(153, 153, 153));
                        mI3.setFont(mI3.getFont().deriveFont(mI3.getFont().getSize() + 3f));
                        mI3.setForeground(Color.black);
                        m43.add(mI3);

                        //---- mI4 ----
                        mI4.setText("\u547c\u5438\u6ce2\u5f62\u56de\u987e");
                        mI4.setBackground(new Color(153, 153, 153));
                        mI4.setForeground(Color.black);
                        mI4.setFont(mI4.getFont().deriveFont(mI4.getFont().getSize() + 3f));
                        m43.add(mI4);
                    }
                    m4.add(m43);

                    //---- m47 ----
                    m47.setText("\u5fc3\u7535\u5206\u6790");
                    m47.setFont(m47.getFont().deriveFont(m47.getFont().getSize() + 4f));
                    m47.setBackground(new Color(153, 153, 153));
                    m47.setForeground(Color.black);
                    m4.add(m47);
                }
                menuBar1.add(m4);

                //======== m3 ========
                {
                    m3.setText("\u65e0\u521b\u8840\u538b");
                    m3.setFont(m3.getFont().deriveFont(m3.getFont().getSize() + 7f));
                    m3.setBackground(new Color(153, 153, 153));
                    m3.setForeground(Color.black);

                    //---- StarMI ----
                    StarMI.setText("\u542f\u52a8\u6d4b\u91cf");
                    StarMI.setFont(StarMI.getFont().deriveFont(StarMI.getFont().getSize() + 4f));
                    StarMI.setBackground(new Color(153, 153, 153));
                    StarMI.setForeground(Color.black);
                    StarMI.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            StarNibpMouseClicked(e);
                        }
                    });
                    m3.add(StarMI);

                    //---- StopMI ----
                    StopMI.setText("\u505c\u6b62\u6d4b\u91cf");
                    StopMI.setFont(StopMI.getFont().deriveFont(StopMI.getFont().getSize() + 4f));
                    StopMI.setBackground(new Color(153, 153, 153));
                    StopMI.setForeground(Color.black);
                    StopMI.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            StopNibpMouseClicked(e);
                        }
                    });
                    m3.add(StopMI);
                }
                menuBar1.add(m3);
            }
            panel1InfoDisplay.add(menuBar1);
            menuBar1.setBounds(0, 0, 1120, 31);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1InfoDisplay.getComponentCount(); i++) {
                    Rectangle bounds = panel1InfoDisplay.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1InfoDisplay.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1InfoDisplay.setMinimumSize(preferredSize);
                panel1InfoDisplay.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1InfoDisplay);
        panel1InfoDisplay.setBounds(0, 0, 1118, 778);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1InfoDisplay;
    private MedicalWaveDisplayPanel ECGwavePanel1;
    private MedicalWaveDisplayPanel ECGwavePanel2;
    private MedicalWaveDisplayPanel Spo2WavePanel;
    private MedicalWaveDisplayPanel RESPwavePanel;
    private JPanel ECGdataPanel;
    private JLabel e1;
    private JLabel e2;
    private JLabel e3;
    private JLabel e4;
    private JLabel e5;
    private JLabel e6;
    private JLabel e7;
    private JLabel e8;
    private JLabel e9;
    private JLabel e10;
    private JLabel e11;
    private JLabel e0;
    private JPanel NIBPdataPanel;
    private JLabel n1;
    private JLabel n2;
    private JLabel n3;
    private JLabel n4;
    private JLabel n5;
    private JLabel n6;
    private JLabel n7;
    private JLabel n8;
    private JLabel n9;
    private JLabel n10;
    private JPanel panel1;
    private JLabel l1;
    private JLabel l2;
    private JPanel SPO2dataPanel;
    private JLabel s1;
    private JLabel s2;
    private JLabel s3;
    private JLabel s4;
    private JLabel s5;
    private JLabel s6;
    private JLabel s7;
    private JLabel s8;
    private JProgressBar spo2_Bar1;
    private JPanel RESPdataPanel;
    private JLabel r2;
    private JLabel r3;
    private JLabel r4;
    private JPanel panel3;
    private JLabel t1;
    private JLabel t2;
    private JLabel t3;
    private JLabel t4;
    private JLabel t5;
    private JLabel t6;
    private JLabel t7;
    private JLabel t8;
    private JLabel t9;
    private JLabel t10;
    private JLabel t11;
    private JLabel t12;
    private JPanel panel2;
    private JTextField warningText;
    private JLabel f1;
    private JLabel f2;
    private JLabel f3;
    private JLabel f4;
    private JLabel f5;
    private JMenuBar menuBar1;
    private JMenu m4;
    private JMenuItem m41;
    private JMenuItem m42;
    private JMenu m43;
    private JMenuItem mI1;
    private JMenuItem mI2;
    private JMenuItem mI3;
    private JMenuItem mI4;
    private JMenuItem m47;
    private JMenu m3;
    private JMenuItem StarMI;
    private JMenuItem StopMI;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void DrawStart()//绘制方格
    {
        this.ECGwavePanel1.DispStart();
        this.ECGwavePanel2.DispStart();
        this.Spo2WavePanel.DispStart();
        this.RESPwavePanel.DispStart();
        return;
    }

    public void setSPO2wavedata(int data1)
    {
        this.Spo2WavePanel.putSPO2data(data1);
        this.SetAllText();
    }

    public void setRESPwavedata(int data1)
    {
        this.RESPwavePanel.putRESPdata(data1);
        this.SetAllText();
    }

    public void setECGwavedata(int data1,int data2)
    {
        this.ECGwavePanel1.putECGdata(data1);//2导联
        this.ECGwavePanel2.putECGdata(data2);//1导联
        this.SetAllText();
    }


 //显示各参数数据
    public void SetAllText()
    {
        /**
         * NIBP
         */
        n2.setText(String.valueOf(sbp)); //收缩压
        n4.setText(String.valueOf(dbp)); //平均压
        n5.setText(String.valueOf(map)); //舒张压
        if(pre != 0) //袖带压
        {
            panel1.setVisible(true);
            l2.setText(String.valueOf(pre));
        }
        else if (pre < 3)
        {
            panel1.setVisible(false);
        }
        //测量模式
        if (msu_mode == 0)
            n10.setText(String.valueOf("手动测量...")); //默认
        else if (msu_mode == 1)
            n10.setText(String.valueOf("自动测量..."));
        else if (msu_mode == 2)
            n10.setText(String.valueOf("连续测量..."));
        //测量时间
        n1.setText(dateFormat1.format(time));

        /**
         * ECG模块
         */
        if(hr == -100) //心率
            e1.setText(String.valueOf("- - -")); //Invalid value
        else
            e1.setText(String.valueOf(hr));
   //     System.out.println("========= hr =  "+hr);

        /**
         * SPO2模块
         */
        if (spo2 == 120) //血氧
            s2.setText(String.valueOf("- - -")); //Invalid value
        else if ((spo2 <= 100)&&(spo2 >= 0))
            s2.setText(String.valueOf(spo2));
        if (pr == 255) //脉率
            s3.setText(String.valueOf("- - -"));
        else s3.setText(String.valueOf(pr)); //if ((pr >= 25)&&(pr <255))

        spo2_Bar1.setValue(spo2_bar); //棒图
        /*if(spo2_voice == 1)

        else*/

 //       System.out.println("spo2 = "+spo2 +"    pr = "+pr);



        /**
         * RESP模块
         */
        if (rr == 240) //呼吸率
        {
            r4.setText(String.valueOf("- - -")); //Invalid value
        }
        else  r4.setText(String.valueOf(rr));
    //    System.out.println(" rr = "+rr);

        /**
         * TEMP模块
         */
        if (bt1 == 600.0)
            t2.setText(String.valueOf("- - -")); //Invalid value
        else
            t2.setText(String.valueOf(bt1));
        if (bt2 == 600.0)
            t4.setText(String.valueOf("- - -"));
        else
            t4.setText(String.valueOf(bt2));
    //    System.out.println(" bt1 = "+bt1+"    bt2 = "+bt2);
        /**
         * 显示时间
         */
        f1.setText(dateFormat2.format(time));
        f2.setText(dateFormat3.format(time));
        System.out.println(dateFormat3.format(time));
    }

    public void run()
    {
        int _count = 0;
        while (go_thread)
        {
            try
            {
            //    setSPO2_ECG_RESPwavedata(para_spo2.getSPO2_WAVE(),para_resp.getRESP_WAVE());

                System.out.println("Sleep Count"+_count);
                Thread.sleep(0);      //every millisecond to check the windows is showing,

            }catch(InterruptedException e)
            {
                go_thread = false;
            }
            _count ++;
        }
        return;
    }
    public void DrawStop()
    {
        // this.m_MedInforPanel.DispStop();
        return;
    }
}
