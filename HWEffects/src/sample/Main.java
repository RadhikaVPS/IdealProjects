package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setVgap(10);
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 300, 275));


        Label greeting = new Label("Hello, Welcome");
        root.getChildren().add(greeting);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
