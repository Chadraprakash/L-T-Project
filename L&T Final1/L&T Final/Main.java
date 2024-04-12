import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        ArrayList<Contact> objList = new ArrayList<Contact>();
//        try {
            while (true) {
                System.out.println("1. Add contact");
                System.out.println("2. Remove contact");
                System.out.println("3. Update contact");
                System.out.println("4. Search contact by name");
                System.out.println("5. Search contact by phone number");
                System.out.println("6. Sort and display contacts");
                System.out.println("7. Export contacts to Excel");
                System.out.println("8. Exit");
                System.out.println("9. Show all contacts");
                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();
//                scan.nextLine();
                switch (choice) {
                    case 1:
                        GetUserData.GetDatas(objList);
                        break;
                    case 2:
                        System.out.println("Enter the Contact ID to remove: ");
                        int newId = scan.nextInt();
                        GetUserData.remove(objList, newId);
                        break;
                    case 3:
                        GetUserData.updateAllData(objList);
                        break;
                    case 4:
                        System.out.println("Enter the name to search: ");
                        String name = scan.nextLine();
                        Contact result = GetUserData.searchByName(objList, name);
                        if (result != null) {
                            System.out.println("Name: " + result.getName());
                            System.out.println("Phone Number: " + result.getPhoneNumber());
                            System.out.println("Email: " + result.getEmail());
                            System.out.println("Address: " + result.getAddress());
                        } else {
                            System.out.println("No contact found");
                        }
                        break;
                    case 5:
                    System.out.println("Enter the Phone Number to search: ");
                    String phoneNumber = scan.nextLine();
                    Contact phoneNum = GetUserData.searchByPhoneNumber(objList, phoneNumber);
                    if (phoneNum != null) {
                        System.out.println("Name: " + phoneNum.getName());
                        System.out.println("Phone Number: " + phoneNum.getPhoneNumber());
                        System.out.println("Email: " + phoneNum.getEmail());
                        System.out.println("Address: " + phoneNum.getAddress());
                    } else {
                        System.out.println("No contact found");
                    }
                    break;
                    case 6:
                        GetUserData.sortAndDisplay(objList);
                        break;
                    case 7:
                    	GetUserData.exportToExcel(objList);
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    case 9:
                        GetUserData.showAllData(objList);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            
//        } catch (Exception e) {
//            System.out.println("Invalid Input");
//        }
    }
   } 
}



