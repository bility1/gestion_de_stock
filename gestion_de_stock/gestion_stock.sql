-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Lun 26 Mars 2018 à 19:09
-- Version du serveur: 5.5.8
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `gestion_stock`
--

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code_prod` int(11) NOT NULL,
  `designation` varchar(30) NOT NULL,
  `reference` varchar(30) NOT NULL,
  `fournisseur` varchar(30) NOT NULL,
  `remise` int(11) NOT NULL,
  `prix` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `rangement` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`id`, `code_prod`, `designation`, `reference`, `fournisseur`, `remise`, `prix`, `stock`, `rangement`) VALUES
(2,' 4', 'poisson', 'fruit de mer', 'aqua freche', 0, 223, 115, 'lma'),
(3, '136', 'nourii', 'ble ', 'fourn2', 5, 5, 5, 'hj'),
(4, '33', 'pomme', 'fruit', 'Four4', 8, 224, 1014, 'fruit1'),
(5, '788', 'cocholat', 'bio', 'fourn19', 2, 987, 2, 'rang3'),
(6, '58', 'biscuit', 'bonbon', 'bon', 5, 785, 15, 'rang4'),
(7, '12', 'jeu de fruit', 'Boisson', 'four1', 12, 100, 200, 'rang1');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `id_user`, `username`, `password`, `type`) VALUES
(1, 1, 'bility', 'bility', 'directeur'),
(2, 2, 'aliou', 'diallo', 'directeur'),
(3, 3, 'bousso', 'bousso', 'directeur'),
(6, 4, 'tiago', 'tiago', 'directeur');

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

CREATE TABLE IF NOT EXISTS `vente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num_fac` int(11) NOT NULL,
  `code_prod` int(11) NOT NULL,
  `reference` varchar(30) NOT NULL,
  `prix_vente` int(11) NOT NULL,
  `stock_sortie` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `vente`
--

INSERT INTO `vente` (`id`, `num_fac`, `code_prod`, `reference`, `prix_vente`, `stock_sortie`, `subtotal`) VALUES
(1, 2, 58, 'bonbon', 746, 1263, 941882),
(3, 9, 33, 'fruit', 206, 200000, 41216000),
(4, 9, 33, 'fruit', 206, 222, 45750),
(5, 8, 136, 'ble ', 5, 100, 475),
(6, 9, 4, 'fruit de mer', 223, 100, 22300),
(7, 6, 7, '12', 50, 10, 500),
(8, 4, 33, 'fruit', 206, 10, 2061),
(9, 4, 33, 'fruit', 206, 10, 2061);
