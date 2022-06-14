public class Car {

    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver){ // Metodo constructor

       this.license = license;
       this.driver = driver; 
    }

    void prinDataCar(){

        System.out.println("License: " + license + " Name Driver: " + driver.name);
        
    }
    
}
