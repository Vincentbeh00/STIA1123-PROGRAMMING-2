import java.util.Scanner;

public class TaxCalculator {
    private static Tax[] tax = new Tax[1];

  public static void main(String[] args) {
    input(tax);
    printTaxAmount(tax);
  }

  public static void input(Tax[] tax) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < tax.length; i++) {
      System.out.println("Enter name: ");
      String name = sc.nextLine();
      System.out.println("Enter IC No: ");
      String icNo = sc.nextLine();
      System.out.println("Enter Total Income: ");
      double totalIncome = sc.nextDouble();
      System.out.println("Enter Tax Deduction Amount: ");
      double taxDeductionAmount = sc.nextDouble();
      double taxableIncome = totalIncome - taxDeductionAmount;
      sc.nextLine(); // consume the remaining newline character
      System.out.println("Enter status (single/married): ");
      String status = sc.nextLine();
      Person person = new Person(name, icNo);
      tax[i] = new Tax (person, taxableIncome, status);

    }
  }

  public static void printTaxAmount(Tax[] tax) {
  // Print table header
  System.out.printf("\n%-20s %-15s %15s %15s\n", "NAME", "IC NO", "TAXABLE INCOME", "TAX AMOUNT");
        System.out.println("-----------------------------------------------------------------------");
  
        // Print table rows
        for (Tax tax1 : tax) {
            // Get person's name, IC number, taxable income, and tax amount
            String name = tax1.getName();
            String icNo = tax1.getIcNo();
            double taxableIncome = tax1.getTaxableIncome();
            double taxAmount = tax1.calculateTax();
            // Print table row using string formatting
            System.out.printf("%-20s %-15s %15.2f %15.2f\n", name, icNo, taxableIncome, taxAmount);

        }

  }
}

