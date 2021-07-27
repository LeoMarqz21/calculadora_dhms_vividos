import clases.Ventana;

public class App {
    public static void main(String[] args) throws Exception {
        
        String mensajeInicio = "Esta aplicación calcula los:  \n\n<> dias \n<> horas \n<> minutos \n<> segundos \n\nQue tu as vivido\n\nSeguir [yes] sino [No]";
        boolean inicio = false;
        int edad = 0;
        Ventana vn = new Ventana();
        
        inicio = vn.confirmar("LeoMarqz - Bienvenid@s", mensajeInicio);
        if(inicio){
            edad = vn.entradaInt("Ingresa tu edad: ");
            if(edad > 0){
                int[] vivido = eVivido(edad);
                var mostrar = "Tienes " + edad + " años y as vivido \n<> " +
                                 vivido[0] + " dias,\n <> " +
                                 vivido[1] + " horas, \n <> " + 
                                 vivido[2] + " minutos y \n <> " + 
                                 vivido[3] + " segundos";
                System.out.println("dias: " + vivido[0]);
                vn.mensaje(mostrar);
                vn.mensaje("Gracias por preferirnos :)\n\n\tVuelve Pronto");
            }
            else{
                vn.mensaje("Debes ingresar una edad mayor a 0");
            }
        }
        else{
            vn.mensaje("Vuelve Pronto :)");
        }

    }

    public static int[] eVivido(int edad){
        int[] vivido = new int[4];
        int dias = edad * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        int segundos = minutos * 60;
        vivido[0] = dias;
        vivido[1] = horas;
        vivido[2] = minutos;
        vivido[3] = segundos;
        return vivido;
    }
}
