package rankingfichero;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Mañana
 */
public class EntradaSalida {
    
    public static int mostrarMenu()
            {
    			int opcion_minima = 1;
    			int opcion_maxima = 3;
    			int opcion_salida = 9;Scanner teclado = new Scanner(System.in);
                System.out.println("\n1-Jugar");
                System.out.println("2-Ver ranking");
                System.out.println("3-Salir");
                System.out.println("Escriba una opción de 1 a 3");
                int opcion = teclado.nextInt();
                while ((opcion <opcion_minima || opcion>opcion_maxima) && opcion !=opcion_salida)
                {
                    System.out.println("Escriba una opción de "+opcion_minima+" a "+opcion_maxima+", o "+opcion_salida+" para salir");
                    opcion = teclado.nextInt();
                }
                return opcion;
                
            }
    
      public static int pedirNumeroEntreUnoYDiez()
            {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Escribe un número entre 1 y 10");
                int entrada = teclado.nextInt();
                while (entrada <1 || entrada>10)
                {
                    System.out.println("Escriba un número entre 1 y 10");
                    entrada = teclado.nextInt();
                }
                return entrada;
                
            }
    
      public static String pedirNombre()
      {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String entrada = teclado.nextLine();
        return entrada;
      }

    public static void pintarSalida(String texto)
    {
        System.out.println(texto);
    }
}
