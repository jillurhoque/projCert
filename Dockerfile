FROM devopsedu/webapp
MAINTAINER Jillur Hoque
ADD projCert /var/www/html
RUN rm /var/www/html/index.html
CMD apachectl -D FOREGROUND

