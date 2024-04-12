import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetUserData {
  static int id = 0;
  public static void GetDatas(ArrayList<Contact> objLists) {
      ArrayList<Contact> objList = objLists;
      try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter the name: ");
        String name = scan.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the email: ");
        String email = scan.nextLine();
        System.out.println("Enter the address: ");
        String address = scan.nextLine();
        id++;
        System.out.println("ID: " + id);
        objList.add(new Contact(name, phoneNumber, email, address));
      }
  }

  public static void remove(ArrayList<Contact> objLists, int newId) {
      ArrayList<Contact> objList = objLists;
      objList.remove(newId - 1);
      id--;
  }

  public static void updateAllData(ArrayList<Contact> objLists) {
      ArrayList<Contact> objList = objLists;
      try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter the New name: ");
        String name = scan.nextLine();
        System.out.println("Enter the New phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the New email: ");
        String email = scan.nextLine();
        System.out.println("Enter the New address: ");
        String address = scan.nextLine();
        objList.get(id - 1).updateAllData(name, phoneNumber, email, address);
      }
  }

  public static Contact searchByName(ArrayList<Contact> objLists, String name) {
      ArrayList<Contact> objList = objLists;
      for (Contact contact : objList) {
          if (contact.getName().equalsIgnoreCase(name)) {
              return contact;
          }
      }
      return null;
  }

  public static Contact searchByPhoneNumber(ArrayList<Contact> objLists, String phoneNumber) {
      ArrayList<Contact> objList = objLists;
      for (Contact contact : objList) {
          if (contact.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
              return contact;
          }
      }
      return null;
  }

  public static void sortAndDisplay(ArrayList<Contact> objLists) {
      ArrayList<Contact> objList = objLists;
      Collections.sort(objList, (c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
      for (Contact contact : objList) {
          System.out.println("Name: " + contact.getName());
          System.out.println("Phone Number: " + contact.getPhoneNumber());
          System.out.println("Email: " + contact.getEmail());
          System.out.println("Address: " + contact.getAddress());
      }
    }

  public static void showAllData(ArrayList<Contact> objLists) {
      ArrayList<Contact> objList = objLists;
      for (Contact contact : objList) {
          System.out.println("Name: " + contact.getName());
          System.out.println("Phone Number: " + contact.getPhoneNumber());
          System.out.println("Email: " + contact.getEmail());
          System.out.println("Address: " + contact.getAddress());
      }
  }
  
  
  public static void exportToExcel(ArrayList<Contact> objLists) {
      ArrayList<Contact> objList = objLists;
      try {
          Workbook workbook = new XSSFWorkbook();
          org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Contacts");
          int rowNum = 0;
          System.out.println("Creating excel");
          for (Contact contact : objList) {
              Row row = sheet.createRow(rowNum++);
              row.createCell(0).setCellValue(contact.getName());
              row.createCell(1).setCellValue(contact.getPhoneNumber());
              row.createCell(2).setCellValue(contact.getEmail());
              row.createCell(3).setCellValue(contact.getAddress());
          }
          try {
              FileOutputStream outputStream = new FileOutputStream("Contacts.xlsx");
              workbook.write(outputStream);
              workbook.close();
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
      } catch (Exception e) {
          e.printStackTrace();
          }
          
          	}

}




/* 
 
            
 */
