class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando base de datos Uber.");

        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic"); // Crea objeto car con su metodo constructor
        //uberX.passegenger = 4;  
        uberX.prinDataCar();

        /*Car car2 = new Car("QME567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.prinDataCar();  */      
    }
}