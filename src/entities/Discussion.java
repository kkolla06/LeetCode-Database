package entities;

import oracle.sql.TIMESTAMP;

public class Discussion {
    private Integer discussionId;
    private String submissionTime;// convert this to timestamp using helper ?
    private Integer upvotes;
    private Integer viewsNum;
    private String memberUsername;
    private Integer problemNum;


    public Discussion(Integer discussionId, String submissionTime, Integer upvotes, Integer viewsNum, String memberUsername, Integer problemNum) {
        this.discussionId = discussionId;
        this.submissionTime = submissionTime;
        this.upvotes = upvotes;
        this.viewsNum = viewsNum;
        this.memberUsername = memberUsername;
        this.problemNum = problemNum;
    }

    public Integer getDiscussionId() {
        return discussionId;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public Integer getViewsNum() {
        return viewsNum;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public Integer getProblemNum() {
        return problemNum;
    }

    public void setDiscussionId(Integer discussionId) {
        this.discussionId = discussionId;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public void setViewsNum(Integer viewsNum) {
        this.viewsNum = viewsNum;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
    }
}
