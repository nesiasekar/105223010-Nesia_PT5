class Person {
    private String name;
    private int age;

    //pada bagian class tidak ada kesalahan 
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        super(n, a); // Memanggil konstruktor Person
        salary = s;
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
    //pada showSlary() tadinya yang sout nya diakhiri dengan koma, sudah dibenarkan jadim menggunakan titik koma
}

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Jake", 23, 50000000.0); // Perbaikan format angka
        emp.display();
        emp.showSalary();
    }
    //Menambahkan pemanggilan showSalary() agar gaji juga tercetak.
}
