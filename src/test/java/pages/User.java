package pages;

public class User {

    String firstName;
    String lastName;
    String id;
    String phone;
    String dateOfBirth;
    String gender;
    Boolean terms;

    public User() {

    }

    public User(String firstName, String lastName, String id,
                String phone, String dateOfBirth, String gender, String terms) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.terms = Boolean.valueOf(terms);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getTerms() {
        return terms;
    }

    public void setTerms(Boolean terms) {
        this.terms = Boolean.valueOf(terms);
    }

    @Override
    public String toString() {
        return "\nfirstName - " + firstName +
                "\nlastName - " + lastName +
                "\nPersonal id - '" + id + '\'' +
                "\nphone - " + phone + '\'' +
                "\ngender - " + gender + '\'' +
                "\nterms - " + terms;
    }


}
