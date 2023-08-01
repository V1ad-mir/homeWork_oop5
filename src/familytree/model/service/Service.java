package familytree.model.service;

import familytree.model.familyTree.FamilyTree;
import familytree.model.person.Person;
import familytree.model.wriitable.FileHandler;
import familytree.view.commands.GetPersonList;

import java.util.Scanner;

public class Service{
    private FamilyTree<Person> tree;

    public Service() {
        tree = new FamilyTree<>();
    }



    public void addPersonFamily(String firstName, String lastName, String birthday, String fatherFirstName,
                                String fatherLastName, String motherFirstName, String motherLastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setBirthday(birthday);
        person.setFatherFirstName(fatherFirstName);
        person.setFatherLastName(fatherLastName);
        person.setMotherFirstName(motherFirstName);
        person.setMotherLastName(motherLastName);
        tree.addPerson(person);


    }




    public void sortByBirthDate() {
        tree.sortByBirthDate();
    }

    public void sortByChildrenCount() {
        tree.sortByChildrenCount();
    }

    public void sortByFirstName() {
        tree.sortByFirstName();
    }

    public void printChildren(String firstName, String lastName) {
        tree.printChildren(firstName,lastName);
    }


public String getPersonListInfo() {
    StringBuilder stringBuilder = new StringBuilder();

    for (Person person: tree){
        stringBuilder.append(person);
        stringBuilder.append("\n");

    }
    return stringBuilder.toString();
}





    public void loadFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String filePath1 = scanner.next();
        FileHandler fileHandlerLoad = new FileHandler();
        tree = (FamilyTree) fileHandlerLoad.read(filePath1);

    }

    public void saveFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String filePath = scanner.next();
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(tree, filePath);

    }
}
