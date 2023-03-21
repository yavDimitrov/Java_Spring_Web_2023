package bg.softuni.mobileleGO.model.dto;

public class UserRegisterDTO {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private String confirmedPassword;

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public UserRegisterDTO setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
        return this;
    }

    @Override
    public String toString() {
        return "UserRegisterDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='"  + (password != null ? "[PROVIDED]" : null) + '\''+
                ", confirmedPassword='" + (confirmedPassword != null ? "[PROVIDED]" : null) + '\'' +
                '}';
    }
}
