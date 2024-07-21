// Scenario: Create a base class called Device and a derived class called Smartphone.
//  The Device class should contain attributes for brand and model, along with methods to display device information
//   and power on/off. The Smartphone class should inherit from Device and include additional attributes for 
//   operatingSystem and cameraResolution, along with methods to display smartphone-specific information and take a photo.

// Requirements: 
// Implement the Device class with the required attributes and methods.
// Implement the Smartphone class that inherits from Device and adds its own attributes and methods.
// Create an instance of Smartphone, set its attributes, and demonstrate the usage of all methods.

class Device {
   private String brand;
   private String model;
    public Device(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public void deviceInfo(){
        System.out.println("The device information is :");
        System.out.println("brand :"+brand);
        System.out.println("Model :"+model);

    }
    public void powerOn(){
        System.out.println("Its quite obvious power is on as you are able to call me");
    }
    public void powerOff(){
        System.out.println("Sorry!buddy please turn me off...i need some rest ");
    }
}    
class Smartphone extends Device{
   private String OS;
   private int cameraResol;
    public Smartphone(String brand,String model,String OS,int cameraResol){
        super(brand, model);
        this.OS=OS;
        this.cameraResol=cameraResol;
    }
    public void smartphoneInfo(){
        super.deviceInfo();
        System.out.println("The smartphone information is :");
        System.out.println("Opearating System :"+OS);
        System.out.println("Camera Resolution :"+cameraResol);

    }

    public void takePhoto(){
    System.out.println("you can click anything using my camera....so try me!!!!");
    }

}
public class Test{
    public static void main(String[] args) {
        Smartphone myphone=new Smartphone("Samsung","galaxy S21","Android",64);
        myphone.smartphoneInfo();
        myphone.takePhoto();
        myphone.powerOn();
        myphone.powerOff();
        
    }

}
}
