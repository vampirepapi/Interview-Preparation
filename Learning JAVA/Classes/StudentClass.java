package Classes;

public class StudentClass {
    //properties involved for student 
    public int rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;

    //behaviours involved for student
    public long total(){
        return m1+m2+m3;
    }

    public float average(){
        return total()/2;
    }

    public char grade(){
        if (average()>60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    public static void main(String[] args) {
        StudentClass student = new StudentClass();
        student.rollNo = 44;
        student.name = "Shubham";
        student.course = "Btech";
        student.m1 = 10;
        student.m2 = 8;
        student.m3 = 7;
        System.out.println(student.total());
        System.out.println(student.average());
        System.out.println(student.grade());

    }
}
