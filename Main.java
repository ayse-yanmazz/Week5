public class Main {

    public static void main(String[] args) {
        TwoDayPackage package1 = new TwoDayPackage(
            "Ayse", "Antakya", "Hatay", "hy", "10001",
            "Ayseeee", "Talas", "Kayseri", "ky", "02108",
            10.0, 0.5, 5.0
        );

        OvernightPackage package2 = new OvernightPackage(
            "Sümeyye", "Talas", "kayseri", "ky", "78701",
            "Esma", "merkezS", "kırşehir", "kş", "33101",
            10.0, 0.5, 0.25
        );

        System.out.println("Sender name: " + package1.senderName);
        System.out.println("Sender Adress: " + package1.senderAdress);
        System.out.println("Sender City : " + package1.senderCity);
        System.out.println("Sender State : " + package1.senderState);
        System.out.println("Sender Zip Code : " + package1.senderZipCode);
        System.out.println("Recipient Name : " + package1.recipientName);
        System.out.println("Recipient Adress : " + package1.recipientAdress);
        System.out.println("Recipient City : " + package1.recipientCity);
        System.out.println("Recipient State : " + package1.recipientState);
        System.out.println("Recipient Zip Code : " + package1.recipientZipCode);
        System.out.println("Weight : " + package1.weight);
        System.out.println("Cost Per Once : " + package1.costPerOnce);
        System.out.println("Flat Fee $ : " + package1.flatFee);

        System.out.println("----------------------------------------");

        System.out.println("Sender name: " + package2.senderName);
        System.out.println("Sender Adress: " + package2.senderAdress);
        System.out.println("Sender City : " + package2.senderCity);
        System.out.println("Sender State : " + package2.senderState);
        System.out.println("Sender Zip Code : " + package2.senderZipCode);
        System.out.println("Recipient Name : " + package2.recipientName);
        System.out.println("Recipient Adress : " + package2.recipientAdress);
        System.out.println("Recipient City : " + package2.recipientCity);
        System.out.println("Recipient State : " + package2.recipientState);
        System.out.println("Recipient Zip Code : " + package2.recipientZipCode);
        System.out.println("Weight : " + package2.weight);
        System.out.println("Cost Per Once : " + package2.costPerOnce);
        System.out.println("Additional Fee :" + package2.af);
        System.out.println("----------------------------------------");

        System.out.println("Total package1: " + package1.calculateCost());
        System.out.println("Total package2 :" + package2.calculateCost());
    }
}