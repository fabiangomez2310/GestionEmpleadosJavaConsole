/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionempleados.model;

/**
 *
 * @author FABIANG
 */
public class EmpleadoPorComision extends Empleado {

    private double salarioBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, String identificacion, double salarioBase, double ventasRealizadas, double porcentajeComision) {
        super(nombre, identificacion);
        this.salarioBase = salarioBase;
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;

    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: Empleado por Comision").append("\n");
        sb.append("Nombre: ").append(this.getNombre()).append("\n");
        sb.append("Identificacion: ").append(this.getIdentificacion()).append("\n");
        sb.append("Salario Base: ").append(getSalarioBase()).append("\n");
        sb.append("Ventas Realizadas: : ").append(getVentasRealizadas()).append("\n");
        sb.append("Porcentaje Comision: ").append(getPorcentajeComision()).append("\n");

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmpleadoPorComision{");
        sb.append("salarioBase=").append(salarioBase);
        sb.append(", ventasRealizadas=").append(ventasRealizadas);
        sb.append(", porcentajeComision=").append(porcentajeComision);
        sb.append('}');
        return sb.toString();
    }

    // getter y setter
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

}
