public class Employee extends Person {
    double annual_salary;
    int starting_year;
    String nataional_insurance;
    Employee(int starting_year, String nataional_insurance,String name,double annual_salary) {
        this.starting_year = starting_year;
        this.nataional_insurance = nataional_insurance;
        this.name=name;
        this.annual_salary = annual_salary;
    }
}
