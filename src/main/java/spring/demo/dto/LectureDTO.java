package spring.demo.dto;

public class LectureDTO {


    private int id_lecture;
    private int id_subject;
    private String hour;
    private String day;
    private String status;

    public LectureDTO(){}

    public LectureDTO(int id_lecture, int id_subject, String hour, String day, String status) {
        this.id_lecture = id_lecture;
        this.id_subject = id_subject;
        this.hour = hour;
        this.day = day;
        this.status = status;
    }

    public int getId_lecture() {
        return id_lecture;
    }

    public void setId_lecture(int id_lecture) {
        this.id_lecture = id_lecture;
    }

    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder {
        private int nestid_lecture;
        private int nestid_subject;
        private String nesthour;
        private String nestday;
        private String neststatus;

        public Builder id_lecture(int id){
            this.nestid_lecture = id;
            return this;
        }

        public Builder id_subject(int id){
            this.nestid_subject = id;
            return this;
        }

        public Builder hour(String id){
            this.nesthour = id;
            return this;
        }

        public Builder day(String id){
            this.nestday = id;
            return this;
        }

        public Builder status(String id){
            this.neststatus = id;
            return this;
        }

        public LectureDTO create(){
            return new LectureDTO(nestid_lecture,nestid_subject,nesthour,nestday,neststatus);
        }
    }
}
