package entities;

public class Submission1 {
    private Float runtime;
    private String status;

    public Submission1(Float runtime, String status) {
        this.runtime = runtime;
        this.status = status;
    }

    public Float getRuntime() {
        return runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setRuntime(Float runtime) {
        this.runtime = runtime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
