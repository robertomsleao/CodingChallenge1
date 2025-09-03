import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many coffees would you like?");
        int nC = input.nextInt();

        System.out.println("How many teas would you like?");
        int nT = input.nextInt();

        System.out.println("How many pasteries would you like?");
        int nP = input.nextInt();

        double costCafes = nC * 2.10;
        double costTeas = nT * 2.75;
        double costPastries = nP * 1.60;

        double subTotalP = (costCafes + costTeas + costPastries) * 100;
        double totalP = (subTotalP * 1.573);
        double serviceFeeP = (subTotalP * 0.3);
        double subTotal = Math.floor(subTotalP) / 100;
        double total = Math.floor(totalP) / 100;
        double serviceFee = Math.floor(serviceFeeP) / 100;

        System.out.println(
                "\nItems:" +
                "\nCafes:     -   " + nC +
                "\nTeas:      -   " + nT +
                "\nPastries:  -   " + nP +
                "\nSubtotal: " + subTotal +
                "\nVAT: 21%" +
                "\nServiceFee: " + serviceFee +
                "\nTotal: " + total);
    }
}
