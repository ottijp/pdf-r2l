FROM adoptopenjdk:11-jre-hotspot
LABEL maintainer "Satoshi SAKAO <ottijp@users.noreply.github.com>"

WORKDIR /work
COPY build/install/pdf-r2l /opt/pdf-r2l

ENV PATH $PATH:/opt/pdf-r2l/bin

CMD ["pdf-r2l"]
