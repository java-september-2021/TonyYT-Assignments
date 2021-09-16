public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        // your code here
        String ringing = "Galaxy S9 says Ring Ring Ring!";
        return ringing;
    }

    @Override
    public String unlock() {
        // your code here
        String unlocking = "Unlocking via fringer print";
        return unlocking;
    }

    @Override
    public void displayInfo() {
        // your code here
        System.out.println("Galaxy " + this.versionNumber + "from " + this.carrier);
    }
}