ARG JIRA_IMAGE
FROM $JIRA_IMAGE

RUN mkdir /var/atlassian/application-data/shared && \
    chown jira:jira /var/atlassian/application-data/shared
