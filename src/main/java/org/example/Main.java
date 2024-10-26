package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавляем сотрудников
        directory.addEmployee(new Employee("001", "123-456-7890", "Иван", 5));
        directory.addEmployee(new Employee("002", "123-456-7891", "Петр", 3));
        directory.addEmployee(new Employee("003", "123-456-7892", "Анна", 5));

        // Ищем сотрудников по стажу
        List<Employee> experiencedEmployees = directory.findByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Employee emp : experiencedEmployees) {
            System.out.println(emp.getName());
        }

        // Получаем номер телефона по имени
        List<String> phoneNumbers = directory.getPhoneNumbersByName("Иван");
        System.out.println("Номер телефона Ивана: " + phoneNumbers);

        // Ищем сотрудника по табельному номеру
        Employee foundEmployee = directory.findByEmployeeId("002");
        if (foundEmployee != null) {
            System.out.println("Найденный сотрудник: " + foundEmployee.getName() + ", телефон: " + foundEmployee.getPhoneNumber());
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }
}