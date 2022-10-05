/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_unidad01_villa.sarmiento.saquicela;

/**
 *
 * @author PC-2
 */
public class Poo_unidad01_villaSarmientoSaquicela {

    public static void main(String[] args) {
        System.out.println("Clase unidad 1.1");
        var perro1 = new Perro();
        var perro2 = new Perro();
        var perro3 = new Perro();
        
        /*-----*/
        /*PERRO 1*/
        perro1.edad = 2;
        perro1.nombre = "Cesar";
        perro1.raza = "Chiguagua";
        
        /*PERRO 2*/
        perro2.edad = 12;
        perro2.nombre = "Pipo";
        perro2.raza = "snow";
        
        /*PERRO 3*/
        perro3.edad = 7;
        perro3.nombre = "Kuchau";
        perro3.raza = "grandanes";
          
        /*----CARROS----*/
        var carro1 = new Auto();
        var carro2 = new Auto();
        var carro3 = new Auto();
        
        carro1.an = 2019;
        carro1.marca = "datsun";
        carro1.placa = "ABC-1234";
                
        carro2.an = 2022;
        carro2.marca = "Chevrolet";
        carro2.placa = "GBO-4321";
        
        carro3.an = 2011;
        carro3.marca = "Toyota";
        carro3.placa = "PJG-6787";
        
        /*-----PERSONA----*/
        var persona1 = new Persona();
        var persona2 = new Persona();
        
        
        System.out.println("El perro uno se llama:" + perro1.nombre +
                "y tiene una edad de: " + perro1.edad + "años " +
                " y su raza es:"+ perro1.raza);
    }
}
