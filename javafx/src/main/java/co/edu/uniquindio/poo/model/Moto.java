package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private TipoCaja caja;
    public Moto(int Matricula, String modelo, int marca, int añoFabricacion, int diasReserva, TipoCaja caja, int precioBase){
        super(Matricula, modelo, marca, añoFabricacion, diasReserva, precioBase);
        this.caja=caja;
    }
    public TipoCaja getCaja() {
        return caja;
    }
    public void setCaja(TipoCaja caja) {
        this.caja = caja;
    }
    @Override
    public double calculoDecostoReserva(){
        double calculoDecostoReserva;
        if(caja==TipoCaja.AUTOMATICA){
            calculoDecostoReserva= precioBase+10000;
        }else{
            calculoDecostoReserva= precioBase;
        }
        return calculoDecostoReserva;
    }
}
