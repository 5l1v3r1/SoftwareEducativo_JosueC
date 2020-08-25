
package modelo;

import java.io.IOException;
import java.net.URISyntaxException;
public class URLX {
     public void goToURL(String URL){
           if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
 
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                   // Logger.getLogger(Acerca.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Erro al abrir navegador ");
                }
            }
        }
    }
}
