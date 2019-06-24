package com.junk.application.helloworld;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.stage.Screen;

/**
 *
 * @author elmerhd | https://github.com/elmerhd
 */
public class App extends Application {

    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Main main = Main.getInstance("/com/junk/application/helloworld/fxml/main.fxml");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        Scene scene = new Scene(main.getContent(), primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World - JavaFx Port");
        primaryStage.show();

    }
    
}
