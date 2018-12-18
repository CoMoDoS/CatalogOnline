package spring.demo.dto;

public class LectureTeacherDTO {

    private int id_lec_t;
    private int id_lec;
    private int id_t;
    private String room;
    private String status;

    public LectureTeacherDTO(){}

    public LectureTeacherDTO(int id_lec_t, int id_lec, int id_t, String room, String status) {
        this.id_lec_t = id_lec_t;
        this.id_lec = id_lec;
        this.id_t = id_t;
        this.room = room;
        this.status = status;
    }

    public int getId_lec_t() {
        return id_lec_t;
    }

    public void setId_lec_t(int id_lec_t) {
        this.id_lec_t = id_lec_t;
    }

    public int getId_lec() {
        return id_lec;
    }

    public void setId_lec(int id_lec) {
        this.id_lec = id_lec;
    }

    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder{
        private int nestid_lec_t;
        private int nestid_lec;
        private int nestid_t;
        private String nestroom;
        private String neststatus;

        public Builder id_lec_t(int id) {
            this.nestid_lec_t = id;
            return this;
        }

        public Builder id_lec(int id) {
            this.nestid_lec = id;
            return this;
        }

        public Builder id_t(int id) {
            this.nestid_t = id;
            return this;
        }

        public Builder room(String id) {
            this.nestroom = id;
            return this;
        }

        public Builder status(String id) {
            this.neststatus = id;
            return this;
        }

        public LectureTeacherDTO create() {
            return new LectureTeacherDTO(nestid_lec_t,nestid_lec,nestid_t,nestroom,neststatus);
        }
    }
}
