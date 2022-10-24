package Contact;

public class Contact {
    private String fName;
    private String lName;
    private String phNumber;

    public Contact(String fName, String lName, String phNumber) {
        this.fName = fName;
        this.lName = lName;
        this.phNumber = phNumber;
    }

    public String getfName(){
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName(){
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getPhNumber(){
        return phNumber;
    }
    public void setPhNumber(String fName) {
        this.phNumber = fName;
    }

    public void validatefName() {
        if(this.fName.isBlank())
            throw new RuntimeException("1st Name can't be Null or empty");
    }

    public void validatelName() {
        if(this.lName.isBlank())
            throw new RuntimeException("1st Name can't be Null or empty");
    }

    public void validatephNumber() {
        if (this.phNumber.isBlank()){
            throw new RuntimeException("Phone Name Cannot be null or empty");
        }

        if (this.phNumber.length() < 10) {
            throw new RuntimeException("Phone Number Should be 10 Digits Long");
        }
        if (!this.phNumber.matches("\\d+")) {
            throw new RuntimeException("Phone Number Contain only digits");
        }
        if (!this.phNumber.startsWith("0")) {
            throw new RuntimeException("Phone Number Should Start with 0");
        }
    }

}
