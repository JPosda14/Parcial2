package Service;
import com.example.farmacy2.Model.Client;
import com.example.farmacy2.Service.ClientService;

import java.util.ArrayList;
public class Clientserviceimple ClientService{
    private ArrayList<Client> listClient=new ArrayList<>();
}
    @Override
    public void saveClient(String name,int age) {
        listClient.add(new Client(name,age));
    }

    public ArrayList<Client> getListClient() {
        return listClient;
}}
