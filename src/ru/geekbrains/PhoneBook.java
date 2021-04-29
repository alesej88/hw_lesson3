package ru.geekbrains;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String,String> phoneRec = new HashMap<>();
    PhoneBook(){
        this.phoneRec.put("Вася Пупкин", "8-933-211-11-22");
        this.phoneRec.put("Гадя Петрович Хренова", "8-954-587-98-99");
               }
    void add(String userName, String phoneNumber){
        this.phoneRec.put(userName, phoneNumber);

    }

    String get(String userName) {
        return this.phoneRec.get(userName);
    }
void printPhoneBook(){
        Interator<Map.Entry<String, String >> inter = this.phoneRec.entrySet().iterator();
        while (inter.hasNext()){
            Map.Entry<String, String> e = new inter.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
}
}
