/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarrays;

/**
 *
 * @author Gabo
 */
public class Secciones {

    String secciones[] = {"Carniceria", "Pescaderia", "Verdureria", "Embutidos", "Bebidas", "Farmacia", "Limpieza"};
    int cantidadproductos[] = {50, 50, 50, 50, 50, 50, 50};
    int compratotal;

    void compracarn(int cantprod1) {

        for (int i = 0; i <= 6; i++) {
        }
        int compra = cantidadproductos[0] - cantprod1;
        System.out.println("Se han comprado: " + cantprod1 + "Productos de la seccion: Carniceria");
        cantidadproductos[0] = compra;

    }

    void comprapesc(int cantprod) {

        for (int i = 0; i <= 6; i++) {

        }
        int compra = cantidadproductos[1] - cantprod;
        System.out.println("Se han comprado: " + cantprod + "Productos de la seccion: Pescaderia");
        cantidadproductos[1] = compra;

    }

    void compraverd(int cantprod) {

        for (int i = 0; i <= 6; i++) {

        }
        int compra = cantidadproductos[2] - cantprod;
        System.out.println("Se han comprado: " + cantprod + "Productos de la seccion: Verduras");
        cantidadproductos[2] = compra;

    }

    void compraemb(int cantprod) {

        for (int i = 0; i <= 6; i++) {

        }
        int compra = cantidadproductos[3] - cantprod;
        System.out.println("Se han comprado: " + cantprod + "Productos de la seccion: Embutidos");
        cantidadproductos[3] = compra;

    }

    void comprabeb(int cantprod) {

        for (int i = 0; i <= 6; i++) {

        }
        int compra = cantidadproductos[4] - cantprod;
        System.out.println("Se han comprado: " + cantprod + "Productos de la seccion: Bebidas");
        cantidadproductos[4] = compra;

    }

    void comprafarm(int cantprod) {

        for (int i = 0; i <= 6; i++) {

        }
        int compra = cantidadproductos[5] - cantprod;
        System.out.println("Se han comprado: " + cantprod + "Productos de la seccion: Farmacia");
        cantidadproductos[5] = compra;

    }

    void compralimp(int cantprod) {

        for (int i = 0; i <= 6; i++) {

        }
        int compra = cantidadproductos[6] - cantprod;
        System.out.println("Se han comprado: " + cantprod + "Productos de la seccion: Limpieza");
        cantidadproductos[6] = compra;

    }

    void mostrarinv() {
        
        System.out.println("La cantidad de productos disponibles por seccion es:");
        System.out.println(secciones[0] + "----->" + cantidadproductos[0]);
        System.out.println(secciones[1] + "----->" + cantidadproductos[1]);
        System.out.println(secciones[2] + "----->" + cantidadproductos[2]);
        System.out.println(secciones[3] + "----->" + cantidadproductos[3]);
        System.out.println(secciones[4] + "----->" + cantidadproductos[4]);
        System.out.println(secciones[5] + "----->" + cantidadproductos[5]);
        System.out.println(secciones[6] + "----->" + cantidadproductos[6]);
        
    }
}
