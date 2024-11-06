package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.time.LocalDate;
import co.edu.uniquindio.poo.model.Reserva;

public class ValidarViewController {

    @FXML private DatePicker fechaInicioPicker;
    @FXML private DatePicker fechaFinPicker;
    @FXML private ChoiceBox<String> clienteChoiceBox;
    @FXML private ChoiceBox<String> vehiculoChoiceBox;
    @FXML private TextField costoTextField;
    @FXML private Button confirmarButton;
    
    private boolean reservaGenerada = false;

    @FXML
    public void initialize() {
        clienteChoiceBox.setItems(FXCollections.observableArrayList("Cliente Juan", "Cliente Sara", "Cliente Camilo"));
        vehiculoChoiceBox.setItems(FXCollections.observableArrayList("Auto BMW", "Moto Yamaha", "Camioneta Chevrolet"));
    }

    // Método para recibir datos de la reserva
    public void setDatosReserva(LocalDate fechaInicio, LocalDate fechaFin, String cliente, String vehiculo, double costo) {
        fechaInicioPicker.setValue(fechaInicio);
        fechaFinPicker.setValue(fechaFin);
        clienteChoiceBox.setValue(cliente);
        vehiculoChoiceBox.setValue(vehiculo);
        costoTextField.setText(String.format("%.2f", costo));
    }

    // Método para confirmar la generación de la reserva
    @FXML
    private void confirmarReserva() {
        reservaGenerada = true;
        confirmarButton.getScene().getWindow().hide(); // Cerrar la ventana
    }

    // Método para verificar si la reserva fue generada
    public boolean isReservaGenerada() {
        return reservaGenerada;
    }
}
