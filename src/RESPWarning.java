import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class RESPWarning {
    public RESPWarning() {
         initComponents();
         RESPWarning.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        RESPWarning = new JFrame();
        RESPWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        RESPslider1 = new JSlider();
        RESPslider2 = new JSlider();
        RESPtextField1 = new JTextField();
        RESPtextField2 = new JTextField();

        //======== RESPWarning ========
        {
            RESPWarning.setTitle("RESP  Setting");
            RESPWarning.setMaximizedBounds(null);
            Container RESPWarningContentPane = RESPWarning.getContentPane();
            RESPWarningContentPane.setLayout(null);

            //======== RESPWarningPanel ========
            {
                RESPWarningPanel.setBackground(new Color(60, 63, 65));
                RESPWarningPanel.setLayout(null);

                //---- label1 ----
                label1.setText("HR");
                label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
                label1.setForeground(Color.lightGray);
                RESPWarningPanel.add(label1);
                label1.setBounds(110, 20, 35, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("\u4e0a\u9650");
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
                label2.setForeground(Color.lightGray);
                RESPWarningPanel.add(label2);
                label2.setBounds(new Rectangle(new Point(45, 55), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("\u4e0b\u9650");
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
                label3.setForeground(Color.lightGray);
                RESPWarningPanel.add(label3);
                label3.setBounds(new Rectangle(new Point(155, 55), label3.getPreferredSize()));

                //---- RESPslider1 ----
                RESPslider1.setOrientation(SwingConstants.VERTICAL);
                RESPslider1.setBackground(new Color(60, 63, 65));
                RESPslider1.setForeground(new Color(153, 153, 153));
                RESPWarningPanel.add(RESPslider1);
                RESPslider1.setBounds(60, 90, RESPslider1.getPreferredSize().width, 100);

                //---- RESPslider2 ----
                RESPslider2.setOrientation(SwingConstants.VERTICAL);
                RESPslider2.setBackground(new Color(60, 63, 65));
                RESPWarningPanel.add(RESPslider2);
                RESPslider2.setBounds(165, 90, RESPslider2.getPreferredSize().width, 100);

                //---- RESPtextField1 ----
                RESPtextField1.setBackground(Color.darkGray);
                RESPtextField1.setForeground(Color.lightGray);
                RESPWarningPanel.add(RESPtextField1);
                RESPtextField1.setBounds(35, 195, 64, 30);

                //---- RESPtextField2 ----
                RESPtextField2.setBackground(Color.darkGray);
                RESPtextField2.setForeground(Color.lightGray);
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
            RESPWarningContentPane.add(RESPWarningPanel);
            RESPWarningPanel.setBounds(0, 0, 260, 253);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < RESPWarningContentPane.getComponentCount(); i++) {
                    Rectangle bounds = RESPWarningContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = RESPWarningContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                RESPWarningContentPane.setMinimumSize(preferredSize);
                RESPWarningContentPane.setPreferredSize(preferredSize);
            }
            RESPWarning.pack();
            RESPWarning.setLocationRelativeTo(RESPWarning.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame RESPWarning;
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
