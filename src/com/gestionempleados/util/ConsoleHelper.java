package com.gestionempleados.util;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FABIANG
 */
public class ConsoleHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    public static int leerEntero(String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número entero válido.");
            }
        }
    }

    public static double leerDecimal(String mensaje) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                numero = Double.parseDouble(entrada);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número decimal válido.");
            }
        }
    }

    public static boolean confirmar(String mensaje) {
        System.out.print(mensaje + " (s/n): ");
        String entrada = scanner.nextLine().trim().toLowerCase();
        return entrada.equals("s");
    }
}
