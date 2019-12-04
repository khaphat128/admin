/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phat_Chim
 */
public class main {

    public static void main(String[] args) {
        int choice;
        Menu menu = new Menu();
        StudentManager studentManager = new StudentManager();
        menu.add("Add");
        menu.add("Update");
        menu.add("Remove");
        menu.add("Show all student");
        menu.add("Exit");

        do {
            choice = menu.printMenu();
            switch (choice) {
                case 1:
                    studentManager.addNewStudent();
                    break;
                case 2:
                    studentManager.Update();
                    break;
                case 3:
                    studentManager.remove();
                    break;
                case 4:
                    studentManager.showAllStudent();
                    break;
            }
        } while (choice != 5);

    }
}
