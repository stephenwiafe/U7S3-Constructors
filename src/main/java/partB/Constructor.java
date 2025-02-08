package partB;

public class Constructor {

    String name = "";

    public Constructor() {
        System.out.println("The constructor is being called:");
        name = "Francis";
    }

    public static String Constructor() {
        String response = "";

        /**
         * Your code goes here
         */
        Constructor instance = new Constructor();
        response = "The name is " + instance.name;

        return response;
    }

    public static void main(String[] args) {
        String output = Constructor();
        System.out.print(output);
    }
}
