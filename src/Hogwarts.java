public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String description() {
        return "Имя: " + name + ", сила магии: " + magicPower + ", сила трансгрессирования: " + transgressionDistance;
    }

    public void print() {
        System.out.println("Имя: " + name + ", сила магии: " + magicPower + ", сила трансгрессирования: " + transgressionDistance);
    }

    public int sum() {
        return magicPower + transgressionDistance;
    }

    public void compare(Hogwarts other) {
        if (magicPower > other.magicPower) {
            System.out.println(name + " обладает большей мощностью магии, чем  " + other.name);
        } else {
            System.out.println(other.name + " обладает большей мощностью магии, чем  " + name);
        }

        if (transgressionDistance > other.transgressionDistance) {
            System.out.println(name + " обладает большей дистанцией трансгрессии, чем  " + other.name);
        } else {
            System.out.println(other.name + " обладает большей дистанцией трансгрессии, чем  " + name);
        }

        if (magicPower == other.magicPower) {
            System.out.println(name + " и " + other.name + " равны по силе магии");
        }

        if (transgressionDistance == other.transgressionDistance) {
            System.out.println(transgressionDistance + " и " + other.transgressionDistance + " равны по дистанции трансгрессии");
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}