package entities;

public class Contest {
    private Integer number;
    private String status;

    public Contest(Integer number, String status) {
        this.number = number;
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
