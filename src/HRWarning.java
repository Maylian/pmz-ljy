import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */



/**
 * @author Brainrain
 */
public class HRWarning {
    public HRWarning() {
        initComponents();

    }

    private void HRslider1StateChanged(ChangeEvent e) {
        // TODO add your code here
    }

    private void HRslider2StateChanged(ChangeEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        HRWarning = new JFrame();
        HRWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        HRslider1 = new JSlider();
        HRslider2 = new JSlider();
        HRtextField1 = new JTextField();
        HRtextField2 = new JTextField();

        //======== HRWarning ========
        {
            HRWarning.setTitle("HR  Setting");
            HRWarning.setMaximizedBounds(null);
            Container HRWarningContentPane = HRWarning.getContentPane();
            HRWarningContentPane.setLayout(null);

            //======== HRWarningPanel ========
            {
                HRWarningPanel.setBackground(new Color(60, 63, 65));
                HRWarningPanel.setLayout(null);

                //---- label1 ----
                label1.setText("HR");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
                label1.setForeground(Color.lightGray);
                HRWarningPanel.add(label1);
                label1.setBounds(110, 20, 35, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("\u4e0a\u9650");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
                label2.setForeground(Color.lightGray);
                HRWarningPanel.add(label2);
                label2.setBounds(new Rectangle(new Point(45, 55), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("\u4e0b\u9650");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
                label3.setForeground(Color.lightGray);
                HRWarningPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(155, 55), label3.getPreferredSize()));

                //---- HRslider1 ----
                HRslider1.setOrientation(SwingConstants.VERTICAL);
                HRslider1.setBackground(new Color(60, 63, 65));
                HRslider1.setForeground(new Color(153, 153, 153));
                HRslider1.addChangeListener(e -> HRslider1StateChanged(e));
                HRWarningPanel.add(HRslider1);
                HRslider1.setBounds(60, 90, HRslider1.getPreferredSize().width, 100);

                //---- HRslider2 ----
                HRslider2.setOrientation(SwingConstants.VERTICAL);
                HRslider2.setBackground(new Color(60, 63, 65));
                HRslider2.addChangeListener(e -> HRslider2StateChanged(e));
                HRWarningPanel.add(HRslider2);
                HRslider2.setBounds(165, 90, HRslider2.getPreferredSize().width, 100);

                //---- HRtextField1 ----
                HRtextField1.setBackground(Color.darkGray);
                HRtextField1.setForeground(Color.lightGray);
                HRWarningPanel.add(HRtextField1);
                HRtextField1.setBounds(35, 195, 64, 30);

                //---- HRtextField2 ----
                HRtextField2.setBackground(Color.darkGray);
                HRtextField2.setForeground(Color.lightGray);
                HRWarningPanel.add(HRtextField2);
                HRtextField2.setBounds(145, 195, 64, 30);

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
            HRWarningContentPane.add(HRWarningPanel);
            HRWarningPanel.setBounds(0, 0, 260, 253);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < HRWarningContentPane.getComponentCount(); i++) {
                    Rectangle bounds = HRWarningContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = HRWarningContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                HRWarningContentPane.setMinimumSize(preferredSize);
                HRWarningContentPane.setPreferredSize(preferredSize);
            }
            HRWarning.pack();
            HRWarning.setLocationRelativeTo(HRWarning.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame HRWarning;
    private JPanel HRWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider HRslider1;
    private JSlider HRslider2;
    private JTextField HRtextField1;
    private JTextField HRtextField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
