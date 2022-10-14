import com.onresolve.jira.groovy.user.FormField
import static com.atlassian.jira.issue.IssueFieldConstants.*

trait ClassA {
    @Lazy FormField issueTypeFF = getFieldById(ISSUE_TYPE)
}