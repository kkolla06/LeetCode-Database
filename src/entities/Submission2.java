package entities;

public class Submission2 {
    private String submissionId;
    private String lang;
    private String status;
    private Float runtime;
    private Float memory;
    private Integer problemNum;
    private String userName;
    private String timeSubmitted; // convert string to timestamp

    public Submission2(String submissionId, String lang, String status, Float runtime, Float memory, Integer problemNum, String userName, String timeSubmitted) {
        this.submissionId = submissionId;
        this.lang = lang;
        this.status = status;
        this.runtime = runtime;
        this.memory = memory;
        this.problemNum = problemNum;
        this.userName = userName;
        this.timeSubmitted = timeSubmitted;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public String getLang() {
        return lang;
    }

    public String getStatus() {
        return status;
    }

    public Float getRuntime() {
        return runtime;
    }

    public Float getMemory() {
        return memory;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public String getUserName() {
        return userName;
    }

    public String getTimeSubmitted() {
        return timeSubmitted;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRuntime(Float runtime) {
        this.runtime = runtime;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTimeSubmitted(String timeSubmitted) {
        this.timeSubmitted = timeSubmitted;
    }
}
