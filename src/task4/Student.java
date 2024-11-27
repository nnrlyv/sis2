package task4;

public class Student {
    private int id;
    private String name;
    private String group;
    private double currentScholarship;
    private double gpa;
    private String faculty;
    private double newScholarship;

    public Student(int id, String name, String group, double currentScholarship, double gpa, String faculty, double newScholarship) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.currentScholarship = currentScholarship;
        this.gpa = gpa;
        this.faculty = faculty;
        this.newScholarship = newScholarship;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public double getCurrentScholarship() {
        return currentScholarship;
    }

    public double getGpa() {
        return gpa;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getNewScholarship() {
        return newScholarship;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", currentScholarship=" + currentScholarship +
                ", gpa=" + gpa +
                ", faculty='" + faculty + '\'' +
                ", newScholarship=" + newScholarship +
                '}';
    }
}

