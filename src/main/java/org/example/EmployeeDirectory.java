package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



    public class EmployeeDirectory {
        private List<Employee> employees;

        public EmployeeDirectory() {
            employees = new ArrayList<>();
        }

        // Метод для добавления нового сотрудника
        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        // Метод для поиска сотрудников по стажу
        public List<Employee> findByExperience(int experience) {
            return employees.stream()
                    .filter(employee -> employee.getExperience() == experience)
                    .collect(Collectors.toList());
        }

        // Метод для получения номера телефона по имени
        public List<String> getPhoneNumbersByName(String name) {
            return employees.stream()
                    .filter(employee -> employee.getName().equalsIgnoreCase(name))
                    .map(Employee::getPhoneNumber)
                    .collect(Collectors.toList());
        }

        // Метод для поиска сотрудника по табельному номеру
        public Employee findByEmployeeId(String employeeId) {
            return employees.stream()
                    .filter(employee -> employee.getEmployeeId().equals(employeeId))
                    .findFirst()
                    .orElse(null); // Возвращает null, если сотрудник не найден
        }
    }

