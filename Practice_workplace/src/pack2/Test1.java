package pack2;

import pack1.A;

public class Test1 {

    public static void main(String[] args) {

        A obj = new A();

        System.out.println(obj.x); // ✅ public variable
        obj.show(); // ✅ public method
    }
}