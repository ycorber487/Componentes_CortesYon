module es.ieslosmontecillos.componentes_cortesyon {
    requires ies.montecillos.deslizamientocortesyon;
    requires ies.montecillos.temporizador_cortesyon;
    requires javafx.fxml;
    requires javafx.controls;


    exports es.ieslosmontecillos.componentes_cortesyon.campotextoboton;
    opens es.ieslosmontecillos.componentes_cortesyon.campotextoboton to javafx.fxml;
    exports es.ieslosmontecillos.componentes_cortesyon.selectores;
    opens es.ieslosmontecillos.componentes_cortesyon.selectores to javafx.fxml;
    exports es.ieslosmontecillos.componentes_cortesyon.temporizador;
    opens es.ieslosmontecillos.componentes_cortesyon.temporizador to javafx.fxml;
    exports es.ieslosmontecillos.componentes_cortesyon.campotextonumerico;
    opens es.ieslosmontecillos.componentes_cortesyon.campotextonumerico to javafx.fxml;
}