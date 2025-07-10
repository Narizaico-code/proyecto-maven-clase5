package org.angelreyes.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author angelreyes
 */
public class Main extends Application {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        JSONObject persona = new JSONObject();
//        
//        persona.put("nombre", "Angel");
//        persona.put("Apellido", "Reyes");
//        persona.put("edad", 31);
//        persona.put("valido", true);    
//        System.out.println("Este es el contenido de Json");
//        System.out.println(persona.toString(4));
        launch(args);
    }

    @Override
    public void start(Stage escenario) throws Exception {
        FXMLLoader cargadorFXML = new FXMLLoader(getClass().getResource(
                "/org/angelreyes/view/InicioView.fxml"));
        Parent raiz = cargadorFXML.load();
        
        Scene escena = new Scene(raiz);
        
        escenario.setScene(escena);
        escenario.show();
    }
}
