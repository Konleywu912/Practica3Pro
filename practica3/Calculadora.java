/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica3;

import javax.swing.JFrame;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author leyma
 */
public class Calculadora extends JFrame implements ActionListener {
    private JTextField pantalla;
    private Logica logica;

    public Calculadora() {
        setTitle("Calculadora Básica");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        add(pantalla, BorderLayout.NORTH);

        logica = new Logica();

        JPanel panelBotones = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] botones = {
            "7", "8", "9", "÷",
            "4", "5", "6", "X",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 18));
            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        String resultado = logica.procesarOperacion(comando, pantalla.getText());
        pantalla.setText(resultado);

    
}}
