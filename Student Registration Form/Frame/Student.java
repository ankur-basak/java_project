package Frame;

public class Student {
    private String name;
    private String id;
    private String email;
    private String phone;
    private String address;
    private String year;
    private String password;
    private String gender;
    private String department;

    public Student(String name, String id, String email, String phone, String address, String year, String password, String gender, String department) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.year = year;
        this.password = password;
        this.gender = gender;
        this.department = department;
    }

    // Getters
    public String getName() { return name; }
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getYear() { return year; }
    public String getPassword() { return password; }
    public String getGender() { return gender; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Email: " + email + ", Phone: " + phone + ", Address: " + address + ", Year: " + year + ", Gender: " + gender + ", Department: " + department;
    }
}