package io.javasmithy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/root.fxml")), 1280, 720);
        Stage stage = primaryStage;
        stage.setTitle("Order Tracker");
        stage.setScene(scene);
        stage.show();

    }
}
