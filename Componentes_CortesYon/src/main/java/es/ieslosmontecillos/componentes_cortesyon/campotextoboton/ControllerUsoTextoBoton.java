package es.ieslosmontecillos.componentes_cortesyon.campotextoboton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerUsoTextoBoton {

    @FXML
    private CampoTextoBoton ctb1;

    @FXML
    private CampoTextoBoton ctb2;

    @FXML
    private Label lbResult;

    @FXML
    public void initialize() {
        // Asocia eventos al botón de ctb1 y ctb2
        ctb1.textProperty().addListener((obs, oldValue, newValue) -> guardarTextoEnLabel());
        ctb2.textProperty().addListener((obs, oldValue, newValue) -> guardarTextoEnLabel());
    }

    private void guardarTextoEnLabel() {
        // Obtiene el texto del CampoTextoBoton y asignarlo al Label
        String texto = ctb1.getText();
        String texto2 = ctb2.getText();
        lbResult.setText(texto + " " +  texto2);
    }
}


