package sigleton;

public class Profile {
    private static Profile profile;
    private String information;
    private Profile(){}


    public void setInformation(String newInformation) {
        information = newInformation;
    }

    public String getInformation() {
        return information;
    }

    public static Profile getInstance() {
        if (profile == null)
            profile = new Profile();
        return profile;
    }
}
