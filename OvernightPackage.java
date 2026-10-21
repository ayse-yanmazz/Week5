public class OvernightPackage extends Package {
    public double af; 

    public OvernightPackage(String senderName, String senderAdress, String senderCity, String senderState, String senderZipCode,
                            String recipientName, String recipientAdress, String recipientCity, String recipientState, String recipientZipCode,
                            double weight, double costPerOnce, double af) {
        
        super(senderName, senderAdress, senderCity, senderState, senderZipCode,
              recipientName, recipientAdress, recipientCity, recipientState, recipientZipCode,
              weight, costPerOnce);

        if (af >= 0.0) {
            this.af = af;
        } else {
            this.af = 0.0;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (weight * af);
    }
}