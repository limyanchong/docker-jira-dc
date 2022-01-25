ARG HAPROXY_IMAGE
FROM $HAPROXY_IMAGE

COPY haproxy.cfg /usr/local/etc/haproxy/haproxy.cfg
