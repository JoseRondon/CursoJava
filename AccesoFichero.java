/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rankingfichero;

import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañana
 */
public class AccesoFichero {
    
    static void InicializarFichero(String nombre_fichero)
    {
        File fichero = new File(nombre_fichero);
        try
        {
            fichero.createNewFile();
            System.out.println("Localizado fichero de resultados\n");
        }
        catch (IOException ex)
        {
        	System.out.println("Error al crear el fichero.\n");
        }
        
    }
    
    static void grabarJugador(Jugador nuevo_jugador, String fichero)
    {
    	StringBuffer sbf = new StringBuffer();
    	FileWriter escritor = null;
    	try {
    		sbf.append(nuevo_jugador.toString());
    		escritor = new FileWriter(fichero, true);
    		escritor.append(sbf);
    		escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    static ArrayList obtenerListaJugadores(String fichero)
    {
        ArrayList<Jugador> lista_jugadores = new ArrayList<>();
        
        FileReader lector=null;
        BufferedReader lector_buff=null;
        String linea=null;
        try {
        	lector = new FileReader(fichero);
            lector_buff=new BufferedReader(lector);
        } catch (FileNotFoundException ex) {Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);}

    	try {
			linea = lector_buff.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

        while(linea!=null)
            {
        	String[] jugador_i = linea.split(",");
        	Jugador nuevo_jugador = new Jugador(jugador_i[0], (int)parseInt(jugador_i[1].trim()));
            lista_jugadores.add(nuevo_jugador);
            
            try {
            	linea=lector_buff.readLine();
            } catch (IOException ex) {
            	Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);}
            }
        return lista_jugadores;
    }
}
