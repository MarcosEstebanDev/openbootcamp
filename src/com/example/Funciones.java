package com.example;

public class Funciones {
    public static void main(String[] args){

        showMenu();
       String menu = getMenu();
        System.out.println(menu);
        double price = getPrice();
        System.out.println(price);
        imprimirSaludo( "openbootcamp");
        String nombre = "Marco";
        String apellido ="Godoy";
        String Saludo = obtenerSaludo(nombre, apellido);
        System.out.println(Saludo);
        int resultadoSuma = suma(50, 200);
        System.out.println(resultadoSuma);

    }
    static void showMenu(){
        System.out.println("Bienvenidos al E-comerce de zapatillas:");
        System.out.println("1- ver Zapatillas");
        System.out.println("2- comprar zapatilla");
    };
    static String getMenu(){
        return "Bienvenidos al E-comerce de zapatillas: \n 1- ver Zapatillas \n 2- comprar zapatilla";
    }
    static double getPrice(){
        return 100.05 + 21.5;
    }
    static void imprimirSaludo(String name){
        System.out.println("buenas "+ name);
    }
    static String obtenerSaludo(String nombre, String apellido){
        return " Hola que tal " + nombre + " " + apellido;
    }
    static int suma(int num1, int num2){
        return num1 + num2;
    }
}
