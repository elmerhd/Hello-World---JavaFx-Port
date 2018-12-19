package com.junk.application.helloworld;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
/**
 *
 * @author elmerhd | https://github.com/elmerhd
 */
public class Main extends FXMLContent{

    public static Main getInstance(String fxml) throws IOException {
        Main controller = new Main(Main.class, fxml);
        return controller;
    }
    @FXML
    private JFXButton clickButton;

    public Main(Class c, String fxml) throws IOException {
        super(c, fxml);
        setController(this);
    }

    @Override
    public void onLoad() {
        JFXDialogLayout content= new JFXDialogLayout();
                
        content.setHeading(new Text("Hello World"));
        content.setBody(new Text("and Hello JavaFx Developers."));
        
        JFXDialog dialog = new JFXDialog((StackPane) this.getContent(), content, JFXDialog.DialogTransition.CENTER);
        JFXButton closeButton = new JFXButton("Close");
        closeButton.setOnAction((ActionEvent event) -> {
            dialog.close();
        });
        content.setActions(closeButton);
        clickButton.setOnAction((ActionEvent event) -> {
            dialog.show();
        });
    }
    

}
