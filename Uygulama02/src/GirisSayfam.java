import javax.swing.*;
import java.awt.*;

public class GirisSayfam {
     JFrame frame;
     JTextField kullanıcıAdı;
     public GirisSayfam(){
         JPanel panelUst = new JPanel();
         panelUst.setLayout(new FlowLayout());
         JLabel labelUst = new JLabel("Kullanıcı Adı :");
         labelUst.setFont(new Font("Arial",Font.PLAIN,20));

         kullanıcıAdı = new JTextField();
         kullanıcıAdı.setPreferredSize(new Dimension(200,40));

         panelUst.add(labelUst);
         panelUst.add(kullanıcıAdı);

         frame.setTitle("Kullanıcı Girişi");
         frame.setSize(300, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);
     }
}
