package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AutoController {

    
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
    private TextField txtNumeroPuertas;

    @FXML
    private TextField txtPrecioBase;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblMensaje;

    private Empresa empresa;

    public AutoController(Empresa empresa) {
        this.empresa = empresa;
    }

    @FXML
    public void initialize() {
        btnGuardar.setOnAction(event -> guardarAuto());
    }

    private void guardarAuto() {
        int numeroMatricula = Integer.parseInt(txtNumeroMatricula.getText());
        String modelo = txtModelo.getText();
        int marca = Integer.parseInt(txtMarca.getText());
        int añoFabricacion = Integer.parseInt(txtAñoFabricacion.getText());
        int diasReserva = Integer.parseInt(txtDiasReserva.getText());
        int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
        int precioBase = Integer.parseInt(txtPrecioBase.getText());

        Auto auto = new Auto(numeroMatricula, modelo, marca, añoFabricacion, diasReserva, numeroPuertas, precioBase);
        empresa.getAutos().add(auto);
        lblMensaje.setText("Auto guardado con éxito.");
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNumeroMatricula.clear();
        txtModelo.clear();
        txtMarca.clear();
        txtAñoFabricacion.clear();
        txtDiasReserva.clear();
        txtNumeroPuertas.clear();
        txtPrecioBase.clear();
    }
}
