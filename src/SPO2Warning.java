import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class SPO2Warning {
    public SPO2Warning() {
         initComponents();
         SPO2Warning.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        SPO2Warning = new JFrame();
        SPO2WarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        SPO2slider = new JSlider();
        SPO2textField = new JTextField();
        SPO2PRWarningPanel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        SPO2PRslider1 = new JSlider();
        SPO2PRslider2 = new JSlider();
        SPO2PRtextField1 = new JTextField();
        SPO2PRtextField2 = new JTextField();

        //======== SPO2Warning ========
        {
            SPO2Warning.setTitle("SPO2 Alarm Setting");
            SPO2Warning.setMaximizedBounds(null);
            Container SPO2WarningContentPane = SPO2Warning.getContentPane();
            SPO2WarningContentPane.setLayout(null);

            //======== SPO2WarningPanel ========
            {
                SPO2WarningPanel.setBackground(new Color(60, 63, 65));
                SPO2WarningPanel.setLayout(null);

                //---- label1 ----
                label1.setText("SPO2");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
                label1.setForeground(Color.lightGray);
                SPO2WarningPanel.add(label1);
                label1.setBounds(30, 20, 55, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("\u4e0b\u9650");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
                label2.setForeground(Color.lightGray);
                SPO2WarningPanel.add(label2);
                label2.setBounds(new Rectangle(new Point(30, 60), label2.getPreferredSize()));

                //---- SPO2slider ----
                SPO2slider.setOrientation(SwingConstants.VERTICAL);
                SPO2slider.setBackground(new Color(60, 63, 65));
                SPO2WarningPanel.add(SPO2slider);
                SPO2slider.setBounds(40, 90, SPO2slider.getPreferredSize().width, 100);

                //---- SPO2textField ----
                SPO2textField.setBackground(Color.darkGray);
                SPO2textField.setForeground(Color.lightGray);
                SPO2WarningPanel.add(SPO2textField);
                SPO2textField.setBounds(15, 195, 64, 30);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < SPO2WarningPanel.getComponentCount(); i++) {
                        Rectangle bounds = SPO2WarningPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = SPO2WarningPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    SPO2WarningPanel.setMinimumSize(preferredSize);
                    SPO2WarningPanel.setPreferredSize(preferredSize);
                }
            }
            SPO2WarningContentPane.add(SPO2WarningPanel);
            SPO2WarningPanel.setBounds(0, 0, 100, 285);

            //======== SPO2PRWarningPanel2 ========
            {
                SPO2PRWarningPanel2.setBackground(new Color(60, 63, 65));
                SPO2PRWarningPanel2.setLayout(null);

                //---- label4 ----
                label4.setText("SPO2 PR");
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 8f));
                label4.setForeground(Color.lightGray);
                SPO2PRWarningPanel2.add(label4);
                label4.setBounds(50, 20, 105, label4.getPreferredSize().height);

                //---- label5 ----
                label5.setText("\u4e0a\u9650");
                label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
                label5.setForeground(Color.lightGray);
                SPO2PRWarningPanel2.add(label5);
                label5.setBounds(new Rectangle(new Point(30, 60), label5.getPreferredSize()));

                //---- label6 ----
                label6.setText("\u4e0b\u9650");
                label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
                label6.setForeground(Color.lightGray);
                SPO2PRWarningPanel2.add(label6);
                label6.setBounds(new Rectangle(new Point(115, 60), label6.getPreferredSize()));

                //---- SPO2PRslider1 ----
                SPO2PRslider1.setOrientation(SwingConstants.VERTICAL);
                SPO2PRslider1.setBackground(new Color(60, 63, 65));
                SPO2PRWarningPanel2.add(SPO2PRslider1);
                SPO2PRslider1.setBounds(40, 90, SPO2PRslider1.getPreferredSize().width, 100);

                //---- SPO2PRslider2 ----
                SPO2PRslider2.setOrientation(SwingConstants.VERTICAL);
                SPO2PRslider2.setBackground(new Color(60, 63, 65));
                SPO2PRWarningPanel2.add(SPO2PRslider2);
                SPO2PRslider2.setBounds(120, 90, SPO2PRslider2.getPreferredSize().width, 100);

                //---- SPO2PRtextField1 ----
                SPO2PRtextField1.setBackground(Color.darkGray);
                SPO2PRtextField1.setForeground(Color.lightGray);
                SPO2PRWarningPanel2.add(SPO2PRtextField1);
                SPO2PRtextField1.setBounds(15, 195, 64, 30);

                //---- SPO2PRtextField2 ----
                SPO2PRtextField2.setBackground(Color.darkGray);
                SPO2PRtextField2.setForeground(Color.lightGray);
                SPO2PRWarningPanel2.add(SPO2PRtextField2);
                SPO2PRtextField2.setBounds(95, 195, 64, 30);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < SPO2PRWarningPanel2.getComponentCount(); i++) {
                        Rectangle bounds = SPO2PRWarningPanel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = SPO2PRWarningPanel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    SPO2PRWarningPanel2.setMinimumSize(preferredSize);
                    SPO2PRWarningPanel2.setPreferredSize(preferredSize);
                }
            }
            SPO2WarningContentPane.add(SPO2PRWarningPanel2);
            SPO2PRWarningPanel2.setBounds(100, 0, 180, 285);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < SPO2WarningContentPane.getComponentCount(); i++) {
                    Rectangle bounds = SPO2WarningContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = SPO2WarningContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                SPO2WarningContentPane.setMinimumSize(preferredSize);
                SPO2WarningContentPane.setPreferredSize(preferredSize);
            }
            SPO2Warning.pack();
            SPO2Warning.setLocationRelativeTo(SPO2Warning.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame SPO2Warning;
    private JPanel SPO2WarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JSlider SPO2slider;
    private JTextField SPO2textField;
    private JPanel SPO2PRWarningPanel2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JSlider SPO2PRslider1;
    private JSlider SPO2PRslider2;
    private JTextField SPO2PRtextField1;
    private JTextField SPO2PRtextField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
