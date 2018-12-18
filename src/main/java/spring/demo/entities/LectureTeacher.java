package spring.demo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "lecture_teacher")
public class LectureTeacher {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "id_lec", length = 200)
    private Integer id_lec;

    @Column(name = "id_t", length = 200)
    private Integer id_t;

    @Column(name = "room", length = 200)
    private String room;

    @Column(name = "status", length = 200)
    private String status;

    public LectureTeacher(){}

    public LectureTeacher( Integer id_lec, Integer id_t, String room, String status) {

        this.id_lec = id_lec;
        this.id_t = id_t;
        this.room = room;
        this.status = status;
    }

    public int getId_lec_t() {
        return id;
    }

    public void setId_lec_t(int id_lec_t) {
        this.id = id_lec_t;
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

    @Override
    public String toString() {
        return "LectureTeacher{" +
                "id=" + id +
                ", id_lec=" + id_lec +
                ", id_t=" + id_t +
                ", room='" + room + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
