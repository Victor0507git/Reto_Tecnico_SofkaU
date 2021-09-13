-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 12-09-2021 a las 18:00:49
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
  `ID jugador` varchar(11) COLLATE utf8_bin NOT NULL,
  `Pregunta` varchar(60) COLLATE utf8_bin NOT NULL,
  `Respuesta 1` varchar(30) COLLATE utf8_bin NOT NULL,
  `Respuesta 2` varchar(30) COLLATE utf8_bin NOT NULL,
  `Respuesta 3` varchar(30) COLLATE utf8_bin NOT NULL,
  `Respuesta 4` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ID jugador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
