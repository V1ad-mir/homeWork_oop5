package familytree.view;

import familytree.model.person.Person;
import familytree.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private  MainMenu menu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);

    }

    @Override
    public void start() {
        while (work) {
            System.out.println(menu.menu());
            System.out.println("Выберите действие:");

            int choice = scanner.nextInt();
//            int choiceInt = Integer.parseInt(choice);
            menu.execute(choice);
        }
    }

//            switch (choice) {
//                case 1:
//                    addPersonFamily();
//                    break;
//
////                case 2:
////                    saveFamilyFaile();
////
////                    break;
////
////                case 3:
////                    loaderFamilyFaile();
//
//
//                case 4:
//                    sortByBirthDate();
//                    break;
//
//                case 5:
//                    sortByChildrenCount();
//                    break;
//
//                case 6:
//                    sortByFirstName();
//                    break;
//
//                case 7:
//                    getChildren();
////
//                    break;
//                case 8:
//                    getPersonList();
//                    break;
//                case 9:
//                    running = false;
//
//                    System.out.println("До свидание!");
//                    break;
//
//
//                default:
//                    System.out.println("Неверный выбор");
//                    break;
//            }
//        }
//    }

//    private void saveFamilyFaile() {
//        System.out.println("Введите имя файла:");
//        String filePath = scanner.next();
//        FileHandler fileHandler = new FileHandler();
//        System.out.println(familyTree);
//        fileHandler.save(familyTree, filePath);
//    }
//
//    private void loaderFamilyFaile() {
//        System.out.println("Введите имя файла:");
//        String filePath1 = scanner.next();
//        FileHandler fileHandlerLoad = new FileHandler();
//        familyTree = (FamilyTree) fileHandlerLoad.read(filePath1);
//        System.out.println(familyTree);
//    }

    public void getChildren() {
        System.out.println("Введите имя:");
        String firstName = scanner.next();
        System.out.println("Введите фамилию:");
        String lastName = scanner.next();
        printChildren(firstName, lastName);
    }

    private void printChildren(String firstName, String lastName) {
        presenter.printChildren(firstName, lastName);
    }

    public void sortByFirstName() {
        presenter.sortByFirstName();
    }

    public void sortByChildrenCount() {
        presenter.sortByCildrenCount();
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }
    public void finish(){
        System.out.println("Окончание работы");
        work = false;
    }

    public void getPersonList() {
        presenter.getPersonList();
    }


    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    public void addPersonFamily() {
        Person person = new Person();
        System.out.println("Введите имя:");
        String firstName = scanner.next();
        System.out.println("Введите фамилию:");
        String lastName = scanner.next();
        System.out.println("Введите дату рождения в формате 2016-12-25:");
        String birthday = scanner.next();
        System.out.println("Введите имя отца:");
        String fatherFirstName = scanner.next();
        System.out.println("Введите фамилию отца:");
        String fatherLastName = scanner.next();
        System.out.println("Введите имя матери:");
        String motherFirstName = scanner.next();
        System.out.println("Введите фамилию матери:");
        String motherLastName = scanner.next();
        presenter.addPersonFamily(firstName, lastName, birthday, fatherFirstName, fatherLastName,
                motherFirstName, motherLastName);

    }
    public void loadFile() {
        presenter.loadFile();
    }
    public void saveFile() {
        presenter.saveFile();
    }
}
