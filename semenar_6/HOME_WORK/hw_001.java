package semenar_6.HOME_WORK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// ДЗ
// 📌 Реализуйте структуру телефонной книги с помощью HashMap
// 📌 Программа также должна учитывать, что в во входной структуре будут
// повторяющиеся имена с разными телефонами, их необходимо считать, как одного
// человека с разными телефонами. Вывод должен быть отсортирован по убыванию
// числа телефонов.


import java.util.*;

    public class hw_001 {
        private static Map<String, Set<String>> phoneBook = new HashMap<>();
        private static Scanner scanner = new Scanner(System.in);
    
        public static void main(String[] args) {
            boolean run = true;
            while (run) {
                hr();// подчеркивает отделяет 
                System.out.println("Телефонная книга:\n");
                System.out.println("1. Просмотреть контакты");
                System.out.println("2. Добавить контакт");
                System.out.println("3. Удалить контакт");
                System.out.println("4. Редактировать контакт");
                System.out.println("5. Выйти");
                System.out.print("\nВыберите пункт действий: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                clear_console();//чистит консоль
    
                switch (choice) {
                    case 1:
                        loock_contact();
                        break;
                    case 2:
                         add_contact() ;
                        break;
                    case 3:
                        del_contact();
                        break;
                    case 4:
                        edit_contact();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("\nНекорректное число.\n");
                }
            }
            System.out.println("\nЗавершение работы.\n");
        }
    
        private static void loock_contact(){
            if (phoneBook.isEmpty()) {
                System.out.println("\nТелефонная книга пустая.\n");
            } else {
                List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
                sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
                hr();
                System.out.println("Записи в телефонной книге (отсортированы по убыванию числа телефонов):\n");
                for (Map.Entry<String, Set<String>> entry : sortedEntries) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
            waitEnter();
        }
    
        private static void add_contact() {
            hr();
            System.out.print("ДОБАВЛЕНИЕ ЗАПИСИ\n\n");
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine();
            phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
            System.out.println("\nЗапись добавлена: " + name + ": " + phoneNumber);
            waitEnter();
        }
        private static void del_contact() {
            hr();
            System.out.print("УДАЛЕНИЕ ЗАПИСИ\n\n");
            System.out.print("Введите имя для удаления: ");
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {
                Set<String> phoneNumbers = phoneBook.remove(name);
                System.out.println("Запись удалена: " + name + ": " + phoneNumbers);
            } else {
                System.out.println("Запись с таким именем не найдена.");
            }
            waitEnter();
        }
    
        private static void edit_contact() {
            hr();
            System.out.print("РЕДАКТИРОВАНИЕ ЗАПИСИ\n\n");
            System.out.print("Введите имя для редактирования: ");
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.print("Введите новый номер телефона: ");
                String newPhoneNumber = scanner.nextLine();
                phoneBook.get(name).add(newPhoneNumber);
                System.out.println("Запись отредактирована: " + name + ": " + phoneBook.get(name));
            } else {
                System.out.println("Запись с таким именем не найдена.");
            }
            waitEnter();
        }
    //функция переводит на начало меню
        private static void waitEnter() {
            System.out.print("\nНажмите ENTER для продолжения...");
            scanner.nextLine();
            clear_console();
        }
        // функция выделяет пунтиром
        private static void hr() {
            System.out.println("\n--------------------------------");
        }
        // функция чистит консоль при достежения 20 строк
        public static void clear_console() {
            for (int i = 0; i < 20; i++) {
                System.out.println();
            }
        }
    }