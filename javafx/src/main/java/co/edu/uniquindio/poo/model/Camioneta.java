package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo {
    private double capacidadCarga;
    public Camioneta (int Matricula, String modelo, int marca, int añoFabricacion, int diasReserva, double capacidadCarga, int precioBase){
        super(Matricula, modelo, marca, añoFabricacion, diasReserva, precioBase);
        this.capacidadCarga=capacidadCarga;
    }
    public double getCapacidadDeCarga() {
        return capacidadCarga;
    }
    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadCarga = capacidadDeCarga;
    }
    @Override
    public double calculoDecostoReserva(){
        double calculoDecostoReserva;
        if(capacidadCarga<=10){
            calculoDecostoReserva= precioBase+(precioBase*0.1)*diasReserva;
        }else{
            if(capacidadCarga>10 && capacidadCarga <=15){
                calculoDecostoReserva= precioBase+(precioBase*0.2)*diasReserva;
            }else{
                if(capacidadCarga>15){
                    calculoDecostoReserva= precioBase+(precioBase*0.3)*diasReserva;
                }else{
                    calculoDecostoReserva= precioBase*diasReserva;
                }
            }
        }
        return calculoDecostoReserva;
    }
}
