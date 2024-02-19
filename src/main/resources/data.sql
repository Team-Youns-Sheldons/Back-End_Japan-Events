INSERT INTO roles (id_role, name) VALUES (default, 'ROLE_ADMIN');
INSERT INTO roles (id_role, name) VALUES (default, 'ROLE_USER');


INSERT INTO users (id_user, username, password) VALUES (default, 'juanito', '$2a$12$8LegtLQWe717tIPvZeivjuqKnaAs5.bm0Q05.5GrAmcKzXw2NjoUO');
INSERT INTO users (id_user, username, password) VALUES (default, 'nicolasito', '$2a$12$8LegtLQWe717tIPvZeivjuqKnaAs5.bm0Q05.5GrAmcKzXw2NjoUO');

INSERT INTO roles_users (user_id, role_id) VALUES (1, 1);
INSERT INTO roles_users (user_id, role_id) VALUES (2, 2);

INSERT INTO types(id_types, name) VALUES(DEFAULT, "Foods");
INSERT INTO types(id_types, name) VALUES(DEFAULT, "Culture");
INSERT INTO types(id_types, name) VALUES(DEFAULT, "Sports");

INSERT INTO event(id_event, name, capacity, price, description, ubication, time, date, types_id) VALUES(DEFAULT, "Curry House cocoIchibanya", 40, 400, "es una de las varias cadenas especializadas en curry japonés de todo tipo, desde el más suave hasta el más picante, con diferentes tamaños, tipos de carne para acompañar, etc. ¡Hay más de treinta variedades!", "Nagoya/Japon", "10:00", "De Lunes a Domingo", 1);
INSERT INTO event(id_event, name, capacity, price, description, ubication, time, date, types_id) VALUES(DEFAULT, "Gindaco", 40, 400, "es una cadena especializada en takoyaki, las bolitas de pulpo típicas de Osaka. Tiene locales por todo Japón, ideal cuando te apetecen takoyaki pero no estás en Osaka.", "Locales en todo Japon", "10:00", "De Lunes a Domingo", 1);
INSERT INTO event(id_event, name, capacity, price, description, ubication, time, date, types_id) VALUES(DEFAULT, "Festival de la nieve de Sapporo (Hokkaido)", 10000, 0, "El festival de la nieve de Sapporo (Sapporo Yuki Matsuri) es uno de los mayores festivales del año para la ciudad de Sapporo. Se celebra en febrero durante una semana desde 1950", "Sapporo", "07:00", "Febrero", 2);
INSERT INTO event(id_event, name, capacity, price, description, ubication, time, date, types_id) VALUES(DEFAULT, "Hanami (花見)", 100000, 0, "El Hanami (はなみ, contemplación de flores), también llamado festival de los cerezos en flor, se celebra en abril, mes en el que se suceden diversos festivales florares en los altares sintoístas.", "Japon", "00:00", "Abril", 2);
INSERT INTO event(id_event, name, capacity, price, description, ubication, time, date, types_id) VALUES(DEFAULT, "Competencia de Sumo", 10000, 1200, "Si piensas en el deporte de Japón, probablemente te imaginarás el sumo. Pero no olvides aprovechar la oportunidad para conocer algunos de los otros deportes tradicionales del país, así como los importados de occidente.", "Ryogoku Kokugikan de Tokio", "10:00", "Enero, Mayo y Septiembre", 3);
INSERT INTO event(id_event, name, capacity, price, description, ubication, time, date, types_id) VALUES(DEFAULT, "Kendo", 10000, 100, "Kendo, el esgrima con un toque japonés, proviene del kenjutsu o esgrima, el importante arte marcial del samurái.", "Ryogoku Kokugikan de Tokio", "10:00", "Verano", 3);

