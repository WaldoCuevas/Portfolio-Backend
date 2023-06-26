CREATE TABLE `education` (
  `education_id` int(11) NOT NULL,
  `description_education_r1` varchar(255) DEFAULT NULL,
  `description_education_r2` varchar(255) DEFAULT NULL,
  `description_education_r3` varchar(255) DEFAULT NULL,
  `description_education_r4` varchar(255) DEFAULT NULL,
  `education_image` varchar(255) DEFAULT NULL,
  `end_education` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `start_education` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `education` (`education_id`, `description_education_r1`, `description_education_r2`, `description_education_r3`, `description_education_r4`, `education_image`, `end_education`, `qualification`, `school`, `start_education`) VALUES
(1, 'Esta carrera me ofreció conocimientos y prácticas intensivas que me permitieron analizar un problema de procesamiento de datos y desarrollar una solución en un lenguaje apropiado utilizando un computador.', '', '', '', 'https://i.ibb.co/ydP2KRF/logo-utn-removebg-preview.png', '2022', 'Tecnico Universitario en Programación', 'Universidad Tecnologica Nacional', '2021'),
(2, 'En esta primera etapa aprendi sobre:', 'Gobstone: para fundamentos de programacion.', 'Javascript: para programacion imperactiva e estructuras de datos.', 'Ruby: para el paradigma de objetos.', 'https://i.ibb.co/p2LmBgC/icon-Argentina-programa-2.png', '2022', '#SeProgramar', 'Argentina Programa - 1ra Etapa', '2021'),
(3, 'En esta etapa aprendi sobre:', 'Las herramientas de un dev FrontEnd.', 'Las herramientas de un dev BackEnd.', 'Conocimiento en DevOps y Testing.', 'https://i.ibb.co/k24XqCC/icon-Argentina-programa-3-removebg-preview.png', '2023', '#YoProgramo', 'Argentina Programa - 2da Etapa', '2022');





CREATE TABLE `person` (
  `user_id` int(11) NOT NULL,
  `about_me_r1` varchar(255) DEFAULT NULL,
  `about_me_r2` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_image` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `person` (`user_id`, `about_me_r1`, `about_me_r2`, `last_name`, `name`, `user_image`) VALUES
(1, 'Soy una persona autodictacta y comprometida con los trabajos querealizo. Empeze a programar en el 2021 cuando inicie mi carrera de Programación en la Universidad Tecnologica Nacional - FRVT.', 'A finales del año 2022 me recibí de Técnico Universitario en Programación. Personalmente siento interés por el mundo de la informática y el rubro IT. Entre mis preferencias me gustan las áreas relacionadas al Backend sobre el Frontend.', 'Cueva', 'Waldos', 'https://i.ibb.co/dPtgMKd/1654281159375-removebg-preview.png');





CREATE TABLE `projects` (
  `proyectos_id` int(11) NOT NULL,
  `end_project` varchar(255) DEFAULT NULL,
  `link_github` varchar(255) DEFAULT NULL,
  `link_project` varchar(255) DEFAULT NULL,
  `project_description` varchar(255) DEFAULT NULL,
  `project_image` varchar(255) DEFAULT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `project_title` varchar(255) DEFAULT NULL,
  `start_project` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `projects` (`proyectos_id`, `end_project`, `link_github`, `link_project`, `project_description`, `project_image`, `project_name`, `project_title`, `start_project`) VALUES
(1, '2023', 'https://github.com/WaldoCuevas/StockTracking', 'null', 'Desarrollo de una aplicación que permite realizar el seguimiento de Stock de una empresa ficticia.', 'https://i.ibb.co/vshdRTz/stock-Tracking.jpg', 'StockTracking', 'Application Web', '2022'),
(2, '2022', 'https://github.com/WaldoCuevas/comunicate', 'https://comunicate-con-nosotros.web.app/home', 'Desarrollo de una aplicación que permite una mejor comunicación con personas con capacidades especiales.', 'https://i.ibb.co/tHPqc4m/project-Esc-Especial.jpg', 'Comunicate', 'ApplicationWeb', '2022'),
(3, '2023', 'https://github.com/WaldoCuevas/waldocuevas.github.io', 'https://waldocuevas.github.io', 'Realización de un portafolio web de parte de Argentina Programa.', 'https://i.ibb.co/W35VGN6/portfolio.jpg', 'Portfolio Web', 'Web', '2022');





CREATE TABLE `rol` (
  `id` int(11) NOT NULL,
  `rol_nombre` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `rol` (`id`, `rol_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');





CREATE TABLE `skill` (
  `skill_id` int(11) NOT NULL,
  `skill_image` varchar(255) DEFAULT NULL,
  `skill_porcent` float DEFAULT NULL,
  `skills_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `skill` (`skill_id`, `skill_image`, `skill_porcent`, `skills_name`) VALUES
(1, 'https://img.icons8.com/ios/256/java-coffee-cup-logo--v1.png', 90, 'Java'),
(2, 'https://img.icons8.com/ios/256/mysql-logo.png', 70, 'MySql'),
(3, 'https://i.ibb.co/QFyHkwf/spring.png', 80, 'Spring'),
(4, 'https://img.icons8.com/ios-filled/256/html-5--v2.png', 75, 'HTML'),
(5, 'https://img.icons8.com/ios-filled/256/css3.png', 60, 'CSS'),
(6, 'https://img.icons8.com/ios-filled/256/javascript-logo.png', 70, 'JavaScript'),
(7, 'https://img.icons8.com/ios-filled/256/angularjs.png', 80, 'Angular');





CREATE TABLE `tecnologias` (
  `tecnology_id` int(11) NOT NULL,
  `badge_technology_1` varchar(255) DEFAULT NULL,
  `badge_technology_2` varchar(255) DEFAULT NULL,
  `badge_technology_3` varchar(255) DEFAULT NULL,
  `badge_technology_4` varchar(255) DEFAULT NULL,
  `description_technology_r1` varchar(255) DEFAULT NULL,
  `description_technology_r2` varchar(255) DEFAULT NULL,
  `name_technology` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `tecnologias` (`tecnology_id`, `badge_technology_1`, `badge_technology_2`, `badge_technology_3`, `badge_technology_4`, `description_technology_r1`, `description_technology_r2`, `name_technology`) VALUES
(1, 'HTML', 'CSS', 'JS', 'Angular', 'En Frontend tengo conocimientos en HTML, CSS y JavaScript.', 'Además utilizo framework como Angular, y librerias como Bootstrap.', 'FrontEnd Dev'),
(2, 'Java', 'Spring', 'Node js', 'Ruby', 'Manejo el lenguaje de programacion Java junto con su framework Spring.', 'Algunas de las características de Spring que manejo son: Spring Data, Spring boot e Spring Securiry.', 'Backend Dev'),
(3, 'MySql', 'MongoDB', 'Postgress', '', 'Entre las bases de datos relacionales que trabajo estan MySql yPostGress.', 'Y entre las bases de datos no relacionales que trabajo estan MongoDB', 'Backend DataBase'),
(4, 'Scrum', 'Docker', 'Git/Github', 'Postman', 'Las herramientas devOps que utilizo son git e github, postman y docker.', 'Tambien suelo trabajar con una metodologia ágil Scrum.', 'DevOps');





CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nombre_usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `usuario` (`id`, `apellido`, `email`, `nombre`, `nombre_usuario`, `password`) VALUES
(1, 'Prueba', 'admin@gmail.com', 'Admin', 'admin', '$2a$10$g6YqLGLthrCOOZNz4.7U0uWulsv81JdOGSh4VH5WcGihvpmSafND2'),
(2, 'Prueba', 'user@gmail.com', 'user', 'user', '$2a$10$6lGrR1jc8RwjythUL7RzuuEYGHbxfAqmfQc7ttOrjmgxzC603ST5W'),
(3, 'Cuevas', 'WaldoCuevas@gmail.com', 'Waldo', 'Waldo', '$2a$10$9jE1/90vIxBN2LVemaR.ROew0fb3H.n3SXypoutY8n4C6jS39pAcy');





CREATE TABLE `usuario_rol` (
  `usuario_id` int(11) NOT NULL,
  `rol_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 1),
(3, 2);





CREATE TABLE `work_experience` (
  `work_exp_id` int(11) NOT NULL,
  `description_work_exp_r1` varchar(255) DEFAULT NULL,
  `description_work_exp_r2` varchar(255) DEFAULT NULL,
  `description_work_exp_r3` varchar(255) DEFAULT NULL,
  `end_work_exp` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `start_work_exp` varchar(255) DEFAULT NULL,
  `work_image` varchar(255) DEFAULT NULL,
  `workplace` varchar(255) DEFAULT NULL,
  `workstation` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `work_experience` (`work_exp_id`, `description_work_exp_r1`, `description_work_exp_r2`, `description_work_exp_r3`, `end_work_exp`, `job`, `start_work_exp`, `work_image`, `workplace`, `workstation`) VALUES
(1, 'Desarrollo en equipo de una aplicación que facilita la comunicación entre el equipo docente y los alumnos', 'Instalación del software en los dispositivos de la institución', 'Mantenimiento al software desarrollado', '2022', 'Comunicate', '2022', 'https://i.ibb.co/WzjHQj2/escuela-especial-n-2045.jpg', 'Escuela Especial N° 2045 - Dr. Oscar Oñativia', 'Desarrollador');


ALTER TABLE `education`
  ADD PRIMARY KEY (`education_id`);


ALTER TABLE `person`
  ADD PRIMARY KEY (`user_id`);


ALTER TABLE `projects`
  ADD PRIMARY KEY (`proyectos_id`);


ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `skill`
  ADD PRIMARY KEY (`skill_id`);


ALTER TABLE `tecnologias`
  ADD PRIMARY KEY (`tecnology_id`);


ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `usuario_rol`
  ADD PRIMARY KEY (`usuario_id`,`rol_id`),
  ADD KEY `FK610kvhkwcqk2pxeewur4l7bd1` (`rol_id`);


ALTER TABLE `work_experience`
  ADD PRIMARY KEY (`work_exp_id`);


ALTER TABLE `education`
  MODIFY `education_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `person`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;


ALTER TABLE `projects`
  MODIFY `proyectos_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

ALTER TABLE `rol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;


ALTER TABLE `skill`
  MODIFY `skill_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;


ALTER TABLE `tecnologias`
  MODIFY `tecnology_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;


ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;


ALTER TABLE `work_experience`
  MODIFY `work_exp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;
