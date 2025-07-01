FROM postgres:16

LABEL maintainer="lucasrodriguesestefano"

COPY init.sql /docker-entrypoint-initdb.d/init.sql
