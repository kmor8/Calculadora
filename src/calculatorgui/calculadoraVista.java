package calculatorgui;



import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class calculadoraVista extends Application {

@Override
public void start(Stage primaryStage) throws Exception
{
    Parent root= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    primaryStage.setTitle("Calculadora");
    primaryStage.setScene(new Scene (root,300,275));
    primaryStage.show();
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)
    {
    	launch(args);
       
    }

    
}