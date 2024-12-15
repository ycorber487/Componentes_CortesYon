package es.ieslosmontecillos.componentes_cortesyon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMainSelectorDeslizamiento extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/es/ieslosmontecillos/componentes_cortesyon/SelectorDeslizamientoView.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Selector Deslizamiento Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
