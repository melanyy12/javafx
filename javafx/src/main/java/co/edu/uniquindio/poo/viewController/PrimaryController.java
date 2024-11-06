package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import java.io.IOException;

public class PrimaryController {

    @FXML
    private Button gestionarReservasButton; // Cambiado a gestionarReservasButton

    @FXML
    private void onOpenCrudReserva() {
        // Mostrar mensaje de confirmación
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Gestión de Reservas");
        alert.setHeaderText(null);
        alert.setContentText("¿Deseas abrir la gestión de reservas?");
        
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                // Abrir la ventana de gestión de reservas si el usuario confirma
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/co/edu/uniquindio/poo/crudReserva.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) gestionarReservasButton.getScene().getWindow(); // Obtener la ventana actual
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
