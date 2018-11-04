import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class SPO2Warning extends JFrame {
    public SPO2Warning() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        SPO2WarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        slider1 = new JSlider();
        textField1 = new JTextField();
        SPO2PRWarningPanel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        slider3 = new JSlider();
        slider4 = new JSlider();
        textField3 = new JTextField();
        textField4 = new JTextField();

        //======== this ========
        setTitle("SPO2 Alarm Setting");
        setMaximizedBounds(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== SPO2WarningPanel ========
        {
            SPO2WarningPanel.setLayout(null);

            //---- label1 ----
            label1.setText("SPO2");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            SPO2WarningPanel.add(label1);
            label1.setBounds(30, 20, 55, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u4e0b\u9650");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
            SPO2WarningPanel.add(label2);
            label2.setBounds(new Rectangle(new Point(30, 60), label2.getPreferredSize()));

            //---- slider1 ----
            slider1.setOrientation(SwingConstants.VERTICAL);
            SPO2WarningPanel.add(slider1);
            slider1.setBounds(40, 90, slider1.getPreferredSize().width, 100);
            SPO2WarningPanel.add(textField1);
            textField1.setBounds(new Rectangle(new Point(15, 195), textField1.getPreferredSize()));

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
        contentPane.add(SPO2WarningPanel);
        SPO2WarningPanel.setBounds(10, 5, SPO2WarningPanel.getPreferredSize().width, 275);

        //======== SPO2PRWarningPanel2 ========
        {
            SPO2PRWarningPanel2.setLayout(null);

            //---- label4 ----
            label4.setText("SPO2 PR");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 8f));
            SPO2PRWarningPanel2.add(label4);
            label4.setBounds(50, 20, 105, label4.getPreferredSize().height);

            //---- label5 ----
            label5.setText("\u4e0a\u9650");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
            SPO2PRWarningPanel2.add(label5);
            label5.setBounds(new Rectangle(new Point(30, 60), label5.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u4e0b\u9650");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
            SPO2PRWarningPanel2.add(label6);
            label6.setBounds(new Rectangle(new Point(115, 60), label6.getPreferredSize()));

            //---- slider3 ----
            slider3.setOrientation(SwingConstants.VERTICAL);
            SPO2PRWarningPanel2.add(slider3);
            slider3.setBounds(40, 90, slider3.getPreferredSize().width, 100);

            //---- slider4 ----
            slider4.setOrientation(SwingConstants.VERTICAL);
            SPO2PRWarningPanel2.add(slider4);
            slider4.setBounds(120, 90, slider4.getPreferredSize().width, 100);
            SPO2PRWarningPanel2.add(textField3);
            textField3.setBounds(new Rectangle(new Point(15, 195), textField3.getPreferredSize()));
            SPO2PRWarningPanel2.add(textField4);
            textField4.setBounds(95, 195, 64, 30);

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
        contentPane.add(SPO2PRWarningPanel2);
        SPO2PRWarningPanel2.setBounds(105, 5, SPO2PRWarningPanel2.getPreferredSize().width, 270);

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
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel SPO2WarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JSlider slider1;
    private JTextField textField1;
    private JPanel SPO2PRWarningPanel2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JSlider slider3;
    private JSlider slider4;
    private JTextField textField3;
    private JTextField textField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
