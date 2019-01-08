package spring.demo.dto;

public class Lesons {
    private int lID;
    private int sID;
    private int tID;
    private int ltID;
    private String subject;
    private String day;
    private String hour;
    private String teacher;

    public Lesons(){}

    public Lesons(int lID, int sID, int tID, int ltID, String subject, String day, String hour, String teacher) {
        this.lID = lID;
        this.sID = sID;
        this.tID = tID;
        this.ltID = ltID;
        this.subject = subject;
        this.day = day;
        this.hour = hour;
        this.teacher = teacher;
    }

    public int getLtID() {
        return ltID;
    }

    public void setLtID(int ltID) {
        this.ltID = ltID;
    }

    public int gettID() {
        return tID;
    }

    public void settID(int tID) {
        this.tID = tID;
    }

    public int getlID() {
        return lID;
    }

    public void setlID(int lID) {
        this.lID = lID;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lesons{" +
                "lID=" + lID +
                ", sID=" + sID +
                ", tID=" + tID +
                ", ltID=" + ltID +
                ", subject='" + subject + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
