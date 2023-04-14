-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-04-2023 a las 11:52:23
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `portfolio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `education`
--

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
  `start_education` varchar(255) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `education`
--

INSERT INTO `education` (`education_id`, `description_education_r1`, `description_education_r2`, `description_education_r3`, `description_education_r4`, `education_image`, `end_education`, `qualification`, `school`, `start_education`, `usuario_id`) VALUES
(1, 'Esta carrera me ofreció conocimientos y prácticas intensivas que me permitieron analizar un problema de procesamiento de datos y desarrollar una solución en un lenguaje apropiado utilizando un computador.', '', '', '', 'null', '2022', 'Tecnico Universitario en Programación', 'Universidad Tecnologica Nacional', '2021', NULL),
(2, 'En esta primera etapa aprendi sobre:', 'Gobstone: para fundamentos de programacion.', 'Javascript: para programacion imperactiva e estructuras de datos.', 'Ruby: para el paradigma de objetos.', 'null', '2022', '#SeProgramar', 'Argentina Programa - 1ra Etapa', '2021', NULL),
(3, 'En esta etapa aprendi sobre:', 'Las herramientas de un dev FrontEnd.', 'Las herramientas de un dev BackEnd.', 'Conocimiento en DevOps y Testing.', 'null', '2023', '#YoProgramo', 'Argentina Programa - 2da Etapa', '2022', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `projects`
--

CREATE TABLE `projects` (
  `proyectos_id` int(11) NOT NULL,
  `end_project` varchar(255) DEFAULT NULL,
  `link_github` varchar(255) DEFAULT NULL,
  `link_project` varchar(255) DEFAULT NULL,
  `project_description` varchar(255) DEFAULT NULL,
  `project_image` varchar(255) DEFAULT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `project_title` varchar(255) DEFAULT NULL,
  `start_project` varchar(255) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `projects`
--

INSERT INTO `projects` (`proyectos_id`, `end_project`, `link_github`, `link_project`, `project_description`, `project_image`, `project_name`, `project_title`, `start_project`, `usuario_id`) VALUES
(1, '2023', 'https://github.com/WaldoCuevas/StockTracking', 'null', 'Desarrollo de una aplicación que permite realizar el seguimiento de Stock de una empresa ficticia.', 'https://files.deply.dev/files/43904778-e7d6-494c-b4be-9aafbd86a2db-7d6af530-457d-482e-af94-9cab60c0257c-stockTracking.jpg', 'StockTracking', 'Application Web', '2022', NULL),
(2, '2022', 'https://github.com/WaldoCuevas/comunicate', 'https://comunicate-con-nosotros.web.app/home', 'Desarrollo de una aplicación que permite una mejor comunicación con personas con capacidades especiales.', 'https://files.deply.dev/files/6e8622cf-d974-4b1a-b74c-4600fef3cd6d-2a792668-9511-4019-85c3-39ed6daffeb2-project-Esc.Especial.jpg', 'Comunicate', 'Application Web', '2022', NULL),
(3, '2023', 'https://github.com/WaldoCuevas/waldocuevas.github.io', 'https://waldocuevas.github.io', 'Realización de un portafolio web de parte de Argentina Programa.', 'https://files.deply.dev/files/ce886845-6a11-4113-94b8-7045cd7e64d7-01d51121-000c-4753-bf31-969bcbe13401-portfolio.jpg', 'Portfolio Web', 'Web', '2022', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skill`
--

