import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LOAN ELIGIBILITY SYSTEM ===");

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Monthly Income: ");
        double monthlyIncome = scanner.nextDouble();

        System.out.print("Enter Requested Loan: ");
        double requestedLoan = scanner.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = scanner.nextInt();

        // Calculations
        double maxAllowedLoan = monthlyIncome * 6;
        double processingFee = requestedLoan * 0.02;

        // Evaluation
        boolean creditPassed = creditScore >= 650;
        boolean loanAmountAllowed = requestedLoan <= maxAllowedLoan;

        System.out.println();
        System.out.println("--- EVALUATION RESULT ---");
        System.out.println("Applicant Name: " + customerName);
        System.out.printf("Max Allowed Loan: PHP %.2f%n", maxAllowedLoan);
        System.out.println("Credit Score: " + creditScore +
                (creditPassed ? " (PASSED)" : " (FAILED)"));

        if (creditPassed && loanAmountAllowed) {
            System.out.println();
            System.out.println("STATUS: LOAN APPROVED");
            System.out.printf("Processing Fee: PHP %.2f%n", processingFee);
        } else {
            System.out.println();
            System.out.println("STATUS: LOAN DENIED");
            System.out.printf("Processing Fee: PHP %.2f%n", processingFee);
        }

        scanner.close();
    }
}
