
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Phat_Chim
 */
public class Menu {

    ArrayList<String> menu;

    public Menu() {
        menu = new ArrayList<>();
    }

    public void add(String option) {
        menu.add(option);
    }

    public int printMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + "." + menu.get(i));
        }
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Enter again!");
            }

        }

    }

}
