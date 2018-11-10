import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Sun Oct 28 19:13:00 CST 2018
 */


/**
 * @author Brainrain
 */
public class NIBPWarning {
    public NIBPWarning() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        NIBPWarning = new JFrame();
        DBPWarningPanel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        DBPslider1 = new JSlider();
        DBPslider2 = new JSlider();
        DBPtextField1 = new JTextField();
        DBPtextField2 = new JTextField();
        PRWarningPanel3 = new JPanel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        PRslider1 = new JSlider();
        PRslider2 = new JSlider();
        PRtextField1 = new JTextField();
        PRtextField2 = new JTextField();
        SBPWarningPanel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        SBPslider1 = new JSlider();
        SBPslider2 = new JSlider();
        SBPtextField1 = new JTextField();
        SBPtextField2 = new JTextField();

        //======== NIBPWarning ========
        {
            NIBPWarning.setTitle("NIBP Alarm Setting");
            NIBPWarning.setMaximizedBounds(null);
            Container NIBPWarningContentPane = NIBPWarning.getContentPane();
            NIBPWarningContentPane.setLayout(null);

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

                //---- DBPslider1 ----
                DBPslider1.setOrientation(SwingConstants.VERTICAL);
                DBPslider1.setMaximum(300);
                DBPslider1.setMinimum(10);
                DBPWarningPanel2.add(DBPslider1);
                DBPslider1.setBounds(40, 90, DBPslider1.getPreferredSize().width, 100);

                //---- DBPslider2 ----
                DBPslider2.setOrientation(SwingConstants.VERTICAL);
                DBPslider2.setMaximum(300);
                DBPslider2.setMinimum(30);
                DBPWarningPanel2.add(DBPslider2);
                DBPslider2.setBounds(120, 90, DBPslider2.getPreferredSize().width, 100);
                DBPWarningPanel2.add(DBPtextField1);
                DBPtextField1.setBounds(15, 195, 64, 30);
                DBPWarningPanel2.add(DBPtextField2);
                DBPtextField2.setBounds(95, 195, 64, 30);

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
            NIBPWarningContentPane.add(DBPWarningPanel2);
            DBPWarningPanel2.setBounds(175, 5, 159, 250);

            //======== PRWarningPanel3 ========
            {
                PRWarningPanel3.setLayout(null);

                //---- label7 ----
                label7.setText("PR");
                label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 8f));
                PRWarningPanel3.add(label7);
                label7.setBounds(75, 20, 55, label7.getPreferredSize().height);

                //---- label8 ----
                label8.setText("\u4e0a\u9650");
                label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 5f));
                PRWarningPanel3.add(label8);
                label8.setBounds(new Rectangle(new Point(30, 60), label8.getPreferredSize()));

                //---- label9 ----
                label9.setText("\u4e0b\u9650");
                label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 5f));
                PRWarningPanel3.add(label9);
                label9.setBounds(new Rectangle(new Point(115, 60), label9.getPreferredSize()));

                //---- PRslider1 ----
                PRslider1.setOrientation(SwingConstants.VERTICAL);
                PRslider1.setMaximum(250);
                PRslider1.setMinimum(30);
                PRWarningPanel3.add(PRslider1);
                PRslider1.setBounds(40, 90, PRslider1.getPreferredSize().width, 100);

                //---- PRslider2 ----
                PRslider2.setOrientation(SwingConstants.VERTICAL);
                PRslider2.setMaximum(250);
                PRslider2.setMinimum(30);
                PRWarningPanel3.add(PRslider2);
                PRslider2.setBounds(120, 90, PRslider2.getPreferredSize().width, 100);
                PRWarningPanel3.add(PRtextField1);
                PRtextField1.setBounds(15, 195, 64, 30);
                PRWarningPanel3.add(PRtextField2);
                PRtextField2.setBounds(95, 195, 64, 30);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < PRWarningPanel3.getComponentCount(); i++) {
                        Rectangle bounds = PRWarningPanel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = PRWarningPanel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    PRWarningPanel3.setMinimumSize(preferredSize);
                    PRWarningPanel3.setPreferredSize(preferredSize);
                }
            }
            NIBPWarningContentPane.add(PRWarningPanel3);
            PRWarningPanel3.setBounds(340, 5, 165, 250);

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
                SBPWarningPanel.add(SBPtextField1);
                SBPtextField1.setBounds(15, 195, 64, 30);
                SBPWarningPanel.add(SBPtextField2);
                SBPtextField2.setBounds(95, 195, 64, 30);

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
            NIBPWarningContentPane.add(SBPWarningPanel);
            SBPWarningPanel.setBounds(10, 5, 165, 250);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < NIBPWarningContentPane.getComponentCount(); i++) {
                    Rectangle bounds = NIBPWarningContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = NIBPWarningContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                NIBPWarningContentPane.setMinimumSize(preferredSize);
                NIBPWarningContentPane.setPreferredSize(preferredSize);
            }
            NIBPWarning.pack();
            NIBPWarning.setLocationRelativeTo(NIBPWarning.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame NIBPWarning;
    private JPanel DBPWarningPanel2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JSlider DBPslider1;
    private JSlider DBPslider2;
    private JTextField DBPtextField1;
    private JTextField DBPtextField2;
    private JPanel PRWarningPanel3;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JSlider PRslider1;
    private JSlider PRslider2;
    private JTextField PRtextField1;
    private JTextField PRtextField2;
    private JPanel SBPWarningPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JSlider SBPslider1;
    private JSlider SBPslider2;
    private JTextField SBPtextField1;
    private JTextField SBPtextField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
