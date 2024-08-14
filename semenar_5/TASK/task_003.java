package semenar_5.TASK;

import java.util.*;
// Задание №1
// 📌 Дана строка. Необходимо написать метод, который отсортирует слова в
// строке по длине с помощью TreeMap. Строки с одинаковой длиной не
// должны “потеряться”.
// 📌 Пример строки: Я помню чудное мгновенье Передо мной явилась ты Как
// мимолетное виденье Как гений чистой красоты
public class task_003 {
    public static void main(String[] args) {
        String str = "Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
        task_003 ask_003 = new task_003();
        System.out.println(ask_003.GetSortedOfWort(str));
    }
    public String GetSortedOfWort(String str){
        if( str == null || str.isEmpty()){
            return null;
        }
        Map<Integer, List<String>> result = new TreeMap<>();
        List<String> ListTemp ;
        for(String subWord : str.split(" ")){
            int size = subWord.length();
            if(result.containsKey(size) && !result.get(size).contains(subWord)){
                ListTemp = result.get(size);
            }
            else{
                ListTemp = new ArrayList<>();
            }
            ListTemp.add(subWord);
            result.put(size, ListTemp);
        }
        return result.toString();
    }
}
