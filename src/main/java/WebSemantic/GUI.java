package WebSemantic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class GUI extends Application
{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String pathFile = new File("").getAbsolutePath();
        System.out.println(pathFile);
        Parent root = FXMLLoader.<Parent>load(GUI.class.getResource(pathFile + "/src/main/java/WebSemantic/GUI.fxml"));
        /*
        Scene scene = new Scene(root,300,275);
        primaryStage.setTitle("WEB SEMANTIC");
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        /*
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        */
    }
}