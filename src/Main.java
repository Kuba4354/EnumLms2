public class Main {
    public static void main(String[] args) {
        for (TransportType value : TransportType.values()) {
            System.out.println(value + " " + value.calculateTravelCost(50));
        }
    }
}
