package visitor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            if(i%2 == 0){
                patients.add(new Child("Mike", 4));
            } else{
                patients.add(new Adult("Nick", 26));
            }
        }
        Doctor doctor = new Doctor();
        for(Patient patient: patients){
            patient.getVaccinated(doctor);
        }
        
    }
}
