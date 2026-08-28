public class StringArray {

    public static void displayNames() {
        String[] names = {"Abhinav", "Rahul", "Aman", "Riya"};

        System.out.println("Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        displayNames();
    }
}
