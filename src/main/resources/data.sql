create table person
(
    id  integer auto_increment not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key (id)
);

INSERT INTO person (name, location, birth_date)
VALUES ('seba', 'Chile', sysdate());
INSERT INTO person (name, location, birth_date)
VALUES ('Meli', 'Chile', sysdate());
INSERT INTO person (name, location, birth_date)
VALUES ('Canelita', 'CatLandia', sysdate());
INSERT INTO person (name, location, birth_date)
VALUES ('Rolo', 'CatLandia', sysdate());
