import java.util.Scanner;
    public class PatientInformation {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter patient's first  name: ");
            String firstName = input.nextLine();

            System.out.print("Enter patient's last name: ");
            String lastName = input.nextLine();

            System.out.print("Enter patient's age: ");
            int age = input.nextInt();
            input.nextLine(); 
            System.out.print("Enter patient's gender: ");
            String gender = input.nextLine();

            System.out.print("Enter patient's address: ");
            String address = input.nextLine();
            

            System.out.print("Enter patient's contact number: ");
            String contactNumber = input.nextLine();
            System.out.print("Enter patient's height in feet:");
            double height = input.nextDouble();
            System.out.print("Enter patient's weight in pounds:");
            double weight = input.nextDouble();
            System.out.print("Enter patient's ID:");
            int patientID = input.nextInt();
            System.out.print("Enter patient's heart rate:");
            int heartRate = input.nextInt();
            String heartRateStatus;
            if (heartRate < 60) {
                heartRateStatus = "below normal";

    } else if (heartRate >= 60 && heartRate <= 100) {
                heartRateStatus = "normal";
    
            } else {
                heartRateStatus = "above normal";
            }


// Display the collected patient information
            System.out.println("\nPatient Information:");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Address: " + address);
            System.out.println("Contact Number: " + contactNumber);
            System.out.println("Height: " + height + " feet");
            System.out.println("Weight: " + weight + " pounds");
            System.out.println("Patient ID: " + patientID);
            System.out.println("Heart Rate: " + heartRate);
            System.out.println("Heart Rate Status: " + heartRateStatus);
            input.close();
        }
}
