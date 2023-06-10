/*
*Autor: Mongeote Tlachy Daniel
*Fecha de creación: 08/06/2023
*Fecha de modificación: 08/06/2023
*Descripción: Archivo base del proyecto
*/

package javafxsspger;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavaFXSSPGER extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("vistas/FXMLInicioSesion.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Inicio de Sesión");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}