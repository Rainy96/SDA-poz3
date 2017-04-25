package zajecia1.oop;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia12 {
    public static void main(String[] args) throws IOException{

        Adress firstAddress = new Adress();
        firstAddress.flatNumber = 23;
        firstAddress.postalCode = "23-234";
        firstAddress.city = "Poznan";
        firstAddress.land = "Poland";
        firstAddress.street = "Dluga";

        Adress secondAddress = new Adress();
        secondAddress.flatNumber = 23;
        secondAddress.postalCode = "23-234";
        secondAddress.city = "Warszawa";
        secondAddress.land = "Poland";
        secondAddress.street = "Pierwsza";

        User user = new User();
        user.firstName = "Jan";
        user.lastName = "Kowalski";
        user.phoneNumber = "123456789";
        user.adress = firstAddress;
        user.age = 40;

        User user2 = new User();
        user2.firstName = "Anna";
        user2.lastName = "Wisniewska";
        user2.phoneNumber = "987625444";
        user2.adress = secondAddress;
        user2.age = 30;

        User[] users = new User[2];
        users[0] = user;
        users[1] = user2;

        System.out.println();

        user.display();
        user2.display();
        firstAddress.display();
        Adress adress = user.adress;
        adress.display();
    }

    public static User getUserDetails() {
        User user = new User();
        user.firstName = getFirstNameFromUser();
        user.lastName = getLastNameFromUser();
        user.phoneNumber = getPhoneNumberFromUser();
        return user;
    }

    public static String[] getUserFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        return scanner.nextLine().split(" ");
    }

    private static String getAddressFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Address");
        return scanner.nextLine();
    }

    public static String getPhoneNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Phone Number");
        return scanner.nextLine();
    }

    public static String getFirstNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert First Name");
        return scanner.nextLine();
    }

    public static String getLastNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Last Name");
        return scanner.nextLine();
    }

    public static void writeUserToFile(File file, String[] userDetails)throws IOException{
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            for(int i = 0; i < userDetails.length; i++){
                out.print(userDetails[i]);
                if(i != userDetails.length - 1) {
                    out.print(" ");
                }
            }
            out.println();
        }
    }


}
