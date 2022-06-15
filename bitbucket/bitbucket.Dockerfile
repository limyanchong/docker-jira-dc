ARG BITBUCKET_IMAGE
FROM $BITBUCKET_IMAGE

RUN mkdir -p /var/atlassian/application-data/bitbucket/shared && \
    chown bitbucket:bitbucket /var/atlassian/application-data/bitbucket/shared
