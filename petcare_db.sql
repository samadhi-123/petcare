-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 27, 2026 at 07:14 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petcare_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor_time_table1`
--

CREATE TABLE `doctor_time_table1` (
  `Doctor_Id` varchar(100) NOT NULL,
  `Doctor_name` varchar(100) NOT NULL,
  `Year` varchar(20) NOT NULL,
  `Month` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `start_time` varchar(100) NOT NULL,
  `Leave_time` varchar(100) NOT NULL,
  `specialist` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor_time_table1`
--

INSERT INTO `doctor_time_table1` (`Doctor_Id`, `Doctor_name`, `Year`, `Month`, `Date`, `start_time`, `Leave_time`, `specialist`) VALUES
('1', 'Dr.Jayasinghe', '2026', 'November', '28', '9 am', '6 pm', 'Animal Welfare');

-- --------------------------------------------------------

--
-- Table structure for table `medicale`
--

CREATE TABLE `medicale` (
  `petName` varchar(100) NOT NULL,
  `ownerTel` varchar(20) NOT NULL,
  `description` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicale`
--

INSERT INTO `medicale` (`petName`, `ownerTel`, `description`) VALUES
('rockey', '0729807966', 'he has a fever so i prescribed amoxALIN'),
('rockey', '0729807966', 'he has a stomeache');

-- --------------------------------------------------------

--
-- Table structure for table `payments_details`
--

CREATE TABLE `payments_details` (
  `Date` varchar(100) NOT NULL,
  `ownerId` varchar(100) NOT NULL,
  `petName` varchar(100) NOT NULL,
  `medicine` varchar(100) NOT NULL,
  `quantity` int(100) NOT NULL,
  `unit` int(100) NOT NULL,
  `totalBill` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payments_details`
--

INSERT INTO `payments_details` (`Date`, `ownerId`, `petName`, `medicine`, `quantity`, `unit`, `totalBill`) VALUES
('2026/09/25', '1', 'rockey', 'Bravecto', 3, 700, 8200),
('2026/09/30', '2', 'max', 'Bravecto', 5, 700, 9500);

-- --------------------------------------------------------

--
-- Table structure for table `pet_register`
--

CREATE TABLE `pet_register` (
  `OwnerId` varchar(100) NOT NULL,
  `ownerName` varchar(100) NOT NULL,
  `OwnerTel` varchar(20) NOT NULL,
  `PetName` varchar(100) NOT NULL,
  `PetAge` int(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Breed` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pet_register`
--

INSERT INTO `pet_register` (`OwnerId`, `ownerName`, `OwnerTel`, `PetName`, `PetAge`, `Gender`, `Breed`) VALUES
('1', 'samadhi', '0729807966', 'rockey', 8, 'Male', 'wild'),
('2', 'oshan', '0712345623', 'max', 2, 'Male', 'Jurman sharpet');

-- --------------------------------------------------------

--
-- Table structure for table `register_tbl`
--

CREATE TABLE `register_tbl` (
  `UserId` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `PhoneNo` varchar(20) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Role` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register_tbl`
--

INSERT INTO `register_tbl` (`UserId`, `username`, `Address`, `PhoneNo`, `Password`, `Role`) VALUES
('1', 'samadhi', 'kiribathgoda', '0729807966', '123', 'Manager'),
('2', 'loshana', 'Gampaha', '0789645123', '123', 'Doctor'),
('3', 'kasuni', 'Panadura', '0764563123', 'abc', 'Doctor'),
('4', 'minuthi', 'Horana', '0746589123', '123', 'Staff');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
