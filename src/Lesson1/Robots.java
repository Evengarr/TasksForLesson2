package Lesson1;

public class Robots implements SportActivity {      //класс отвечающий за создание роботов наследуемый от интерфейса SportActivity
    private final String name;
    private final int jumpLimit;
    private final int runLimit;

    public Robots(int jumpLimit, int runLimit, String name) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.name = name;
    }

    @Override
    public void jump(int height) {          //вызов переопределенного метода отвечающего за прыжок
        System.out.printf("%s прыгнул на %s метров. %n", name, height);
    }

    @Override
    public void run(int distance) {         // вызов переопределенного метода отвечающего за бего
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
