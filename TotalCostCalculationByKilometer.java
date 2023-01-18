import java.util.Scanner;

public class TotalCostCalculationByKilometer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how much your vehicle costs per kilometer. Example (0.75):");
        double cents = scanner.nextDouble();

        System.out.print("Enter how many kilometers you will travel. Example (172.56): ");
        double km = scanner.nextDouble();

        System.out.println("Your vehicle will cost a total of " + (int)(cents * km) + " TL.");

    }

}

