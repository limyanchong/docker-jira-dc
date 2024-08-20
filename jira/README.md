Setup Jira Data Center cluster with 2 nodes. Tested on macOS.

Based on:
- [Set up a PostgreSQL server and pgAdmin with Docker](https://linuxhint.com/postgresql_docker/).
- repo: [codeclou/docker-atlassian-jira-data-center](https://github.com/codeclou/docker-atlassian-jira-data-center)
- video: [Load Balancing and Sticky Sessions With Docker and Apache](https://youtu.be/6gDW56dS8nU).

# TL; DR
1. Clone my repo containing all files needed, then `cd` into it the `jira` directory:
```
git clone https://github.com/maxlim33/docker-atlassian-dc.git
cd docker-atlassian-dc/jira
```

2. Change versions as needed in .env file:
```
HAPROXY_IMAGE=haproxy:2.2.32
POSTGRES_IMAGE=postgres:14.7
PGADMIN_IMAGE=dpage/pgadmin4:8.2
JIRA_IMAGE=atlassian/jira-software:9.12.12
```

3. Start the cluster and stop node2:
```
docker compose up -d --build && docker stop jira_node2
```
Set up Jira with demo licenses.

4. Start node2 back via Docker Desktop GUI or use command:
```
docker start jira_node2
```

5. Stop, start, down (stop and delete) containers and the network, and delete volumes with:
```
docker compose stop
docker compose start
docker compose down
docker compose down -v # Also remove created volumes, all data will be lost.
```