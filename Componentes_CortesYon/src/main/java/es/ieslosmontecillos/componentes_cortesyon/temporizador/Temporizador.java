package es.ieslosmontecillos.componentes_cortesyon.temporizador;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Temporizador extends Label {
    private int tiempo;
    private Timeline timeline;
    private EventHandler<ActionEvent> onFinCuentaAtras;
    private static final int parametro = 60;


    public Temporizador() {
        this(parametro);
    }

    // Constructor principal
    public Temporizador(int tiempoInicial) {
        this.tiempo = tiempoInicial;
        setText(String.valueOf(tiempo));


        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), e -> decrementarTiempo());
        timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);


        onFinCuentaAtras = event -> {};
    }

    private void decrementarTiempo() {
        if (--tiempo <= 0) {
            timeline.stop();
            if (onFinCuentaAtras != null) {
                onFinCuentaAtras.handle(new ActionEvent());
            }
        }
        setText(String.valueOf(tiempo));
    }

    public void iniciar() {
        timeline.playFromStart();
    }

    public void setOnFinCuentaAtras(EventHandler<ActionEvent> eventHandler) {
        this.onFinCuentaAtras = eventHandler;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
        setText(String.valueOf(tiempo));
    }
}
