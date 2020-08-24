/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImgC {
    private int W;
    private int H;
    private String path;
    private ImageIcon icon ;
    
    public ImgC(String path,int W,int H){
       this.path = path.replace("\\", "/");
       this.W = W;
       this.H = H;
       this.icon = new ImageIcon(getClass().getResource(this.path));
    }
    public Icon Standard(){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W, H, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Pressed( ){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W-5, H-5, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Released(){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W+2, H-2, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Entered(){
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(W+5, H+5, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon Exited(){
        return Standard();
    }
    
}
