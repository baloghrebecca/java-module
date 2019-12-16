package academy.everyonecodes.java.week2.set1.exercise1;

public class Student {

    private String name;
    private String peerProgrammer;

    public Student(String name, String peerProgrammer) {
        this.name = name;
        this.peerProgrammer = peerProgrammer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeerProgrammer() {
        return peerProgrammer;
    }

    public void setPeerProgrammer(String peerProgrammer) {
        this.peerProgrammer = peerProgrammer;
    }
}
