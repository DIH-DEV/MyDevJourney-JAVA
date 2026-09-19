package CoreBanking;

public class BusinessBanking extends UserDatabase {
    private String rcNumber;
    private String directorName;

    public BusinessBanking(String firstName, String lastName, String phoneNumber,String rcNumber,String directorName) {
        super(firstName, lastName, phoneNumber);
        this.rcNumber = rcNumber;
        this.directorName = directorName;
    }
    @Override
    public String getFirstName(){
        if (super.firstName.length() <= 2){
            System.out.println("Name is too short!");
        }
        else {
            return firstName;
        }
        return "";
    }

    public String getRcNumber() {
        return rcNumber;
    }

    public void setRcNumber(String rcNumber) {
        this.rcNumber = rcNumber;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
