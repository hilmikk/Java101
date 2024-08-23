public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 0) {
            System.out.println("Salary cannot be negative");
            return 0;
        } else if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int yearsWorked = 2021 - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else if (yearsWorked >= 20) {
            return this.salary * 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        double tax = this.tax();
        double bonus = this.bonus();
        double raise = this.raiseSalary();
        double salaryWithBonusesAndTaxes = this.salary + bonus - tax;
        double totalSalary = salaryWithBonusesAndTaxes + raise;

        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax +
                "\nBonus: " + bonus +
                "\nRaise Salary: " + raise +
                "\nSalary (Bonuses and Taxes included): " + salaryWithBonusesAndTaxes +
                "\nTotal Salary: " + totalSalary + "\n----------";
    }
}
