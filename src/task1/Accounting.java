package task1;

public class Accounting {
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);//calculate in otherway
        return employee.getBaseSalary() - tax;
    }
}
