import java.util.Scanner;
public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();

     // Creating instances of GoaMumbaiTrain
        GoaMumbaiTrain goaToMumbaiTrain1 = new GoaMumbaiTrain(1, "Goa to Mumbai Train 1", "Goa", "Mumbai", "10:00", "18:00",
                500, 100, 150, 200, 250, 300, 124, 334, 566);
        GoaMumbaiTrain goaToMumbaiTrain2 = new GoaMumbaiTrain(2, "Goa to Mumbai Train 2", "Goa", "Mumbai", "09:00", "17:00",
                600, 150, 200, 250, 300, 350, 234, 125, 556);
        GoaMumbaiTrain goaToMumbaiTrain3 = new GoaMumbaiTrain(3, "Goa to Mumbai Train 3", "Goa", "Mumbai", "08:00", "16:00",
                700, 200, 250, 300, 350, 400, 350, 200, 467);

     // Creating an instance of MumbaiGoaTrain
        MumbaiGoaTrain mumbaiToGoaTrain = new MumbaiGoaTrain(4, "Mumbai to Goa Train", "Mumbai", "Goa", "11:00", "19:00",
                550, 120, 170, 220, 270, 320, 300, 230, 700);

        // Creating an instance of GoaBangaloreTrain
        GoaBangaloreTrain goaToBangaloreTrain = new GoaBangaloreTrain(5, "Goa to Bangalore Train", "Goa", "Bangalore", "07:00", "15:00",
                800, 250, 300, 350, 400, 450, 345, 455, 777);



        // Add trains to the booking system
        bookingSystem.addTrain((Train)goaToMumbaiTrain1);
        bookingSystem.addTrain((Train)goaToMumbaiTrain2);
        bookingSystem.addTrain((Train)goaToMumbaiTrain3);
        bookingSystem.addTrain((Train)mumbaiToGoaTrain);
        bookingSystem.addTrain((Train)goaToBangaloreTrain);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Booking Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Book Ticket
                    bookingSystem.bookTicket();
                    break;
                case 2:
                    // Cancel Ticket
                    bookingSystem.cancelTicket();
                    break;
                case 3:
                    // View Booking Status
                    bookingSystem.viewBookingStatus();
                    break;
                case 4:
                    // Exit
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
