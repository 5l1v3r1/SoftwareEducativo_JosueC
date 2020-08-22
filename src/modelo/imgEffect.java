
package modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class imgEffect {
    private JLabel img ;
    private int W;
    private int H;
    private int N;
    private String path;
    private ImageIcon icon;
    
    public imgEffect(JLabel img,int N,String path,int W,int H){
        this.img = img; // imagen
        this.path = path;
        this.N = N;
        this.W = W; // imagen
        this.H = H;
        this.icon = new ImageIcon(this.path.replace("\\", "/"));
        
    }
    public void effectLate(){
        new Thread(){
            public void start(){
                while(true){
                    for (int i = 0; i < N; i++) {
                        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W+i, H+i, Image.SCALE_DEFAULT));
                        img.setIcon(icono);
                        //Ponemos a "Dormir" el programa durante los ms que queremos
                        try {   
                            Thread.sleep(5*1000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    for (int i = 0; i < N; i++) {
                        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W-i, H-i, Image.SCALE_DEFAULT));
                        img.setIcon(icono);
                        try {   
                            Thread.sleep(5*1000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                }
            }
        }.start();
    }
    public void  sdfd(){
    
    }
    
}
