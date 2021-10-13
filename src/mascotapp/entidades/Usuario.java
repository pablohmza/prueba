/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;

/**
 *
 * @author Pablo
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public String dni;
    public String pais;
    public Date nacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, String pais, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
        this.nacimiento = nacimiento;
    }
   
    
}
