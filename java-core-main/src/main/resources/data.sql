INSERT INTO CONTACTS (id, name, is_group, description) VALUES (1,'Juan', 0 , 'Juan Perez');
INSERT INTO CONTACTS (id, name, is_group, description) VALUES (2,'Pedro', 0 , 'Pedro Perez');
INSERT INTO CONTACTS (id, name, is_group, description) VALUES (3,'Manuel', 0 , 'Manuel Perez');
INSERT INTO CONTACTS (id, name, is_group, description) VALUES (4,'Grupo de Amigos', 1 , 'Grupo de amigos del colegio');


INSERT INTO GROUP_CONTACTS ( id_group, id_contact) VALUES( 4, 3 );
INSERT INTO GROUP_CONTACTS ( id_group, id_contact) VALUES( 4, 2 );

