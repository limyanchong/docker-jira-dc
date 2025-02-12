ARG CONFLUENCE_IMAGE
FROM $CONFLUENCE_IMAGE

RUN mkdir /var/atlassian/application-data/shared && \
    chown confluence:confluence /var/atlassian/application-data/shared
