
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Phat_Chim
 */
public class StudentManager {

    ArrayList<Student> list;

    public StudentManager() {
        list = new ArrayList<>();
    }

    public boolean isIdExist(String id) {
        for (Student student : list) {
            if (student.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void addNewStudent() {
        String id;
        do {
            id = Validation.isString("Enter id: ", "Id not empty!");
        } while (isIdExist(id));

        String name = Validation.isString("Enter name: ", "Name not empty!");
        double mark = Validation.isMark("Enter mark: ", "0 <= Mark <=10", "Mark must be number");
        list.add(new Student(id, name, mark));
        System.out.println("Add a new student success!");
    }

    public void Update() {
        int pos;
        String name;
        double mark;
        String id = Validation.isString("Enter id to search: ", "Id not empty");

        pos = searchIdInListStudent(id);
        if (pos < 0) {
            System.out.println("Id not exist!");
            return;
        }
        name = Validation.isString("Enter name: ", "Name not empty!");
        mark = Validation.isMark("Enter mark: ", "0 <= Mark <=10", "Mark must be number");
        list.set(pos, new Student(id, name, mark));
    }

    public int searchIdInListStudent(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public void showAllStudent() {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        String id;
        int pos;

        id = Validation.isString("Enter id: ", "Id not empty!");
        pos = searchIdInListStudent(id);
        if (pos == -1) {
            System.out.println("id not exist");
        } else {
            list.remove(pos);
            System.out.println("Remove id: " + id + " success!");
        }
    }

}
