package Model;

//import Service.impl.ClientServiceImpl;
import Application.SearchObject;
import Application.ShowMaquinatorList;


public class Laboratory {
//    private final ClientServiceImpl clientService;
    private final SearchObject searchObject;
    private final ShowMaquinatorList showMaquinatorList;

    public Laboratory() {
//        clientService = new ClientServiceImpl();
        searchObject=new SearchObject();
        showMaquinatorList=new ShowMaquinatorList();
    }

    public SearchObject getSearchObject() {
        return searchObject;
    }

    public ShowMaquinatorList getShowMaquinatorList() {
        return showMaquinatorList;
    }

//    public ClientServiceImpl getClientService() {
//        return clientService;
//    }
}
