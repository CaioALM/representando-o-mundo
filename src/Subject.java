public class Subject {
    String name;
    private int  hourOfClasses;
    private int students;

    public void setStudentOnClass(boolean confirmedPayment) {
        if (confirmedPayment == true){
            this.students += 1;
            System.out.println("Successfully registered student");
        } else {
            System.out.println("Student not allowed to be on  class");
        }
        
    }
    public void setStudentOffClass() {
        this.students -= 1;
    }
    public int getQuantityOfStudents() {
        return this.students;
    }
    public void setHoursOfClasses(int hour) {
        this.hourOfClasses = hour;
    }
    public int getHoursOfClasses() {
        return this.hourOfClasses;
    }

}
