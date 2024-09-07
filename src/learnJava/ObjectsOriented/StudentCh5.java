package learnJava.ObjectsOriented;

class Subject {
    // read only
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public String toString() {
        return "Subject [subId=" + subId + ", name=" + name + ", maxMarks=" + maxMarks + ", marksObtain=" + marksObtain
                + "]";
    }
}

// toString

public class StudentCh5 {
    public static void main(String[] args) {

        Subject[] subs = new Subject[3];

        subs[0] = new Subject("101", "Hindi", 90);
        subs[1] = new Subject("102", "English", 90);
        subs[2] = new Subject("103", "Maths", 90);

        for (Subject subject : subs) {
            System.out.println(subject);
        }

    }
}
