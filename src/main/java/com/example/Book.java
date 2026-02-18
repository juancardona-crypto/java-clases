package com.example;

public class Book {
    private String nombre;
    private int stock;
    private boolean enventa;
    private double precio;
    
    public Book (){
        this.nombre = null;
        this.stock = 0;
        this.enventa = false;
        this.precio = 0.0;
        
    }
    public Book (String nombre, int stock, boolean enventa, double precio){
        this.nombre = nombre;
        this.stock = stock;
        this.enventa = enventa;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrcio(double precio){
        if (precio >= 0){
            this.stock = stock;
        }
        else{
            System.out.println("Precio incorrecto");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock){
        if (stock >= 0){
            this.stock = stock;
        }
        else{
            System.out.println("Cantidad invalida");
        }
    }

    public boolean isEnventa(){
        return enventa;
    }

    public void setEnventa(boolean enventa) {
        this.enventa = enventa;
    }

    



}

