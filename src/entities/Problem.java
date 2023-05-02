package entities;

public class Problem {
    private Integer problemNum;
    private String title;
    private Float acceptance;
    private String difficulty;

    public Problem(Integer problemNum, String title, Float acceptance, String difficulty) {
        this.problemNum = problemNum;
        this.title = title;
        this.acceptance = acceptance;
        this.difficulty = difficulty;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public String getTitle() {
        return title;
    }

    public Float getAcceptance() {
        return acceptance;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAcceptance(Float acceptance) {
        this.acceptance = acceptance;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
