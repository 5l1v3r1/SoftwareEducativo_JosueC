
package vista;

import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class vMenu extends javax.swing.JFrame {

    private CofreMagico  vVGame= null;
    private vJuego vJJuego  = null;
    private vMusica vVMusica = null;
    public final int H = 600, W = 800;
    private vVideo1 vVVideo1 = null;
    private vVideo2 vVVideo2 = null;
    private int x = 550;
    private int y = 0;
    private int velocidad =6;

    // Audio Cofre Magico
    private final String pathCofre =  "\\sound\\voces\\El cofre mágico.wav";
    private AudioClip sCofre;
    // Audio Video
    private final String pathGame =  "\\sound\\voces\\jugar-fast.wav";
    private AudioClip sGame;
    // adudio Musica
    private final String pathMusica = "\\sound\\voces\\musica-fast.wav"; 
    private AudioClip sMusica;
    // Sound video 1
    private final String pathVideo1 = "\\sound\\voces\\ver un video.wav"; 
    private AudioClip sVideo1;



   
    public vMenu() {
        initComponents();
        panelLienzo.setFocusable(true);
        imgInka.setLocation(x,y);
        sCofre = java.applet.Applet.newAudioClip(getClass().getResource(pathCofre.replace("\\", "/")));
        sGame = java.applet.Applet.newAudioClip(getClass().getResource(pathGame.replace("\\", "/")));
        sMusica = java.applet.Applet.newAudioClip(getClass().getResource(pathMusica.replace("\\", "/")));
        sVideo1 = java.applet.Applet.newAudioClip(getClass().getResource(pathVideo1.replace("\\", "/")));
        setIconImage(new ImageIcon(getClass().getResource("/img/index/Escudo_imperio_inca.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLienzo = new javax.swing.JDesktopPane();
        imgInka = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Juego = new javax.swing.JMenu();
        itemCofreMagico = new javax.swing.JMenu();
        itemMusic = new javax.swing.JMenu();
        itemVideo1 = new javax.swing.JMenu();
        itemVideo2 = new javax.swing.JMenu();
        vAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLienzo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelLienzoKeyPressed(evt);
            }
        });

        imgInka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inka.png"))); // NOI18N
        panelLienzo.add(imgInka);
        imgInka.setBounds(650, 0, 150, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo (4).jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelLienzo.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 620);

        Juego.setText("Juego");
        Juego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JuegoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JuegoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JuegoMouseExited(evt);
            }
        });
        Juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuegoActionPerformed(evt);
            }
        });
        menuBar.add(Juego);

        itemCofreMagico.setText("Cofre Magico");
        itemCofreMagico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemCofreMagicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemCofreMagicoMouseEntered(evt);
            }
        });
        itemCofreMagico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCofreMagicoActionPerformed(evt);
            }
        });
        menuBar.add(itemCofreMagico);

        itemMusic.setText("Musica");
        itemMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMusicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMusicMouseEntered(evt);
            }
        });
        menuBar.add(itemMusic);

        itemVideo1.setText("Video 1");
        itemVideo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemVideo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemVideo1MouseEntered(evt);
            }
        });
        menuBar.add(itemVideo1);

        itemVideo2.setText("Video 2");
        itemVideo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemVideo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemVideo2MouseEntered(evt);
            }
        });
        menuBar.add(itemVideo2);

        vAbout.setText("Acerca de");
        vAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vAboutMouseClicked(evt);
            }
        });
        menuBar.add(vAbout);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemVideo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVideo2MouseClicked
        if (vVVideo2 == null || vVVideo2.isClosed()){
            vVVideo2 = new vVideo2();
            this.panelLienzo.add(vVVideo2);
            vVVideo2.setLocation((W/2-(vVVideo2.getWidth()/2)), (H/2)-(vVVideo2.getHeight()/2));
            vVVideo2.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
        
        //Reproducir sonido 
            new Thread(){
                public void start(){
                   sVideo1.play();
                   System.out.println("Se reprodució audio");
               }
            }.start();
    }//GEN-LAST:event_itemVideo2MouseClicked

    private void itemVideo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVideo1MouseClicked
        //Reproducir sonido 
            new Thread(){
                public void start(){
                   sVideo1.play();
                   System.out.println("Se reprodució audio");
               }
            }.start();
        if (vVVideo1 == null || vVVideo1.isClosed()){
            vVVideo1 = new vVideo1();
            this.panelLienzo.add(vVVideo1);
            vVVideo1.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_itemVideo1MouseClicked

    private void itemMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMusicMouseClicked
        //Reproducir sonido 
            new Thread(){
                public void start(){
                   sMusica.play();
                   System.out.println("Se reprodució audio");
               }
            }.start();
            
        if (vVMusica == null || vVMusica.isClosed()){
            vVMusica = new vMusica();
            this.panelLienzo.add(vVMusica);
            vVMusica.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_itemMusicMouseClicked

    private void itemCofreMagicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemCofreMagicoMouseClicked
        if (vVGame == null || vVGame.isClosed()){
            vVGame = new CofreMagico();
            this.panelLienzo.add(vVGame);
            vVGame.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
         //Reproducir sonido 
            new Thread(){
                public void start(){
                   sCofre.play();
                   System.out.println("Se reprodució audio");
               }
            }.start();
    }//GEN-LAST:event_itemCofreMagicoMouseClicked

    private void JuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JuegoMouseClicked
        //Reproducir sonido 
            new Thread(){
                public void start(){
                   sGame.play();
                   System.out.println("Se reprodució audio");
               }
            }.start();
        if (vJJuego == null || vJJuego.isClosed()){
            vJJuego = new vJuego();
            this.panelLienzo.add(vJJuego);
            vJJuego.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_JuegoMouseClicked

    private void panelLienzoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelLienzoKeyPressed
         switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:    System.out.println("press Key Up");     y = y-velocidad; break;
            case KeyEvent.VK_DOWN:  System.out.println("press Key Down");   y = y+velocidad; break;
            case KeyEvent.VK_LEFT:  System.out.println("press Key Left");   x = x-velocidad; break;
            case KeyEvent.VK_RIGHT: System.out.println("press Key Right");  x = x+velocidad; break;
        }
        imgInka.setLocation(x,y);    
       
        
        
        
    }//GEN-LAST:event_panelLienzoKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panelLienzo.setFocusable(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void JuegoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JuegoMouseEntered
    }//GEN-LAST:event_JuegoMouseEntered

    private void itemCofreMagicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemCofreMagicoMouseEntered
    }//GEN-LAST:event_itemCofreMagicoMouseEntered

    private void itemMusicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMusicMouseEntered
        
    }//GEN-LAST:event_itemMusicMouseEntered

    private void itemVideo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVideo1MouseEntered
      
    }//GEN-LAST:event_itemVideo1MouseEntered

    private void itemVideo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVideo2MouseEntered

    }//GEN-LAST:event_itemVideo2MouseEntered

    private void JuegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JuegoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JuegoMouseExited

    private void JuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuegoActionPerformed
         
    }//GEN-LAST:event_JuegoActionPerformed

    private void itemCofreMagicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCofreMagicoActionPerformed
        
    }//GEN-LAST:event_itemCofreMagicoActionPerformed

    private void vAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vAboutMouseClicked
        
        vAbout about = new vAbout();
        about.setLocationRelativeTo(null);
        about.setVisible(true);
        
    }//GEN-LAST:event_vAboutMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Juego;
    private javax.swing.JLabel imgInka;
    private javax.swing.JMenu itemCofreMagico;
    private javax.swing.JMenu itemMusic;
    private javax.swing.JMenu itemVideo1;
    private javax.swing.JMenu itemVideo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JDesktopPane panelLienzo;
    private javax.swing.JMenu vAbout;
    // End of variables declaration//GEN-END:variables

}
