package es.ieslosmontecillos.componentes_cortesyon.campotextoboton;

import es.ieslosmontecillos.componentes_cortesyon.campotextoboton.CampoTextoBoton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainCampoTextoBoton extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox();


        CampoTextoBoton campoTextoBoton = new CampoTextoBoton();
        campoTextoBoton.setText("HOLA");
        hbox.getChildren().add(campoTextoBoton);
        Scene scene = new Scene(hbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Prueba de CampoTextoBoton");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
