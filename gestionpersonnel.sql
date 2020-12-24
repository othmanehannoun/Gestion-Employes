-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : jeu. 24 déc. 2020 à 22:40
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionpersonnel`
--

-- --------------------------------------------------------

--
-- Structure de la table `manutantion`
--

CREATE TABLE `manutantion` (
  `id` int(11) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `dateEntr` varchar(10) NOT NULL,
  `salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `manutantion`
--

INSERT INTO `manutantion` (`id`, `nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES
(1, 'aaaaaa', 'aaaaaaaaa', '23', '2019', 3600);

-- --------------------------------------------------------

--
-- Structure de la table `presenteur`
--

CREATE TABLE `presenteur` (
  `id` int(11) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntr` varchar(10) NOT NULL,
  `salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `presenteur`
--

INSERT INTO `presenteur` (`id`, `nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES
(1, 'azizi', 'hamid', 23, '2003', 4500),
(2, 'bigRami', 'tarik', 25, '2008', 500);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

CREATE TABLE `producteur` (
  `id` int(11) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `dateEntr` varchar(10) NOT NULL,
  `salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `producteur`
--

INSERT INTO `producteur` (`id`, `nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES
(1, 'aaaaa', 'ghizlan', '20', '2019', 15000);

-- --------------------------------------------------------

--
-- Structure de la table `vendeur`
--

CREATE TABLE `vendeur` (
  `idV` int(11) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `age` varchar(200) NOT NULL,
  `dateEntr` varchar(200) NOT NULL,
  `salaire` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `vendeur`
--

INSERT INTO `vendeur` (`idV`, `nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES
(1, 'othmane', 'hannoune', '22', '2002', 3500);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `manutantion`
--
ALTER TABLE `manutantion`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `presenteur`
--
ALTER TABLE `presenteur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `producteur`
--
ALTER TABLE `producteur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vendeur`
--
ALTER TABLE `vendeur`
  ADD PRIMARY KEY (`idV`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `manutantion`
--
ALTER TABLE `manutantion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `presenteur`
--
ALTER TABLE `presenteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `producteur`
--
ALTER TABLE `producteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `vendeur`
--
ALTER TABLE `vendeur`
  MODIFY `idV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
