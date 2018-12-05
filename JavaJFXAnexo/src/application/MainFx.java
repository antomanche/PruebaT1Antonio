package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 * @author Antonio
 * @version 1.0.0
 * @see ControFX
 */

public class MainFx extends Application {
	
	private AnchorPane rootLayout;	
	/**
	 * el stage es público
	 */
	public Stage primaryStage;
	
	/**
	 * seteamos el stage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Anexo");
			this.primaryStage.setX(screenSize.getWidth()/3);   
			this.primaryStage.setY(screenSize.getHeight()/7);
			initRootLayout();
			primaryStage.show();		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * cargamos el layout
	 */
	public void initRootLayout() {
		try {
			// Cargamos layout desde el fxml.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFx.class.getResource("view/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();
			Scene scene = new Scene(rootLayout, 640,480);
			scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Text+Me+One");
			Font.loadFont(getClass().getResourceAsStream("TextMeOne-Regular.ttf"), 20);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args lanzándose
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
