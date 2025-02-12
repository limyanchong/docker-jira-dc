import groovy.transform.BaseScript
import static com.atlassian.jira.issue.IssueFieldConstants.*

// If you comment out this line, the script will work as expected
@BaseScript ClassB classB

def storyIssueType = issueContext.projectObject.issueTypes.findAll {it.name == "Story"} as Iterable
log.warn "issue types are found: " + storyIssueType
getFieldById(ISSUE_TYPE).setFieldOptions(storyIssueType)