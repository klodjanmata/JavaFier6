package JavaAdvCoding.RealEstate;

import Helper.Helper;

public class Application {
    private EstateService estateService;
    private Application application;

    public static void main(String[] args) {
        int choice;
        Application application = new Application();
        while (true) {
            Menu.printMenu();
            choice = Helper.getIntFromUser("Your choice: ");
            if (choice == 0){
                application.estateService.saveProperties();
                return;
            }
            application.handleChoice(choice);
        }
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("All Properties");
                estateService.printProperties(estateService.getProperties());
                break;
            case 2:
                System.out.println("Add Property");
                estateService.addNewProperty(Property.getFromUser());
                break;
        }
    }

    public Application() {
        estateService = new EstateService();
    }

}
