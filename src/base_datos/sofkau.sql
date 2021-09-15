-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 14-09-2021 a las 23:54:57
-- Versión del servidor: 8.0.18
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sofkau`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historicos`
--

DROP TABLE IF EXISTS `historicos`;
CREATE TABLE IF NOT EXISTS `historicos` (
  `Registro` int(11) NOT NULL AUTO_INCREMENT,
  `ID_jugador` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Pregunta` varchar(60) COLLATE utf8_bin NOT NULL,
  `Respuestas` varchar(60) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Respuesta_escogida` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Ronda` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Premio_acumulado` int(10) NOT NULL,
  PRIMARY KEY (`Registro`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `historicos`
--

INSERT INTO `historicos` (`Registro`, `ID_jugador`, `Pregunta`, `Respuestas`, `Respuesta_escogida`, `Ronda`, `Premio_acumulado`) VALUES
(72, '103020', ' 4+4 ', 'A. 12,B. 9, C. 8,D. 7', 'C', 'Ronda 1', 1000),
(73, '103020', ' 2*2 ', 'A. 2,B. 3, C. 4,D. 6', 'C', 'Ronda 2', 2500),
(74, '103020', 'Estados unidos', 'A) Chicago, B) Nueva York, C) Washington DC, D) Los Ángeles', 'C', 'Ronda 3', 4500),
(75, '103020', 'Blanco', ' A) White, B) Red, C) Black, D) Violet', 'A', 'Ronda 4', 7000),
(76, '103020', 'Argentina', 'A) 1841, B) 1839, C) 1816, D)1826', 'C', 'Ronda 5', 10000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
