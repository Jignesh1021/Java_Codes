package pack1;

public class SamePackageDemo {

    public static void main(String[] args) {

        BaseClass obj = new BaseClass();

        System.out.println(obj.value); // allowed
        obj.display(); // allowed
    }
}