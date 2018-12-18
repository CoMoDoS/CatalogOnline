package spring.demo.dto;

public class LectureStudentDTO {

    private int id_lec_s;
    private int id_lec;
    private int id_s;
    private String status;

    public LectureStudentDTO(){}

    public LectureStudentDTO(int id_lec_s, int id_lec, int id_s, String status) {
        this.id_lec_s = id_lec_s;
        this.id_lec = id_lec;
        this.id_s = id_s;
        this.status = status;
    }

    public int getId_lec_s() {
        return id_lec_s;
    }

    public void setId_lec_s(int id_lec_s) {
        this.id_lec_s = id_lec_s;
    }

    public int getId_lec() {
        return id_lec;
    }

    public void setId_lec(int id_lec) {
        this.id_lec = id_lec;
    }

    public int getId_s() {
        return id_s;
    }

    public void setId_s(int id_s) {
        this.id_s = id_s;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder{
        private int nestid_lec_s;
        private int nestid_lec;
        private int nestid_s;
        private String neststatus;

        public Builder id_lec_s(int id) {
            this.nestid_lec_s = id;
            return this;
        }
        public Builder id_lec(int id) {
            this.nestid_lec = id;
            return this;
        }
        public Builder id_s(int id) {
            this.nestid_s = id;
            return this;
        }
        public Builder status(String id) {
            this.neststatus = id;
            return this;
        }

        public LectureStudentDTO create(){
            return new LectureStudentDTO(nestid_lec_s,nestid_lec,nestid_s,neststatus);
        }
    }
}
