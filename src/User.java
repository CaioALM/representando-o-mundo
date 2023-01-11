public class User {
    
    String name;
    int age;
    private boolean confirmedPayment = false;
    Address address = new Address();
    private String email;
    private String cpf;
    private String password;
    private int studyHours;
    
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean getPaymment() {
        return this.confirmedPayment;
    }
    public void setPaymment() {
        this.confirmedPayment = true;
        System.out.println("Payment has been confirmed");
    }
    public int getStudyHours() {
      return this.studyHours;
    }
    public void setStudyHours(int hoursOfClasses) {
        this.studyHours += 1;
        String s;
        if (this.studyHours == 1) {
            s = "";
        } else {
            s = "s";
        }
        System.out.println("Keep on learning, now you have study for: "+this.studyHours+ " hour"+s+"!");
        if(this.studyHours == hoursOfClasses){
            System.out.println("Congratulations, you have finished this subject!");
        }
    }
    
}
