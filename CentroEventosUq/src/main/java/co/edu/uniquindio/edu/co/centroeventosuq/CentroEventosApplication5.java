package co.edu.uniquindio.edu.co.centroeventosuq;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CentroEventosApplication5 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CentroEventosApplication5.class.getResource("Inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello4!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}