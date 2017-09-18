/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**1
 * 
 *
 * @author Lan
 */
public class Reservatinom {

    public static void main(String[] args) {
        Reservatinom menu = new Reservatinom();
        menu.createMenu();
    }
    Controller passsenger = new Controller();

    public void createMenu() {
        table:
        while (true) {

            Passenger pas = new Passenger();
            System.out.println("______Passenger______");
            System.out.println("1. Add reservation.");
            System.out.println("2. Modify passenger records.");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit");
            System.out.println("Enter choice nunber [1-4]:");
            Scanner scaner = new Scanner(System.in);
            int choice = scaner.nextInt();
            switch (choice) {
                case 1:
                    passsenger.add();
                    break;

                case 2:
                    passsenger.modifyPasssenger();
                    break;
                case 3:
                    passsenger.displayPassenger();
                    break;
                case 4:
                    break table;
                default:
                    System.out.println("not accept");
                            
            }

        }

    }

}
