package sigleton;

public class App {
    public static void main(String[] args) {
        Profile prof = Profile.getInstance();
        prof.setInformation("Anastasiia");
        //like exit
        Profile prof1 = Profile.getInstance();
        System.out.println(prof1.getInformation());

    }
}
