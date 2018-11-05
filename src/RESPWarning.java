import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class RESPWarning {
    public RESPWarning() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        PESPWarning = new JFrame();
        RESPWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        RESPslider1 = new JSlider();
        RESPslider2 = new JSlider();
        RESPtextField1 = new JTextField();
        RESPtextField2 = new JTextField();

        //======== PESPWarning ========
        {
            PESPWarning.setTitle("RESP Alarm Setting");
            PESPWarning.setMaximizedBounds(null);
            Container PESPWarningContentPane = PESPWarning.getContentPane();
            PESPWarningContentPane.setLayout(null);

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

                //---- RESPslider1 ----
                RESPslider1.setOrientation(SwingConstants.VERTICAL);
                RESPWarningPanel.add(RESPslider1);
                RESPslider1.setBounds(60, 90, RESPslider1.getPreferredSize().width, 100);

                //---- RESPslider2 ----
                RESPslider2.setOrientation(SwingConstants.VERTICAL);
                RESPWarningPanel.add(RESPslider2);
                RESPslider2.setBounds(165, 90, RESPslider2.getPreferredSize().width, 100);
                RESPWarningPanel.add(RESPtextField1);
                RESPtextField1.setBounds(35, 195, 64, 30);
                RESPWarningPanel.add(RESPtextField2);
                RESPtextField2.setBounds(145, 195, 64, 30);

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
            PESPWarningContentPane.add(RESPWarningPanel);
            RESPWarningPanel.setBounds(10, 0, 265, 253);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < PESPWarningContentPane.getComponentCount(); i++) {
                    Rectangle bounds = PESPWarningContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = PESPWarningContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                PESPWarningContentPane.setMinimumSize(preferredSize);
                PESPWarningContentPane.setPreferredSize(preferredSize);
            }
            PESPWarning.pack();
            PESPWarning.setLocationRelativeTo(PESPWarning.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame PESPWarning;
    private JPanel RESPWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider RESPslider1;
    private JSlider RESPslider2;
    private JTextField RESPtextField1;
    private JTextField RESPtextField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
