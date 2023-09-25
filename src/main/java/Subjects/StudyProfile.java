package Subjects;

public enum StudyProfile {
    MEDICINE("Медицина"), PROGRAMMER("Программист"), MECHANIC("Механик");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
