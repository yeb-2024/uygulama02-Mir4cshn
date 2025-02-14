import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GirisSayfam implements ActionListener {
     JFrame frame;
     JTextField kullanıcıAdı,sifre;
     JButton button;
     public GirisSayfam(){
         JPanel panelUst = new JPanel();
         panelUst.setLayout(new FlowLayout());
         JLabel labelUst = new JLabel("Kullanıcı Adı :");
         labelUst.setFont(new Font("Arial",Font.PLAIN,20));

         kullanıcıAdı = new JTextField();
         kullanıcıAdı.setPreferredSize(new Dimension(200,40));

         panelUst.add(labelUst);
         panelUst.add(kullanıcıAdı);


         JPanel panelAlt = new JPanel();
         panelAlt.setLayout(new FlowLayout());
         JLabel labelAlt = new JLabel("Şifre :");
         labelAlt.setFont(new Font("Arial",Font.PLAIN,20));

         sifre = new JTextField();
         sifre.setPreferredSize(new Dimension(200,40));

         panelAlt.add(labelAlt);
         panelAlt.add(sifre);

         button = new JButton("Giriş Yap");
         button.setFont(new Font("Arial",Font.PLAIN,20));
         button.addActionListener(this);

         frame = new JFrame();

         frame.setTitle("Kullanıcı Girişi");
         frame.setSize(400, 300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new GridLayout(3,1));

         frame.add(panelUst);
         frame.add(panelAlt);
         frame.add(button);

         frame.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String kullanıcıAdi = this.kullanıcıAdı.getText().trim();
            String sifre = this.sifre.getText().trim();

           if(kullanıcıAdi.isEmpty() || sifre.isEmpty()){
               JOptionPane.showMessageDialog(null
                       ,"Lütfen tum alanları doldurun."
                       ,"Hata"
                       ,JOptionPane.ERROR_MESSAGE);
           }
           else if(sifre.length() < 5){
               JOptionPane.showMessageDialog(null
                       ,"Minimum 5 char olmalı."
                       ,"Adam Akıllı Doldur Su Alanı"
                       ,JOptionPane.ERROR_MESSAGE);
           }
           else if(kullanıcıAdi.equals("kullanıcı") && sifre.equals("12345")){
               JOptionPane.showMessageDialog(null
                       ,"Giriş Başarılı."
                       ,"Helal lan sana"
                       ,JOptionPane.INFORMATION_MESSAGE);
           }
        }
    }
}
