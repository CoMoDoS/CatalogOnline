package spring.demo.dto;

public class TeacherSituation {
    private Integer id;
    private String studentName;
    private String lectureName;
    private Integer lectureCredits;
    private Integer lectureMark;
    private Integer idLecT;

    public TeacherSituation(){}
    public TeacherSituation(Integer id, String teacherName, String lectureName, Integer lectureCredits, Integer lectureMark,Integer idLecT) {
        this.id = id;
        this.studentName = teacherName;
        this.lectureName = lectureName;
        this.lectureCredits = lectureCredits;
        this.lectureMark = lectureMark;
        this.idLecT = idLecT;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String teacherName) {
        this.studentName = teacherName;
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

    public Integer getIdLecT() {
        return idLecT;
    }

    public void setIdLecT(Integer idLecT) {
        this.idLecT = idLecT;
    }

    @Override
    public String toString() {
        return "TeacherSituation{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", lectureName='" + lectureName + '\'' +
                ", lectureCredits=" + lectureCredits +
                ", lectureMark=" + lectureMark +
                ", idLecT=" + idLecT +
                '}';
    }
}
