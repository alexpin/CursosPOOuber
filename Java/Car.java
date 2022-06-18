public class Car {

    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Car(String license, Account driver){ // Metodo constructor

       this.license = license;
       this.driver = driver; 
       //passegenger = 3;

       }

    void prinDataCar(){
        //System.out.println("Passengers: " + passegenger);
        if (passegenger != null) {
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);
        }         
    }

    public Integer getPassegenger() {
        return passegenger;
    }

    public void setPassegenger(Integer passegenger) {
        if (passegenger == 4) {
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }



    
    
}
