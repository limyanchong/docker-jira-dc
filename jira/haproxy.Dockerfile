ARG HAPROXY_IMAGE
FROM $HAPROXY_IMAGE

COPY haproxy.cfg /usr/local/etc/haproxy/haproxy.cfg
COPY localhost.pem /usr/local/etc/haproxy/localhost.pem
COPY localhost-key.pem /usr/local/etc/haproxy/localhost.pem.key
