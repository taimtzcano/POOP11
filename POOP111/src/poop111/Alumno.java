/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop111;

/**
 *
 * @author tania
 */
public class Alumno {
    String nombre;
    String apPaterno;
    String apMaterno;
    String numCuenta;
    int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String apPaterno, String apMaterno, String numCuenta, int edad) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", numCuenta=" + numCuenta + ", edad=" + edad + '}';
    }
    
    
    
    
}
