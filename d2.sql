-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 27, 2014 at 02:44 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `d2`
--
CREATE DATABASE IF NOT EXISTS `d2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `d2`;

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `right_level` int(11) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `password`, `right_level`) VALUES
('adam', 'adam', 1),
('pankaj', 'pankaj', 1);

-- --------------------------------------------------------

--
-- Table structure for table `cheque`
--

CREATE TABLE IF NOT EXISTS `cheque` (
  `check_id` int(11) NOT NULL AUTO_INCREMENT,
  `PAY_TO` varchar(255) DEFAULT NULL,
  `amount_in_numbers` float NOT NULL,
  `amount_in_words` varchar(255) DEFAULT NULL,
  `check_type` int(11) NOT NULL,
  `checkq_date` datetime DEFAULT NULL,
  `from_account` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`check_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=176 ;

--
-- Dumping data for table `cheque`
--

INSERT INTO `cheque` (`check_id`, `PAY_TO`, `amount_in_numbers`, `amount_in_words`, `check_type`, `checkq_date`, `from_account`) VALUES
(173, 'a/c121215656', 1000, 'One thousand', 1, '2014-05-02 15:24:35', 'a/c45454'),
(174, 'a/b12223', 1200, 'twelve hundred', 2, '2014-05-02 15:29:42', 'a/c 121212'),
(175, 'A/C11265234567', 1200, 'Twelve Hundread Only', 2, '2014-05-03 12:10:54', 'A/C67855689');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
