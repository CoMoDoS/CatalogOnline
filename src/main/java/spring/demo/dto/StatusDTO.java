package spring.demo.dto;

public class StatusDTO {

    private int id_status;
    private int id_lec_t;
    private int mark;
    private String status;

    public StatusDTO(){}

    public StatusDTO(int id_status, int id_lec_t, int mark, String status) {
        this.id_status = id_status;
        this.id_lec_t = id_lec_t;
        this.mark = mark;
        this.status = status;
    }

    public int getId_status() {
        return id_status;
    }

    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

    public int getId_lec_t() {
        return id_lec_t;
    }

    public void setId_lec_t(int id_lec_t) {
        this.id_lec_t = id_lec_t;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder{
        private int nestid_status;
        private int nestid_lec_t;
        private int nestmark;
        private String neststatus;

        public Builder id_status(int id) {
            this.nestid_status = id;
            return this;
        }

        public Builder id_lec_t(int id) {
            this.nestid_lec_t = id;
            return this;
        }

        public Builder mark(int id) {
            this.nestmark = id;
            return this;
        }

        public Builder status(String id) {
            this.neststatus = id;
            return this;
        }

        public StatusDTO create(){
            return new StatusDTO(nestid_status,nestid_lec_t,nestmark,neststatus);
        }

    }
}
