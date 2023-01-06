package Main;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Credit {
    public MainMenu main;
    private JFrame frame = new JFrame();
    private JLabel label1 = new JLabel("Mathdle");
    private JLabel label3 = new JLabel("Maulana Raka R. 1202213164");
    private JLabel label4 = new JLabel("Larasati 1202213176");
    private JLabel label5 = new JLabel("Adelio Ferhan S. 1202213217");
    private JLabel label6 = new JLabel("Ayesha Margalla P. 1202213214");
    private JLabel labelF = new JLabel();
    private JButton button1 = new JButton("Back");
    private ImageIcon backG = new ImageIcon(this.getClass().getResource("/Content/back.png"));
    private ImageIcon icon = new ImageIcon(this.getClass().getResource("/Content/kwasonk.png"));
    private JLabel label2 = new JLabel(backG);
    private int width;
    private int height;

    public Credit(int w, int h, MainMenu main) {
        this.width = w;
        this.height = h;
        this.main = main;
    }
    
    public void setGUI(){
        label1.setBounds(100, 50, 300, 50);
        label1.setFont(new java.awt.Font("Dialog", 1, 50));
        
        label2.setSize(500,500);
        
        label3.setBounds(50, 150, 300, 50);
        label3.setFont(new java.awt.Font("Dialog", 1, 20));

        label4.setBounds(80, 200, 300, 50);
        label4.setFont(new java.awt.Font("Dialog", 1, 20));

        label5.setBounds(50, 250, 300, 50);
        label5.setFont(new java.awt.Font("Dialog", 1, 20));

        label6.setBounds(40, 300, 300, 50);
        label6.setFont(new java.awt.Font("Dialog", 1, 20));

        labelF.setBounds(30, 140, 330, 220);
        labelF.setBackground(java.awt.Color.white);
        labelF.setOpaque(true);
        
        button1.setBounds(130, 390, 120, 40);
        button1.setFont(new java.awt.Font("DM Sans", 1, 25));
        button1.setBackground(java.awt.Color.white);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frame.setVisible(false);
                main.setJFrame(true);
            }
        });
        
        frame.add(label1);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(button1);
        frame.add(labelF);
        frame.add(label2);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setSize(this.width, this.height);
        frame.setBackground(java.awt.Color.white);
        frame.setTitle("Mathdle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
