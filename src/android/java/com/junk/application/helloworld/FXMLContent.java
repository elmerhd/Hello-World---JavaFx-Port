package com.junk.application.helloworld;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 *
 * @author elmerhd | https://github.com/elmerhd
 */
public abstract class FXMLContent {

    private final FXMLLoader loader;
    private Pane pane;

    public FXMLContent(@SuppressWarnings("unchecked") Class c, @SuppressWarnings("unchecked") String fxml) {
        loader = new FXMLLoader(c.getResource(fxml));
    }

    /**
     * sets the controller of the fxml file
     *
     * @param controller the controller class
     * @throws IOException
     */
    public void setController(Object controller) throws IOException {
        loader.setController(controller);
        pane = (Pane) loader.load();
        onLoad();
    }

    public void setStyle(String styleUrl) {
        if (pane.getStylesheets().isEmpty()) {
            pane.getStylesheets().add(styleUrl);
        } else {
            pane.getStylesheets().removeAll(pane.getStylesheets());
            pane.getStylesheets().add(styleUrl);
        }

    }

    /**
     * Gets the content pane;
     *
     * @return the content pane.
     */
    public Pane getContent() {
        return pane;
    }

    /**
     * Initialization of components
     */
    public abstract void onLoad();
}
