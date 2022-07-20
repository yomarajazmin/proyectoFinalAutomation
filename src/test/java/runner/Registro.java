package runner;

public class Registro {
    private String name;
    private String phone;
    private String address;
    private String ci;
    private String email;
    private String password;

    public Registro(){}

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCi() {
        return ci;
    }

    public Registro setName(String name) {
        this.name = name;
        return this;
    }

    public Registro setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Registro setAddress(String address) {
        this.address = address;
        return this;
    }

    public Registro setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public Registro setEmail(String email) {
        this.email = email;
        return this;
    }

    public Registro setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
