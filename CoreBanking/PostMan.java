package CoreBanking;

public class PostMan {
    public static void main(String[] args) {
        BusinessBanking businessBanking = new BusinessBanking("Happines","Demola","0986754323","12345","Justice");
        PersonalBanking personalBanking = new PersonalBanking("Seun","Juwon","098456733");
        UserDatabase bs = new NanoLoan("Kelvin","Esho","09089786765",23452,4);
        NanoLoan nanoLoan = new NanoLoan("Kelvin","Esho","8098774643",21344,12);


        System.out.println("First name: " + businessBanking.getFirstName());
        System.out.println("Last name: " + businessBanking.getLastName("Komolafe"));
        System.out.println("Mobile Number: " + businessBanking.getPhoneNumber());
        System.out.println("rc Number: " + businessBanking.getRcNumber());
        System.out.println("Director name: " + businessBanking.getDirectorName());
        System.out.println("NN - Phone Number: " + bs.getPhoneNumber());
        System.out.println("NN - loan Amount: $" + nanoLoan.getloanAmount());

        //System.out.println("Existing: " + businessBanking.getFirstName("test"));
//        System.out.println(personalBanking.getFirstName());
//        System.out.println(businessBanking.getDirectorName());
//        businessBanking.setDirectorName("Shayo");
//        System.out.println("Director Name: " + businessBanking.getDirectorName());
//
//        System.out.println(nanoLoan.getFirstName());
//        nanoLoan.setFirstName("Oluwasegun");
//        System.out.println(nanoLoan.getFirstName());
//        nanoLoan.setloanAmount(54000);
//        System.out.println("New loan request: "+ nanoLoan.getloanAmount());

    }
}
