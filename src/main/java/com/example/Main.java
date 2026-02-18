package com.example;

public class Main {
    public static void main(String[] args) {
        Product lib1 = new Product();
        Product lib2 = new Product("vientos de invierno", 0, true, 120000 );

        lib1.setNombre("Cien años de soledad");
        lib1.setStock(5);
        lib1.setEnventa(true);
        lib1.setPrecio(19.99);
        
        lib2.setStock(15);  
        lib2.setPrecio(29.99);  
        
        
        
        System.out.println("=== GETTERS - LIBRO 1 ===");
        System.out.println("Nombre: " + lib1.getNombre());
        System.out.println("Precio: " + lib1.getPrecio());
        System.out.println("Stock: " + lib1.getStock());
        System.out.println("¿En venta?: " + lib1.isEnventa());
        
        System.out.println("\n=== GETTERS - LIBRO 2 ===");
        System.out.println("Nombre: " + lib2.getNombre());
        System.out.println("Stock: " + lib2.getStock());
        System.out.println("Precio: " + lib2.getPrecio());
        System.out.println("¿En venta?: " + lib2.isEnventa());

    }

        
}