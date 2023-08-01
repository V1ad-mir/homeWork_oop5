package familytree.presenter;

import familytree.model.service.Service;
import familytree.view.View;




public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view){
        this.view = view;
        service = new Service();
    }


    public void addPersonFamily(String firstName, String lastName, String birthday, String fatherFirstName,
                                String fatherLastName, String motherFirstName, String motherLastName ){
    service.addPersonFamily(firstName, lastName, birthday, fatherFirstName,fatherLastName, motherFirstName, motherLastName);
    }



    public void getPersonList() {
        String info = service.getPersonListInfo();
        view.printAnswer(info);
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
    }

    public void sortByCildrenCount() {
        service.sortByChildrenCount();
    }

    public void sortByFirstName() {
        service.sortByFirstName();
    }

    public void printChildren(String firstName, String lastName) {
        service.printChildren(firstName, lastName);
    }

    public void loadFile() {
        service.loadFile();
    }

    public void saveFile() {
        service.saveFile();
    }
}
