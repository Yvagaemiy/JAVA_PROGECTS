package semenar_3.TASK;
// Задание №0
// 📌 Даны следующие строки, cравнить их с помощью == и метода
// equals() класса Object
// 📌 String s1 = "hello";
// 📌 String s2 = "hello";
// 📌 String s3 = s1;
// 📌 String s4 = "h" + "e" + "l" + "l" + "o";
// 📌 String s5 = new String("hello");
// 📌 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
public class task_001 {
    public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1 == s4);
    System.out.println(s1 == s5);
    System.out.println(s1 == s6);
    System.out.println("-----------------------------");
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equals(s5));
    System.out.println(s1.equals(s6));
    System.out.println("-----------------------------");
    System.out.println(s1.equalsIgnoreCase(s2)); //игнорирует регистор и сравнивает значение
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.equalsIgnoreCase(s4));
    System.out.println(s1.equalsIgnoreCase(s5));
    System.out.println(s1.equalsIgnoreCase(s6));
    }
    
}
