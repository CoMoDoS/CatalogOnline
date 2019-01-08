package spring.demo.dto;

public class Users {
    private int id;
    private String name;
    private String tel;
    private String pass;
    private int stud;
    private int te;
    private String status;

    public Users(){}

    public Users(int id, String name, String tel, String pass, int stud, int te, String status) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.pass = pass;
        this.stud = stud;
        this.te = te;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getStud() {
        return stud;
    }

    public void setStud(int stud) {
        this.stud = stud;
    }

    public int getTe() {
        return te;
    }

    public void setTe(int te) {
        this.te = te;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", pass='" + pass + '\'' +
                ", stud=" + stud +
                ", te=" + te +
                ", status='" + status + '\'' +
                '}';
    }
}
