package spring.demo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "lecture")
public class Lecture {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="subject", nullable = false)
//    private Subject subject;
    @Column(name = "id_subject", length = 200) // TO DO
    private Integer id_subject;

    @Column(name = "hour", length = 200)
    private String hour;

    @Column(name = "day", length = 200)
    private String day;

    @Column(name = "status", length = 200)
    private String status;

    public Lecture(){}

    public Lecture(Integer id_subject, String hour, String day, String status) {
//        this.subject = subject;
        this.id_subject = id_subject;
        this.hour = hour;
        this.day = day;
        this.status = status;
    }


    public int getId_lecture() {
        return id;
    }

    public void setId_lecture(int id_lecture) {
        this.id= id_lecture;
    }

    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }


//    public Subject getSubject() {
//        return subject;
//    }
//
//    public void setSubject(Subject subject) {
//        this.subject = subject;
//    }

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

    @Override
    public String toString() {
        return "Lecture{" +
                "id_lecture=" + id +
                ", id_subject=" + id_subject+
                ", hour='" + hour +
                ", day='" + day +
                ", status='" + status +
                '}';
    }
}
