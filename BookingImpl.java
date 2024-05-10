public class BookingImpl extends Booking {
    private static int nextBookingId = 1;
    private int bookingId;
    private String passengerName;
    private int trainNumber;
    private String coachType;
    private int fare;

    public BookingImpl(String passengerName, int trainNumber, String coachType, int fare) {
        this.bookingId = nextBookingId++;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.coachType = coachType;
        this.fare = fare;
    }

    @Override
    void bookTicket() {
        // Implementation of booking a ticket (if needed)
        System.out.println("Booking ticket for: " + passengerName);
    }

    @Override
    void cancelTicket() {
        // Implementation of canceling a ticket (if needed)
        System.out.println("Canceling ticket for: " + passengerName);
    }

    @Override
    void viewBookingStatus() {
        // Implementation of viewing booking status (if needed)
        System.out.println("Booking ID: " + bookingId + ", Passenger: " + passengerName + ", Train: " + trainNumber + ", Coach: " + coachType + ", Fare: " + fare);
    }

    @Override
    int getBookingId() {
        return bookingId;
    }

    @Override
    int getTrainNumber() {
        return trainNumber;
    }

    @Override
    String getPassengerName() {
        return passengerName;
    }

    @Override
    String getCoachType() {
        return coachType;
    }

    @Override
    int getFare() {
        return fare;
    }
}