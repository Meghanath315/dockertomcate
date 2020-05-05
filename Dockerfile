FROM tomcat:8

MAINTAINER 1804megh@gmail.com

CMD mkdir /usr/local/tomcat/webapps/mytomcat

COPY ./index.html /usr/local/tomcat/webapps/mytomcat/

EXPOSE 8081
CMD /usr/local/tomcat/bin/startup.sh run
