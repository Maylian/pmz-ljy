import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class RESPWarning extends JFrame {
    public RESPWarning() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        RESPWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        slider1 = new JSlider();
        slider2 = new JSlider();
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setTitle("RESP Alarm Setting");
        setMaximizedBounds(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== RESPWarningPanel ========
        {
            RESPWarningPanel.setLayout(null);

            //---- label1 ----
            label1.setText("RESP");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            RESPWarningPanel.add(label1);
            label1.setBounds(105, 20, 60, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u4e0a\u9650");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
            RESPWarningPanel.add(label2);
            label2.setBounds(new Rectangle(new Point(45, 55), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("\u4e0b\u9650");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
            RESPWarningPanel.add(label3);
            label3.setBounds(new Rectangle(new Point(155, 55), label3.getPreferredSize()));

            //---- slider1 ----
            slider1.setOrientation(SwingConstants.VERTICAL);
            RESPWarningPanel.add(slider1);
            slider1.setBounds(60, 90, slider1.getPreferredSize().width, 100);

            //---- slider2 ----
            slider2.setOrientation(SwingConstants.VERTICAL);
            RESPWarningPanel.add(slider2);
            slider2.setBounds(165, 90, slider2.getPreferredSize().width, 100);
            RESPWarningPanel.add(textField1);
            textField1.setBounds(new Rectangle(new Point(35, 195), textField1.getPreferredSize()));
            RESPWarningPanel.add(textField2);
            textField2.setBounds(145, 195, 64, 30);

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
        contentPane.add(RESPWarningPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel RESPWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider slider1;
    private JSlider slider2;
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
