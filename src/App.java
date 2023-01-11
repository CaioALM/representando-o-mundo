public class App {
    public static void main(String[] args) throws Exception {
        
        User user = new User();
        Subject subject = new Subject();

        //cadastrar novo usuário com endereço
        user.name = "Josh";
        user.age = 25;
        user.address.city = "Volta Redonda";
        user.address.number = 546;
        user.address.state = "Rio de Janeiro";
        user.address.street = "Visconde de Entre Rios";
        user.address.district = "Centro";
        user.setEmail("teste@email.com");
        user.setPassword("123456789");
        user.setCpf("123.123.123-12");

        System.out.println(user.getEmail());
        
        //cadastrar nova materia no respondeAi
        subject.name = "Eletricidade Aplicada";
        subject.setHoursOfClasses(30);

        //testar se já foi pago
        subject.setStudentOnClass(user.getPaymment());

        //estudante pagou a mensalidade
        user.setPaymment();
        subject.setStudentOnClass(user.getPaymment());

        //pegar o endereço completo 
        System.out.println(user.address.getFullAddress());


        //adicionando horas de estudos na materia
        System.out.println(user.getStudyHours());
        user.setStudyHours(subject.getHoursOfClasses());
        System.out.println(user.getStudyHours());

        //verifica quantos alunos tem na matéria
        System.out.println(subject.getQuantityOfStudents());


        
    }
}
