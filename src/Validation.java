
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
public class Validation {

    public static String isString(String msg, String err1) {
        String result;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(msg);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(err1);
            } else {
                return result;
            }
        }
    }

    public static double isMark(String msg, String err1, String err2) {
        Scanner sc = new Scanner(System.in);
        double result;
        while (true) {
            System.out.println(msg);
            try {
                result = Double.parseDouble(sc.nextLine());
                if (result < 0 || result > 10) {
                    System.out.println(err1);
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println(err2);
            }
        }
    }
    

    
}
