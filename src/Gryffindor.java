public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int sum() {
        return nobility + honor + bravery;
    }

    public void compare(Gryffindor other) {
        var s1 = this.sum();
        var s2 = other.sum();

        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else if (s1 == s2) {
            System.out.println(this.getName() + " и " + other.getName() + " равны по силе");
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}