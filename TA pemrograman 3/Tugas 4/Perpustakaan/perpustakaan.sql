-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Waktu pembuatan: 21. Desember 2012 jam 01:51
-- Versi Server: 5.5.16
-- Versi PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
  `id_buku` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `nama_buku` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `penulis` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `penerbit` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `deskripsi` text COLLATE latin1_general_ci NOT NULL,
  `no_rak` int(10) NOT NULL,
  `id_kategori` int(10) NOT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `nama_buku`, `penulis`, `penerbit`, `deskripsi`, `no_rak`, `id_kategori`) VALUES
('5', 'asd', 'asd', 'asd', 'sad', 23, 3),
('2', 'PHP 5', 'Ir. Dr. M. Sidratul Muntaha', 'Jaya Abadi', 'buku inisangat bagus sekali lohh...', 7, 4),
('1', 'Java Dasar', 'Rafii Pratama', 'Gramedia', 'buku ini khusus untuk pemula yang ingin belajar JAVA\n', 8, 4),
('23', 'aw', 'sad', 'sadsa', 'dasdasd', 25, 5),
('3', 'sdf', 'sd', 'sdf', 'sdf', 21, 1),
('4', 'asd', 'sef', 'sadf', 'awe', 23, 2),
('345', 'eafrsdfsdfwefdsf', 'asd', 'asd', 'asd', 24, 6);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE IF NOT EXISTS `kategori` (
  `id_kategori` int(10) NOT NULL AUTO_INCREMENT,
  `nama_kategori` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `deskripsi` varchar(100) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`id_kategori`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=7 ;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`, `deskripsi`) VALUES
(1, 'Arsitektur', ''),
(2, 'Elektro', ''),
(3, 'Industri', ''),
(4, 'Informatika', ''),
(5, 'Mesin', ''),
(6, 'Sipil', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `nama_lengkap` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `password` int(20) NOT NULL,
  `jenis_kelamin` varchar(10) COLLATE latin1_general_ci NOT NULL,
  `email` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `alamat` text COLLATE latin1_general_ci NOT NULL,
  `jurusan` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `NPM` varchar(20) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama_lengkap`, `password`, `jenis_kelamin`, `email`, `alamat`, `jurusan`, `NPM`) VALUES
('Febry', 'Febry Damatraseta', 1234, 'Pria', 'febryfairuz@gmail.com', 'Dihatimu yang paling dalam', 'Teknik Informatika', '4510210039'),
('Rafi', 'Muhammad Rafii Pratama', 123, 'Pria', 'rafi@gmail.com', 'Disisimu yang sedang kesepian', 'Teknik Informatika', '4510210038');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
