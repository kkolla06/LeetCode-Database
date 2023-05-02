package relationships;

public class TopicTaggedProblems {
    private Integer problemNum;
    private String topicName;

    public TopicTaggedProblems(Integer problemNum, String topicName) {
        this.problemNum = problemNum;
        this.topicName = topicName;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
