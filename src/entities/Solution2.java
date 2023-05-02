package entities;

public class Solution2 {
    private Integer problemNum;
    private Integer approachNum;
    private String lang;


    public Solution2(Integer problemNum, Integer approachNum, String lang) {
        this.problemNum = problemNum;
        this.approachNum = approachNum;
        this.lang = lang;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public Integer getApproachNum() {
        return approachNum;
    }

    public String getLang() {
        return lang;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }

}
