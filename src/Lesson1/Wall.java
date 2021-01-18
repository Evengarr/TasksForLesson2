package Lesson1;

public class Wall implements ObstacleCourse {       //класс отвечающий за создание препятствия типа "Стена" наследуемый от интерфейса ObstacleCourse

    int height = RandomParameters.randomParameters();

    @Override
    public boolean take(SportActivity person) {     //переопределенный метод отвечающий за сравнение высоты сены и высоты прыжка участника
        if (person.getJumpLimit() > height) {
            person.jump(height);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "не смог преодолеть препятствие высотой " + height + " метра.";
    }

}
