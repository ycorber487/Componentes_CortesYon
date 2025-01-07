package es.ieslosmontecillos.componentes_cortesyon.temporizador;

import ies.montecillos.temporizador_cortesyon.Temporizador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    private Temporizador temp;

    @FXML
    public void initialize() {

        temp.setTiempo(10);


        temp.setOnFinCuentaAtras(event -> {
            System.out.println("¡El tiempo ha terminado!");

        });

        temp.iniciar();
    }
}
