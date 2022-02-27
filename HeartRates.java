package lab2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Scanner;

public class HeartRates {
    private String  firstName;
    private String  lastName;
    private String  dateOfBirth;
    private final int   RESTING_HEART_RATE = 70;
    private final double    LOWER_BOUNDARY = 0.5;
    private final double    UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public LocalDate getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate birthday = null;

        try {
            birthday = LocalDate.parse(getDateOfBirth(), formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error! Please try again");
        }
        return birthday;
    }

    public int calculatesMaximumHeartRates(){
        return 220 - (calculateAge(getBirthday()).getYears());
    }

    public double[] targetHeartRateRange(){
        int averageHeartRate = calculatesMaximumHeartRates() - RESTING_HEART_RATE;
        double  lowerBoundaryTargetHeartRate = (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        double  upperBoundaryTargetHeartRate = (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;
        return new double[]{lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate};
    }

    @Override
    public String toString() {
        return "FirstName : " + firstName + '\n' +
                "LastName : " + lastName + '\n' +
                "Age :" + calculateAge(getBirthday()).getYears() + '\n' +
                "Date of Birth : " + dateOfBirth + '\n' +
                "Maximum Heart Rate: " + calculatesMaximumHeartRates();
    }
}
