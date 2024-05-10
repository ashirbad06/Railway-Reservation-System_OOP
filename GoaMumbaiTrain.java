public class GoaMumbaiTrain extends Train {
    public GoaMumbaiTrain(int trainNumber, String trainName, String source, String destination, String arrivalTime,
                             String departureTime, int generalCapacity, int thirdACCapacity, int secondACCapacity, int firstACCapacity,
                             int fare1AC, int fare2AC, int fare3AC, int fareGeneral, int capacity) {
        super(trainNumber, trainName, source, destination, arrivalTime, departureTime, generalCapacity, thirdACCapacity, secondACCapacity,
                firstACCapacity, fare1AC, fare2AC, fare3AC, fareGeneral, capacity);
    }
}
