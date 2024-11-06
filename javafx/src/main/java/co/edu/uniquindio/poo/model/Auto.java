package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo {
    private int Puertas;
    public Auto (int Matricula, String modelo, int marca, int añoFabricacion, int diasReserva, int Puertas, int precioBase){
        super(Matricula, modelo, marca, añoFabricacion, diasReserva, precioBase);
        this.Puertas=Puertas;
    }
    public int getNumeroDePuertas() {
        return Puertas;
    }
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.Puertas = numeroDePuertas;
    }
    @Override
    public double calculoDecostoReserva(){
        double costoReserva= precioBase*diasReserva;
        return costoReserva;
    }

}
