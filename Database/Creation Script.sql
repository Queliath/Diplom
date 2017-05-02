-- Sequence: public.em_answer_options_id_seq

-- DROP SEQUENCE public.em_answer_options_id_seq;

CREATE SEQUENCE public.em_answer_options_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.em_answer_options_id_seq
  OWNER TO postgres;

-- Sequence: public.em_employees_id_seq

-- DROP SEQUENCE public.em_employees_id_seq;

CREATE SEQUENCE public.em_employees_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.em_employees_id_seq
  OWNER TO postgres;

-- Sequence: public.em_projects_id_seq

-- DROP SEQUENCE public.em_projects_id_seq;

CREATE SEQUENCE public.em_projects_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.em_projects_id_seq
  OWNER TO postgres;

-- Sequence: public.em_questions_id_seq

-- DROP SEQUENCE public.em_questions_id_seq;

CREATE SEQUENCE public.em_questions_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.em_questions_id_seq
  OWNER TO postgres;

-- Sequence: public.em_test_periods_id_seq

-- DROP SEQUENCE public.em_test_periods_id_seq;

CREATE SEQUENCE public.em_test_periods_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.em_test_periods_id_seq
  OWNER TO postgres;

-- Sequence: public.em_tests_id_seq

-- DROP SEQUENCE public.em_tests_id_seq;

CREATE SEQUENCE public.em_tests_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public.em_tests_id_seq
  OWNER TO postgres;

-- Table: public.em_projects

-- DROP TABLE public.em_projects;

CREATE TABLE public.em_projects
(
  id bigint NOT NULL DEFAULT nextval('em_projects_id_seq'::regclass),
  name character varying(100) NOT NULL,
  CONSTRAINT em_projects_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_projects
  OWNER TO postgres;

-- Table: public.em_employees

-- DROP TABLE public.em_employees;

CREATE TABLE public.em_employees
(
  id bigint NOT NULL DEFAULT nextval('em_employees_id_seq'::regclass),
  first_name character varying(50) NOT NULL,
  last_name character varying(50) NOT NULL,
  birth_date date NOT NULL,
  "position" character varying(50) NOT NULL,
  core_skill character varying(50) NOT NULL,
  project_id bigint NOT NULL,
  CONSTRAINT em_employees_pk PRIMARY KEY (id),
  CONSTRAINT em_employees_fk1 FOREIGN KEY (project_id)
      REFERENCES public.em_projects (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_employees
  OWNER TO postgres;

-- Table: public.em_tests

-- DROP TABLE public.em_tests;

CREATE TABLE public.em_tests
(
  id bigint NOT NULL DEFAULT nextval('em_tests_id_seq'::regclass),
  name character varying(100) NOT NULL,
  fixed_time integer NOT NULL,
  CONSTRAINT em_tests_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_tests
  OWNER TO postgres;

-- Table: public.em_questions

-- DROP TABLE public.em_questions;

CREATE TABLE public.em_questions
(
  id bigint NOT NULL DEFAULT nextval('em_questions_id_seq'::regclass),
  content text NOT NULL,
  test_id bigint NOT NULL,
  CONSTRAINT em_questions_pk PRIMARY KEY (id),
  CONSTRAINT em_questions_fk1 FOREIGN KEY (test_id)
      REFERENCES public.em_tests (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_questions
  OWNER TO postgres;

-- Table: public.em_answer_options

-- DROP TABLE public.em_answer_options;

CREATE TABLE public.em_answer_options
(
  id bigint NOT NULL DEFAULT nextval('em_answer_options_id_seq'::regclass),
  content text NOT NULL,
  value integer NOT NULL,
  question_id bigint NOT NULL,
  CONSTRAINT em_answer_options_pk PRIMARY KEY (id),
  CONSTRAINT em_answer_options_fk1 FOREIGN KEY (question_id)
      REFERENCES public.em_questions (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_answer_options
  OWNER TO postgres;

-- Table: public.em_test_periods

-- DROP TABLE public.em_test_periods;

CREATE TABLE public.em_test_periods
(
  id bigint NOT NULL DEFAULT nextval('em_test_periods_id_seq'::regclass),
  start_date date NOT NULL,
  end_date date NOT NULL,
  CONSTRAINT em_test_periods_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_test_periods
  OWNER TO postgres;

-- Table: public.em_test_results

-- DROP TABLE public.em_test_results;

CREATE TABLE public.em_test_results
(
  employee_id bigint NOT NULL,
  test_id bigint NOT NULL,
  test_period_id bigint NOT NULL,
  success double precision NOT NULL,
  CONSTRAINT em_test_results_fk PRIMARY KEY (employee_id, test_id, test_period_id),
  CONSTRAINT em_test_results_fk1 FOREIGN KEY (employee_id)
      REFERENCES public.em_employees (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT em_test_results_fk2 FOREIGN KEY (test_id)
      REFERENCES public.em_tests (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT em_test_results_fk3 FOREIGN KEY (test_period_id)
      REFERENCES public.em_test_periods (id) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.em_test_results
  OWNER TO postgres;
