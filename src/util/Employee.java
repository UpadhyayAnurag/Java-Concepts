package util;

public class Employee {

    private int id;
    private String name;
    private String department;
    private String designation;
    private double salary;
    private int age;
    private int experience;
    private boolean active;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String name, String department,
                    String designation, double salary,
                    int age, int experience, boolean active) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
        this.active = active;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public String toString() {
        return "Util.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", experience=" + experience +
                ", active=" + active +
                '}';
    }
}
