package ArrayListPrograms;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contacts> addressBook;

    public AddressBook(){
        addressBook = new ArrayList<Contacts>();
    }

    public void addContact(Contacts c){
        addressBook.add(c);
    }

    public void searchContacts(String target){
        boolean isIn = false;
        for (Contacts i : addressBook){
            if ((i.getFirstName().indexOf(target) != -1) ||
                    (i.getLastName().indexOf(target) != -1) ||
                    (i.getPhoneNumber().indexOf(target) != -1)){
                System.out.println(i.toString());
                isIn = true;
            }
        }
        if (!isIn){
            System.out.println("Sorry! no contact with the name or phone number " + target + " was found. Please try again");
        }
    }

    public void displayContacts(){
        if (addressBook.size() == 0){
            System.out.println("Sorry, no contacts to display");
            return;
        }
        for (Contacts i : addressBook){
            System.out.println(i.toString());
        }
    }

    public void deleteContact(String target){
        for (Contacts i : addressBook){
            if (i.getFirstName().equals(target) ||
                    i.getLastName().equals(target) ||
                    i.getPhoneNumber().equals(target)){
                System.out.println(i.toString() + " successfully deleted");
                addressBook.remove(i);
                return;
            }
        }
        System.out.println("Sorry! no contact with the name or phone number " + target + " was found. Please try again");
    }




}
