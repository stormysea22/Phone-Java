package phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Slide to unlock";
    }
    @Override
    public void displayInfo() {
        System.out.println("Samsung " + this.getVersionNumber() + "Carrier: " + this.getCarrier());          
    }
}

