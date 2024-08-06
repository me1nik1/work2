public class Ravenclaw extends Hogwarts {
    private int creativity;
    private int witty;
    private int wisdom;
    private int intelligence;

    public Ravenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int creativity,
                     int witty,
                     int wisdom,
                     int intelligence) {
        super(name, magicPower, transgressionDistance);
        this.creativity = creativity;
        this.witty = witty;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWitty() {
        return witty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int sum() {
        return creativity + witty + wisdom + intelligence;
    }

    public void compare(Ravenclaw other) {
        var s1 = this.sum();
        var s2 = other.sum();

        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else if (s1 == s2) {
            System.out.println(this.getName() + " и " + other.getName() + " равны по силе");
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        }


    }

    @Override
    public String toString() {
        return ", creativity=" + creativity +
                ", witty=" + witty +
                ", wisdom=" + wisdom +
                ", intelligence=" + intelligence;
    }
}