package application;

import java.io.IOException;
import java.time.Duration;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Único controlador de la aplicación
 * 
 * @author Antonio
 * @see MainFx
 * @version 1.0.0
 */
public class ControlFX {

	@FXML
	public Button closeButton; 
	public ImageView imagen;
	public AnchorPane page;
	public Scene scene;
	public Label label;
	public Stage sendStage;


	/**
	 * Abre el stage
	 */

	public void showSendProfile() {
		try {

            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFx.class.getResource("view/GetMe.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Pop");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);   
            sendStage.show();
           
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private FadeTransition fadeIn = new FadeTransition(
	);

	public void initialize() {
	    fadeIn.setNode(imagen);

	    fadeIn.setFromValue(0.0);
	    fadeIn.setToValue(1.0);
	    fadeIn.setCycleCount(1);
	    fadeIn.setAutoReverse(false);
	}

	@FXML
	private void handleSend() {
	}
	@FXML
	private void handleClose() {
		sendStage.hide();
	}
}
