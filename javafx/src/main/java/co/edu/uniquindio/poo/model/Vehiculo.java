package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    public int Matricula;
    public String modelo;
    public int marca;
    public int añoFabricacion;
    public int diasReserva;
    public int precioBase;
    public Vehiculo(int Matricula, String modelo, int marca, int añoFabricacion, int diasReserva, int precioBase){
        this.Matricula= Matricula;
        this.modelo=modelo;
        this.marca=marca;
        this.añoFabricacion=añoFabricacion;
        this.diasReserva=diasReserva;
        this.precioBase=precioBase;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public int getDiasReserva() {
        return diasReserva;
    }
    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }
    public int getNumeroDeMatricula() {
        return Matricula;
    }
    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.Matricula = numeroDeMatricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getMarca() {
        return marca;
    }
    public void setMarca(int marca) {
        this.marca = marca;
    }
    public int getAñoDeFabricacion() {
        return añoFabricacion;
    }
    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoFabricacion = añoDeFabricacion;
    }
    public abstract double calculoDecostoReserva();
    @Override
    public String toString() {
        return "vehiculo [numeroDeMatricula=" + Matricula + ", modelo=" + modelo + ", marca=" + marca
                + ", añoDeFabricacion=" + añoFabricacion + ", diasReserva=" + diasReserva + ", precioBase="
                + precioBase + "]";
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}