public class Employee implements Comparable<Employee> {
    public int id;
    public String name;
    public String address;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "Employee [Id=" + id + ", name=" + name + ", address=" + address + "]";
    }

    @Override
        public int compareTo(Employee o){
        return this.id-o.id;
        }
}
