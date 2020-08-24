
package vista;

import java.awt.event.KeyEvent;
import modelo.playSound;

public class vMenu extends javax.swing.JFrame {

    private CofreMagico  vVGame= null;
    private vJuego vVCofre  = null;
    private vMusica vVMusica = null;
    public final int H = 600, W = 800;
    private vVideo1 vVVideo1 = null;
    private vVideo2 vVVideo2 = null;
    private int x = 550;
    private int y = 0;
    private int velocidad =6;
    
   // <editor-fold defaultstate="collapsed" desc="sound Fast">
    // Audio Cofre Magico
    private final String pathCofre =   "src\\sound\\voces\\jugar-fast.wav";

    public playSound iACofre;
    // Audio Video
    private final String pathGame = "src\\sound\\voces\\El cofre mágico.wav";

    public playSound IAGame;
    // adudio Musica
    private final String pathMusica = "src\\sound\\voces\\musica-fast.wav"; 

    public playSound IAMusica;
    // Sound video 1
    private final String pathFVideo1 = "src\\sound\\voces\\ver un video.wav"; 
    public playSound IAVideo1;
    //sound video2
    private final String pathVideo2 = "src\\sound\\voces\\ver un video.wav"; 
    public playSound IAVideo2;
    // </editor-fold>

   
    public vMenu() {
        initComponents();
        panelLienzo.setFocusable(true);
        imgInka.setLocation(x,y);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLienzo = new javax.swing.JDesktopPane();
        imgInka = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Juego = new javax.swing.JMenu();
        itemGame = new javax.swing.JMenu();
        itemMusic = new javax.swing.JMenu();
        itemVideo1 = new javax.swing.JMenu();
        itemVideo2 = new javax.swing.JMenu();

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

        itemGame.setText("Cofre Magico");
        itemGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemGameMouseEntered(evt);
            }
        });
        itemGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGameActionPerformed(evt);
            }
        });
        menuBar.add(itemGame);

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
        
        
        
        new Thread(){
                public void start(){
                    IAVideo2 = new playSound(pathVideo2);
                    IAVideo2.Init();
                    IAVideo2.Play();
                }
        }.start();
    }//GEN-LAST:event_itemVideo2MouseClicked

    private void itemVideo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemVideo1MouseClicked
         new Thread(){
                public void start(){
                    IAVideo1 = new playSound(pathFVideo1);
                    IAVideo1.Init();
                    IAVideo1.Play();
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
        new Thread(){
                public void start(){
                    IAMusica = new playSound(pathMusica);
                    IAMusica.Init();
                    IAMusica.Play();
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

    private void itemGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGameMouseClicked
        if (vVGame == null || vVGame.isClosed()){
            vVGame = new CofreMagico();
            this.panelLienzo.add(vVGame);
            vVGame.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
         new Thread(){
                public void start(){
                    IAGame = new playSound(pathGame);
                    IAGame.Init();
                    IAGame.Play();
                }
            }.start();
    }//GEN-LAST:event_itemGameMouseClicked

    private void JuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JuegoMouseClicked
        new Thread(){
                public void start(){
                    iACofre = new playSound(pathCofre);
                    iACofre.Init();
                    iACofre.Play();
                    
                }
            }.start();
        if (vVCofre == null || vVCofre.isClosed()){
            vVCofre = new vJuego();
            this.panelLienzo.add(vVCofre);
            vVCofre.show(true);
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

    private void itemGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGameMouseEntered
    }//GEN-LAST:event_itemGameMouseEntered

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

    private void itemGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGameActionPerformed
        
    }//GEN-LAST:event_itemGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Juego;
    private javax.swing.JLabel imgInka;
    private javax.swing.JMenu itemGame;
    private javax.swing.JMenu itemMusic;
    private javax.swing.JMenu itemVideo1;
    private javax.swing.JMenu itemVideo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JDesktopPane panelLienzo;
    // End of variables declaration//GEN-END:variables

}
