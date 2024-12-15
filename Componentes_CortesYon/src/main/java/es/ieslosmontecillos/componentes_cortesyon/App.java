package es.ieslosmontecillos.componentes_cortesyon;

import es.ieslosmontecillos.componentes_cortesyon.Componentes.CampoTextoBoton;
import es.ieslosmontecillos.componentes_cortesyon.Componentes.CustomControl;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /*
        CustomControl customControl = new CustomControl();
        customControl.setText("Hello World");
        */
        /*
        CampoTextoBoton campoTextoBoton = new CampoTextoBoton();
        campoTextoBoton.setText("Hello campoTextoBoton!");
        */




        stage.setTitle("Probando temporizador");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}