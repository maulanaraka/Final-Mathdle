package Main;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameBase {
    public MainMenu main;
    private JFrame frame = new JFrame();
    private ImageIcon icon = new ImageIcon(this.getClass().getResource("/Content/kwasonk.png"));
    private int width;
    private int height;
    private int levelCount=0;
    private JLabel level = new JLabel("Level " + getLevelCount());
    private boolean cek = false;
    private JButton button1 = new JButton("Submit");
    private JButton button2 = new JButton("Next");
    private JButton button3 = new JButton("Back");
    private JLabel condition = new JLabel("SALAH");
    private int posXall[][] = {{130, 130, 130, 130, 130, 200, 270, 340, 410, 410, 410, 410, 410, 340, 270, 200}, 
                                {130, 130, 130, 130, 130, 200, 410, 340, 270, 410, 410, 410, 410, 340, 270, 200},
                                {270, 130, 130, 130, 270, 200, 130, 340, 410, 410, 410, 410, 410, 340, 130, 200}};
    private int posYall[][] = {{100, 170, 240, 310, 380, 380, 380, 380, 380, 310, 240, 170, 100, 100, 100, 100},
                               {240, 170, 100, 310, 380, 380, 380, 380, 380, 310, 100, 170, 240, 100, 100, 100},
                               {100, 170, 240, 310, 380, 380, 380, 380, 380, 310, 240, 170, 100, 100, 100, 100}};
    private JLabel jLabel1 = new JLabel("0");
    private JLabel jLabel2 = new JLabel("+");
    private JLabel jLabel3 = new JLabel("=");
    private JLabel jLabel4 = new JLabel("+");
    private JLabel jLabel5 = new JLabel("0");
    private JLabel jLabel6 = new JLabel("=");
    private JLabel jLabel7 = new JLabel("+");
    private JLabel jLabel8 = new JLabel("0");
    private JLabel jLabel9 = new JLabel("=");
    private JLabel jLabel10 = new JLabel("+");
    private JLabel jLabel11 = new JLabel("=");
    private JTextField jTextField1 = new JTextField("0");
    private JTextField jTextField2 = new JTextField("0");
    private JTextField jTextField3 = new JTextField("0");
    private JTextField jTextField4 = new JTextField("0");
    private JTextField jTextField5 = new JTextField("0");
   
    public GameBase(int w, int h, MainMenu main) {
        this.width = w;
        this.height = h;
        this.main = main;
    }
    
    public void setGUI(){

        Random r1 = new Random();
        int r = r1.nextInt(3);
        int rn2 = r1.nextInt(10)+1;
        int rn3 = r1.nextInt(10) + 1;
        int rn4 = r1.nextInt(10) + 1;
        int rn5 = r1.nextInt(2) + 1;
        
        String num = Integer.toString(rn2);
        jLabel1.setText(num);
        num = Integer.toString(rn3);
        jLabel5.setText(num);
        num = Integer.toString(rn4);
        jLabel8.setText(num);
        
        if(rn5 == 2){
            jLabel2.setText("-");
            jLabel4.setText("-");
            jLabel7.setText("-");
            jLabel10.setText("-");
        }else if(rn5 == 1){
            jLabel2.setText("+");
            jLabel4.setText("+");
            jLabel7.setText("+");
            jLabel10.setText("+");
        }
        
        level.setBounds(425, 0, 150, 50);
        level.setHorizontalAlignment(JLabel.CENTER);
        level.setVerticalAlignment(JLabel.CENTER);
        level.setFont(new java.awt.Font("Dialog", 1, 25));

        condition.setText("SALAH");
        condition.setBounds(220, 240, 150, 50);
        condition.setHorizontalAlignment(JLabel.CENTER);
        condition.setVerticalAlignment(JLabel.CENTER);
        condition.setForeground(java.awt.Color.red);
        condition.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel1.setBounds(posXall[r][0], posYall[r][0], 50, 50);
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLabel1.setVerticalAlignment(JLabel.CENTER);
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel2.setBounds(posXall[r][1], posYall[r][1], 50, 50);
        jLabel2.setHorizontalAlignment(JLabel.CENTER);
        jLabel2.setVerticalAlignment(JLabel.CENTER);
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jTextField1.setPreferredSize(new Dimension(50,50));
        jTextField1.setBounds(posXall[r][2], posYall[r][2], 50, 50);
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel3.setBounds(posXall[r][3], posYall[r][3], 50, 50);
        jLabel3.setHorizontalAlignment(JLabel.CENTER);
        jLabel3.setVerticalAlignment(JLabel.CENTER);
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jTextField2.setPreferredSize(new Dimension(50,50));
        jTextField2.setBounds(posXall[r][4], posYall[r][4], 50, 50);
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel4.setBounds(posXall[r][5], posYall[r][5], 50, 50);
        jLabel4.setHorizontalAlignment(JLabel.CENTER);
        jLabel4.setVerticalAlignment(JLabel.CENTER);
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel5.setBounds(posXall[r][6], posYall[r][6], 50, 50);
        jLabel5.setHorizontalAlignment(JLabel.CENTER);
        jLabel5.setVerticalAlignment(JLabel.CENTER);
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel6.setBounds(posXall[r][7], posYall[r][7], 50, 50);
        jLabel6.setHorizontalAlignment(JLabel.CENTER);
        jLabel6.setVerticalAlignment(JLabel.CENTER);
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jTextField3.setPreferredSize(new Dimension(50,50));
        jTextField3.setBounds(posXall[r][8], posYall[r][8], 50, 50);
        jTextField3.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel7.setBounds(posXall[r][9], posYall[r][9], 50, 50);
        jLabel7.setHorizontalAlignment(JLabel.CENTER);
        jLabel7.setVerticalAlignment(JLabel.CENTER);
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel8.setBounds(posXall[r][10], posYall[r][10], 50, 50);
        jLabel8.setHorizontalAlignment(JLabel.CENTER);
        jLabel8.setVerticalAlignment(JLabel.CENTER);
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel9.setBounds(posXall[r][11], posYall[r][11], 50, 50);
        jLabel9.setHorizontalAlignment(JLabel.CENTER);
        jLabel9.setVerticalAlignment(JLabel.CENTER);
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jTextField4.setPreferredSize(new Dimension(50,50));
        jTextField4.setBounds(posXall[r][12], posYall[r][12], 50, 50);
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel10.setBounds(posXall[r][13], posYall[r][13], 50, 50);
        jLabel10.setHorizontalAlignment(JLabel.CENTER);
        jLabel10.setVerticalAlignment(JLabel.CENTER);
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 30));
        
        jTextField5.setPreferredSize(new Dimension(50,50));
        jTextField5.setBounds(posXall[r][14], posYall[r][14], 50, 50);
        jTextField5.setFont(new java.awt.Font("Dialog", 1, 25));
        
        jLabel11.setBounds(posXall[r][15], posYall[r][15], 50, 50);
        jLabel11.setHorizontalAlignment(JLabel.CENTER);
        jLabel11.setVerticalAlignment(JLabel.CENTER);
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 25));
        
        button1.setBounds(240, 450, 120, 40);
        button1.setFont(new java.awt.Font("DM Sans", 1, 25));
        button1.setBackground(java.awt.Color.white);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int a,b,c,d,e,f,g,h;
                int hasil1 = 0, hasil2 = 0, hasil3 = 0, hasil4 = 0;

                switch (r) {
                    case 0:
                        a = Integer.parseInt(jLabel1.getText());
                        b = Integer.parseInt(jTextField1.getText());
                        c = Integer.parseInt(jTextField2.getText());
                        if(rn5 == 2){
                            hasil1 = a - b;
                        }else if(rn5 == 1){
                            hasil1 = a + b;
                        }

                        d = Integer.parseInt(jLabel5.getText());
                        e = Integer.parseInt(jTextField3.getText());
                        if(rn5 == 2){
                            hasil2 = c - d;
                        }else if(rn5 == 1){
                            hasil2 = c + d;
                        }

                        f = Integer.parseInt(jLabel8.getText());
                        g = Integer.parseInt(jTextField4.getText());
                        if(rn5 == 2){
                            hasil3 = e - f;
                        }else if(rn5 == 1){
                            hasil3 = e + f;
                        }

                        h = Integer.parseInt(jTextField5.getText());
                        if(rn5 == 2){
                            hasil4 = g - h;
                        }else if(rn5 == 1){
                            hasil4 = g + h;
                        }

                        if(hasil1 == c && hasil2 == e && hasil3 == g && hasil4 == a){
                            setCek(true);
                        }
                        break;
                    case 1:
                        a = Integer.parseInt(jTextField1.getText());
                        b = Integer.parseInt(jLabel1.getText());
                        c = Integer.parseInt(jTextField2.getText());
                        if(rn5 == 2){
                            hasil1 = a - b;
                        }else if(rn5 == 1){
                            hasil1 = a + b;
                        }

                        d = Integer.parseInt(jTextField3.getText());
                        e = Integer.parseInt(jLabel5.getText());
                        if(rn5 == 2){
                            hasil2 = c - d;
                        }else if(rn5 == 1){
                            hasil2 = c + d;
                        }

                        f = Integer.parseInt(jTextField4.getText());
                        g = Integer.parseInt(jLabel8.getText());
                        if(rn5 == 2){
                            hasil3 = e - f;
                        }else if(rn5 == 1){
                            hasil3 = e + f;
                        }

                        h = Integer.parseInt(jTextField5.getText());
                        if(rn5 == 2){
                            hasil4 = g - h;
                        }else if(rn5 == 1){
                            hasil4 = g + h;
                        }

                        if(hasil1 == c && hasil2 == e && hasil3 == g && hasil4 == a){
                            setCek(true);
                        }
                        break;
                    case 2:
                        a = Integer.parseInt(jTextField5.getText());
                        b = Integer.parseInt(jTextField1.getText());
                        c = Integer.parseInt(jLabel5.getText());
                        if(rn5 == 2){
                            hasil1 = a - b;
                        }else if(rn5 == 1){
                            hasil1 = a + b;
                        }

                        d = Integer.parseInt(jTextField2.getText());
                        e = Integer.parseInt(jTextField3.getText());
                        if(rn5 == 2){
                            hasil2 = c - d;
                        }else if(rn5 == 1){
                            hasil2 = c + d;
                        }

                        f = Integer.parseInt(jLabel8.getText());
                        g = Integer.parseInt(jTextField4.getText());
                        if(rn5 == 2){
                            hasil3 = e - f;
                        }else if(rn5 == 1){
                            hasil3 = e + f;
                        }
                        
                        h = Integer.parseInt(jLabel1.getText());
                        if(rn5 == 2){
                            hasil4 = g - h;
                        }else if(rn5 == 1){
                            hasil4 = g + h;
                        }

                        if(hasil1 == c && hasil2 == e && hasil3 == g && hasil4 == a){
                            setCek(true);
                        }
                        break;
                    default:
                        break;
                }
                
                if(isCek()){
                    condition.setText("BENAR");
                    condition.setBounds(220, 240, 150, 50);
                    condition.setHorizontalAlignment(JLabel.CENTER);
                    condition.setVerticalAlignment(JLabel.CENTER);
                    condition.setForeground(java.awt.Color.green);
                    condition.setFont(new java.awt.Font("Dialog", 1, 30));
                    frame.add(jLabel1);
                    
                }else{
                    condition.setText("SALAH");
                    condition.setBounds(220, 240, 150, 50);
                    condition.setHorizontalAlignment(JLabel.CENTER);
                    condition.setVerticalAlignment(JLabel.CENTER);
                    condition.setForeground(java.awt.Color.red);
                    condition.setFont(new java.awt.Font("Dialog", 1, 30));
                    frame.add(jLabel1);
                }
            }
        });
        
        button2.setBounds(425, 500, 120, 40);
        button2.setFont(new java.awt.Font("DM Sans", 1, 25));
        button2.setBackground(java.awt.Color.white);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               if(isCek()){
                    setCek(false);
                    String num = Integer.toString(rn2);
                    jLabel1.setText(num);
                    num = Integer.toString(rn3);
                    jLabel5.setText(num);
                    num = Integer.toString(rn4);
                    jLabel8.setText(num);
                    jTextField1.setText("0");
                    jTextField2.setText("0");
                    jTextField3.setText("0");
                    jTextField4.setText("0");
                    jTextField5.setText("0");
                    setLevelCount(getLevelCount() + 1);
                    level.setText("Level " + getLevelCount());
                    setGUI();
                } 
            }
        });
        
        button3.setBounds(50, 500, 120, 40);
        button3.setFont(new java.awt.Font("DM Sans", 1, 25));
        button3.setBackground(java.awt.Color.white);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frame.dispose();
                frame.setVisible(false);
                main.setJFrame(true);
            }
        });
        
        frame.add(jLabel1);
        frame.add(jLabel2);
        frame.add(jLabel3);
        frame.add(jLabel4);
        frame.add(jLabel5);
        frame.add(jLabel6);
        frame.add(jLabel7);
        frame.add(jLabel8);
        frame.add(jLabel9);
        frame.add(jLabel10);
        frame.add(jLabel11);
        frame.add(jTextField1);
        frame.add(jTextField2);
        frame.add(jTextField3);
        frame.add(jTextField4);
        frame.add(jTextField5);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(condition);
        frame.add(level);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setSize(this.width, this.height);
        frame.setBackground(java.awt.Color.white);
        frame.setTitle("Mathdle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public boolean isCek() {
        return cek;
    }

    public void setCek(boolean cek) {
        this.cek = cek;
    }

    public int getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }
    
    
}
