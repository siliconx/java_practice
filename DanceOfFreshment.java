/**
 * Created by island on 17-3-27.
 */
import java.util.Scanner;

public class DanceOfFreshment {
    static Student[] students;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        students = new Student[n];
        for (int i=0;i<n;i++) {
            String name = in.next();
            String id = in.next();
            char gender = in.next().charAt(0);
            students[i] = new Student(name, id, gender);
        }

//        for (Student e : students) {
//            System.out.printf("%s %s %c%n", e.name, e.id, e.gender);
//        }

        in.nextLine();
        int m = in.nextInt();
        char[] trueOfFalse = new char[m];
        for (int i=0;i<m;i++) {
            String first = in.next();
            String second = in.next();
            char firstGender = search(first);
            char secondGender = search(second);
//            System.out.printf("%c %c%n", firstGender, secondGender);
            if (firstGender != secondGender) {
                trueOfFalse[i] = 'Y';
            } else {
                trueOfFalse[i] = 'N';
            }
        }

        for (char e : trueOfFalse) {
            System.out.println(e);
        }
    }

    public static char search(String idOrName) {
        char gender = '0';
        if ("0123456789".contains(idOrName.charAt(0) + "")) {
            for (Student e : students) {
                if (idOrName.equals(e.id)) {
                    gender = e.gender;
                    break;
                }
            }
        } else {
            for (Student e : students) {
                if (idOrName.equals(e.name)) {
                    gender = e.gender;
                    break;
                }
            }
        }
        return gender;
    }
}

class Student {
    String name;
    String id;
    char gender;

    public Student(String name, String id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }
}
