import com.atlassian.jira.component.ComponentAccessor

def issue = ComponentAccessor.issueManager.getIssueByCurrentKey("SS-3")
log.warn "This is a test log from console"