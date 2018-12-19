package com.junk.application.helloworld;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 *
 * @author elmerhd | https://github.com/elmerhd
 */
public class App extends Application {

    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Main main = Main.getInstance("/com/junk/application/helloworld/fxml/main.fxml");
        
        Scene scene = new Scene(main.getContent(), 300, 250);
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World - JavaFx Port");
        primaryStage.show();

    }
    
}
