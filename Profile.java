
import java.util.Scanner;


public class Profile{
        Scanner input = new Scanner(System.in);

      

            

        float height;
        float weight;
        
        Profile(){
        System.out.println("Enter our height in meters" );
            height = input.nextFloat();
        System.out.println("Enter our weight in kilograms" );
            weight = input.nextFloat();
        }

        float bmiCalculater(){

            float bmi = weight / (height * height);
            return bmi;
        }

        

}