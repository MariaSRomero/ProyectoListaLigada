/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class TestingListaLigada {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
        
        ListaLigada lista = new ListaLigada();
        
        for(;;){ // ciclo infinito
        
            System.out.println("Escribe un dato entero: ");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("¿Quieres agregar más datos: (s/n): ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if(respuesta == 'n' || respuesta == 'N')
                break;
        }
             
            System.out.println("-----------------------------------");
            System.out.println("Contenido de la lista ligada: ");
            lista.printList();
            
        
    }
}

