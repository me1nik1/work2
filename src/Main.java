public class Main {
    public static void main(String[] args) {

        Hogwarts dambledore = new Hogwarts("Albus", 100, 100);

        Gryffindor harry = new Gryffindor("Harry Potter", 89, 26, 35, 45, 72);
        Gryffindor ron = new Gryffindor("Ron", 75, 24, 32, 43, 58);
        harry.compare(ron);

        Slytherin drako = new Slytherin("Drako", 78, 64, 54, 76, 95, 57, 25);
        harry.compare(drako);
        Slytherin vincent = new Slytherin("Vincent Crabbe", 78, 64, 45, 24, 63, 42, 53);
        drako.compare(vincent);
        Slytherin lucian = new Slytherin("Lucian Bole", 78, 64, 54, 76, 95, 57, 25);
        drako.compare(lucian);

        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 15, 45, 41, 15, 56);
        Hufflepuff hannah = new Hufflepuff("Hannah Longbottom", 52, 52, 12, 45, 35);
        cedric.compare(hannah);

        Ravenclaw luna = new Ravenclaw("Luna Lovegood", 36, 52, 47, 63, 56, 53);
        Ravenclaw cho = new Ravenclaw("Cho Chang", 41, 59, 56, 23, 78, 52);
        luna.compare(cho);
        Ravenclaw michael = new Ravenclaw("Michael Corner", 36, 52, 47, 63, 56, 53);
        luna.compare(michael);
    }
}