package Lesson1;

public interface Survival {         //интерфейс отвечающий за сравнение характеристик участников со значением препятствий
    String getName();

    default void take(ObstacleCourse... obstacleCourses) {
        for (ObstacleCourse obstacleCourse : obstacleCourses) {
            if (!obstacleCourse.take((SportActivity) this)) {
                System.out.printf("%s выбыл из соревнования, потому что %s %n", getName(), obstacleCourse);
                return;
            }
        }
        System.out.printf("%s полностью прошел дистанцию. %n", getName());
    }

}