CREATE TABLE `skill` (
  `skill_id` int(11) NOT NULL,
  `skill_image` varchar(255) DEFAULT NULL,
  `skill_porcent` float DEFAULT NULL,
  `skills_name` varchar(255) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `skill`
--

INSERT INTO `skill` (`skill_id`, `skill_image`, `skill_porcent`, `skills_name`, `usuario_id`) VALUES
(1, NULL, 90, 'Java', NULL),
(2, 'null', 70, 'MySql', NULL),
(3, 'null', 80, 'Spring Boot', NULL),
(4, 'null', 75, 'HTML', NULL),
(5, 'null', 60, 'CSS', NULL),
(6, 'null', 70, 'JavaScript', NULL),
(7, 'null', 80, 'Angular', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnologias`
--

CREATE TABLE `tecnologias` (
  `tecnology_id` int(11) NOT NULL,
  `badge_technology_1` varchar(255) DEFAULT NULL,
  `badge_technology_2` varchar(255) DEFAULT NULL,
  `badge_technology_3` varchar(255) DEFAULT NULL,
  `badge_technology_4` varchar(255) DEFAULT NULL,
  `description_technology_r1` varchar(255) DEFAULT NULL,
  `description_technology_r2` varchar(255) DEFAULT NULL,
  `name_technology` varchar(255) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tecnologias`
--

INSERT INTO `tecnologias` (`tecnology_id`, `badge_technology_1`, `badge_technology_2`, `badge_technology_3`, `badge_technology_4`, `description_technology_r1`, `description_technology_r2`, `name_technology`, `usuario_id`) VALUES
(1, 'HTML', 'CSS', 'JS', 'Angular', 'Como FrontEnd Developer me encargo de diseñar la interfaz de usuario (UI) de los sitios web. Es una de las piezas claves de un proyecto digital porque es el responsable de la experiencia de usuario (UX), y se desenvuelve del lado del cliente.', '', 'FrontEnd Dev', NULL),
(2, 'JAVA', 'Spring Framework', 'Node js', NULL, 'Como BackEnd Developer me encargo del desarrollo de una web, app o programa. Ser Backend Dev es ocuparse de la “parte de atrás”, es decir, de trabajar con el servidor. Sus funciones son diseñar, revisar y reparar todo para su correcto funcionamiento.', '', 'Backend Dev', NULL),
(3, 'MySql', 'MongoDB', 'Postgress', NULL, 'Como Database Developer, o programador de base de datos, soy responsable de crear, administrar y solucionar problemas de bases de datos informáticas que pueden procesar grandes cantidades de información y mantenerla segura.', '', 'Databases Dev', NULL),
(4, 'Scrum', '', '', '', 'DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.', '', 'DevOps', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `persona` (
  `user_id` int(11) NOT NULL,
  `about_me_r1` varchar(255) DEFAULT NULL,
  `about_me_r2` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `persona` (`user_id`, `about_me_r1`, `about_me_r2`, `email`, `last_name`, `name`, `user_name`, `user_password`) VALUES
(1, 'Soy una persona autodictacta y comprometida con los trabajos querealizo. Empeze a programar en el 2021 cuando inicie mi carrera de Programación en la Universidad Tecnologica Nacional - FRVT.', 'A finales del año 2022 me recibí de Técnico Universitario en Programación. Personalmente siento interés por el mundo de la informática y el rubro IT. Entre mis preferencias me gustan las áreas relacionadas al Backend sobre el Frontend.', 'CuevasWaldo5@gmail.com', 'Cuevas', 'Waldo', 'WaldoCuevas', '123456789');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `work_experience`
--

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
  `workstation` varchar(255) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `work_experience`
--

INSERT INTO `work_experience` (`work_exp_id`, `description_work_exp_r1`, `description_work_exp_r2`, `description_work_exp_r3`, `end_work_exp`, `job`, `start_work_exp`, `work_image`, `workplace`, `workstation`, `usuario_id`) VALUES
(1, 'Desarrollo en equipo de una aplicación que facilita la comunicación entre el equipo docente y los alumnos', 'Instalación del software en los dispositivos de la institución', 'Mantenimiento al software desarrollado', '2022', 'Comunicate', '2022', 'https://files.deply.dev/files/a865d63d-8f53-422c-bda4-892891a9fc25-17754f74-02a8-47df-a1bf-9d9ba2636a40-escuela_especial_n°_2045.jpg', 'Escuela Especial N° 2045 - Dr. Oscar Oñativia', 'Desarrollador', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `education`
--
ALTER TABLE `education`
  ADD PRIMARY KEY (`education_id`),
  ADD KEY `FK36k6542potsb3rslcprjkngby` (`usuario_id`);

--
-- Indices de la tabla `projects`
--
ALTER TABLE `projects`
  ADD PRIMARY KEY (`proyectos_id`),
  ADD KEY `FKd5ua95d1oahnym6osppdkjm9j` (`usuario_id`);

--
-- Indices de la tabla `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`skill_id`),
  ADD KEY `FK195k1oahyuu3hgf8r0r07ly79` (`usuario_id`);

--
-- Indices de la tabla `tecnologias`
--
ALTER TABLE `tecnologias`
  ADD PRIMARY KEY (`tecnology_id`),
  ADD KEY `FKjv1nnuvbl1ilncd9i5twacbbi` (`usuario_id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`user_id`);

--
-- Indices de la tabla `work_experience`
--
ALTER TABLE `work_experience`
  ADD PRIMARY KEY (`work_exp_id`),
  ADD KEY `FKq373fmpdb2bw84jhdmjg7pgvp` (`usuario_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `education`
--
ALTER TABLE `education`
  MODIFY `education_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `projects`
--
ALTER TABLE `projects`
  MODIFY `proyectos_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `skill`
--
ALTER TABLE `skill`
  MODIFY `skill_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tecnologias`
--
ALTER TABLE `tecnologias`
  MODIFY `tecnology_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `work_experience`
--
ALTER TABLE `work_experience`
  MODIFY `work_exp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
