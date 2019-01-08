package spring.demo.dto;

public class StudentSituation {
    private Integer id;
    private String teacherName;
    private String lectureName;
    private Integer lectureCredits;
    private Integer lectureMark;

    public StudentSituation(){}
    public StudentSituation(Integer id, String teacherName, String lectureName, Integer lectureCredits, Integer lectureMark) {
        this.id = id;
        this.teacherName = teacherName;
        this.lectureName = lectureName;
        this.lectureCredits = lectureCredits;
        this.lectureMark = lectureMark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public Integer getLectureCredits() {
        return lectureCredits;
    }

    public void setLectureCredits(Integer lectureCredits) {
        this.lectureCredits = lectureCredits;
    }

    public Integer getLectureMark() {
        return lectureMark;
    }

    public void setLectureMark(Integer lectureMark) {
        this.lectureMark = lectureMark;
    }

    @Override
    public String   toString() {
        return "StudentSituation{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", lectureName='" + lectureName + '\'' +
                ", lectureCredits=" + lectureCredits +
                ", lectureMark=" + lectureMark +
                '}';
    }
}
