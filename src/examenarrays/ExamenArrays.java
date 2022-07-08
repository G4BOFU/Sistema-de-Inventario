/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarrays;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabo
 */
public class ExamenArrays {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Secciones s = new Secciones();
        int opcion;
        int seccion;
        int cantidad;
        System.out.println("Bienvenido al sistema de facturacion e inventario del supermercado Gatsu!");
        for (int i = 1; i < 351; i++) {
            System.out.println("Escoja una de las opciones: ");
            System.out.println(" 1 / Realizar una venta");
            System.out.println(" 2 / Mostrar inventario");
            System.out.println("3 / Imprimir factura");
            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Escoja una de las secciones del supermercado");
                    System.out.println("1/ Carniceria");
                    System.out.println("2/ Pescaderia");
                    System.out.println("3/ Verduras");
                    System.out.println("4/ Embutidos");
                    System.out.println("5/ Bebidas");
                    System.out.println("6/ Farmacia");
                    System.out.println("7/ Limpieza");
                    
                    seccion = leer.nextInt();

                    switch (seccion) {
                        case 1:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.compracarn(cantidad);

                            break;

                        case 2:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.comprapesc(cantidad);

                            break;
                        
                        case 3:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.compraverd(cantidad);

                            break;
                        case 4:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.compraemb(cantidad);

                            break;    
                         
                        case 5:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.comprabeb(cantidad);

                            break;
                        case 6:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.comprafarm(cantidad);

                            break;    
                            
                        case 7:
                            System.out.println("Introduzca la cantidad de productos a facturar:");
                            cantidad = leer.nextInt();
                            s.compralimp(cantidad);

                            break;    

                    }
                    break;
                    
                case 2:
                    s.mostrarinv();
                break;    
                default:
            }
        }
    }
}
