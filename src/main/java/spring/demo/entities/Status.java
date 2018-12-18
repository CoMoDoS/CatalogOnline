package spring.demo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "id_lec_t", length = 200)
    private Integer id_lec_t;

    @Column(name = "mark", length = 200)
    private Integer mark;

    @Column(name = "status", length = 200)
    private String status;

    public Status(){}

    public Status( Integer id_lec_t, Integer mark, String status) {

        this.id_lec_t = id_lec_t;
        this.mark = mark;
        this.status = status;
    }

    public Integer getId_status() {
        return id;
    }

    public void setId_status(Integer id_status) {
        this.id = id_status;
    }

    public int getId_lec_t() {
        return id_lec_t;
    }

    public void setId_lec_t(Integer id_lec_t) {
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

    @Override
    public String toString() {
        return "StatusDTO{" +
                "id_status=" + id +
                ", id_lec_t=" + id_lec_t +
                ", mark=" + mark +
                ", status='" + status +
                '}';
    }
}
