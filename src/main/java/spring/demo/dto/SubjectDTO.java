package spring.demo.dto;

public class SubjectDTO {

    private int id_subject;
    private String name;
    private int credits;
    private String status;

    public SubjectDTO(){}

    public SubjectDTO(int id_subject, String name, int credits, String status) {
        this.id_subject = id_subject;
        this.name = name;
        this.credits = credits;
        this.status = status;
    }

    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder{
        private int nestid_subject;
        private String nestname;
        private int nestcredits;
        private String neststatus;

        public Builder id_subject(int id) {
            this.nestid_subject = id;
            return this;
        }

        public Builder name(String id) {
            this.nestname = id;
            return this;
        }

        public Builder credits(int id) {
            this.nestcredits = id;
            return this;
        }

        public Builder status(String id) {
            this.neststatus = id;
            return this;
        }

        public SubjectDTO create(){
            return new SubjectDTO(nestid_subject,nestname,nestcredits,neststatus);
        }
    }
}
