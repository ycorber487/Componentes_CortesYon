module es.ieslosmontecillos.componentes_cortesyon {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.componentes_cortesyon to javafx.fxml;
    exports es.ieslosmontecillos.componentes_cortesyon;
    exports es.ieslosmontecillos.componentes_cortesyon.Componentes;
    opens es.ieslosmontecillos.componentes_cortesyon.Componentes to javafx.fxml;
}