package MVCDemo;

public class MVCDemo {

  public static void main(String[] args) {

      //test
      Student model  = retriveStudentFromDatabase();

      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      controller.setStudentName("John");

      controller.updateView();
      
      controller.setStudentName("Mike");
      
      controller.updateView();
      
      Student newStudent = new Student();
      newStudent.setName("Josh");
      newStudent.setRollNo("20");
      
      controller.setNewStudent(newStudent);
      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
    
}

