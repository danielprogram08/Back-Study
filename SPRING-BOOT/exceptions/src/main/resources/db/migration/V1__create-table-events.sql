CREATE TABLE events (
    id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    address TEXT, 
    city VARCHAR(50) NOT NULL,
    state CHAR(2) NOT NULL,
    remote BOOLEAN NOT NULL
);