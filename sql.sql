USE `water_service`;
CREATE TABLE `customer` (
  `customerId` bigint NOT NULL AUTO_INCREMENT,
  `fullName` text,
  `email` text,
  `address` text,
  `phoneNumber` text,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;