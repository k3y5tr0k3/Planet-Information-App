/************************
/*    Populate Tables
/***********************/

INSERT INTO planets (name, description, radius, temperature_min, temperature_max, force_of_gravity, distance_from_earth, is_hospitable, length_of_day, number_of_moons)
VALUES 
    ('Mercury', 'The solar systems smallest planet, Mercury is a rough and rocky planet much like Earth''s moon.', 2439.7, -180, 430, 3.7, 121.4, 0, 1416, 0),
    ('Venus', 'The hottest of all planets, Venus, with its thick atmosphere is trapped in a runaway greenhouse effect.', 6051.8, 460, 465, 8.87, 114.34, 0, 2802, 0),
    ('Earth', 'The pale blue dot, third planet from the Sun and the only known home to live in our solar system.', 6371, -81, 50, 9.8, 0, 1, 24, 1),
    ('Mars', 'Small in comparison to earth, Mars is one of the most explorded bodies in our solar system and could be the detination of a futeur manned-mission.', 3389.5, -90, 5, 3.7, 236.85, 1, 24, 2),
    ('Jupiter', 'Jupiter is a gas giant and is the biggest planet in the solar system. Temperature range is temperature in its clouds and at its core.', 69911, -145, 24000, 24.7, 829.04, 0, 10, 75),
    ('Saturn', 'Saturn is adorded for its beautiful rings of ice and rock.', 58232, -185, -122, 10.4, 1571, 0, 10.5, 82),
    ('Uranus', 'One interesting fact about Uranus is rotates at almost 90-degree angle from the plane of its orbit.', 25362, -218, -153, 8.8, 3081, 0, 17, 27),
    ('Neptune', 'Neptune, was the first planet found through mathematical calculations. The only visitor was Voyager2 in 1989.', 24622, -218, -200, 11.1, 4624, 0, 16, 14);

INSERT INTO moons (name, description, radius, force_of_gravity, distance_from_host, host_id)
VALUES 
    ('The Moon', 'Earth''s only moon', 1737.1, 1.6, 385000, 3),
    ('Phobos', 'The larger of Mars'' two moons', 11, 0.0057, 5826, 4),
    ('Diemos', NULL, 6.2, 0.003, 14573, 4),
    ('Europa', 'Just one of the 79 known moons of Jupiter', 1560, 1.3, 414000, 5),
    ('Callisto', 'The second largest moon of Jupiter', 2410, 1.2, 1168000, 5),
    ('Titan', 'Saturns largest moon', 2574, 1.3, 1200000, 6),
    ('Iapetus', NULL, 735, 0.2, 2213000, 6),
    ('Oberon', 'Uranus'' outermost major moon', 761, 0.3, 584000, 7),
    ('Triton', 'The largest natural satellite of the planet Neptune', 1353, 0.7, 220438, 8);