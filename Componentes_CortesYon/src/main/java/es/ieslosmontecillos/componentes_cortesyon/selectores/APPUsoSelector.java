package es.ieslosmontecillos.componentes_cortesyon.selectores;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ies.montecillos.deslizamientocortesyon.SelectorDeslizamiento;

import java.util.ArrayList;

public class APPUsoSelector extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/es/ieslosmontecillos/componentes_cortesyon/selectores/AppUsoSelector-View.fxml"));


            VBox root = loader.load();


            SelectorDeslizamiento selectorUp = (SelectorDeslizamiento) root.lookup("#selectorUp");
            SelectorDeslizamiento selectorDown = (SelectorDeslizamiento) root.lookup("#selectorDown");
            Label messageLabel = (Label) root.lookup("#messageLabel");


            ArrayList<String> listaUp = new ArrayList<>();
            listaUp.add("1");
            listaUp.add("2");
            listaUp.add("3");
            listaUp.add("4");
            listaUp.add("5");

            ArrayList<String> listaDown = new ArrayList<>();
            listaDown.add("6");
            listaDown.add("7");
            listaDown.add("8");
            listaDown.add("9");
            listaDown.add("10");


            selectorUp.setItems(listaUp);
            selectorDown.setItems(listaDown);


            selectorUp.setOnAction(event -> updateMessage(selectorUp, "Arriba", messageLabel));
            selectorDown.setOnAction(event -> updateMessage(selectorDown, "Abajo", messageLabel));


            Scene scene = new Scene(root, 600, 400);


            primaryStage.setTitle("Aplicación con Selectores");


            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void updateMessage(SelectorDeslizamiento selector, String position, Label messageLabel) {
        String selectedNumber = selector.getText();
        messageLabel.setText("Selector " + position + ": " + selectedNumber);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

