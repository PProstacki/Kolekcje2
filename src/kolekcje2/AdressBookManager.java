package kolekcje2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AdressBookManager{
    List<Person> addressBook = new ArrayList<Person>();

    public AdressBookManager() {
        menu();
    }
    
    public void addPerson(){
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        String adress;
        int phoneNr;
        
        System.out.print("Podaj imie: ");
        firstName = sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        lastName = sc.nextLine();
        System.out.print("Podaj adres: ");
        adress = sc.nextLine();
        System.out.print("Podaj numer telefonu: ");
        phoneNr = sc.nextInt();
        System.out.println();
        
        addressBook.add(new Person(firstName, lastName, adress, phoneNr));
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        int wybor = 0;
        
        do{
        System.out.println("1. Dodaj osobe");
        System.out.println("2. Wypisz osoby");
        System.out.println("3. Koniec");
        
        do{
            System.out.print("Wybor: ");
            wybor = sc.nextInt();
            System.out.println();
            
            if(wybor == 1){
                addPerson();
            }else if(wybor == 2){
                Collections.sort(addressBook);
                listPerson();
            }else if(wybor == 3){
                System.exit(0);
            }
        }while(wybor != 1 && wybor != 2 && wybor != 3);
        }while(wybor != 3);
    }

    private void listPerson() {
        for(int i = 0;i < addressBook.size();i++){
            System.out.println("Imie: " + addressBook.get(i).getFirstName() + "\nNazwisko: " + addressBook.get(i).getLastName() + "\nAdres: : " + addressBook.get(i).getAdress() + "\nNumer telefonu: : " + addressBook.get(i).getPhoneNr());
            System.out.println();
        }
    }
}
