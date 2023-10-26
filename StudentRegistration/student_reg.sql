-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 24, 2023 at 01:55 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_reg`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `id` int(11) NOT NULL,
  `idnumber` varchar(12) NOT NULL,
  `lastname` varchar(15) NOT NULL,
  `firstname` varchar(25) NOT NULL,
  `middle` varchar(1) NOT NULL,
  `age` int(2) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(120) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`id`, `idnumber`, `lastname`, `firstname`, `middle`, `age`, `gender`, `dob`, `address`, `created_at`, `updated_at`) VALUES
(1, 'TUPV-22-0508', 'EDWIN', 'BAYOG', 'P', 21, 'Male', '2002-07-22', 'Prk. Sigay, Zone 3, Talisay City, Neg. Occ.', '2023-10-10 11:19:00', '2023-10-17 10:45:31'),
(3, 'TUPV-22-0001', 'AMBONG', 'HANS', 'P', 20, 'Male', '2003-10-09', 'BAGO CITY', '2023-10-17 10:56:45', '2023-10-17 10:56:45'),
(4, 'TUPV-22-0002', 'DIAZ', 'JAY', 'P', 20, 'Male', '2002-07-02', 'EB MAGALONA', '2023-10-17 10:58:42', '2023-10-17 10:58:42'),
(5, 'TUPV-22-0003', 'TAPPA', 'NESTOR LUIS', 'P', 20, 'Male', '2023-10-09', 'MURCIA', '2023-10-17 11:05:35', '2023-10-17 11:05:35');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL,
  `idnumber` varchar(12) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id`, `idnumber`, `username`, `password`, `fullname`, `created_at`, `updated_at`) VALUES
(1, '', 'admin', 'password', 'Jason John Quintanilla', '2023-10-17 09:20:26', '2023-10-17 09:20:26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_student`
--
ALTER TABLE `tbl_student`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_idno` (`idnumber`),
  ADD KEY `idx_ln` (`lastname`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idx_un` (`username`),
  ADD KEY `idx_idno` (`idnumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
