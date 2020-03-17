/*******************************
/*    Create Tables
/******************************/

DROP TABLE IF EXISTS planets;
DROP TABLE IF EXISTS moons;


CREATE TABLE planets(
    planet_id             INTEGER PRIMARY KEY NOT NULL,
    name                  TEXT NOT NULL UNIQUE,
    description           TEXT NOT NULL,
    radius                INTEGER NOT NULL,
    temperature_min       INTEGER NOT NULL,
    temperature_max       INTEGER NOT NULL,
    force_of_gravity      INTEGER NOT NULL,
    distance_from_earth   INTEGER NOT NULL,
    is_hospitable         BOOLEAN NOT NULL,
    length_of_day         INTEGER NOT NULL,
    number_of_moons       INTEGER NOT NULL
);


CREATE TABLE moons(
    moon_id            INTEGER PRIMARY KEY NOT NULL,
    name               TEXT NOT NULL UNIQUE,
    description        TEXT,
    radius             INTEGER NOT NULL,
    force_of_gravity   INTEGER NOT NULL,
    distance_from_host INTEGER NOT NULL,
    host_id            INTEGER,
    
    FOREIGN KEY (host_id) REFERENCES planets(planet_id)
    ON DELETE SET NULL
    ON UPDATE SET NULL
);



