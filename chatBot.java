import java.util.*;

public class chatBot {

    public static void main(String[] args) {

        Scanner inn = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\nCAB BOOKING CHATBOT");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.println("Enter your choice");

            int mainChoice = inn.nextInt();

            if (mainChoice == 1) {

                System.out.println("\nSELECT CAB TYPE");
                System.out.println("1. Auto - Rs 12/Km");
                System.out.println("2. Sedan - Rs 18/Km");
                System.out.println("3. SUV - Rs 25/Km");
                System.out.print("Enter cab choice: ");

                int cabChoice = inn.nextInt();

                String cabType;
                int rate;

                if (cabChoice == 1) {
                    cabType = "Auto";
                    rate = 12;

                } else if (cabChoice == 2) {
                    cabType = "Sedan";
                    rate = 18;

                } else if (cabChoice == 3) {
                    cabType = "SUV";
                    rate = 25;

                } else {
                    System.out.println("Invalid cab choice.");
                    continue;
                }

                System.out.println("\nSELECT ROUTE");
                System.out.println("1. Pune Station -> Shivajinagar (5 km)");
                System.out.println("2. Swargate -> Kothrud (8 km)");
                System.out.println("3. Hinjawadi -> Wakad (10 km)");
                System.out.print("Enter route choice: ");

                int routeChoice = inn.nextInt();

                String source;
                String destination;
                int distance;

                if (routeChoice == 1) {
                    source = "Pune Station";
                    destination = "Shivajinagar";
                    distance = 5;

                } else if (routeChoice == 2) {
                    source = "Swargate";
                    destination = "Kothrud";
                    distance = 8;

                } else if (routeChoice == 3) {
                    source = "Hinjawadi";
                    destination = "Wakad";
                    distance = 10;

                } else {
                    System.out.println("Invalid route choice.");
                    continue;
                }

                int fare = rate * distance;

                System.out.println("\nRIDE DETAILS");
                System.out.println("Cab Type   : " + cabType);
                System.out.println("From       : " + source);
                System.out.println("To         : " + destination);
                System.out.println("Distance   : " + distance + " Km");
                System.out.println("Rate       : Rs " + rate + "/Km");
                System.out.println("Total Fare : Rs " + fare);

                System.out.println("\nBOOKING CONFIRMATION");
                System.out.println("1. Confirm & Share OTP");
                System.out.println("2. Cancel Ride");
                System.out.print("Enter your choice: ");

                int confirmChoice = inn.nextInt();

                if (confirmChoice == 2) {
                    System.out.println("\nRide cancelled successfully.");
                    System.out.println("No OTP was shared.");
                    continue;
                }

                if (confirmChoice == 1) {

                    int otp = 1000 + random.nextInt(9000);

                    System.out.println("\nYour OTP is: " + otp);
                    System.out.println("OTP has been shared with you.");
                    System.out.println("Once OTP is shared, ride cancellation is not allowed.");
                    System.out.println("Ride booked successfully!");

                } else {
                    System.out.println("Invalid confirmation choice.");
                }

            } else if (mainChoice == 2) {

                System.out.println("\nThank you for using Cab Booking Chatbot!");
                System.out.println("Goodbye!");
                break;

            } else {

                System.out.println("\nInvalid menu choice.");
                System.out.println("Please enter 1 or 2.");
            }
        }

        inn.close();
    }
}
