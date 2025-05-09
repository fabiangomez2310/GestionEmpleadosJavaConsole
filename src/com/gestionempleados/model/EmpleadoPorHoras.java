/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionempleados.model;

/**
 *
 * @author FABIANG
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String identificacion, double valorHora, int horasTrabajadas) {
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: Empleado por Horas").append("\n");
        sb.append("Nombre: ").append(this.getNombre()).append("\n");
        sb.append("Identificacion: ").append(this.getIdentificacion()).append("\n");
        sb.append("Valor Hora: ").append(this.getValorHora()).append("\n");
        sb.append("Horas Trabajadas: : ").append(this.getHorasTrabajadas()).append("\n");

        return sb.toString();
    }
}
