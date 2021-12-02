CREATE TABLE person (
    person_id BIGINT AUTO_INCREMENT,
    name VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (person_id)
);


CREATE TABLE todo (
    todo_id BIGINT AUTO_INCREMENT,
    person_id BIGINT NOT NULL,
    description VARCHAR(255) DEFAULT NULL,
    week BIGINT DEFAULT NULL,
    PRIMARY KEY (todo_id),
    FOREIGN KEY (person_id) REFERENCES person(person_id)
);