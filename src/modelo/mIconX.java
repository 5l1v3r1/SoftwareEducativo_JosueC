/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class mIconX {
    private int W;
    private int H;
    private String path;
    private int interval;
    private ImageIcon icon ;
    
    public mIconX(String path,int W,int H){
       this.path = path.replace("\\", "/");
       this.W = W;
       this.H = H;
       this.interval = 5;
       this.icon = new ImageIcon(getClass().getResource(this.path));
    }
    public Icon Standard(){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W, H, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Pressed( ){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W-interval, H-interval, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Released(){
        return Entered();
    }
    public Icon Entered(){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W+interval, H+interval, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Exited(){
        return Standard();
    }
    public void setInterval(int interval){
        this.interval = interval;
    }
}


