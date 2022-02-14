
public class Student {

    private String name;
    private int id;
    private double cgpa;

    public void insertRecord(String n, int id, double cgpa) {
      name = n;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void displayRecord() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.insertRecord("Sohan", 12, 3.5);
        x.displayRecord();
    }
}
