package partB;

public class ConstructorExample {

    int x = 2;

    public  ConstructorExample() {
        x = 5;
    }

    public static void main(String[] args) {
       ConstructorExample myClass = new  ConstructorExample();
        System.out.println(myClass.x);
    }
}
