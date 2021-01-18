package Lesson1;

public class Track implements ObstacleCourse {             // класс отвечающий за создание препятствия типа "полоса препятствия" наследуемый от интерфейса ObstacleCourse
    int length = RandomParameters.randomParameters();

    @Override
    public boolean take(SportActivity person) {         //переопределенный метод сравнивающий выносливость участника и длины дистанции
        if (person.getRunnerLimit() > length) {
            person.run(length);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "не смог пробежать дистанцию в " + length + " метра.";

    }

}
