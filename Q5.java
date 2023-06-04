public class Q5 {
    private String name;
    private String rollNumber;
    private String subject;
    private int marksObtained;
    private int maximumMarks;
    private float percentage;

    public Q5(String name, String rollNumber, String subject, int marksObtained, int maximumMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
        this.marksObtained = marksObtained;
        this.maximumMarks = maximumMarks;
        this.percentage = (float) marksObtained / maximumMarks * 100;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public int getMaximumMarks() {
        return maximumMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "StudentMarksCard{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", subject='" + subject + '\'' +
                ", marksObtained=" + marksObtained +
                ", maximumMarks=" + maximumMarks +
                ", percentage=" + percentage +
                '}';
    }
}
