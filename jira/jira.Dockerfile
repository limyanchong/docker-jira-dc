ARG JIRA_IMAGE
FROM $JIRA_IMAGE

RUN mkdir /var/atlassian/application-data/shared && \
    chown jira:jira /var/atlassian/application-data/shared && \
    echo "jira.websudo.is.disabled = true" >> /var/atlassian/application-data/jira/jira-config.properties
