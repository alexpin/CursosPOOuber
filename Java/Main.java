class Main {
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123")); // Crea objeto car con su metodo constructor
        car.passegenger = 4;  
        car.prinDataCar();

        Car car2 = new Car("QME567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.prinDataCar();        
    }
}