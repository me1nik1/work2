public class Slytherin extends Hogwarts {

    private int cunning;
    private int ambition;
    private int resourcefulness;
    private int lust;
    private int determination;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int ambition,
                     int resourcefulness,
                     int lust,
                     int determination) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust = lust;
        this.determination = determination;
    }

    public int getCunning() {
        return cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLust() {
        return lust;
    }

    public int getDetermination() {
        return determination;
    }

    public int sum() {
        return ambition + resourcefulness + lust + determination;
    }

    public void compare(Slytherin other) {
        var s1 = this.sum();
        var s2 = other.sum();

        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else if (s1 == s2) {
            System.out.println(this.getName() + " и " + other.getName() + " равны по силе");
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return ", cunning=" + cunning +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lust=" + lust +
                ", determination=" + determination;
    }
}