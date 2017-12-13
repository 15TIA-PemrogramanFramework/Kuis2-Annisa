-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.44
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1010`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1010`
--

CREATE TABLE `identitas_1010` (
  `id_mahasiswa` bigint(20) NOT NULL,
  `nama_mahasiswa` varchar(100) DEFAULT NULL,
  `prodi` varchar(100) DEFAULT NULL,
  `tahunmasuk` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1010`
--

INSERT INTO `identitas_1010` (`id_mahasiswa`, `nama_mahasiswa`, `prodi`, `tahunmasuk`) VALUES
(11, 'Annisa Harlina P', 'TI', '2015'),
(13, 'Saarah', 'TI', '2015');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1010`
--

CREATE TABLE `ipk_1010` (
  `id_matkul` bigint(20) NOT NULL,
  `id_mahasiswa` varchar(100) NOT NULL,
  `ipk` varchar(100) DEFAULT NULL,
  `semester` varchar(100) DEFAULT NULL,
  `identitas_1010_id_mahasiswa` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1010`
--

INSERT INTO `ipk_1010` (`id_matkul`, `id_mahasiswa`, `ipk`, `semester`, `identitas_1010_id_mahasiswa`) VALUES
(27, 'annisa', '4', '7', 11);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1010`
--
ALTER TABLE `identitas_1010`
  ADD PRIMARY KEY (`id_mahasiswa`),
  ADD UNIQUE KEY `UK_anvy6278q7cpqjjquclof2ofa` (`nama_mahasiswa`);

--
-- Indexes for table `ipk_1010`
--
ALTER TABLE `ipk_1010`
  ADD PRIMARY KEY (`id_matkul`),
  ADD UNIQUE KEY `UK_3iij4pk9pgj61fqjua8rbo2lk` (`id_mahasiswa`),
  ADD UNIQUE KEY `id_mahasiswa` (`id_mahasiswa`),
  ADD KEY `FK3wkker6y7acdav8wbrtkebwt2` (`identitas_1010_id_mahasiswa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1010`
--
ALTER TABLE `identitas_1010`
  MODIFY `id_mahasiswa` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `ipk_1010`
--
ALTER TABLE `ipk_1010`
  MODIFY `id_matkul` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1010`
--
ALTER TABLE `ipk_1010`
  ADD CONSTRAINT `FK3wkker6y7acdav8wbrtkebwt2` FOREIGN KEY (`identitas_1010_id_mahasiswa`) REFERENCES `identitas_1010` (`id_mahasiswa`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
