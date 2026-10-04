import java.util.Scanner;

public class Profile {

    Scanner input = new Scanner(System.in);
    BMICalculator bmiCalculator = new BMICalculator();

    float height;
    float weight;
    double bmi;
    String bodyType;
    String bodyGoal;

    Profile() {

        System.out.println("Enter your height in meters");
        height = input.nextFloat();

        System.out.println("Enter your weight in kilograms");
        weight = input.nextFloat();

        input.nextLine();

        bmi = bmiCalculator.calculateBMI(weight, height);
        bodyType = bmiCalculator.getBodyType(bmi);

        System.out.println("Enter your body goal");
        bodyGoal = input.nextLine();
    }
}