import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.plaf.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class WarningSetting {
     public WarningSetting() {
         initComponents();
         WarningSetting.setVisible(true);
    }

    //获取warning slider值在text中显示
    private void SBPslider1StateChanged(ChangeEvent e) {
        SBPslider1.setValue(SBPslider1.getValue());
        SBPslider1.setMinimum(SBPslider2.getValue());
        SBPtextField1.setText("" + SBPslider1.getValue());
        SBPslider1.repaint();
       /* if (!SBPslider1.getValueIsAdjusting()) {
            int value = SBPslider1.getValue();
            SBPtextField1.setText(""+ value);
            SBPslider1.setValue(value);*/
        }
    private void SBPslider2StateChanged(ChangeEvent e) {
        SBPtextField2.setText(""+  SBPslider2.getValue());
        SBPslider2.setMaximum(SBPslider1.getValue());
    }

    private void DBPslider1StateChanged(ChangeEvent e) {
        DBPtextField1.setText(""+  DBPslider1.getValue());
        DBPslider1.setMinimum(DBPslider2.getValue());
    }

    private void DBPslider2StateChanged(ChangeEvent e) {
        DBPtextField2.setText(""+  DBPslider2.getValue());
        DBPslider2.setMaximum(DBPslider1.getValue());
    }

    private void HRslider1StateChanged(ChangeEvent e) {
        HRtextField1.setText(""+  HRslider1.getValue());
        HRslider1.setMinimum(HRslider2.getValue());
    }

    private void HRslider2StateChanged(ChangeEvent e) {
        HRtextField2.setText(""+  HRslider2.getValue());
        HRslider2.setMaximum(HRslider1.getValue());
    }

    private void PRslider1StateChanged(ChangeEvent e) {
        PRtextField1.setText(""+  PRslider1.getValue());
        PRslider1.setMinimum(PRslider2.getValue());
    }

    private void PRslider2StateChanged(ChangeEvent e) {
        PRtextField2.setText(""+  PRslider2.getValue());
        PRslider2.setMaximum(PRslider1.getValue());
     }

     private void SPO2slider1StateChanged(ChangeEvent e) {
         SPO2textField1.setText(""+  SPO2slider1.getValue());
         SPO2slider1.setMinimum(SPO2slider2.getValue());
     }

     private void SPO2slider2StateChanged(ChangeEvent e) {
         SPO2textField2.setText(""+  SPO2slider2.getValue());
         SPO2slider2.setMaximum(SPO2slider1.getValue());
     }

     private void RESPslider1StateChanged(ChangeEvent e) {
         RESPtextField1.setText(""+  RESPslider1.getValue());
         RESPslider1.setMinimum(RESPslider2.getValue());
     }

     private void RESPslider2StateChanged(ChangeEvent e) {
         RESPtextField2.setText(""+  RESPslider2.getValue());
         RESPslider2.setMaximum(RESPslider1.getValue());
     }

     private void T1slider1StateChanged(ChangeEvent e) {
         T1textField1.setText(""+  T1slider1.getValue());
         T1slider1.setMinimum(T1slider2.getValue());
     }

     private void T1slider2StateChanged(ChangeEvent e) {
         T1textField2.setText("" + T1slider2.getValue());
         T1slider2.setMaximum(T1slider1.getValue());
     }

     private void T2slider1StateChanged(ChangeEvent e) {
         T2textField1.setText(""+  T2slider1.getValue());
         T2slider1.setMinimum(T2slider2.getValue());
     }

     private void T2slider2StateChanged(ChangeEvent e) {
         T2textField2.setText(""+  T2slider2.getValue());
         T2slider2.setMaximum(T2slider1.getValue());
     }

     private void TDsliderStateChanged(ChangeEvent e) {
         TDtextField.setText(""+  TDslider.getValue());
     }

     //warning窗口关闭
     private void CloseBtnMouseClicked(MouseEvent e) {
         WarningSetting.dispose();
     }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        WarningSetting = new JFrame();
        HRWarningPanel2 = new JPanel();
        label18 = new JLabel();
        label19 = new JLabel();
        label26 = new JLabel();
        HRslider1 = new JSlider();
        HRslider2 = new JSlider();
        HRtextField1 = new JTextField();
        HRtextField2 = new JTextField();
        SBPWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        SBPslider1 = new JSlider();
        SBPslider2 = new JSlider();
        SBPtextField1 = new JTextField();
        SBPtextField2 = new JTextField();
        DBPWarningPanel = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        DBPslider1 = new JSlider();
        DBPslider2 = new JSlider();
        DBPtextField1 = new JTextField();
        DBPtextField2 = new JTextField();
        SPO2WarningPanel2 = new JPanel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        SPO2slider1 = new JSlider();
        SPO2slider2 = new JSlider();
        SPO2textField1 = new JTextField();
        SPO2textField2 = new JTextField();
        RESPWarningPanel = new JPanel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        RESPslider1 = new JSlider();
        RESPslider2 = new JSlider();
        RESPtextField1 = new JTextField();
        RESPtextField2 = new JTextField();
        PRWarningPanel = new JPanel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        PRslider1 = new JSlider();
        PRslider2 = new JSlider();
        PRtextField1 = new JTextField();
        PRtextField2 = new JTextField();
        T1WarningPanel = new JPanel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        T1slider1 = new JSlider();
        T1slider2 = new JSlider();
        T1textField1 = new JTextField();
        T1textField2 = new JTextField();
        T2WarningPanel = new JPanel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        T2slider1 = new JSlider();
        T2slider2 = new JSlider();
        T2textField1 = new JTextField();
        T2textField2 = new JTextField();
        TDWarningPanel = new JPanel();
        label16 = new JLabel();
        label17 = new JLabel();
        TDslider = new JSlider();
        TDtextField = new JTextField();
        panel1 = new JPanel();
        SureBtn = new JButton();
        CloseBtn = new JButton();

        //======== WarningSetting ========
        {
            WarningSetting.setTitle("Warning Setting");
            WarningSetting.setMaximizedBounds(null);
            WarningSetting.setBackground(new Color(60, 63, 65));
            WarningSetting.setResizable(false);
            WarningSetting.setUndecorated(true);
            Container WarningSettingContentPane = WarningSetting.getContentPane();
            WarningSettingContentPane.setLayout(null);

            //======== HRWarningPanel2 ========
            {
                HRWarningPanel2.setBackground(new Color(60, 63, 65));
                HRWarningPanel2.setLayout(null);

                //---- label18 ----
                label18.setText("HR");
                label18.setFont(label18.getFont().deriveFont(label18.getFont().getSize() + 6f));
                label18.setForeground(Color.lightGray);
                HRWarningPanel2.add(label18);
                label18.setBounds(new Rectangle(new Point(70, 10), label18.getPreferredSize()));

                //---- label19 ----
                label19.setText("\u4e0a\u9650");
                label19.setFont(label19.getFont().deriveFont(label19.getFont().getSize() + 5f));
                label19.setForeground(Color.lightGray);
                HRWarningPanel2.add(label19);
                label19.setBounds(new Rectangle(new Point(30, 35), label19.getPreferredSize()));

                //---- label26 ----
                label26.setText("\u4e0b\u9650");
                label26.setFont(label26.getFont().deriveFont(label26.getFont().getSize() + 5f));
                label26.setForeground(Color.lightGray);
                HRWarningPanel2.add(label26);
                label26.setBounds(new Rectangle(new Point(100, 35), label26.getPreferredSize()));

                //---- HRslider1 ----
                HRslider1.setOrientation(SwingConstants.VERTICAL);
                HRslider1.setMaximum(300);
                HRslider1.setBackground(new Color(60, 63, 65));
                HRslider1.addChangeListener(e -> HRslider1StateChanged(e));
                HRWarningPanel2.add(HRslider1);
                HRslider1.setBounds(35, 60, HRslider1.getPreferredSize().width, 100);

                //---- HRslider2 ----
                HRslider2.setOrientation(SwingConstants.VERTICAL);
                HRslider2.setMaximum(300);
                HRslider2.setBackground(new Color(60, 63, 65));
                HRslider2.addChangeListener(e -> HRslider2StateChanged(e));
                HRWarningPanel2.add(HRslider2);
                HRslider2.setBounds(105, 60, HRslider2.getPreferredSize().width, 100);

                //---- HRtextField1 ----
                HRtextField1.setForeground(Color.lightGray);
                HRtextField1.setBackground(Color.darkGray);
                HRWarningPanel2.add(HRtextField1);
                HRtextField1.setBounds(15, 165, 60, 25);

                //---- HRtextField2 ----
                HRtextField2.setForeground(Color.lightGray);
                HRtextField2.setBackground(Color.darkGray);
                HRWarningPanel2.add(HRtextField2);
                HRtextField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < HRWarningPanel2.getComponentCount(); i++) {
                        Rectangle bounds = HRWarningPanel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = HRWarningPanel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    HRWarningPanel2.setMinimumSize(preferredSize);
                    HRWarningPanel2.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(HRWarningPanel2);
            HRWarningPanel2.setBounds(0, 0, 170, 200);

            //======== SBPWarningPanel ========
            {
                SBPWarningPanel.setBackground(new Color(60, 63, 65));
                SBPWarningPanel.setLayout(null);

                //---- label1 ----
                label1.setText("SBP");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
                label1.setForeground(Color.lightGray);
                SBPWarningPanel.add(label1);
                label1.setBounds(new Rectangle(new Point(70, 10), label1.getPreferredSize()));

                //---- label2 ----
                label2.setText("\u4e0a\u9650");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
                label2.setForeground(Color.lightGray);
                SBPWarningPanel.add(label2);
                label2.setBounds(new Rectangle(new Point(30, 35), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("\u4e0b\u9650");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
                label3.setForeground(Color.lightGray);
                SBPWarningPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(100, 35), label3.getPreferredSize()));

                //---- SBPslider1 ----
                SBPslider1.setOrientation(SwingConstants.VERTICAL);
                SBPslider1.setMaximum(300);
                SBPslider1.setBackground(new Color(60, 63, 65));
                SBPslider1.addChangeListener(e -> SBPslider1StateChanged(e));
                SBPWarningPanel.add(SBPslider1);
                SBPslider1.setBounds(35, 60, SBPslider1.getPreferredSize().width, 100);

                //---- SBPslider2 ----
                SBPslider2.setOrientation(SwingConstants.VERTICAL);
                SBPslider2.setMaximum(300);
                SBPslider2.setBackground(new Color(60, 63, 65));
                SBPslider2.addChangeListener(e -> SBPslider2StateChanged(e));
                SBPWarningPanel.add(SBPslider2);
                SBPslider2.setBounds(105, 60, SBPslider2.getPreferredSize().width, 100);

                //---- SBPtextField1 ----
                SBPtextField1.setForeground(Color.lightGray);
                SBPtextField1.setBackground(Color.darkGray);
                SBPWarningPanel.add(SBPtextField1);
                SBPtextField1.setBounds(15, 165, 60, 25);

                //---- SBPtextField2 ----
                SBPtextField2.setForeground(Color.lightGray);
                SBPtextField2.setBackground(Color.darkGray);
                SBPWarningPanel.add(SBPtextField2);
                SBPtextField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < SBPWarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = SBPWarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = SBPWarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    SBPWarningPanel.setMinimumSize(preferredSize);
                    SBPWarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(SBPWarningPanel);
            SBPWarningPanel.setBounds(170, 0, 170, 200);

            //======== DBPWarningPanel ========
            {
                DBPWarningPanel.setBackground(new Color(60, 63, 65));
                DBPWarningPanel.setLayout(null);

                //---- label4 ----
                label4.setText("DBP");
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 6f));
                label4.setForeground(Color.lightGray);
                DBPWarningPanel.add(label4);
                label4.setBounds(new Rectangle(new Point(70, 10), label4.getPreferredSize()));

                //---- label5 ----
                label5.setText("\u4e0a\u9650");
                label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
                label5.setForeground(Color.lightGray);
                DBPWarningPanel.add(label5);
                label5.setBounds(new Rectangle(new Point(30, 35), label5.getPreferredSize()));

                //---- label6 ----
                label6.setText("\u4e0b\u9650");
                label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
                label6.setForeground(Color.lightGray);
                DBPWarningPanel.add(label6);
                label6.setBounds(new Rectangle(new Point(100, 35), label6.getPreferredSize()));

                //---- DBPslider1 ----
                DBPslider1.setOrientation(SwingConstants.VERTICAL);
                DBPslider1.setMaximum(300);
                DBPslider1.setBackground(new Color(60, 63, 65));
                DBPslider1.addChangeListener(e -> DBPslider1StateChanged(e));
                DBPWarningPanel.add(DBPslider1);
                DBPslider1.setBounds(35, 60, DBPslider1.getPreferredSize().width, 100);

                //---- DBPslider2 ----
                DBPslider2.setOrientation(SwingConstants.VERTICAL);
                DBPslider2.setMaximum(300);
                DBPslider2.setBackground(new Color(60, 63, 65));
                DBPslider2.addChangeListener(e -> DBPslider2StateChanged(e));
                DBPWarningPanel.add(DBPslider2);
                DBPslider2.setBounds(105, 60, DBPslider2.getPreferredSize().width, 100);

                //---- DBPtextField1 ----
                DBPtextField1.setForeground(Color.lightGray);
                DBPtextField1.setBackground(Color.darkGray);
                DBPWarningPanel.add(DBPtextField1);
                DBPtextField1.setBounds(15, 165, 60, 25);

                //---- DBPtextField2 ----
                DBPtextField2.setForeground(Color.lightGray);
                DBPtextField2.setBackground(Color.darkGray);
                DBPWarningPanel.add(DBPtextField2);
                DBPtextField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < DBPWarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = DBPWarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = DBPWarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    DBPWarningPanel.setMinimumSize(preferredSize);
                    DBPWarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(DBPWarningPanel);
            DBPWarningPanel.setBounds(340, 0, 170, 200);

            //======== SPO2WarningPanel2 ========
            {
                SPO2WarningPanel2.setBackground(new Color(60, 63, 65));
                SPO2WarningPanel2.setLayout(null);

                //---- label23 ----
                label23.setText("SPO2 ");
                label23.setFont(label23.getFont().deriveFont(label23.getFont().getSize() + 6f));
                label23.setForeground(Color.lightGray);
                SPO2WarningPanel2.add(label23);
                label23.setBounds(new Rectangle(new Point(65, 10), label23.getPreferredSize()));

                //---- label24 ----
                label24.setText("\u4e0a\u9650");
                label24.setFont(label24.getFont().deriveFont(label24.getFont().getSize() + 5f));
                label24.setForeground(Color.lightGray);
                SPO2WarningPanel2.add(label24);
                label24.setBounds(new Rectangle(new Point(30, 35), label24.getPreferredSize()));

                //---- label25 ----
                label25.setText("\u4e0b\u9650");
                label25.setFont(label25.getFont().deriveFont(label25.getFont().getSize() + 5f));
                label25.setForeground(Color.lightGray);
                SPO2WarningPanel2.add(label25);
                label25.setBounds(new Rectangle(new Point(100, 35), label25.getPreferredSize()));

                //---- SPO2slider1 ----
                SPO2slider1.setOrientation(SwingConstants.VERTICAL);
                SPO2slider1.setBackground(new Color(60, 63, 65));
                SPO2slider1.setMaximum(250);
                SPO2slider1.addChangeListener(e -> SPO2slider1StateChanged(e));
                SPO2WarningPanel2.add(SPO2slider1);
                SPO2slider1.setBounds(35, 60, SPO2slider1.getPreferredSize().width, 100);

                //---- SPO2slider2 ----
                SPO2slider2.setOrientation(SwingConstants.VERTICAL);
                SPO2slider2.setBackground(new Color(60, 63, 65));
                SPO2slider2.setMaximum(250);
                SPO2slider2.addChangeListener(e -> SPO2slider2StateChanged(e));
                SPO2WarningPanel2.add(SPO2slider2);
                SPO2slider2.setBounds(105, 60, SPO2slider2.getPreferredSize().width, 100);

                //---- SPO2textField1 ----
                SPO2textField1.setBackground(Color.darkGray);
                SPO2textField1.setForeground(Color.lightGray);
                SPO2WarningPanel2.add(SPO2textField1);
                SPO2textField1.setBounds(15, 165, 60, 25);

                //---- SPO2textField2 ----
                SPO2textField2.setBackground(Color.darkGray);
                SPO2textField2.setForeground(Color.lightGray);
                SPO2WarningPanel2.add(SPO2textField2);
                SPO2textField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < SPO2WarningPanel2.getComponentCount(); i++) {
                        Rectangle bounds = SPO2WarningPanel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = SPO2WarningPanel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    SPO2WarningPanel2.setMinimumSize(preferredSize);
                    SPO2WarningPanel2.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(SPO2WarningPanel2);
            SPO2WarningPanel2.setBounds(0, 200, 170, 200);

            //======== RESPWarningPanel ========
            {
                RESPWarningPanel.setBackground(new Color(60, 63, 65));
                RESPWarningPanel.setLayout(null);

                //---- label20 ----
                label20.setText("RESP");
                label20.setFont(label20.getFont().deriveFont(label20.getFont().getSize() + 6f));
                label20.setForeground(Color.lightGray);
                RESPWarningPanel.add(label20);
                label20.setBounds(new Rectangle(new Point(70, 10), label20.getPreferredSize()));

                //---- label21 ----
                label21.setText("\u4e0a\u9650");
                label21.setFont(label21.getFont().deriveFont(label21.getFont().getSize() + 5f));
                label21.setForeground(Color.lightGray);
                RESPWarningPanel.add(label21);
                label21.setBounds(new Rectangle(new Point(30, 35), label21.getPreferredSize()));

                //---- label22 ----
                label22.setText("\u4e0b\u9650");
                label22.setFont(label22.getFont().deriveFont(label22.getFont().getSize() + 5f));
                label22.setForeground(Color.lightGray);
                RESPWarningPanel.add(label22);
                label22.setBounds(new Rectangle(new Point(100, 35), label22.getPreferredSize()));

                //---- RESPslider1 ----
                RESPslider1.setOrientation(SwingConstants.VERTICAL);
                RESPslider1.setBackground(new Color(60, 63, 65));
                RESPslider1.setForeground(new Color(153, 153, 153));
                RESPslider1.setMaximum(250);
                RESPslider1.addChangeListener(e -> RESPslider1StateChanged(e));
                RESPWarningPanel.add(RESPslider1);
                RESPslider1.setBounds(35, 60, RESPslider1.getPreferredSize().width, 100);

                //---- RESPslider2 ----
                RESPslider2.setOrientation(SwingConstants.VERTICAL);
                RESPslider2.setBackground(new Color(60, 63, 65));
                RESPslider2.setMaximum(250);
                RESPslider2.addChangeListener(e -> RESPslider2StateChanged(e));
                RESPWarningPanel.add(RESPslider2);
                RESPslider2.setBounds(105, 60, RESPslider2.getPreferredSize().width, 100);

                //---- RESPtextField1 ----
                RESPtextField1.setBackground(Color.darkGray);
                RESPtextField1.setForeground(Color.lightGray);
                RESPWarningPanel.add(RESPtextField1);
                RESPtextField1.setBounds(15, 165, 60, 25);

                //---- RESPtextField2 ----
                RESPtextField2.setBackground(Color.darkGray);
                RESPtextField2.setForeground(Color.lightGray);
                RESPWarningPanel.add(RESPtextField2);
                RESPtextField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < RESPWarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = RESPWarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = RESPWarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    RESPWarningPanel.setMinimumSize(preferredSize);
                    RESPWarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(RESPWarningPanel);
            RESPWarningPanel.setBounds(340, 200, 170, 200);

            //======== PRWarningPanel ========
            {
                PRWarningPanel.setBackground(new Color(60, 63, 65));
                PRWarningPanel.setLayout(null);

                //---- label7 ----
                label7.setText("PR");
                label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 6f));
                label7.setForeground(Color.lightGray);
                PRWarningPanel.add(label7);
                label7.setBounds(new Rectangle(new Point(70, 10), label7.getPreferredSize()));

                //---- label8 ----
                label8.setText("\u4e0a\u9650");
                label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 5f));
                label8.setForeground(Color.lightGray);
                PRWarningPanel.add(label8);
                label8.setBounds(new Rectangle(new Point(30, 35), label8.getPreferredSize()));

                //---- label9 ----
                label9.setText("\u4e0b\u9650");
                label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 5f));
                label9.setForeground(Color.lightGray);
                PRWarningPanel.add(label9);
                label9.setBounds(new Rectangle(new Point(100, 35), label9.getPreferredSize()));

                //---- PRslider1 ----
                PRslider1.setOrientation(SwingConstants.VERTICAL);
                PRslider1.setMaximum(250);
                PRslider1.setBackground(new Color(60, 63, 65));
                PRslider1.addChangeListener(e -> PRslider1StateChanged(e));
                PRWarningPanel.add(PRslider1);
                PRslider1.setBounds(35, 60, PRslider1.getPreferredSize().width, 100);

                //---- PRslider2 ----
                PRslider2.setOrientation(SwingConstants.VERTICAL);
                PRslider2.setMaximum(250);
                PRslider2.setBackground(new Color(60, 63, 65));
                PRslider2.addChangeListener(e -> PRslider2StateChanged(e));
                PRWarningPanel.add(PRslider2);
                PRslider2.setBounds(105, 60, PRslider2.getPreferredSize().width, 100);

                //---- PRtextField1 ----
                PRtextField1.setForeground(Color.lightGray);
                PRtextField1.setBackground(Color.darkGray);
                PRWarningPanel.add(PRtextField1);
                PRtextField1.setBounds(15, 165, 60, 25);

                //---- PRtextField2 ----
                PRtextField2.setForeground(Color.lightGray);
                PRtextField2.setBackground(Color.darkGray);
                PRWarningPanel.add(PRtextField2);
                PRtextField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < PRWarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = PRWarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = PRWarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    PRWarningPanel.setMinimumSize(preferredSize);
                    PRWarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(PRWarningPanel);
            PRWarningPanel.setBounds(170, 200, 170, 200);

            //======== T1WarningPanel ========
            {
                T1WarningPanel.setBackground(new Color(60, 63, 65));
                T1WarningPanel.setLayout(null);

                //---- label10 ----
                label10.setText("T1");
                label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 6f));
                label10.setForeground(Color.lightGray);
                T1WarningPanel.add(label10);
                label10.setBounds(new Rectangle(new Point(70, 10), label10.getPreferredSize()));

                //---- label11 ----
                label11.setText("\u4e0a\u9650");
                label11.setFont(label11.getFont().deriveFont(label11.getFont().getSize() + 5f));
                label11.setForeground(Color.lightGray);
                T1WarningPanel.add(label11);
                label11.setBounds(new Rectangle(new Point(30, 35), label11.getPreferredSize()));

                //---- label12 ----
                label12.setText("\u4e0b\u9650");
                label12.setFont(label12.getFont().deriveFont(label12.getFont().getSize() + 5f));
                label12.setForeground(Color.lightGray);
                T1WarningPanel.add(label12);
                label12.setBounds(new Rectangle(new Point(100, 35), label12.getPreferredSize()));

                //---- T1slider1 ----
                T1slider1.setOrientation(SwingConstants.VERTICAL);
                T1slider1.setMajorTickSpacing(10);
                T1slider1.setMinorTickSpacing(1);
                T1slider1.setBackground(new Color(60, 63, 65));
                T1slider1.addChangeListener(e -> T1slider1StateChanged(e));
                T1WarningPanel.add(T1slider1);
                T1slider1.setBounds(35, 60, T1slider1.getPreferredSize().width, 100);

                //---- T1slider2 ----
                T1slider2.setOrientation(SwingConstants.VERTICAL);
                T1slider2.setMajorTickSpacing(10);
                T1slider2.setMinorTickSpacing(1);
                T1slider2.setBackground(new Color(60, 63, 65));
                T1slider2.addChangeListener(e -> T1slider2StateChanged(e));
                T1WarningPanel.add(T1slider2);
                T1slider2.setBounds(105, 60, T1slider2.getPreferredSize().width, 100);

                //---- T1textField1 ----
                T1textField1.setBackground(Color.darkGray);
                T1textField1.setForeground(Color.lightGray);
                T1WarningPanel.add(T1textField1);
                T1textField1.setBounds(15, 165, 60, 25);

                //---- T1textField2 ----
                T1textField2.setBackground(Color.darkGray);
                T1textField2.setForeground(Color.lightGray);
                T1WarningPanel.add(T1textField2);
                T1textField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < T1WarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = T1WarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = T1WarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    T1WarningPanel.setMinimumSize(preferredSize);
                    T1WarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(T1WarningPanel);
            T1WarningPanel.setBounds(0, 400, 170, 200);

            //======== T2WarningPanel ========
            {
                T2WarningPanel.setBackground(new Color(60, 63, 65));
                T2WarningPanel.setLayout(null);

                //---- label13 ----
                label13.setText("T2");
                label13.setFont(label13.getFont().deriveFont(label13.getFont().getSize() + 6f));
                label13.setForeground(Color.lightGray);
                T2WarningPanel.add(label13);
                label13.setBounds(new Rectangle(new Point(70, 10), label13.getPreferredSize()));

                //---- label14 ----
                label14.setText("\u4e0a\u9650");
                label14.setFont(label14.getFont().deriveFont(label14.getFont().getSize() + 5f));
                label14.setForeground(Color.lightGray);
                T2WarningPanel.add(label14);
                label14.setBounds(new Rectangle(new Point(30, 35), label14.getPreferredSize()));

                //---- label15 ----
                label15.setText("\u4e0b\u9650");
                label15.setFont(label15.getFont().deriveFont(label15.getFont().getSize() + 5f));
                label15.setForeground(Color.lightGray);
                T2WarningPanel.add(label15);
                label15.setBounds(new Rectangle(new Point(100, 35), label15.getPreferredSize()));

                //---- T2slider1 ----
                T2slider1.setOrientation(SwingConstants.VERTICAL);
                T2slider1.setMajorTickSpacing(10);
                T2slider1.setMinorTickSpacing(1);
                T2slider1.setBackground(new Color(60, 63, 65));
                T2slider1.addChangeListener(e -> T2slider1StateChanged(e));
                T2WarningPanel.add(T2slider1);
                T2slider1.setBounds(35, 60, T2slider1.getPreferredSize().width, 100);

                //---- T2slider2 ----
                T2slider2.setOrientation(SwingConstants.VERTICAL);
                T2slider2.setMajorTickSpacing(10);
                T2slider2.setMinorTickSpacing(1);
                T2slider2.setBackground(new Color(60, 63, 65));
                T2slider2.addChangeListener(e -> T2slider2StateChanged(e));
                T2WarningPanel.add(T2slider2);
                T2slider2.setBounds(105, 60, T2slider2.getPreferredSize().width, 100);

                //---- T2textField1 ----
                T2textField1.setBackground(Color.darkGray);
                T2textField1.setForeground(Color.lightGray);
                T2WarningPanel.add(T2textField1);
                T2textField1.setBounds(15, 165, 60, 25);

                //---- T2textField2 ----
                T2textField2.setBackground(Color.darkGray);
                T2textField2.setForeground(Color.lightGray);
                T2WarningPanel.add(T2textField2);
                T2textField2.setBounds(95, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < T2WarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = T2WarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = T2WarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    T2WarningPanel.setMinimumSize(preferredSize);
                    T2WarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(T2WarningPanel);
            T2WarningPanel.setBounds(170, 400, 170, 200);

            //======== TDWarningPanel ========
            {
                TDWarningPanel.setBackground(new Color(60, 63, 65));
                TDWarningPanel.setLayout(null);

                //---- label16 ----
                label16.setText("TD");
                label16.setFont(label16.getFont().deriveFont(label16.getFont().getSize() + 6f));
                label16.setForeground(Color.lightGray);
                TDWarningPanel.add(label16);
                label16.setBounds(new Rectangle(new Point(35, 10), label16.getPreferredSize()));

                //---- label17 ----
                label17.setText("\u4e0a\u9650");
                label17.setFont(label17.getFont().deriveFont(label17.getFont().getSize() + 5f));
                label17.setForeground(Color.lightGray);
                TDWarningPanel.add(label17);
                label17.setBounds(30, 35, 50, label17.getPreferredSize().height);

                //---- TDslider ----
                TDslider.setOrientation(SwingConstants.VERTICAL);
                TDslider.setMaximum(50);
                TDslider.setMajorTickSpacing(1);
                TDslider.setValue(2);
                TDslider.setBackground(new Color(60, 63, 65));
                TDslider.addChangeListener(e -> TDsliderStateChanged(e));
                TDWarningPanel.add(TDslider);
                TDslider.setBounds(35, 60, TDslider.getPreferredSize().width, 100);

                //---- TDtextField ----
                TDtextField.setBackground(Color.darkGray);
                TDtextField.setForeground(Color.lightGray);
                TDWarningPanel.add(TDtextField);
                TDtextField.setBounds(15, 165, 60, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < TDWarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = TDWarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = TDWarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    TDWarningPanel.setMinimumSize(preferredSize);
                    TDWarningPanel.setPreferredSize(preferredSize);
                }
            }
            WarningSettingContentPane.add(TDWarningPanel);
            TDWarningPanel.setBounds(340, 400, 170, 200);

            //======== panel1 ========
            {
                panel1.setBackground(new Color(60, 63, 65));
                panel1.setMaximumSize(new Dimension(359, 39));
                panel1.setLayout(null);

                //---- SureBtn ----
                SureBtn.setText("\u4fdd\u5b58");
                SureBtn.setBackground(Color.gray);
                SureBtn.setFont(SureBtn.getFont().deriveFont(SureBtn.getFont().getSize() + 4f));
                SureBtn.setActionCommand("save");
                panel1.add(SureBtn);
                SureBtn.setBounds(120, 15, 80, 25);

                //---- CloseBtn ----
                CloseBtn.setText("\u5173\u95ed");
                CloseBtn.setBackground(Color.gray);
                CloseBtn.setFont(CloseBtn.getFont().deriveFont(CloseBtn.getFont().getSize() + 4f));
                CloseBtn.setActionCommand("close");
                CloseBtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        CloseBtnMouseClicked(e);
                    }
                });
                panel1.add(CloseBtn);
                CloseBtn.setBounds(285, 15, 80, 25);

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
            WarningSettingContentPane.add(panel1);
            panel1.setBounds(0, 600, 510, 55);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < WarningSettingContentPane.getComponentCount(); i++) {
                    Rectangle bounds = WarningSettingContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = WarningSettingContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                WarningSettingContentPane.setMinimumSize(preferredSize);
                WarningSettingContentPane.setPreferredSize(preferredSize);
            }
            WarningSetting.pack();
            WarningSetting.setLocationRelativeTo(WarningSetting.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame WarningSetting;
    private JPanel HRWarningPanel2;
    private JLabel label18;
    private JLabel label19;
    private JLabel label26;
    private JSlider HRslider1;
    private JSlider HRslider2;
    private JTextField HRtextField1;
    private JTextField HRtextField2;
    private JPanel SBPWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider SBPslider1;
    private JSlider SBPslider2;
    private JTextField SBPtextField1;
    private JTextField SBPtextField2;
    private JPanel DBPWarningPanel;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JSlider DBPslider1;
    private JSlider DBPslider2;
    private JTextField DBPtextField1;
    private JTextField DBPtextField2;
    private JPanel SPO2WarningPanel2;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JSlider SPO2slider1;
    private JSlider SPO2slider2;
    private JTextField SPO2textField1;
    private JTextField SPO2textField2;
    private JPanel RESPWarningPanel;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JSlider RESPslider1;
    private JSlider RESPslider2;
    private JTextField RESPtextField1;
    private JTextField RESPtextField2;
    private JPanel PRWarningPanel;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JSlider PRslider1;
    private JSlider PRslider2;
    private JTextField PRtextField1;
    private JTextField PRtextField2;
    private JPanel T1WarningPanel;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JSlider T1slider1;
    private JSlider T1slider2;
    private JTextField T1textField1;
    private JTextField T1textField2;
    private JPanel T2WarningPanel;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JSlider T2slider1;
    private JSlider T2slider2;
    private JTextField T2textField1;
    private JTextField T2textField2;
    private JPanel TDWarningPanel;
    private JLabel label16;
    private JLabel label17;
    private JSlider TDslider;
    private JTextField TDtextField;
    private JPanel panel1;
    private JButton SureBtn;
    private JButton CloseBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
