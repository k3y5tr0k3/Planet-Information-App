/*******************************
/*    Create Tables
/******************************/

DROP TABLE IF EXISTS planets;
DROP TABLE IF EXISTS moons;


CREATE TABLE planets(
    planet_id             INTEGER PRIMARY KEY AUTOINCREMENT,
    description           TEXT NOT NULL,
    radius                INTEGER NOT NULL,
    temperature_range     INTEGER NOT NULL,
    force_of_gravity      INTEGER NOT NULL,
    distance_from_earth   INTEGER NOT NULL,
    is_hospitable         BOOLEAN NOT NULL,
    length_of_day         INTEGER NOT NULL,
    number_of_moons       INTEGER NOT NULL
);


CREATE TABLE moons (
    id                 INTEGER PRIMARY KEY AUTOINCREMENT,
    description        TEXT,
    radius             INTEGER NOT NULL,
    temperature_range  INTEGER NOT NULL,
    force_of_gravity   INTEGER NOT NULL,
    
    FOREIGN KEY (id) REFERENCES planets (planet_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);