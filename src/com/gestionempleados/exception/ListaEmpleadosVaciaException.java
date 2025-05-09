/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionempleados.exception;

/**
 *
 * @author FABIANG
 */
public class ListaEmpleadosVaciaException extends RuntimeException {
    public ListaEmpleadosVaciaException(String mensaje){
        super(mensaje);
    }
}
