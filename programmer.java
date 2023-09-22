package Salary;

class programmer extends employee {
  private int overtimeHours;
  private double hourlyRate;

  public programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
    super(name, baseSalary);
    this.overtimeHours = overtimeHours;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public double calculateSalary() {
    return baseSalary + (overtimeHours * hourlyRate);
  }

  @Override
  public void displayInfo() {
    System.out.println("Programmer Name: " + name);
    System.out.println("Base Salary: $" + baseSalary);
    System.out.println("Overtime Hours: " + overtimeHours);
    System.out.println("Hourly Rate: $" + hourlyRate);
    System.out.println("Total Salary: $" + calculateSalary());
  }
}