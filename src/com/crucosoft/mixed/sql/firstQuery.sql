-- POSTGRESQL
-- DROP DATABASE java_backend_course;
-- CREATE DATABASE java_backend_course;

CREATE TABLE IF NOT EXISTS teachers(
    ID          SERIAL NOT NULL,
    NAME        VARCHAR NOT NULL,
    SURNAME     VARCHAR NOT NULL,
    COURSE_ID   INT NOT NULL,

    PRIMARY KEY(ID)
);

CREATE TABLE IF NOT EXISTS students(
    ID              SERIAL NOT NULL,
    NAME            VARCHAR NOT NULL,
    SURNAME         VARCHAR NOT NULL,
    PHONE           VARCHAR,
    EMAIL           VARCHAR,
    BIRTHDATE       DATE,
    COURSE_ID       INT,
    TEACHER_ID      INT,
    ASSIGNMENT_ID   INT,

    PRIMARY KEY(ID)
);

CREATE TABLE IF NOT EXISTS assignments(
    ID          SERIAL NOT NULL,
    NAME        VARCHAR NOT NULL,
    COURSE_ID   INT,

    PRIMARY KEY(ID)
);

CREATE TABLE IF NOT EXISTS courses(
    ID          SERIAL NOT NULL,
    NAME        VARCHAR NOT NULL,

    PRIMARY KEY(ID)
);

