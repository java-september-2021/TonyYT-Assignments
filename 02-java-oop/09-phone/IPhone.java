public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        // your code here
        super.ringTone = "iPhone X says Zing ";
        return ringTone;
    }

    @Override
    public String unlock() {
        // your code here
        String unlocking = "Unlocking via facial recogniation";
        return unlocking;
    }

    @Override
    public void displayInfo() {
        // your code here
        System.out.println("iPhone " + this.versionNumber + "from " + this.carrier);
    }
}