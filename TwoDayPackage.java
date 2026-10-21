public class TwoDayPackage extends Package {
    public double flatFee;

    public TwoDayPackage(String senderName, String senderAdress, String senderCity, String senderState, String senderZipCode,
                           String recipientName, String recipientAdress, String recipientCity, String recipientState, String recipientZipCode,
                           double weight, double costPerOnce, double flatFee) {
        
        super(senderName, senderAdress, senderCity, senderState, senderZipCode,
              recipientName, recipientAdress, recipientCity, recipientState, recipientZipCode,
              weight, costPerOnce);

        if (flatFee >= 0.0) {
            this.flatFee = flatFee;
        } else {
            this.flatFee = 0.0;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}