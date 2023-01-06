package Main;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu{
    
    private JFrame frame = new JFrame();
    private JLabel label1 = new JLabel("Mathdle");
    private JButton button1 = new JButton("Play");
    private JButton button2 = new JButton("Credit");
    private JButton button3 = new JButton("Quit");
    private ImageIcon backG = new ImageIcon(this.getClass().getResource("/Content/back.png"));
    private ImageIcon icon = new ImageIcon(this.getClass().getResource("/Content/kwasonk.png"));
    private JLabel label2 = new JLabel(backG);
    public GameBase game;
    public Credit credit;
    private int width;
    private int height;

    public MainMenu(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public void setGUI(){
        label1.setBounds(110, 50, 300, 50);
        label1.setFont(new java.awt.Font("Dialog", 1, 50));
        
        label2.setSize(500,500);
        
        button1.setBounds(140, 150, 120, 40);
        button1.setFont(new java.awt.Font("DM Sans", 1, 25));
        button1.setBackground(java.awt.Color.white);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frame.setVisible(false);
                game = new GameBase(600, 600, getMenu());
                game.setGUI();
            }
        });
        button2.setBounds(140, 220, 120, 40);
        button2.setFont(new java.awt.Font("DM Sans", 1, 25));
        button2.setBackground(java.awt.Color.white);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frame.setVisible(false);
                credit = new Credit(getWidth(), getHeight(), getMenu());
                credit.setGUI();
            }
        });
        button3.setBounds(140, 290, 120, 40);
        button3.setFont(new java.awt.Font("DM Sans", 1, 25));
        button3.setBackground(java.awt.Color.white);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(label2);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setSize(this.getWidth(), this.getHeight());
        frame.setBackground(java.awt.Color.white);
        frame.setTitle("Mathdle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }      

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MainMenu getMenu(){
        return this;
    }

    public JFrame getJFrame(){
        return frame;
    }
    
    public void setJFrame(boolean visible){
        frame.setVisible(visible);
    }
}
