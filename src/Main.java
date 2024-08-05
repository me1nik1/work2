public class Main {
    public static void main(String[] args) {

        Hogwarts dambledore = new Hogwarts("Albus", 100, 100);

        Gryffindor harry = new Gryffindor("Harry Potter", 89, 26, 35, 45, 72);
        Gryffindor ron = new Gryffindor("Ron", 75, 24, 32, 43, 58);
        harry.compare(dambledore);

        Slytherin drako = new Slytherin("Drako", 78, 64, 54, 76, 95, 57, 25);
        harry.compare(drako);
    }
}