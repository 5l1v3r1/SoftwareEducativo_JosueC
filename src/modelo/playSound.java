
package modelo;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;


public class playSound {
    private String path;
    private AudioClip clip;
    
    public playSound(String path){
        this.path = path;
        
    }
    
    public void Init(){
        if (this.path.isEmpty()){
            System.out.println("The path is Empty");
        }else{
            try {
                System.out.println("path aceptdo ");
                File Url = new File(this.path.replace("\\", "/"));
                clip = Applet.newAudioClip(Url.toURI().toURL());
            } catch (Exception e) {
                System.out.println("There was a mistake while oppening file: "+e);
            }
        }
    }
    
    public void Play(){
        try {
            System.out.println("paly entered");
            clip.play();
        } catch (Exception e) {
            System.out.println("There was a miskase while playing a sound: "+e);
        }
    }
    public void Stop(){
        try {
            clip.stop();
        } catch (Exception e) {
            System.out.println("There was a miskase while stopping a sound: "+e);
        }
    }
    
    public String getPath(){
        return this.path;
    }
    public void setPath(String path){
        path = this.path;
    }
    
}
