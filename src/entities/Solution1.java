package entities;

public class Solution1 {
    private Integer problemNum;
    private Integer approachNum;
    private String title;

    public Solution1(Integer problemNum, Integer approachNum, String title) {
        this.problemNum = problemNum;
        this.approachNum = approachNum;
        this.title = title;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public Integer getApproachNum() {
        return approachNum;
    }

    public String getTitle() {
        return title;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }

    public void setApproachNum(Integer approachNum) {
        this.approachNum = approachNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
