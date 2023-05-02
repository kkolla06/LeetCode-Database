package relationships;

public class CompanyCategorizedProblems {
    private Integer problemNum;
    private String companyName;

    public CompanyCategorizedProblems(Integer problemNum, String companyName) {
        this.problemNum = problemNum;
        this.companyName = companyName;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
