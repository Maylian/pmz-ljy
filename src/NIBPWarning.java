import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class NIBPWarning extends JFrame {
    public NIBPWarning() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        DBPWarningPanel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        SBPslider3 = new JSlider();
        SBPslider4 = new JSlider();
        textField3 = new JTextField();
        textField4 = new JTextField();
        DBPWarningPanel3 = new JPanel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        slider5 = new JSlider();
        slider6 = new JSlider();
        textField5 = new JTextField();
        textField6 = new JTextField();
        SBPWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        SBPslider1 = new JSlider();
        SBPslider2 = new JSlider();
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setTitle("NIBP Alarm Setting");
        setMaximizedBounds(null);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== DBPWarningPanel2 ========
        {
            DBPWarningPanel2.setLayout(null);

            //---- label4 ----
            label4.setText("DBP");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 8f));
            DBPWarningPanel2.add(label4);
            label4.setBounds(70, 20, 55, label4.getPreferredSize().height);

            //---- label5 ----
            label5.setText("\u4e0a\u9650");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
            DBPWarningPanel2.add(label5);
            label5.setBounds(new Rectangle(new Point(30, 60), label5.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u4e0b\u9650");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
            DBPWarningPanel2.add(label6);
            label6.setBounds(new Rectangle(new Point(115, 60), label6.getPreferredSize()));

            //---- SBPslider3 ----
            SBPslider3.setOrientation(SwingConstants.VERTICAL);
            SBPslider3.setMaximum(300);
            SBPslider3.setMinimum(10);
            DBPWarningPanel2.add(SBPslider3);
            SBPslider3.setBounds(40, 90, SBPslider3.getPreferredSize().width, 100);

            //---- SBPslider4 ----
            SBPslider4.setOrientation(SwingConstants.VERTICAL);
            SBPslider4.setMaximum(300);
            SBPslider4.setMinimum(30);
            DBPWarningPanel2.add(SBPslider4);
            SBPslider4.setBounds(120, 90, SBPslider4.getPreferredSize().width, 100);
            DBPWarningPanel2.add(textField3);
            textField3.setBounds(new Rectangle(new Point(15, 195), textField3.getPreferredSize()));
            DBPWarningPanel2.add(textField4);
            textField4.setBounds(95, 195, 64, 30);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < DBPWarningPanel2.getComponentCount(); i++) {
                    Rectangle bounds = DBPWarningPanel2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = DBPWarningPanel2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                DBPWarningPanel2.setMinimumSize(preferredSize);
                DBPWarningPanel2.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(DBPWarningPanel2);
        DBPWarningPanel2.setBounds(175, 5, 159, 250);

        //======== DBPWarningPanel3 ========
        {
            DBPWarningPanel3.setLayout(null);

            //---- label7 ----
            label7.setText("PR");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 8f));
            DBPWarningPanel3.add(label7);
            label7.setBounds(75, 20, 55, label7.getPreferredSize().height);

            //---- label8 ----
            label8.setText("\u4e0a\u9650");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 5f));
            DBPWarningPanel3.add(label8);
            label8.setBounds(new Rectangle(new Point(30, 60), label8.getPreferredSize()));

            //---- label9 ----
            label9.setText("\u4e0b\u9650");
            label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 5f));
            DBPWarningPanel3.add(label9);
            label9.setBounds(new Rectangle(new Point(115, 60), label9.getPreferredSize()));

            //---- slider5 ----
            slider5.setOrientation(SwingConstants.VERTICAL);
            slider5.setMaximum(250);
            slider5.setMinimum(30);
            DBPWarningPanel3.add(slider5);
            slider5.setBounds(40, 90, slider5.getPreferredSize().width, 100);

            //---- slider6 ----
            slider6.setOrientation(SwingConstants.VERTICAL);
            slider6.setMaximum(250);
            slider6.setMinimum(30);
            DBPWarningPanel3.add(slider6);
            slider6.setBounds(120, 90, slider6.getPreferredSize().width, 100);
            DBPWarningPanel3.add(textField5);
            textField5.setBounds(new Rectangle(new Point(15, 195), textField5.getPreferredSize()));
            DBPWarningPanel3.add(textField6);
            textField6.setBounds(95, 195, 64, 30);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < DBPWarningPanel3.getComponentCount(); i++) {
                    Rectangle bounds = DBPWarningPanel3.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = DBPWarningPanel3.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                DBPWarningPanel3.setMinimumSize(preferredSize);
                DBPWarningPanel3.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(DBPWarningPanel3);
        DBPWarningPanel3.setBounds(340, 5, 165, 250);

        //======== SBPWarningPanel ========
        {
            SBPWarningPanel.setLayout(null);

            //---- label1 ----
            label1.setText("SBP");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            SBPWarningPanel.add(label1);
            label1.setBounds(70, 20, 55, label1.getPreferredSize().height);

            //---- label2 ----
            label2.setText("\u4e0a\u9650");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
            SBPWarningPanel.add(label2);
            label2.setBounds(new Rectangle(new Point(30, 60), label2.getPreferredSize()));

            //---- label3 ----
            label3.setText("\u4e0b\u9650");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
            SBPWarningPanel.add(label3);
            label3.setBounds(new Rectangle(new Point(115, 60), label3.getPreferredSize()));

            //---- SBPslider1 ----
            SBPslider1.setOrientation(SwingConstants.VERTICAL);
            SBPslider1.setMaximum(300);
            SBPslider1.setMinimum(30);
            SBPWarningPanel.add(SBPslider1);
            SBPslider1.setBounds(40, 90, SBPslider1.getPreferredSize().width, 100);

            //---- SBPslider2 ----
            SBPslider2.setOrientation(SwingConstants.VERTICAL);
            SBPslider2.setMaximum(300);
            SBPslider2.setMinimum(30);
            SBPWarningPanel.add(SBPslider2);
            SBPslider2.setBounds(120, 90, SBPslider2.getPreferredSize().width, 100);
            SBPWarningPanel.add(textField1);
            textField1.setBounds(new Rectangle(new Point(15, 195), textField1.getPreferredSize()));
            SBPWarningPanel.add(textField2);
            textField2.setBounds(95, 195, 64, 30);

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
        contentPane.add(SBPWarningPanel);
        SBPWarningPanel.setBounds(10, 5, 165, 250);

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
    private JPanel DBPWarningPanel2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JSlider SBPslider3;
    private JSlider SBPslider4;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel DBPWarningPanel3;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JSlider slider5;
    private JSlider slider6;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel SBPWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider SBPslider1;
    private JSlider SBPslider2;
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
