/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionempleados.service;

import com.gestionempleados.exception.ListaEmpleadosVaciaException;
import com.gestionempleados.model.Empleado;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author FABIANG
 */
public class NominaService {

    private final List<Empleado> empleados;

    private final NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

    public NominaService() {
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado exitosamente.");
    }
    public void mostrarResumenEmpleados() {
        if (empleados.isEmpty()) {
            throw new ListaEmpleadosVaciaException("No hay empleados registrados para mostrar resumen.");
        }
        System.out.println("\n------ Resumen de Empleados ------");
        int i = 1;
        for (Empleado empleado : empleados) {
            System.out.println("\nEmpleado #" + i++);
            System.out.println(empleado.imprimir());
            double salario = empleado.calcularSalario();
            System.out.println("Salario calculado: $" + formatoPesos.format(salario));
            System.out.println("----------------------------------");
        }
    }
    public double calcularTotalNomina() {
        if (empleados.isEmpty()) {
            throw new ListaEmpleadosVaciaException("No hay empleados registrados para calcular la nomina.");
        }
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }
    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
