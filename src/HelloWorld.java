public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!!");
        Person p = new Person("Pawel");
        System.out.println("Witaj !" + p.getName());

        try {
            showmeError();
            System.out.println("Access element in array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exeption thrown :" + e);
        }
    }
    private static void showmeError() {

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(num[15]);
    }
}

