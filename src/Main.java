import java.util.Date;

public class Main {

    public Worker createWorker(String classification, String firstName, String lastName,
                               Date birthday, String phone, double salary) {
        Worker worker = new Worker();

        worker.setClassification(classification);
        worker.setFirstName(firstName);
        worker.setLastName(lastName);
        worker.setBirthday(birthday);
        worker.setPhone(phone);
        worker.setSalary(salary);

        return worker;


    }




}
