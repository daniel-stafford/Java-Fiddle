class MortgageCalculator {

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private final int principal;
    private final float annualInterest;
    private int years;

    MortgageCalculator(int principal, float annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        setYears(years);
    }

    double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        double totalNumberOfPayments = getTotalNumberOfPayments();
        double paymentsPerMonth = Math.pow(1 + monthlyInterest, totalNumberOfPayments);
        return principal * (monthlyInterest * paymentsPerMonth) / (paymentsPerMonth - 1);
    }

    double calculateBalance(double numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        double totalNumberOfPayments = getTotalNumberOfPayments();
        return principal
                * (Math.pow(1 + monthlyInterest, totalNumberOfPayments)
                        - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1);
    }

    private int getYears() {
        return years;
    }

    private void setYears(int years) {
        this.years = years;
    }

    private double getTotalNumberOfPayments() {
        return (double) getYears() * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}