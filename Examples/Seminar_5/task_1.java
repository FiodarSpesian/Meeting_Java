package Examples.Seminar_5;

import java.util.HashMap;
import java.util.Map;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

123456 Иванов

321456 Васильев

234561 Петрова

234432 Иванов

654321 Петрова

345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
 */
public class task_1 {
    public static void main(String[] args) {
        Map<String, String> passportData = new HashMap<>();
        passportData.put("123456", "Иванов");
        passportData.put("321456", "Васильев");
        passportData.put("234561", "Петрова");
        passportData.put("234432", "Иванов");
        passportData.put("654321", "Петрова");
        passportData.put("345678", "Иванов");
        for (var number : passportData.entrySet()) {
            if (number.getValue().equals("Иванов")){
                System.out.printf("%s - %s\n", number.getValue(), number.getKey());
            }
        }
    }
}
