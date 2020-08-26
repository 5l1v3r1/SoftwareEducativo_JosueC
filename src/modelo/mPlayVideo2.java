package modelo;
import java.awt.BorderLayout;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mPlayVideo2 {
    
    private JFXPanel panell;
    private JPanel jpanel;
    private MediaPlayer mediaplayer;
    private Media media;
    private MediaView mediaView;
    private Scene scene;

    private String path;
    private int H;
    private int W;
    
    // Constructor
    public mPlayVideo2(){
        this.panell = new JFXPanel();

    }
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    /**
     * @return the mediaplayer
     */
    public MediaPlayer getMediaplayer() {
        return mediaplayer;
    }
    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    public void showVideo(){
        try {
            //getMediaplayer().
             W = this.jpanel.getWidth();
             H = this.jpanel.getHeight();
            //this.media = new Media(this.file.toURI().toString());
            
            this.media = new Media(getClass().getResource(this.path).toString());
            
            this.mediaplayer = new MediaPlayer(this.media);
            this.mediaView = new MediaView(this.mediaplayer);
            this.mediaView.setFitHeight(H);
            this.mediaView.setFitWidth(W);
            this.scene = new Scene(new Group(this.mediaView)); 
            this.panell.setSize(W,H);
            this.panell.setScene(this.scene);
            this.getMediaplayer().setCycleCount(MediaPlayer.INDEFINITE);
            
            // border
            this.jpanel.setLayout(new BorderLayout());
            this.jpanel.add(this.panell, BorderLayout.CENTER);

        } catch (MediaException e) {
            JOptionPane.showMessageDialog(null,"There was a mistake while opening a video or file","Error while opening ",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void play(){
        try {
            getMediaplayer().play();
        } catch (MediaException e) {
            System.out.println("There was a mistake while playing");
        }
    }
    public void stop(){
        try {
            getMediaplayer().stop();
        } catch (MediaException e) {
            System.out.println("There was a mistake while stopping");
        }
    }
    public void pause(){
        try {
            getMediaplayer().pause();
        } catch (MediaException e) {
            System.out.println("There was a mistake in the pause");
        }
    }
    public void setVolume(double value){
        try {
            getMediaplayer().setVolume(value);
        } catch (MediaException e) {
            System.out.println("There was a mistake while raising volume ");
        }
    }
    public double getVolume(){
        return getMediaplayer().getVolume();
    }

    
}
