import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */



/**
 * @author Brainrain
 */
public class HRWarning extends JFrame {
    public HRWarning() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        HRWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        slider1 = new JSlider();
        slider2 = new JSlider();
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setTitle("HR Alarm Setting");
        setMaximizedBounds(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== HRWarningPanel ========
        {
            HRWarningPanel.setLayout(null);

            //---- label1 ----
            label1.setText("HR");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            HRWarningPanel.add(label1);
            label1.setBounds(110, 20, 35, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u4e0a\u9650");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
            HRWarningPanel.add(label2);
            label2.setBounds(new Rectangle(new Point(45, 55), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("\u4e0b\u9650");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
            HRWarningPanel.add(label3);
            label3.setBounds(new Rectangle(new Point(155, 55), label3.getPreferredSize()));

            //---- slider1 ----
            slider1.setOrientation(SwingConstants.VERTICAL);
            HRWarningPanel.add(slider1);
            slider1.setBounds(60, 90, slider1.getPreferredSize().width, 100);

            //---- slider2 ----
            slider2.setOrientation(SwingConstants.VERTICAL);
            HRWarningPanel.add(slider2);
            slider2.setBounds(165, 90, slider2.getPreferredSize().width, 100);
            HRWarningPanel.add(textField1);
            textField1.setBounds(new Rectangle(new Point(35, 195), textField1.getPreferredSize()));
            HRWarningPanel.add(textField2);
            textField2.setBounds(145, 195, 64, 30);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < HRWarningPanel.getComponentCount(); i++) {
                    Rectangle bounds = HRWarningPanel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = HRWarningPanel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                HRWarningPanel.setMinimumSize(preferredSize);
                HRWarningPanel.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(HRWarningPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel HRWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider slider1;
    private JSlider slider2;
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
