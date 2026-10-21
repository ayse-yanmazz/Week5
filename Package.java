public class Package {
    public String senderName;
    public String senderAdress;
    public String senderCity;
    public String senderState;
    public String senderZipCode;

    public String recipientName;
    public String recipientAdress;
    public String recipientCity;
    public String recipientState;
    public String recipientZipCode;

    public double weight;
    public double costPerOnce;

    public Package(String senderName, String senderAdress, String senderCity, String senderState, String senderZipCode,
                   String recipientName, String recipientAdress, String recipientCity, String recipientState, String recipientZipCode,
                   double weight, double costPerOnce) {
        
        this.senderName = senderName;
        this.senderAdress = senderAdress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;

        this.recipientName = recipientName;
        this.recipientAdress = recipientAdress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZipCode = recipientZipCode;

        if (weight > 0.0) {
            this.weight = weight;
        } else {
            this.weight = 0.0;
        }

        if (costPerOnce > 0.0) {
            this.costPerOnce = costPerOnce;
        } else {
            this.costPerOnce = 0.0;
        }
    }

    public double calculateCost() {
        return weight * costPerOnce;
    }
}