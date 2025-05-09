/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionempleados.model;

/**
 *
 * @author FABIANG
 */
public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual) {
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: Empleado Tiempo Completo").append("\n");
        sb.append("Nombre: ").append(this.getNombre()).append("\n");
        sb.append("Identificacion: ").append(this.getIdentificacion()).append("\n");
        return sb.toString();
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salarioMensual = salarioMensual;
    }
}
