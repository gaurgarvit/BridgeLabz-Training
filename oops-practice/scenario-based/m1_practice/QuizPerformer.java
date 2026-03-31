import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student{
    String studentName;
    String department;
    int quiz1;
    int quiz2;
    int quiz3;

    public Student(String studentName, String department, int quiz1, int quiz2, int quiz3){
        this.studentName= studentName;
        this.department= department;
        this.quiz1= quiz1;
        this.quiz2= quiz2;
        this.quiz3= quiz3;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getDepartment(){
        return department;
    }

    public int getQuiz1(){
        return quiz1;
    }

    public int getQuiz2(){
        return quiz2;
    }

    public int getQuiz3() {
        return quiz3;
    }
}

class StudentManager{
    List<Student> students= new ArrayList<>();

    public void addStudents(String studentName, String department, int quiz1, int quiz2, int quiz3, StringBuilder sb){
        Student st= new Student(studentName,department,quiz1,quiz2,quiz3);
        students.add(st);
        sb.append("Record Added: ").append(st.studentName).append("\n");
    }

    public void TopStudentsByDepartment(String department, StringBuilder sb){
        if(students.isEmpty()){
            sb.append("No Records Available").append("\n");
            return;
        }

        Map<String, Integer> map= new LinkedHashMap<>();
        int max= 0;
        boolean flag= false;

        for(Student x: students){
            if(x.department.equals(department)){
                flag= true;
                int total= x.quiz1+ x.quiz2+ x.quiz3;
                max= Math.max(max, total);
                map.put(x.studentName, total);
            }
        }

        if(!flag){
            sb.append("Department Not Found").append("\n");
            return;
        }

        for(Map.Entry<String, Integer> x: map.entrySet()){
            if(x.getValue()==max){
                sb.append(x.getKey()).append(" ").append(x.getValue()).append("\n");
            }
        }
    }

    public void getTopStudentsByQuizName(String quizName,StringBuilder sb){
        if(students.isEmpty()){
            sb.append("No Records Available").append("\n");
            return;
        }

        if(quizName.equals("Q1")){
            int max= 0;

            for(Student x: students){
                if(x.getQuiz1()>max){
                    max= x.getQuiz1();
                }
            }

            for(Student x: students){
                if(x.getQuiz1()==max){
                    sb.append(x.getStudentName()).append(" ").append(x.getQuiz1()).append("\n");
                }
            }
        }
        else if(quizName.equals("Q2")){
            int max= 0;
            for(Student x: students){
                if(x.getQuiz2()>max){
                    max= x.getQuiz2();
                }
            }

            for(Student x: students){
                if(x.getQuiz2()==max){
                    sb.append(x.getStudentName()).append(" ").append(x.getQuiz2()).append("\n");
                }
            }
        }
        else{
            int max= 0;
            for(Student x: students){
                if(x.getQuiz3()>max){
                    max= x.getQuiz3();
                }
            }

            for(Student x: students){
                if(x.getQuiz3()==max){
                    sb.append(x.getStudentName()).append(" ").append(x.getQuiz3()).append("\n");
                }
            }
        }
    }
}

public class QuizPerformer {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();

        StudentManager manager= new StudentManager();
        StringBuilder sb= new StringBuilder();

        while (t-->0){
            String input= s.nextLine();
            String[] parts= input.trim().split("\\s");

            if(parts[0].equals("Record")){
                manager.addStudents(
                        parts[1],
                        parts[2],
                        Integer.parseInt(parts[3]),
                        Integer.parseInt(parts[4]),
                        Integer.parseInt(parts[5]),
                        sb
                );
            }
            else{
                if(parts[1].startsWith("Q")){
                    manager.getTopStudentsByQuizName(parts[1],sb);
                }
                else{
                    manager.TopStudentsByDepartment(parts[1],sb);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
