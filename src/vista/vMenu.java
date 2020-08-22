
package vista;

import java.awt.event.KeyEvent;
import modelo.playSound;

public class vMenu extends javax.swing.JFrame {

    private vCofreMagico c= null;
    private vJuego j = null;
    private vMusica m = null;

    private vVideo1 v1 = null;
    private vVideo2 v2 = null;
    private int x = 550;
    private int y = 0;
    private int velocidad =6;
    
    // Audio Cofre Magico
    private final String pathCofre = "src\\sound\\voces\\bienvenidos.wav";
    public playSound iACofre;
    // Audio Video
    private final String pathVideo = "src\\sound\\voces\\bienvenidos.wav"; 
    public playSound iAVideo;
    // adudio Musica
    private final String pathMusica = "src\\sound\\voces\\bienvenidos.wav"; 
    public playSound IAMusica;
    // Sound video 1
    private final String pathFVideo1 = "src\\sound\\voces\\bienvenidos.wav"; 
    public playSound IAVideo1;
    //sound video2
    private final String pathVideo2 = "src\\sound\\voces\\bienvenidos.wav"; 
    public playSound IAVideo2;

    
    
    
    public vMenu() {
        initComponents();
        desktopPane.setFocusable(true);
        imgInka.setLocation(x,y);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        imgInka = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                desktopPaneKeyPressed(evt);
            }
        });

        imgInka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inka.png"))); // NOI18N
        desktopPane.add(imgInka);
        imgInka.setBounds(650, 0, 150, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo (4).jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 580);

        jMenu1.setText("Cofre Magico");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu1MouseExited(evt);
            }
        });
        menuBar.add(jMenu1);

        jMenu2.setText("Juego");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu2MouseEntered(evt);
            }
        });
        menuBar.add(jMenu2);

        jMenu3.setText("Musica");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu3MouseEntered(evt);
            }
        });
        menuBar.add(jMenu3);

        jMenu4.setText("Video 1");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu4MouseEntered(evt);
            }
        });
        menuBar.add(jMenu4);

        jMenu5.setText("Video 2");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu5MouseEntered(evt);
            }
        });
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        if (v2 == null || v2.isClosed()){
            v2 = new vVideo2();
            this.desktopPane.add(v2);
            v2.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        if (v1 == null || v1.isClosed()){
            v1 = new vVideo1();
            this.desktopPane.add(v1);
            v1.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if (m == null || m.isClosed()){
            m = new vMusica();
            this.desktopPane.add(m);
            m.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if (j == null || j.isClosed()){
            j = new vJuego();
            this.desktopPane.add(j);
            j.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        if (c == null || c.isClosed()){
            c = new vCofreMagico();
            this.desktopPane.add(c);
            c.show(true);
        }else{
            System.out.println("[Form] - The form exits");
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void desktopPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desktopPaneKeyPressed
         switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP:    System.out.println("press Key Up");     y = y-velocidad; break;
            case KeyEvent.VK_DOWN:  System.out.println("press Key Down");   y = y+velocidad; break;
            case KeyEvent.VK_LEFT:  System.out.println("press Key Left");   x = x-velocidad; break;
            case KeyEvent.VK_RIGHT: System.out.println("press Key Right");  x = x+velocidad; break;
        }
        imgInka.setLocation(x,y);    
       
        
        
        
    }//GEN-LAST:event_desktopPaneKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        desktopPane.setFocusable(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
          new Thread(){
                public void start(){
                    iACofre = new playSound(pathCofre);
                    iACofre.Init();
                    iACofre.Play();
                }
            }.start();
    }//GEN-LAST:event_jMenu1MouseEntered

    private void jMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseEntered
        new Thread(){
                public void start(){
                    iAVideo = new playSound(pathVideo);
                    iAVideo.Init();
                    iAVideo.Play();
                }
        }.start();
    }//GEN-LAST:event_jMenu2MouseEntered

    private void jMenu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseEntered
        new Thread(){
                public void start(){
                    IAMusica = new playSound(pathMusica);
                    IAMusica.Init();
                    IAMusica.Play();
                }
            }.start();
    }//GEN-LAST:event_jMenu3MouseEntered

    private void jMenu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseEntered
       
        new Thread(){
                public void start(){
                    IAVideo1 = new playSound(pathFVideo1);
                    IAVideo1.Init();
                    IAVideo1.Play();
                }
            }.start();
    }//GEN-LAST:event_jMenu4MouseEntered

    private void jMenu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseEntered
        new Thread(){
                public void start(){
                    IAVideo2 = new playSound(pathVideo2);
                    IAVideo2.Init();
                    IAVideo2.Play();
                }
            }.start();
    }//GEN-LAST:event_jMenu5MouseEntered

    private void jMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel imgInka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
