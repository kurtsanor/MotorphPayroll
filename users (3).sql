-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2024 at 07:05 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(255) NOT NULL,
  `Last Name` varchar(255) NOT NULL,
  `First Name` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Birthdate` varchar(255) NOT NULL,
  `Position` varchar(255) NOT NULL,
  `Phone_number` varchar(255) DEFAULT NULL,
  `SSS` varchar(255) DEFAULT NULL,
  `Philhealth` varchar(255) DEFAULT NULL,
  `TIN` varchar(255) DEFAULT NULL,
  `Pagibig` varchar(255) DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL,
  `Basic_salary` varchar(255) DEFAULT NULL,
  `Gross_semi_monthly_rate` varchar(255) DEFAULT NULL,
  `Hourly_rate` varchar(255) DEFAULT NULL,
  `Username` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `Last Name`, `First Name`, `Address`, `Birthdate`, `Position`, `Phone_number`, `SSS`, `Philhealth`, `TIN`, `Pagibig`, `Status`, `Basic_salary`, `Gross_semi_monthly_rate`, `Hourly_rate`, `Username`, `Password`, `Role`) VALUES
(1, 'Garcia III', 'Manuel', 'Valero Carpark Building Valero Street 1227, Makati City', '10/11/1983', 'Chief Executive Officer', '966-860-270\r\n', '44-4506057-3', '820126853951', '442-605-657-000', '691295330870', 'Regular', '90,000', '45,000', '535.71', 'Garcia', '123', 'Employee'),
(2, 'Lim', 'Antonio', 'San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite', '06/19/1988', 'Chief Operating Officer', '171-867-411\r\n', '52-2061274-9\r\n', '331735646338', '683-102-776-000\r\n', '663904995411', 'Regular\r\n', '60,000\r\n', '30,000\r\n', '357.14\r\n', 'Lim', '123', 'Employee'),
(3, 'Aquino ', 'Bianca Sofia ', 'Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City ', '08/04/1989', 'Chief Finance Officer ', '966-889-370\r\n', '30-8870406-2\r\n', '177451189665', '971-711-280-000\r\n', '171519773969', 'Regular\r\n', '60,000\r\n', '30,000\r\n', '357.14\r\n', 'Aquino', '123', 'Employee'),
(4, 'Reyes', 'Isabella', '460 Solanda Street Intramuros 1000, Manila ', '06/16/1994 ', 'Chief Marketing Officer ', '786-868-477\r\n', '40-2511815-0\r\n', '341911411254', '876-809-437-000\r\n', '416946776041', 'Regular\r\n', '60,000\r\n', '30,000\r\n', '357.14\r\n', 'Reyes', '123', 'Employee'),
(5, 'Hernandez', 'Eduard', 'National Highway, Gingoog,  Misamis Occidental', '09/23/1989', 'IT Operations and Systems', '088-861-012\r\n', '50-5577638-1\r\n', '957436191812', '031-702-374-000\r\n', '952347222457', 'Regular\r\n', '52,670\r\n', '26,335\r\n', '313.51\r\n', 'Hernandez', '123', 'Admin'),
(6, 'Villanueva', 'Andrea Mae', '17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ', '02/14/1988', 'HR Manager', '918-621-603\r\n', '49-1632020-8\r\n', '382189453145', '317-674-022-000\r\n', '441093369646', 'Regular\r\n', '52,670\r\n', '26,335\r\n', '313.51\r\n', 'Villanueva', '123', 'Admin'),
(7, 'San Jose', 'Brad', '99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi', '03/15/1996', 'HR Team Leader', '797-009-261\r\n', '40-2400714-1\r\n', '239192926939', '672-474-690-000\r\n', '210850209964', 'Regular\r\n', '42,975\r\n', '21,488\r\n', '255.8\r\n', 'San Jose B', '123', 'Admin'),
(8, 'Romualdez', 'Alice', '12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte ', '05/14/1992', 'HR Rank and File', '983-606-799\r\n', '55-4476527-2\r\n', '545652640232', '888-572-294-000\r\n', '211385556888', 'Regular\r\n', '22,500\r\n', '11,250\r\n', '133.93\r\n', 'Romualdez A', '123', 'Admin'),
(9, 'Atienza', 'Rosie ', '90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte', '09/24/1948', 'HR Rank and File', '266-036-427\r\n', '41-0644692-3\r\n', '708988234853', '604-997-793-000\r\n', '260107732354', 'Regular\r\n', '22,500\r\n', '11,250\r\n', '133.93\r\n', 'Atienza', '123', 'Admin'),
(10, 'Alvaro', 'Roderick', '#284 T. Morato corner, Scout Rallos Street, Quezon City', '03/30/1988', 'Accounting Head', '053-381-386\r\n', '64-7605054-4\r\n', '578114853194', '525-420-419-000', '799254095212', 'Regular\r\n', '52,670\r\n', '26,335\r\n', '313.51\r\n', 'Alvaro', '123', 'Employee'),
(11, 'Salcedo', 'Anthony', '93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate', '09/14/1993', 'Payroll Manager', '070-766-300\r\n', '26-9647608-3\r\n', '126445315651', '210-805-911-000\r\n', '218002473454', 'Regular\r\n', '50,825\r\n', '25,413\r\n', '302.53\r\n', 'Salcedo', '123', 'Employee'),
(12, 'Lopez', 'Josie ', '49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro', '01/14/1987', 'Payroll Team Leader', '478-355-427\r\n', '44-8563448-3\r\n', '431709011012', '218-489-737-000', '113071293354', 'Regular\r\n', '38,475\r\n', '19,238\r\n', '229.02\r\n', 'Lopez', '123', 'Employee'),
(13, 'Farala', 'Martha', '42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte ', '01/11/1942', 'Payroll Rank and File', '329-034-366\r\n', '45-5656375-0\r\n', '233693897247', '210-835-851-000\r\n', '631130283546', 'Regular\r\n', '24,000\r\n', '12,000\r\n', '142.86\r\n', 'Farala', '123', 'Employee'),
(14, 'Martinez', 'Leila', '37/46 Kulas Roads, Maragondon 0962 Quirino ', '07/11/1970', 'Payroll Rank and File', '877-110-749\r\n', '27-2090996-4\r\n', '515741057496', '275-792-513-000\r\n', '101205445886', 'Regular\r\n', '24,000\r\n', '12,000\r\n', '142.86\r\n', 'Martinez', '123', 'Employee'),
(15, 'Romualdez', 'Fredrick ', '22A/52 Lubowitz Meadows, Pililla 4895 Zambales', '03/10/1985', 'Account Manager', '023-079-009\r\n', '26-8768374-1\r\n', '308366860059', '598-065-761-000\r\n', '223057707853', 'Regular\r\n', '53,500\r\n', '26,750\r\n', '318.45\r\n', 'Romualdez F', '123', 'Employee'),
(16, 'Mata', 'Christian', '90 OKeefe Spur Apt. 379, Catigbian 2772 Sulu ', '10/21/1987', 'Account Team Leader', '783-776-744\r\n', '49-2959312-6\r\n', '824187961962', '103-100-522-000\r\n', '631052853464', 'Regular\r\n', '42,975\r\n', '21,488\r\n', '255.8\r\n', 'Mata', '123', 'Employee'),
(17, 'De Leon', 'Selena ', '89A Armstrong Trace, Compostela 7874 Maguindanao', '02/20/1975', 'Account Team Leader', '975-432-139\r\n', '27-2090208-8\r\n', '587272469938', '482-259-498-000\r\n', '719007608464', 'Regular\r\n', '41,850\r\n', '20,925\r\n', '249.11\r\n', 'De Leon', '123', 'Employee'),
(18, 'San Jose', 'Allison ', '08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union', '06/24/1986', 'Account Rank and File', '179-075-129\r\n', '45-3251383-0\r\n', '745148459521', '121-203-336-000\r\n', '114901859343', 'Regular\r\n', '22,500\r\n', '11,250\r\n', '133.93\r\n', 'San Jose', '123', 'Employee'),
(19, 'Rosario', 'Cydney ', '93A/21 Berge Points, Tapaz 2180 Quezon', '10/06/1996', 'Account Rank and File', '868-819-912\r\n', '49-1629900-2\r\n', '579253435499', '122-244-511-000\r\n', '265104358643', 'Regular\r\n', '22,500\r\n', '11,250\r\n', '133.93\r\n', 'Rosario', '123', 'Employee'),
(20, 'Bautista', 'Mark ', '65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino', '02/12/1991', 'Account Rank and File', '683-725-348\r\n', '49-1647342-5\r\n', '399665157135', '273-970-941-000\r\n', '260054585575', 'Regular\r\n', '23,250\r\n', '11,625\r\n', '138.39\r\n', 'Bautista', '123', 'Employee'),
(21, 'Lazaro', 'Darlene ', '47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino', '11/25/1985', 'Account Rank and File', '740-721-558\r\n', '45-5617168-2\r\n', '606386917510', '354-650-951-000\r\n', '104907708845', 'Probationary\r\n', '23,250\r\n', '11,625\r\n', '138.39\r\n', 'Lazaro', '123', 'Employee'),
(22, 'Delos Santos', 'Kolby ', '06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur', '02/26/1980', 'Account Rank and File', '739-443-033\r\n', '52-0109570-6\r\n', '357451271274', '187-500-345-000\r\n', '113017988667', 'Probationary\r\n', '24,000\r\n', '12,000\r\n', '142.86\r\n', 'Delos Santos', '123', 'Employee'),
(23, 'Santos', 'Vella', '99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur', '12/31/1983', 'Account Rank and File', '955-879-269\r\n', '52-9883524-3\r\n', '548670482885', '101-558-994-000\r\n', '360028104576', 'Probationary\r\n', '22,500\r\n', '11,250\r\n', '133.93\r\n', 'Santos', '123', 'Employee'),
(24, 'Del Rosario', 'Tomas', '80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque', '12/18/1978', 'Account Rank and File', '882-550-989\r\n', '45-5866331-6\r\n', '953901539995', '560-735-732-000\r\n', '913108649964', 'Probationary\r\n', '22,500\r\n', '11,250\r\n', '133.93\r\n', 'Del Rosario', '123', 'Employee'),
(25, 'Tolentino', 'Jacklyn', '96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao', '05/19/1984', 'Account Rank and File', '675-757-366\r\n', '47-1692793-0\r\n', '753800654114', '841-177-857-000\r\n', '210546661243', 'Probationary\r\n', '24,000\r\n', '12,000\r\n', '142.86\r\n', 'Tolentino', '123', 'Employee'),
(32, 'd', 'd', 'd', 'd', 'd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(33, 's', 's', 's', 's', 's', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
