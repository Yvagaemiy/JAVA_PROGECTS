package semenar_2.AUTOTEST;

import java.util.Iterator;

"select * from students where "

public class test_auto_001{

    public static String answer(String QUERY, String PARAMS) {
        // Создаем StringBuilder для формирования WHERE части запроса
StringBuilder sb = new StringBuilder();
// Разбираем JSON-строку с параметрами
JSONObject paramsObj = new JSONObject(PARAMS);

// Перебираем параметры и добавляем их к sb, если они не равны null
//Iterator keys paramsObj.keys;
while (keys.hasNext​) {
String key = keys.next();
String value =  paramsObj.​getString(key);

// Если значение не равно null, добавляем его к whereClause
if (​!= value.​equals("null")) {
sb.​append(key).​append(",").​append(value).append(", AND ");
}
}

// Удаляем последний ″AND ″, если он есть
if (sb.length() > 5) {
sb.delete(sb.length() - 5, sb.length​());
}

// Формируем окончательный SQL-запрос
StringBuilder sb1 = new StringBuilder(QUERY);
String sqlQuery =""; 
sqlQuery.​append("WHERE")
            .​append(sb);

return sqlQuery;
}

public static void main(String[] args) {
String QUERY = "SELECT * FROM students";
String PARAMS = " {\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
String result = answer(QUERY, PARAMS);
System.out.println(result);
}
}



    