package spring.demo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "lecture_student")
public class LectureStudent {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "id_lec_t", length = 200)
    private Integer id_lec_t;

    @Column(name = "id_s", length = 200)
    private Integer id_s;

    @Column(name = "status", length = 200)
    private String status;

    public LectureStudent(){}

    public LectureStudent(int id_lec_t, int id_s, String status) {

        this.id_lec_t = id_lec_t;
        this.id_s = id_s;
        this.status = status;
    }

    public int getId_lec_s() {
        return id;
    }

    public void setId_lec_s(int id_lec_s) {
        this.id = id_lec_s;
    }

    public int getId_lec_t() {
        return id_lec_t;
    }

    public void setId_lec_t(int id_lec) {
        this.id_lec_t = id_lec;
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

    @Override
    public String toString() {
        return "LectureStudent{" +
                "id_lec_s=" + id +
                ", id_lec=" + id_lec_t +
                ", id_s=" + id_s +
                ", status='" + status +
                '}';
    }
}
