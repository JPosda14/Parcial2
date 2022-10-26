package controller;

import Model.Laboratory;
import Service.ModelfactoryService;

public class ModelFactoryController implements ModelfactoryService {
    Laboratory laboratorio;
    //------------------------------ Singleton ------------------------------------------------
// Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        laboratorio = new Laboratory();
    }


    @Override
    public void saveClient(String name, int age) {laboratorio.getClientService().saveClient(name,age);}
}
