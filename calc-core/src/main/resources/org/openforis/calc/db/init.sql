CREATE USER "calc" WITH PASSWORD 'calc';

CREATE DATABASE calc ENCODING 'UTF8' OWNER calc;

\connect calc;

CREATE SCHEMA calc;
ALTER SCHEMA calc OWNER TO calc;