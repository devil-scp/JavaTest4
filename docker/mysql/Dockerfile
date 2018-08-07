FROM registry.saas.hand-china.com/tools/mysql:5.7.17
COPY sakila-schema.sql /docker-entrypoint-initdb.d/01.sakila-schema.sql
COPY sakila-data.sql /docker-entrypoint-initdb.d/02.sakila-data.sql