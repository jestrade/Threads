/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesusdavide
 */
public class Hilo implements Runnable{
        String nombre;
        
        public Hilo(String nombre){
            this.nombre = nombre;
            new Thread(this).start();
        }
        
	@Override
	public void run() {
            
            try {
                for (int i = 0; i < 200; i++) {
                    System.out.println(this.nombre+" i: "+i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
    
}
