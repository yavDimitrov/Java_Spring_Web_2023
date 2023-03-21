package bg.softuni.mobileleGO.model.dto;

public class UserLoginDTO {

    private String email;
    private String password;


    public UserLoginDTO(String username, String password) {
        this.email = username;
        this.password = password;
    }

    public String getUsername() {
        return email;
    }

    public UserLoginDTO setUsername(String username) {
        this.email = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLoginDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String
    toString() {
        return "UserLoginDTO{" +
                "username='" + email + '\'' +
                ", password='" + (password != null ? "[PROVIDED]" : null) + '\'' +
                '}';
    }
}
