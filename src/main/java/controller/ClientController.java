package controller;

public class ClientController {

try {
        Integer.parseInt(txtAgeClient.getText());
        mfc.saveClient(txtNameClient.getText(),Integer.parseInt(txtAgeClient.getText()));
    }catch (NumberFormatException nfe){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("the age is not a number");
        alert.showAndWait();
    }}
