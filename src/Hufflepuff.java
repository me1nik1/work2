public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honest) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public int sum() {
        return diligence + loyalty + honest;
    }

    public void compare(Hufflepuff other) {
        var s1 = this.sum();
        var s2 = other.sum();

        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else if (s1 == s2) {
            System.out.println(this.getName() + " и " + other.getName() + " равны по силе");
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honest=" + honest;
    }
}