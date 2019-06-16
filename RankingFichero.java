package rankingfichero;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ficherocoches.AccesoFichero;

/**
 *
 * @author Mañana
 */
public class RankingFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	String nombre_fichero = "C:\\Pruebas Java\\BaseRanking.csv";
        AccesoFichero.InicializarFichero(nombre_fichero);
        FileWriter escritor = null;
        ArrayList<Jugador> ranking = new ArrayList<>();
        int opcion = EntradaSalida.mostrarMenu();
        
        while (opcion!=3)
        {         
        switch (opcion)
        {
            case 1:
                int n_aleatorio=(int)(Math.random()*9+1);
                int n_usuario=EntradaSalida.pedirNumeroEntreUnoYDiez();
                int intentos = 0;
                while(n_aleatorio!=n_usuario)
                {
                    if (n_aleatorio>n_usuario)
                    {
                        EntradaSalida.pintarSalida("El número tiene que ser mayor");
                        intentos++;
                    }
                    else
                    {
                        EntradaSalida.pintarSalida("El número tiene que ser menor");
                        intentos++;
                    }
                    n_usuario=EntradaSalida.pedirNumeroEntreUnoYDiez();
                }
                
                intentos++;
                EntradaSalida.pintarSalida("Enhorabuena!!! Has acertado en "+intentos+" intentos");
                String nombre = EntradaSalida.pedirNombre();
                
                Jugador nuevo_jugador = new Jugador(nombre,intentos);
                ranking.add(nuevo_jugador);
                AccesoFichero.grabarJugador(nuevo_jugador, nombre_fichero);
        
                break;
            case 2:
                ArrayList<Jugador> lista = AccesoFichero.obtenerListaJugadores(nombre_fichero);
                
                
            	//Así sería sin el for each
                //for (int i=0;i<lista.size();i++)
                //{
                //  String texto = "Con "+lista.get(i).getIntentos()+" intentos, "+lista.get(i).getNombre();
                //	EntradaSalida.pintarSalida(texto);;
                //}
                  
                for (Jugador j : lista)
                {
                    String texto = "Con "+j.getIntentos()+" intentos, "+j.getNombre();
                    EntradaSalida.pintarSalida(texto);
                }                        
                            
                  
                break;
        }
     
        opcion = EntradaSalida.mostrarMenu();
    }
    }
    
}
