package Lesson1;

public class Humans implements SportActivity {      //класс отвечающий за создание людей наследуется от интерфейса SportActivity
    private final String name;
    private final int jumpLimit;
    private final int runLimit;

    public Humans(int jumpLimit, int runLimit, String name) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.name = name;
    }

    @Override
    public void jump(int height) {          //вызов переопределенного метода отвечающего за прыжек
        System.out.printf("%s прыгнул на %s метров. %n", name, height);
    }

    @Override
    public void run(int distance) {         //вызов переопределенного метода отвечающего за бег
        System.out.printf("%s пробежал %s метров. %n", name, distance);
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int getRunnerLimit() {
        return runLimit;
    }

    @Override
    public String getName() {
        return name;
    }
}
