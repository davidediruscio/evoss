-- phpMyAdmin SQL Dump
-- version 2.11.3deb1ubuntu1.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 07, 2011 at 05:37 PM
-- Server version: 5.0.51
-- PHP Version: 5.2.4-2ubuntu5.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `failuresdetector`
--

-- --------------------------------------------------------

--
-- Table structure for table `ass_oclqueries2failures`
--

CREATE TABLE IF NOT EXISTS `ass_oclqueries2failures` (
  `ID` int(6) NOT NULL auto_increment,
  `idfirst` int(6) NOT NULL,
  `idsecond` int(6) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `ass_oclqueries2failures`
--

INSERT INTO `ass_oclqueries2failures` (`ID`, `idfirst`, `idsecond`) VALUES
(1, 12, 3),
(2, 12, 4),
(3, 13, 5),
(4, 13, 6),
(5, 14, 7),
(6, 14, 8),
(7, 15, 9),
(8, 15, 10),
(9, 16, 11),
(11, 53, 11),
(12, 50, 3),
(13, 53, 5),
(14, 54, 4),
(15, 52, 5);

-- --------------------------------------------------------

--
-- Table structure for table `ass_oclqueries2jars`
--

CREATE TABLE IF NOT EXISTS `ass_oclqueries2jars` (
  `ID` int(6) NOT NULL auto_increment,
  `idfirst` int(6) NOT NULL,
  `idsecond` int(6) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `ass_oclqueries2jars`
--


-- --------------------------------------------------------

--
-- Table structure for table `ass_oclqueries2keywords`
--

CREATE TABLE IF NOT EXISTS `ass_oclqueries2keywords` (
  `ID` int(6) NOT NULL auto_increment,
  `idfirst` int(6) NOT NULL,
  `idsecond` int(6) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=78 ;

--
-- Dumping data for table `ass_oclqueries2keywords`
--

INSERT INTO `ass_oclqueries2keywords` (`ID`, `idfirst`, `idsecond`) VALUES
(70, 51, 9),
(69, 51, 8),
(68, 51, 7),
(67, 50, 8),
(66, 50, 7),
(72, 52, 15),
(71, 52, 7),
(74, 53, 16),
(73, 53, 7),
(76, 54, 18),
(75, 54, 17),
(77, 54, 19);

-- --------------------------------------------------------

--
-- Table structure for table `ass_solutions2failures`
--

CREATE TABLE IF NOT EXISTS `ass_solutions2failures` (
  `ID` int(6) NOT NULL auto_increment,
  `idfirst` int(6) NOT NULL,
  `idsecond` int(6) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `ass_solutions2failures`
--

INSERT INTO `ass_solutions2failures` (`ID`, `idfirst`, `idsecond`) VALUES
(10, 6, 3),
(11, 7, 4),
(12, 8, 5),
(13, 7, 6),
(14, 8, 7),
(15, 8, 8),
(16, 9, 9),
(17, 9, 10),
(18, 6, 11),
(19, 6, 12),
(20, 10, 9),
(21, 10, 10),
(24, 6, 12);

-- --------------------------------------------------------

--
-- Table structure for table `conf_findfield`
--

CREATE TABLE IF NOT EXISTS `conf_findfield` (
  `ID` int(2) NOT NULL auto_increment,
  `mytable` varchar(40) NOT NULL,
  `myfield` varchar(40) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `conf_findfield`
--

INSERT INTO `conf_findfield` (`ID`, `mytable`, `myfield`) VALUES
(1, 'failures', 'idtext'),
(2, 'findfield', 'mytable'),
(3, 'oclqueries', 'name'),
(4, 'solutions', 'text'),
(5, 'users', 'nickname'),
(8, 'keywords', 'keyword'),
(9, 'jars', 'file');

-- --------------------------------------------------------

--
-- Table structure for table `failures`
--

CREATE TABLE IF NOT EXISTS `failures` (
  `ID` int(7) NOT NULL auto_increment,
  `idtext` varchar(40) NOT NULL,
  `description` text NOT NULL,
  PRIMARY KEY  (`ID`),
  UNIQUE KEY `IDtext` (`idtext`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `failures`
--

INSERT INTO `failures` (`ID`, `idtext`, `description`) VALUES
(3, 'Failure 1', 'Sample failure 1 description'),
(4, 'Failure 2', 'Sample failure 2 description'),
(5, 'Failure 3', 'Sample failure 3 description');

-- --------------------------------------------------------

--
-- Table structure for table `jars`
--

CREATE TABLE IF NOT EXISTS `jars` (
  `ID` int(5) NOT NULL auto_increment,
  `name` varchar(100) NOT NULL,
  `description` text NOT NULL,
  `file` tinytext NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `jars`
--

INSERT INTO `jars` (`ID`, `name`, `description`, `file`) VALUES
(24, 'Hello world 2', 'Hello world 2', 'helloworld2.jar'),
(16, 'Hello World', 'Jar di prova che stampa "HELLO WORLD!"', 'helloworld.jar'),
(23, 'Sample ocl query execution from java', 'Sample ocl query execution from java', 'queryExecFromJar.jar'),
(22, 'Missing files', 'Missing files on the real file system are noticed according to the information contained in the configuration model', 'missingFiles.jar');

-- --------------------------------------------------------

--
-- Table structure for table `keywords`
--

CREATE TABLE IF NOT EXISTS `keywords` (
  `ID` int(11) NOT NULL auto_increment,
  `keyword` varchar(255) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `keywords`
--

INSERT INTO `keywords` (`ID`, `keyword`) VALUES
(8, 'SelectNameEqapt'),
(7, 'InstalledPackageallInstances'),
(9, 'InstalledSizeEq5200'),
(13, 'InstalledSizeEq1000'),
(14, 'SelectNameEqapzt'),
(15, 'ExistsInstalledSizeLt85'),
(16, 'ExistsNameEqa'),
(17, 'ConfigurationallInstances'),
(18, 'CollectInstalledPackages'),
(19, 'ExistsNameEqapt');

-- --------------------------------------------------------

--
-- Table structure for table `oclqueries`
--

CREATE TABLE IF NOT EXISTS `oclqueries` (
  `ID` int(6) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL,
  `query` text NOT NULL,
  `author` varchar(16) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=56 ;

--
-- Dumping data for table `oclqueries`
--

INSERT INTO `oclqueries` (`ID`, `name`, `query`, `author`) VALUES
(50, 'Retrieve package named apt', 'mancoosimm::InstalledPackage.allInstances()->select(c | c.name = ''apt'')', 'davide'),
(51, 'Retrieve package apt with installedsize = 5200', 'mancoosimm::InstalledPackage.allInstances()->select(c | c.name = ''apt'')->asSequence()->first().installedSize = 5200', 'Apocalisse'),
(52, 'Check if exists a package with InstalledSize < 85', 'mancoosimm::InstalledPackage.allInstances()->exists(c | c.installedSize < 85)', 'davide'),
(53, 'Check if exists a package named a', 'mancoosimm::InstalledPackage.allInstances()->exists(c | c.name = ''a'')', 'Apocalisse'),
(54, 'Retrieve package named apt version 2', 'mancoosimm::Configuration.allInstances()->asSequence()->first()->collect(c | c.installedPackages)->exists(p | p.name = ''apt'')', 'davide');

-- --------------------------------------------------------

--
-- Table structure for table `solutions`
--

CREATE TABLE IF NOT EXISTS `solutions` (
  `ID` int(8) NOT NULL auto_increment,
  `text` text NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `solutions`
--

INSERT INTO `solutions` (`ID`, `text`) VALUES
(6, 'Sample solution to failure 1'),
(7, 'Sample solution to failure 2'),
(8, 'Sample solution to failure 3');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `ID` int(4) NOT NULL auto_increment,
  `nickname` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY  (`ID`),
  UNIQUE KEY `nickname` (`nickname`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `nickname`, `password`, `email`) VALUES
(1, 'apocalisse', 'prova', 'apocanow@hotmail.it'),
(4, 'davide', 'prova', 'davewilson@hotmail.it'),
(5, 'root', 'root', '');
