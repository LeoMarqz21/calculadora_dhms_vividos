package clases;

import javax.swing.JOptionPane;

public class Ventana {
    
    // public Ventana(){}

    

    public boolean confirmar(String titulo, String mensaje ){
        boolean confirmacion = false;
        var resultado = JOptionPane.showConfirmDialog(null, mensaje,titulo, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if(resultado == JOptionPane.YES_OPTION){
            confirmacion = true;
        }else if(resultado== JOptionPane.NO_OPTION){
            confirmacion = false;
        }
        return confirmacion;
    }

    public int entradaInt(String mensaje){
        int numero = 0;
        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }catch(Exception error){
            System.out.println(error);
            numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
        return numero;
    }

    public void mensaje(String mensaje){
        if(mensaje.length() > 3){
            JOptionPane.showMessageDialog(null, mensaje);
        }else{
            System.out.println("El mensaje debe ser mayor a 3 caracteres");
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
