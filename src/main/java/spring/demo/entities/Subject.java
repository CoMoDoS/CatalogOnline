package spring.demo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "subject")
public class Subject {
//    private static final long serialVersionUID = 12L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name", length = 200)
    private String name;
    @Column(name = "credits", length = 200)
    private Integer credits;
    @Column(name = "status", length = 200)
    private String status;

    public Subject(){}

    public Subject(Integer id, String name, Integer credits, String status) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.status = status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Subject{" +
                "id_subject=" + id +
                ", name='" + name +
                ", credits=" + credits +
                ", status='" + status +
                '}';
    }
}
