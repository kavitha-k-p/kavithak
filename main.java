package Salary;

public class main {
  public static void main(String[] args) {
   manager manager = new manager("Abc", 6000, 1000);
  programmer programmer = new programmer("Xyz", 5000, 20, 25.0);

    manager.displayInfo();
    System.out.println("---------------------");
    programmer.displayInfo();
  }
}