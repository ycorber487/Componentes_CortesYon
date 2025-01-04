package es.ieslosmontecillos.componentes_cortesyon.campotextoboton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppUsoTextoBoton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga del archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AppUsoTextoBoton.fxml"));
        AnchorPane root = loader.load();

        // Configuración de la escena
        Scene scene = new Scene(root);

        // Configuración del Stage
        primaryStage.setTitle("Uso de CampoTextoBoton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

