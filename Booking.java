public abstract class Booking {
    abstract void bookTicket(); // Method to book a ticket
    abstract void cancelTicket(); // Method to cancel a ticket
    abstract void viewBookingStatus(); // Method to view booking status
    abstract int getBookingId(); // Method to get the booking ID
    abstract int getTrainNumber(); // Method to get the train number
    abstract String getPassengerName(); // Method to get the passenger name
    abstract String getCoachType(); // Method to get the coach type
    abstract int getFare(); // Method to get the fare
}
