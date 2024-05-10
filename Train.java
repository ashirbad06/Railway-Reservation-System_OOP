
public class Train {
    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private int generalCapacity;
    private int thirdACCapacity;
    private int secondACCapacity;
    private int firstACCapacity;
    private int fare1AC;
    private int fare2AC;
    private int fare3AC;
    private int fareGeneral;
    private int capacity;

    public Train(int trainNumber, String trainName, String source, String destination, String arrivalTime,
                 String departureTime, int generalCapacity, int thirdACCapacity, int secondACCapacity, int firstACCapacity,
                 int fare1AC,int fare2AC,int fare3AC,int fareGeneral, int capacity) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.generalCapacity = generalCapacity;
        this.thirdACCapacity = thirdACCapacity;
        this.secondACCapacity = secondACCapacity;
        this.firstACCapacity = firstACCapacity;
        this.fare1AC = fare1AC;
        this.fare2AC = fare2AC;
        this.fare3AC = fare3AC;
        this.fareGeneral = fareGeneral;
        this.capacity = capacity;
    }

    // Getters and Setters

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getGeneralCapacity() {
        return generalCapacity;
    }

    public void setGeneralCapacity(int generalCapacity) {
        this.generalCapacity = generalCapacity;
    }

    public int getThirdACCapacity() {
        return thirdACCapacity;
    }

    public void setThirdACCapacity(int thirdACCapacity) {
        this.thirdACCapacity = thirdACCapacity;
    }

    public int getSecondACCapacity() {
        return secondACCapacity;
    }
    public int getFare1AC() {
        return this.fare1AC;
    }
    public int getFare2AC() {
        return this.fare2AC;
    }
    public int getFare3AC() {
        return this.fare3AC;
    }
    public int getFareGeneral() {
        return this.fareGeneral;
    }
    public void setSecondACCapacity(int secondACCapacity) {
        this.secondACCapacity = secondACCapacity;
    }

    public int getFirstACCapacity() {
        return firstACCapacity;
    }
    public int getSeatCapacity() {
        return this.capacity;
    }

    public void setFirstACCapacity(int firstACCapacity) {
        this.firstACCapacity = firstACCapacity;
    }
}
