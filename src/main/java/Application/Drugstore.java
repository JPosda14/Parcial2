package Application;

import controller.ModelFactoryController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Drugstore extends javafx.application.Application {
    private static ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage=stage;
        showPrincipalWindow();
    }
    public void showPrincipalWindow(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Drugstore.class.getResource("View/clientView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}