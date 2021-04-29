package ru.geekbrains;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static int randWorld(ArrayList<String> arrList, String world) {
        return Collections.frequency(arrList, world);
    }


    public static void main(String[] args) {

        /*  1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
           Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
           Посчитать сколько раз встречается каждое слово. */

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Дача");
        wordList.add("Аллея");
        wordList.add("календарь");
        wordList.add("дни");
        wordList.add("Дача");
        wordList.add("кормить");
        wordList.add("лаять");
        wordList.add("телефон");
        wordList.add("клавиатура");
        wordList.add("мышь");
        wordList.add("мышь");
        wordList.add("календарь");
        wordList.add("бумага");
        wordList.add("ручка");
        for (int i = 0; i < wordList.size(); i++) {
            if(randWorld(wordList, wordList.get(i)) ==1){
                System.out.println(wordList.get(i));
            }

            
        }
    }
}
 /*
           2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
           В этот телефонный справочник с помощью метода add() можно добавлять записи.
           С помощью метода get() искать номер телефона по фамилии.
           Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
           тогда при запросе такой фамилии должны выводиться все телефоны.
           Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись
            добавлять еще дополнительные поля (имя, отчество, адрес),
            делать взаимодействие с пользователем через консоль и т.д.).
            Консоль желательно не использовать (в том числе Scanner),
            тестировать просто из метода main() прописывая add() и get().
            */

