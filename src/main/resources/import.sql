INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (1,'ATENCION PRIMARIA');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (2,'CAPS La Paz');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (3,'CIC La Paz');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (4,'Maria Eva');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (5,'8 De Octubre I');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (6,'La Loma');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (7,'CIC La Matera');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (8,'Don Bosco');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (9,'La Primavera');
INSERT INTO `centros`(`id_centro`, `nombre_centro`) VALUES (10,'Elias Tanus');

INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (1,'lucas','sandoval');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (2,'sdfsdaf','dfsdf');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (3,'sdfsad','sadfasdf');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (4,'asdasd','asdasd');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (5,'asdasd','asdasd');

INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (6,'asdasd','asdasd');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (7,'dasfds','gfdhdg');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (8,'sdfasd','fdgdfg');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (9,'adfdf','sdfsdf');
INSERT INTO `personas`(`id`, `apellidos`, `name`) VALUES (10,'dsfsdaff','sdfsdfsdfs');

INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (1,1);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (1,2);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (1,3);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (1,4);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (1,5);

INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (2,6);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (2,7);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (2,8);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (2,9);
INSERT INTO `centros_personal`(`centro_id`, `personal_id`) VALUES (2,10);

INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (1,1);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (2,1);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (3,1);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (4,1);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (5,1);

INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (6,2);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (7,2);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (8,2);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (9,2);
INSERT INTO `personas_centro`(`persona_id`, `centro_id_centro`) VALUES (10,2);

