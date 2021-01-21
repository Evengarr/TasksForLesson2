package Lesson3.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> book;     //созадть список, который будет собирать в себя все имена и соответствующие им номер телефонов

    public PhoneBook() {            //создаем обект Телефонная книга, в который кладем спсиок
        this.book = new HashMap<>();
    }

    public void add(String name, String number) {
        if (book.containsKey(name)) {                //если в списке нет искомого имени
            List<String> numbers = book.get(name);  //создаем список номеров в который добавляем имя

            if (!numbers.contains(number)) {      //если в спсике номеров нет указанного номера
                numbers.add(number);             //записать номер,
            } else {
            }
        } else {
            book.put(name, new ArrayList<>(Arrays.asList(number))); //добавляем в список имя и номер
        }
    }

    public Object get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            return String.format("В справочнике нет записи для фамилии %s", name);
        }
    }
}
