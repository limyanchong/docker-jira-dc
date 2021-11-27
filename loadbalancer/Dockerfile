FROM httpd:2.4.51-alpine
 
COPY proxy.conf /usr/local/apache2/conf/proxy.conf
COPY virtual-host.conf /usr/local/apache2/conf/virtual-host.conf
 
RUN echo "Include /usr/local/apache2/conf/proxy.conf" >> /usr/local/apache2/conf/httpd.conf && \
    echo "Include /usr/local/apache2/conf/virtual-host.conf" >> /usr/local/apache2/conf/httpd.conf
