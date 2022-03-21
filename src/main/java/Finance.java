import java.util.Map;
import com.h2.SavingsCalculator;
import com.h2.MortgageCalculator;
import com.h2.BestLoanRates;

public class Finance {
    public static final String BEST_LOAN_RATES="bestLoanRates";
    public static final String  SAVINGS_CALCULATOR="savingsCalculator";
    public static final String  MORTGAGE_CALCULATOR ="mortgageCalculator";

    public static final Map<String, String> commandsToUsage = Map.of (
        BEST_LOAN_RATES, "usage: bestLoanRates",
        SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
        MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");

    private static boolean validateCommandArguments(String[] args) {

        switch (args[0]) {
            case BEST_LOAN_RATES:
                return args.length == 1;
            case SAVINGS_CALCULATOR:
                return args.length == 3;
            case MORTGAGE_CALCULATOR:
                System.out.println(MORTGAGE_CALCULATOR);
                return args.length == 4;
        }
        return false;
    }

    private static void executeCommand(String command, String[] arguments) {
        final String loanAmount = "264000";
        final String termInYears = "30";
        final String annualRate = "3.74";


        switch (command) {
            case BEST_LOAN_RATES:
                System.out.println("Finding best loan rates ...");
                BestLoanRates.main(null);
                break;
            case SAVINGS_CALCULATOR:
                System.out.println("Finding your net savings ...");
                SavingsCalculator.main(null);
                break;
            case MORTGAGE_CALCULATOR:
                System.out.println("Finding your monthly payment ...");
                MortgageCalculator.main(null);
                break;
        }

        return;
    }



    public static void main (String[] args) {
        String command = args[0];

        if (!commandsToUsage.containsKey(command)) {
            System.out.print(args[0]);
            System.out.print(": command not found\n");
        }
        return;
    }
}
