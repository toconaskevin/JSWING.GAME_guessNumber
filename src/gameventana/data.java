package gameventana;

import javax.swing.JOptionPane;

public class data {
    
    public data(){
        intentosMAX=Integer.parseInt(ventana.chances.getText());
    }
    
        int intentosMAX, numAdivinar, numAdivinado;
        boolean continuar;
    
    public void capturaDatos(){        
        try {
            numAdivinar=Integer.parseInt(ventana.numeroA.getText());
            intentosMAX=Integer.parseInt(ventana.chances.getText());
            continuar=true;
        }
        catch (Exception noInt){
            JOptionPane.showMessageDialog(null, "Valores no validos. Debe ingresar solo numeros");
            continuar=false;         
        }
    }
        
    public void capturaDatos2(){
        try {
            numAdivinado=Integer.parseInt(ventana2.numeroB.getText());
        }
        catch (Exception noInt2){
            JOptionPane.showMessageDialog(null, "Valores no validos. Debe ingresar solo numeros");
        }  
    }
    
    public void proceso(){
        numAdivinar=Integer.parseInt(ventana.numeroA.getText());
        intentosMAX=Integer.parseInt(ventana.chances.getText());
            if (numAdivinado>numAdivinar){
                JOptionPane.showMessageDialog(null, "El numero ingresado es mayor que el numero a adivinar.");
                intentosMAX--;
            }            
            else {
                if (numAdivinado<numAdivinar){
                    JOptionPane.showMessageDialog(null, "El numero ingresado es menor que el numero a adivinar.");
                    intentosMAX--;
                }
                else {
                    JOptionPane.showMessageDialog(null, "GANASTE, acertaste al numero.");
                    System.exit(0);
                }
            }
            if (0==intentosMAX){
                JOptionPane.showMessageDialog(null, "PERDISTE! Agotaste todos tus intentos. "
                        + "El numero a adivinar era el "+numAdivinar+".");
                System.exit(0);
            }
    }
}
