/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestionempleados.app;

import com.gestionempleados.exception.ListaEmpleadosVaciaException;
import com.gestionempleados.model.Empleado;
import com.gestionempleados.model.EmpleadoPorComision;
import com.gestionempleados.model.EmpleadoPorHoras;
import com.gestionempleados.model.EmpleadoTiempoCompleto;
import com.gestionempleados.service.NominaService;
import com.gestionempleados.util.ConsoleHelper;

/**
 *
 * @author FABIANG
 */
public class Main {

    public static void main(String[] args) {
        NominaService nominaService = new NominaService();
        boolean salir = false;

        System.out.println("=== Sistema de Gestion de Empleados ===");

        while (!salir) {
            System.out.println("");
            System.out.println("--- Menu ---");
            System.out.println("1. Agregar empleado tiempo completo");
            System.out.println("2. Agregar empleado por horas");
            System.out.println("3. Agregar empleado por comision");
            System.out.println("4. Ver resumen de empleados");
            System.out.println("5. Ver total de nomina");
            System.out.println("6. Salir");

            int opcion = ConsoleHelper.leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1 ->
                    agregarEmpleadoTiempoCompleto(nominaService);
                case 2 ->
                    agregarEmpleadoPorHoras(nominaService);
                case 3 ->
                    agregarEmpleadoPorComision(nominaService);
                case 4 -> {
                    try {
                        nominaService.mostrarResumenEmpleados();
                    } catch (ListaEmpleadosVaciaException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    try {
                        double total = nominaService.calcularTotalNomina();
                        System.out.printf("Total de la nomina: $", total);
                    } catch (ListaEmpleadosVaciaException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> {
                    salir = true;
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                }
                default ->
                    System.out.println("Opción inválida.");
            }
        }
    }
    private static void agregarEmpleadoTiempoCompleto(NominaService service) {
        String nombre = ConsoleHelper.leerTexto("Nombre: ");
        String id = ConsoleHelper.leerTexto("Identificación: ");
        double salario = ConsoleHelper.leerDecimal("Salario mensual: ");
        Empleado empleado = new EmpleadoTiempoCompleto(nombre, id, salario);
        service.agregarEmpleado(empleado);
    }

    private static void agregarEmpleadoPorHoras(NominaService service) {
        String nombre = ConsoleHelper.leerTexto("Nombre: ");
        String id = ConsoleHelper.leerTexto("Identificación: ");
        double valorHora = ConsoleHelper.leerDecimal("Valor por hora: ");
        int horasTrabajadas = ConsoleHelper.leerEntero("Horas trabajadas: ");
        Empleado empleado = new EmpleadoPorHoras(nombre, id, valorHora, horasTrabajadas);
        service.agregarEmpleado(empleado);
    }
    private static void agregarEmpleadoPorComision(NominaService service) {
        String nombre = ConsoleHelper.leerTexto("Nombre: ");
        String id = ConsoleHelper.leerTexto("Identificación: ");
        double salarioBase = ConsoleHelper.leerDecimal("Salario base: ");
        double ventas = ConsoleHelper.leerDecimal("Total de ventas: ");
        double porcentaje = ConsoleHelper.leerDecimal("Porcentaje de comisión (%): ");
        Empleado empleado = new EmpleadoPorComision(nombre, id, salarioBase, ventas, porcentaje);
        service.agregarEmpleado(empleado);
    }
}
