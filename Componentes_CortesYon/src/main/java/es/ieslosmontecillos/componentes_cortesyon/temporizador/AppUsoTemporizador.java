package es.ieslosmontecillos.componentes_cortesyon.temporizador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppUsoTemporizador extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/es/ieslosmontecillos/componentes_cortesyon/temporizador/AppTemporizador-View.fxml"));

            // Crea la escena
            Scene scene = new Scene(loader.load());

            // Obtiene el controlador
            Controller controller = loader.getController();
            controller.initialize();

            // Configura el escenario
            primaryStage.setTitle("Temporizador");
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
