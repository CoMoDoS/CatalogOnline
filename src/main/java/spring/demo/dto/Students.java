package spring.demo.dto;

public class Students {
    private String sName;
    private String subject;
    private int mark;
    private String tName;
    private int sID;
    private int ltID;
    private int lID;

    public Students(){}

    public Students(String sName, String subject, int mark, String tName, int sID, int ltID, int lID) {
        this.sName = sName;
        this.subject = subject;
        this.mark = mark;
        this.tName = tName;
        this.sID = sID;
        this.ltID = ltID;
        this.lID = lID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getLtID() {
        return ltID;
    }

    public void setLtID(int ltID) {
        this.ltID = ltID;
    }

    public int getlID() {
        return lID;
    }

    public void setlID(int lID) {
        this.lID = lID;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sName='" + sName + '\'' +
                ", subject='" + subject + '\'' +
                ", mark=" + mark +
                ", tName='" + tName + '\'' +
                ", sID=" + sID +
                ", ltID=" + ltID +
                ", lID=" + lID +
                '}';
    }
}
