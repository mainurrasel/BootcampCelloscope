package constructoroverloading;

public class ConstructorOverloading {
    public static void main(String [] args){
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Rasel","Male");
        teacher2.displayInformation();
        Teacher teacher3 =new Teacher("Mainur","male", 1222);

    }
}
