package number_game;

public class Student {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private int marks;
    private String name;
     private String subject;


//     Student(int ID,int Marks,String Name,String subject){
//         this.id=ID;
//         this.marks=Marks;
//         this.subject=subject;
//         this.name=Name;
//     }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
