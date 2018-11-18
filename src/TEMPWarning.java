import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class TEMPWarning {
    public TEMPWarning() {
        initComponents();
        TEMPWarning.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        TEMPWarning = new JFrame();
        T1WarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        T1slider1 = new JSlider();
        T1slider2 = new JSlider();
        T1textField1 = new JTextField();
        T1textField2 = new JTextField();
        T2WarningPanel = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        T2slider1 = new JSlider();
        T2slider2 = new JSlider();
        T2textField1 = new JTextField();
        T2textField2 = new JTextField();
        TDWarningPanel = new JPanel();
        label7 = new JLabel();
        label9 = new JLabel();
        TDslider = new JSlider();
        TDtextField = new JTextField();

        //======== TEMPWarning ========
        {
            TEMPWarning.setTitle("TEMP Alarm Setting");
            TEMPWarning.setMaximizedBounds(null);
            Container TEMPWarningContentPane = TEMPWarning.getContentPane();
            TEMPWarningContentPane.setLayout(null);

            //======== T1WarningPanel ========
            {
                T1WarningPanel.setBackground(new Color(60, 63, 65));
                T1WarningPanel.setLayout(null);

                //---- label1 ----
                label1.setText("T1");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
                label1.setForeground(Color.lightGray);
                T1WarningPanel.add(label1);
                label1.setBounds(90, 20, 55, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("\u4e0a\u9650");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
                label2.setForeground(Color.lightGray);
                T1WarningPanel.add(label2);
                label2.setBounds(new Rectangle(new Point(45, 60), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("\u4e0b\u9650");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
                label3.setForeground(Color.lightGray);
                T1WarningPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(120, 60), label3.getPreferredSize()));

                //---- T1slider1 ----
                T1slider1.setOrientation(SwingConstants.VERTICAL);
                T1slider1.setMajorTickSpacing(10);
                T1slider1.setMinorTickSpacing(1);
                T1slider1.setBackground(new Color(60, 63, 65));
                T1WarningPanel.add(T1slider1);
                T1slider1.setBounds(40, 90, T1slider1.getPreferredSize().width, 100);

                //---- T1slider2 ----
                T1slider2.setOrientation(SwingConstants.VERTICAL);
                T1slider2.setMajorTickSpacing(10);
                T1slider2.setMinorTickSpacing(1);
                T1slider2.setBackground(new Color(60, 63, 65));
                T1WarningPanel.add(T1slider2);
                T1slider2.setBounds(120, 90, T1slider2.getPreferredSize().width, 100);

                //---- T1textField1 ----
                T1textField1.setBackground(Color.darkGray);
                T1textField1.setForeground(Color.lightGray);
                T1WarningPanel.add(T1textField1);
                T1textField1.setBounds(25, 195, 65, 30);

                //---- T1textField2 ----
                T1textField2.setBackground(Color.darkGray);
                T1textField2.setForeground(Color.lightGray);
                T1WarningPanel.add(T1textField2);
                T1textField2.setBounds(105, 195, 65, 30);

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
            TEMPWarningContentPane.add(T1WarningPanel);
            T1WarningPanel.setBounds(0, 0, 180, 300);

            //======== T2WarningPanel ========
            {
                T2WarningPanel.setBackground(new Color(60, 63, 65));
                T2WarningPanel.setLayout(null);

                //---- label4 ----
                label4.setText("T2");
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 8f));
                label4.setForeground(Color.lightGray);
                T2WarningPanel.add(label4);
                label4.setBounds(75, 20, 55, label4.getPreferredSize().height);

                //---- label5 ----
                label5.setText("\u4e0a\u9650");
                label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
                label5.setForeground(Color.lightGray);
                T2WarningPanel.add(label5);
                label5.setBounds(new Rectangle(new Point(30, 60), label5.getPreferredSize()));

                //---- label6 ----
                label6.setText("\u4e0b\u9650");
                label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
                label6.setForeground(Color.lightGray);
                T2WarningPanel.add(label6);
                label6.setBounds(new Rectangle(new Point(115, 60), label6.getPreferredSize()));

                //---- T2slider1 ----
                T2slider1.setOrientation(SwingConstants.VERTICAL);
                T2slider1.setMajorTickSpacing(10);
                T2slider1.setMinorTickSpacing(1);
                T2slider1.setBackground(new Color(60, 63, 65));
                T2WarningPanel.add(T2slider1);
                T2slider1.setBounds(40, 90, T2slider1.getPreferredSize().width, 100);

                //---- T2slider2 ----
                T2slider2.setOrientation(SwingConstants.VERTICAL);
                T2slider2.setMajorTickSpacing(10);
                T2slider2.setMinorTickSpacing(1);
                T2slider2.setBackground(new Color(60, 63, 65));
                T2WarningPanel.add(T2slider2);
                T2slider2.setBounds(120, 90, T2slider2.getPreferredSize().width, 100);

                //---- T2textField1 ----
                T2textField1.setBackground(Color.darkGray);
                T2textField1.setForeground(Color.lightGray);
                T2WarningPanel.add(T2textField1);
                T2textField1.setBounds(15, 195, 65, 30);

                //---- T2textField2 ----
                T2textField2.setBackground(Color.darkGray);
                T2textField2.setForeground(Color.lightGray);
                T2WarningPanel.add(T2textField2);
                T2textField2.setBounds(100, 195, 65, 30);

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
            TEMPWarningContentPane.add(T2WarningPanel);
            T2WarningPanel.setBounds(180, 0, 185, 300);

            //======== TDWarningPanel ========
            {
                TDWarningPanel.setBackground(new Color(60, 63, 65));
                TDWarningPanel.setLayout(null);

                //---- label7 ----
                label7.setText("TD");
                label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 8f));
                label7.setForeground(Color.lightGray);
                TDWarningPanel.add(label7);
                label7.setBounds(35, 20, 55, label7.getPreferredSize().height);

                //---- label9 ----
                label9.setText("\u4e0b\u9650");
                label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 5f));
                label9.setForeground(Color.lightGray);
                TDWarningPanel.add(label9);
                label9.setBounds(30, 60, 50, label9.getPreferredSize().height);

                //---- TDslider ----
                TDslider.setOrientation(SwingConstants.VERTICAL);
                TDslider.setMaximum(10);
                TDslider.setMajorTickSpacing(1);
                TDslider.setValue(2);
                TDslider.setBackground(new Color(60, 63, 65));
                TDWarningPanel.add(TDslider);
                TDslider.setBounds(35, 90, TDslider.getPreferredSize().width, 100);

                //---- TDtextField ----
                TDtextField.setBackground(Color.darkGray);
                TDtextField.setForeground(Color.lightGray);
                TDWarningPanel.add(TDtextField);
                TDtextField.setBounds(20, 195, 65, 30);

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
            TEMPWarningContentPane.add(TDWarningPanel);
            TDWarningPanel.setBounds(360, 0, 125, 300);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < TEMPWarningContentPane.getComponentCount(); i++) {
                    Rectangle bounds = TEMPWarningContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = TEMPWarningContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                TEMPWarningContentPane.setMinimumSize(preferredSize);
                TEMPWarningContentPane.setPreferredSize(preferredSize);
            }
            TEMPWarning.pack();
            TEMPWarning.setLocationRelativeTo(TEMPWarning.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame TEMPWarning;
    private JPanel T1WarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider T1slider1;
    private JSlider T1slider2;
    private JTextField T1textField1;
    private JTextField T1textField2;
    private JPanel T2WarningPanel;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JSlider T2slider1;
    private JSlider T2slider2;
    private JTextField T2textField1;
    private JTextField T2textField2;
    private JPanel TDWarningPanel;
    private JLabel label7;
    private JLabel label9;
    private JSlider TDslider;
    private JTextField TDtextField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
