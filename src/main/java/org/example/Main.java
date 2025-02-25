package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int moneda20 = 0, moneda50 = 0, moneda100 = 0, moneda200 = 0, moneda500 = 0, suma20, suma50, suma100, suma200, suma500, sumatotal;
        boolean estado = true;
                while(estado){
                    System.out.println("\n Opciones");
                    System.out.println("1. Agregar Moneda");
                    System.out.println("2. Contar Moneda");
                    System.out.println("3. Calcular el total");
                    System.out.println("4. Romper la alcancia");
                    System.out.println("5. Salir");
                    System.out.println("Elige una opcion");
                    int opcion = escaner.nextInt();

                    switch (opcion){
                        case 1:
                            System.out.println("Ingresa la denomidacion de la moneda: (20, 50, 100, 200, 500): ");
                            int moneda = escaner.nextInt();
                            switch (moneda){
                                case 20: moneda20++;
                                break;
                                case 50: moneda50++;
                                break;
                                case 100: moneda100++;
                                break;
                                case 200: moneda200++;
                                break;
                                case 500: moneda500++;
                                break;
                                default: System.out.println("Denominación no válida.");
                            }
                        break;
                        case 2:
                            System.out.println("El total de monedas de (20) es: "+ moneda20);
                            System.out.println("El total de monedas de (50) es: "+ moneda50);
                            System.out.println("El total de monedas de (100) es: "+ moneda100);
                            System.out.println("El total de monedas de (200) es: "+ moneda200);
                            System.out.println("El total de monedas de (500) es: "+ moneda500);
                        break;
                        case 3:
                            suma20 =(moneda20*20);
                            suma50 =(moneda50*50);
                            suma100 =(moneda100*100);
                            suma200 =(moneda200*200);
                            suma500 =(moneda500*500);
                            sumatotal=(suma20+suma50+suma100+suma200+suma500);
                            System.out.println("La suma de las monedas de (20) es: "+ suma20);
                            System.out.println("La suma de las monedas de (50) es: "+ suma50);
                            System.out.println("La suma de las monedas de (100) es: "+ suma100);
                            System.out.println("La suma de las monedas de (200) es: "+ suma200);
                            System.out.println("La suma de las monedas de (500) es: "+ suma500);
                            System.out.println("La suma total de las monedas es "+ sumatotal);
                        break;
                        case 4:
                            moneda20 = 0;
                            moneda50 = 0;
                            moneda100 = 0;
                            moneda200 = 0;
                            moneda500 = 0;
                            System.out.println("\n Rompiste la alcancia ahora esta vacia");
                            break;
                        case 5:
                            estado = false;
                            System.out.println("Gracias por confiar en nosotros :), Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                }
    }
}