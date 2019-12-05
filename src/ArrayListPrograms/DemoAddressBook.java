package ArrayListPrograms;
import java.util.*;
public class DemoAddressBook {
    public static void main(String[] args) {
        AddressBook demo = new AddressBook();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("What would you like to do? Enter");
            System.out.println("1 to add a contact");
            System.out.println("2 to display");
            System.out.println("3 to search");
            System.out.println("4 to delete");
            System.out.println("5 to quit");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.print("Enter last name: ");
                String lastName = input.next();
                System.out.print("Enter first name: ");
                String firstName = input.next();
                System.out.print("Enter phone number: ");
                String phoneNumber = input.next();
                demo.addContact(new Contacts(firstName, lastName, phoneNumber));
            } else if (choice == 2){
                demo.displayContacts();
            } else if (choice == 3){
                System.out.print("Search what: ");
                demo.searchContacts(input.next());
                System.out.println();
            } else if (choice == 4){
                System.out.print("Delete what: ");
                demo.deleteContact(input.next());
                System.out.println();
            } else if (choice == 5){
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid Input! Please try again");
            }
            System.out.println();
        }
    }

}
