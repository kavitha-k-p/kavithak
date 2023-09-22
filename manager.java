package Salary;

class manager extends employee {
  private double bonus;

  public manager(String name, double baseSalary, double bonus) {
    super(name, baseSalary);
    this.bonus = bonus;
  }

  @Override
  public double calculateSalary() {
    return baseSalary + bonus;
  }

  @Override
  public void displayInfo() {
    System.out.println("manager Name: " + name);
    System.out.println("Base Salary: $" + baseSalary);
    System.out.println("Bonus: $" + bonus);
    System.out.println("Total Salary: $" + calculateSalary());
  }
}