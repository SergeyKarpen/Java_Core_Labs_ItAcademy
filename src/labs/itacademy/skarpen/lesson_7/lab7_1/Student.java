package labs.itacademy.skarpen.lesson_7.lab7_1;

public class Student {
    private String StudentName;
    private int account;


    public Student(String studentName, int account) {
        StudentName = studentName;
        this.account = account;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

}




