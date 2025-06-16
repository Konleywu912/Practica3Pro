/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3;

/**
 *
 * @author leyma
 */
public class Logica {
    private int numero1 = 0;
    private int numero2 = 0;
    private int resultado = 0;
    private String operacion = "";

    public String procesarOperacion(String comando, String entrada) {
        try {
            if (comando.matches("[0-9\\.]")) {
                return entrada + comando;

            } else if (comando.matches("[+\\-*/]")) {
                numero1 = Integer.parseInt(entrada);
                operacion = comando;
                return "";

            } else if (comando.equals("=")) {
                numero2 = Integer.parseInt(entrada);
                switch (operacion) {
                    case "+" -> resultado = numero1 + numero2;
                    case "-" -> resultado = numero1 - numero2;
                    case "*" -> resultado = numero1 * numero2;
                    case "/" -> resultado = numero1 / numero2;
                }
                return String.valueOf(resultado);

            } else if (comando.equals("C")) {
                numero1 = 0;
                numero2 = 0;
                resultado = 0;
                operacion = "";
                return "";
            }
        } catch (Exception e) {
            return "Error";
        }
        return entrada;
    }
}
    

