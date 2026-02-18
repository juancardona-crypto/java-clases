package com.example;

public class Product {
    private String nombre;
    private int stock;
    private boolean enventa;
    private double precio;
    
    public Product() {
        this.nombre = null;
        this.stock = 0;
        this.enventa = false;
        this.precio = 0.0;
    }
    
    public Product(String nombre, int stock, boolean enventa, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.enventa = enventa;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            // CORREGIDO: Lanzar excepción en lugar de System.out.println
            throw new IllegalArgumentException("Error: El precio no puede ser negativo. Valor ingresado: " + precio);
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            // CORREGIDO: Lanzar excepción en lugar de System.out.println
            throw new IllegalArgumentException("Error: El stock no puede ser negativo. Valor ingresado: " + stock);
        }
    }

    public boolean isEnventa() {
        return enventa;
    }

    public void setEnventa(boolean enventa) {
        this.enventa = enventa;
    }

    // CORREGIDO: toString ahora dice "Product" en lugar de "Book"
    
    


    
    public String toString() {
            return "Product [Nombre: " + nombre + ", Stock: " + stock + ", En venta: " + enventa + ", Precio: " + precio + "]";

    }
}

