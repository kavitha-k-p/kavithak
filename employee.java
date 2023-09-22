package Salary;

abstract class employee {
  protected String name;
  protected double baseSalary;

  public employee(String name, double baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }

  public abstract double calculateSalary();

  public abstract void displayInfo();
}