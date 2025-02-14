import javax.swing.*;
import java.awt.*;

public class GirisSayfam {
     JFrame frame;
     JTextField kullanıcıAdı,sifre;
     public GirisSayfam(){
         JPanel panelUst = new JPanel();
         panelUst.setLayout(new FlowLayout());
         JLabel labelUst = new JLabel("Kullanıcı Adı :");
         labelUst.setFont(new Font("Arial",Font.PLAIN,20));

         kullanıcıAdı = new JTextField();
         kullanıcıAdı.setPreferredSize(new Dimension(300,60));

         panelUst.add(labelUst);
         panelUst.add(kullanıcıAdı);


         JPanel panelAlt = new JPanel();
         panelAlt.setLayout(new FlowLayout());
         JLabel labelAlt = new JLabel("Şifre :");
         labelAlt.setFont(new Font("Arial",Font.PLAIN,20));

         sifre = new JTextField();
         sifre.setPreferredSize(new Dimension(300,60));

         panelAlt.add(labelAlt);
         panelAlt.add(sifre);


         frame = new JFrame();

         frame.setTitle("Kullanıcı Girişi");
         frame.setSize(400, 300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new GridLayout(3,1));

         frame.add(panelUst);
         frame.add(panelAlt);


         frame.setVisible(true);
     }
}
