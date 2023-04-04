public class Main {
    public static void main(String[] args) {
        Transport[] arr = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle ("bicycle2",2),
                new Bicycle("bicycle2", 2)};
        ServiceStation serviceStation = new ServiceStation();
        for (var transport:arr) {
            serviceStation.check(transport);
        }




    }
}