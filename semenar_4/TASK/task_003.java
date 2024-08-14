package semenar_4.TASK;

import java.util.Stack;

// Задание №2
// Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая
// скобка имеет соответствующую открытую скобку того же типа.
// Пример:
// 1) ()[] = true
// 2) () = true
// 3) {[()]} = true
// 4) ()() = true
// 5) )()( = false
public class task_003 {
    public static void main(String[] args) {
        String s = "{([]){";
        task_003 tesk003 = new task_003();
        System.out.println(tesk003.validata(s));
    }
    public  boolean validata(String s){
         Stack<Character> stack = new Stack<>();
         for (char c : s.toCharArray()) {
             if(c == '(' || c =='[' || c =='{'){
                stack.push(c);
             }else if(stack.isEmpty()){
                return  false;
             }else if(c == ')' && stack.pop() !='(' ){
                return  false;
             }else if (c =='}' && stack.pop() != '{'){
                return  false;
             }else if (c ==']'&& stack.pop() != '['){
                return false;
             } 
         }
         return  stack.empty();
    }
}
