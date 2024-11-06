package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.TipoCaja;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MotoController {

    @FXML
    private TextField txtNumeroMatricula;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtAñoFabricacion;

    @FXML
    private TextField txtDiasReserva;

    @FXML
    private ComboBox<TipoCaja> comboCaja;

    @FXML
    private TextField txtPrecioBase;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblMensaje;

    private Empresa empresa;

    public MotoController(Empresa empresa) {
        this.empresa = empresa;
    }

    @FXML
    public void initialize() {
        comboCaja.getItems().addAll(TipoCaja.values());
        btnGuardar.setOnAction(event -> guardarMoto());
    }

    private void guardarMoto() {
        int numeroMatricula = Integer.parseInt(txtNumeroMatricula.getText());
        String modelo = txtModelo.getText();
        int marca = Integer.parseInt(txtMarca.getText());
        int añoFabricacion = Integer.parseInt(txtAñoFabricacion.getText());
        int diasReserva = Integer.parseInt(txtDiasReserva.getText());
        TipoCaja caja = comboCaja.getValue();
        int precioBase = Integer.parseInt(txtPrecioBase.getText());

        Moto moto = new Moto(numeroMatricula, modelo, marca, añoFabricacion, diasReserva, caja, precioBase);
        empresa.getMotos().add(moto);
        lblMensaje.setText("Moto guardada con éxito.");
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNumeroMatricula.clear();
        txtModelo.clear();
        txtMarca.clear();
        txtAñoFabricacion.clear();
        txtDiasReserva.clear();
        comboCaja.setValue(null);
        txtPrecioBase.clear();
    }
}
