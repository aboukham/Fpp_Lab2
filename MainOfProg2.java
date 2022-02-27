package lab2;

import java.time.Period;
import java.util.Scanner;

public class MainOfProg2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name");
        String fName = sc.nextLine();
        System.out.println("Please, enter your last name");
        String lName = sc.nextLine();
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14");
        String dob = sc.nextLine();
        HeartRates  hr = new HeartRates(fName, lName, dob);
        Period age = hr.calculateAge(hr.getBirthday());
        double[] range = hr.targetHeartRateRange();
        System.out.println("The target heart rate range is between " + range[0] + " and " + range[1]);
        System.out.println(hr);
    }
}
