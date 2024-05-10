import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class BookingSystem {
    private ArrayList<Train> trains;
    private ArrayList<Booking> bookings;
    private Scanner scanner;

    public BookingSystem() {
        trains = new ArrayList<>();
        bookings = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public void bookTicket() {
        System.out.println("Booking a ticket...");
        
        
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        
        System.out.print("Enter train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); 
        
        Train selectedTrain = getTrainByNumber(trainNumber);
        if (selectedTrain != null) {
            System.out.print("Enter journey date (YYYY-MM-DD): ");
            LocalDate journeyDate = LocalDate.parse(scanner.nextLine());
            
            // Check if the journey date is valid for the selected train
            if (isValidJourneyDate(selectedTrain, journeyDate)) {
                System.out.print("Enter coach type (1AC/2AC/3AC/General): ");
                String coachType = scanner.nextLine();
                System.out.print("Enter passenger type (Student/SeniorCitizen/Military/Disabled/None): ");
                String passengerType = scanner.nextLine();
        
                int fare = calculateFare(selectedTrain, coachType);
                fare = applyDiscount(fare, passengerType);
                
                Booking newBooking = new BookingImpl(passengerName, trainNumber, coachType, fare);
                bookings.add(newBooking);
                System.out.println("Ticket booked successfully!");
            } else {
                System.out.println("Invalid journey date for the selected train.");
            }
        } else {
            System.out.println("Invalid train number.");
        }
    }


    public void cancelTicket() {
        // Implementation of canceling a ticket
        System.out.println("Canceling a ticket...");
        // Example implementation: ask for user input and cancel a booking
        System.out.print("Enter booking ID to cancel: ");
        int bookingId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Booking bookingToRemove = getBookingById(bookingId);
        if (bookingToRemove != null) {
            bookings.remove(bookingToRemove);
            System.out.println("Ticket canceled successfully!");
        } else {
            System.out.println("Booking not found.");
        }
    }

    public void viewBookingStatus() {
        // Implementation of viewing booking status
        System.out.println("Viewing booking status...");
        // Example implementation: display all bookings
        System.out.println("All bookings:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    private Train getTrainByNumber(int trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                return train;
            }
        }
        return null;
    }

    private int calculateFare(Train train, String coachType) {
        switch (coachType) {
            case "1AC":
                return train.getFare1AC();
            case "2AC":
                return train.getFare2AC();
            case "3AC":
                return train.getFare3AC();
            case "General":
                return train.getFareGeneral();
            default:
                return 0; // Invalid coach type
        }
    }

    private int applyDiscount(int fare, String passengerType) {
        switch (passengerType) {
            case "Student":
                return (int) SpecialService.applyStudentDiscount(fare);
            case "SeniorCitizen":
                return (int) SpecialService.applySeniorCitizenDiscount(fare);
            case "Military":
                return (int) SpecialService.applyMilitaryPersonnelDiscount(fare);
            case "Disabled":
                return (int) SpecialService.applyDisabledPersonDiscount(fare);
            default:
                return fare; // No discount
        }
    }

    private Booking getBookingById(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        return null;
    }
    public int tatkalTicketsAvailable = 10;
    public void bookTatkalTicket() {
        if (isTatkalBookingWindowOpen()) {
        	
            System.out.println("Booking a ticket...");
            
            System.out.print("Enter passenger name: ");
            String passengerName = scanner.nextLine();
            System.out.print("Enter train number: ");
            int trainNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter coach type (1AC/2AC/3AC/General): ");
            String coachType = scanner.nextLine();
            System.out.print("Enter passenger type (Student/SeniorCitizen/Military/Disabled): ");
            String passengerType = scanner.nextLine();

            Train selectedTrain = getTrainByNumber(trainNumber);
            if (selectedTrain != null) {
                int fare = calculateFare(selectedTrain, coachType);
                fare = applyDiscount(fare, passengerType);
                Booking newBooking = new BookingImpl(passengerName, trainNumber, coachType, fare);
                bookings.add(newBooking);
                tatkalTicketsAvailable--;
                System.out.println("Ticket booked successfully!");
            } 
            else {
                System.out.println("Invalid train number.");
            }
    }
}
    private boolean isValidJourneyDate(Train train, LocalDate journeyDate) {
        
        LocalTime departureTime = LocalTime.parse(train.getDepartureTime());
        LocalTime arrivalTime = LocalTime.parse(train.getArrivalTime());

        
        LocalDateTime departureDateTime = LocalDateTime.of(journeyDate, departureTime);
        LocalDateTime arrivalDateTime = LocalDateTime.of(journeyDate, arrivalTime);

        
        if (arrivalDateTime.isAfter(departureDateTime)) {
            
            return true;
        } 
        return false;
    }

    private boolean isTatkalBookingWindowOpen() {
        LocalTime currentTime = LocalTime.now();
        LocalTime openingTime = LocalTime.of(9, 0); // Opening time is 9:00 AM
        LocalTime closingTime = LocalTime.of(10, 0); // Closing time is 10:00 AM

        
        return !currentTime.isBefore(openingTime) && currentTime.isBefore(closingTime);
    }

}