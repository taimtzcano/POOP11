/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author tania
 */
public class POOP111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            System.out.println("Escribiendo en el archivo");
            PrintWriter impresoraDeArchivos = new PrintWriter(new BufferedWriter(new FileWriter("alumnos.csv")));
            Alumno[] alumnos = new Alumno[10];

            // Inicializando el objeto alumno
            for (int i = 0; i < 10; i++) {
                alumnos[i] = new Alumno("Nombre" + i, "ApPaterno" + i, "ApMaterno" + i, "NumCuenta" + i, 20 + i);
            }

            //Escribir informacion del alumno en el archivo
            for (Alumno alumno : alumnos) {
                impresoraDeArchivos.println(alumno.nombre + "," + alumno.apPaterno + "," + alumno.apMaterno + ","+ alumno.numCuenta + "," + alumno.edad);
            }

            impresoraDeArchivos.close();

            // Leyendo el archivo con Tokenizer
            System.out.println("Leyendo el archivo");
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");

            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, ",");
                String nombre = tokenizer.nextToken();
                String apPaterno = tokenizer.nextToken();
                String apMaterno = tokenizer.nextToken();
                String numCuenta = tokenizer.nextToken();
                int edad = Integer.parseInt(tokenizer.nextToken());

                // Creando alumno a partir de la informacion tokenizada
                Alumno alumno = new Alumno(nombre, apPaterno, apMaterno, numCuenta, edad);

                System.out.println("Alumno: " + alumno.nombre + " " + alumno.apPaterno + " " + alumno.apMaterno + " "+ alumno.numCuenta + " " + alumno.edad);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
