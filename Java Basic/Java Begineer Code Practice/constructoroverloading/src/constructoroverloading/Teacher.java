package constructoroverloading;

public class Teacher {
    String name, gender;
    int phone;

    Teacher() {
        System.out.print("Nothing");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation() {
        System.out.print("Name:" + name);
        System.out.print("Gender:" + gender);
        System.out.print("Phone:" + phone);
    }
}