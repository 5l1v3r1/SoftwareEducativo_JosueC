
package vista;
import com.sun.awt.AWTUtilities;
import java.applet.AudioClip;
import javax.swing.ImageIcon;
import modelo.mIconX;
public class vIndex extends javax.swing.JFrame {

    private  mIconX inka = new mIconX("\\img\\index\\inka.gif",589,445);
    private  mIconX logo = new mIconX("\\img\\index\\logo.png",591-5,90-5);
   //sonido de fondo
    private AudioClip sonidoFondo;
    private final  String pathFondo = "\\sound\\voces\\chuquisoft.wav".replace("\\", "/");
   
    public vIndex() {
        initComponents();
        
        //getClass().getResource
        
        setIconImage(new ImageIcon(getClass().getResource("/img/index/Escudo_imperio_inca.png")).getImage());
        AWTUtilities.setWindowOpaque(this, false);
        imgInka.setIcon(inka.Standard());
        imgLogo.setIcon(logo.Standard());
         sonidoFondo = java.applet.Applet.newAudioClip(getClass().getResource(pathFondo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgInka = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        imgInka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgInka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/Escudo_imperio_inca.png"))); // NOI18N
        imgInka.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgInka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgInkaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgInkaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgInkaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgInkaMouseReleased(evt);
            }
        });

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index/logo.png"))); // NOI18N
        imgLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgLogoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgLogoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgLogoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgInka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imgInka, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         //Reproducir sonido 
            new Thread(){
                public void start(){
                   sonidoFondo.play();
                   System.out.println("Se reprodució audio");
               }
            }.start();
          //  Movimiento inka
           // mIconX i = new mIconX(imgInka,5,"src\\img\\index\\Escudo_imperio_inca.png",589,445);
           // i.effectLate();
               
    }//GEN-LAST:event_formWindowOpened

    private void imgInkaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgInkaMouseEntered
      
    }//GEN-LAST:event_imgInkaMouseEntered

    private void imgInkaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgInkaMouseExited
       
    }//GEN-LAST:event_imgInkaMouseExited

    private void imgInkaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgInkaMousePressed
        
    }//GEN-LAST:event_imgInkaMousePressed

    private void imgLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseEntered
        imgLogo.setIcon(logo.Entered());
    }//GEN-LAST:event_imgLogoMouseEntered

    private void imgLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseExited
        imgLogo.setIcon(logo.Exited());
    }//GEN-LAST:event_imgLogoMouseExited

    private void imgLogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMousePressed
        imgLogo.setIcon(logo.Pressed());
    }//GEN-LAST:event_imgLogoMousePressed

    private void imgLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseClicked
        
        setVisible(false);
        vMenu menu = new vMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        
    }//GEN-LAST:event_imgLogoMouseClicked

    private void imgInkaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgInkaMouseReleased
        //imgInka.setIcon(inka.Released());
    }//GEN-LAST:event_imgInkaMouseReleased

    private void imgLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseReleased
        imgLogo.setIcon(logo.Released());
    }//GEN-LAST:event_imgLogoMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgInka;
    private javax.swing.JLabel imgLogo;
    // End of variables declaration//GEN-END:variables
}
