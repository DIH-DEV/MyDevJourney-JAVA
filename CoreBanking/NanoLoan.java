package CoreBanking;

public class NanoLoan extends UserDatabase {
    private double loanAmount;
    private int tenor;

    public NanoLoan(String firstName, String lastName, String phoneNumber,double loanAmount,int tenor){
        super(firstName,lastName,phoneNumber);
        this.loanAmount = loanAmount;
        this.tenor = tenor;
    }
    public double getloanAmount(){
        return loanAmount;
    }
    protected void setloanAmount(double loanAmount){
        if (loanAmount >= 1000)
            this.loanAmount = loanAmount;
    }

   // public static void main(String[] args) {
//        NanoLoan nanoLoan = new NanoLoan("Kelvin","Esho","8098774643",21344,12);
//        System.out.println(nanoLoan.getFirstName());
//        nanoLoan.setFirstName("Oluwasegun");
//        System.out.println(nanoLoan.getFirstName());
//        nanoLoan.setloanAmount(1200);
//        System.out.println("New loan request: "+ nanoLoan.loanAmount);

}
