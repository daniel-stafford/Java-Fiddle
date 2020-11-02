import java.text.NumberFormat;

public class MortgageReport {

  private final MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    System.out.println("\nMORTGAGE \n----------");
    System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
  }

  public void printPaymentSchedule() {
    System.out.println("\nPAYMENT SCHEDULE \n------------");
      System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
    }
  }

}
