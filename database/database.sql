CREATE TABLE `user_roles` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `users` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `email` varchar(255),
  `identification` varchar(255),
  `full_name` varchar(255),
  `password` varchar(255),
  `user_role` int,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `password_resets` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `token` varchar(255),
  `user_id` int,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `locations` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `location` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `location_sections` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `section` varchar(255),
  `location_id` int,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `copy_categories` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `category` varchar(255),
  `location_section_id` int,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `copy_authors` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `author` varchar(255),
  `birth_date` timestamp DEFAULT (now()),
  `death_date` timestamp DEFAULT (now()),
  `description` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `copy_type` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `type` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `editorials` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `editorial` varchar(255),
  `phone` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `copies` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `isbn` varchar(255),
  `name` varchar(255),
  `quantity` int,
  `publish_at` timestamp DEFAULT (now()),
  `total_pages` int,
  `editorial_id` int,
  `copy_category` int,
  `copy_author` int,
  `copy_type` int,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `interest_rates` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `percent` double,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `loan_plan_types` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `recurrence` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `loan_plans` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `loan_plan_type` int,
  `count` int,
  `type` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

CREATE TABLE `copy_loans` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `cost` double,
  `identification` varchar(255),
  `user_id` int,
  `copy_id` int,
  `loan_plan` int,
  `delay_percent` int,
  `return_date` timestamp DEFAULT (now()),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now())
);

ALTER TABLE `users` ADD FOREIGN KEY (`user_role`) REFERENCES `user_roles` (`id`);

ALTER TABLE `password_resets` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `location_sections` ADD FOREIGN KEY (`location_id`) REFERENCES `locations` (`id`);

ALTER TABLE `copy_categories` ADD FOREIGN KEY (`location_section_id`) REFERENCES `location_sections` (`id`);

ALTER TABLE `copies` ADD FOREIGN KEY (`editorial_id`) REFERENCES `editorials` (`id`);

ALTER TABLE `copies` ADD FOREIGN KEY (`copy_category`) REFERENCES `copy_categories` (`id`);

ALTER TABLE `copies` ADD FOREIGN KEY (`copy_author`) REFERENCES `copy_authors` (`id`);

ALTER TABLE `copies` ADD FOREIGN KEY (`copy_type`) REFERENCES `copy_type` (`id`);

ALTER TABLE `loan_plans` ADD FOREIGN KEY (`loan_plan_type`) REFERENCES `loan_plan_types` (`id`);

ALTER TABLE `copy_loans` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `copy_loans` ADD FOREIGN KEY (`copy_id`) REFERENCES `copies` (`id`);

ALTER TABLE `copy_loans` ADD FOREIGN KEY (`loan_plan`) REFERENCES `loan_plans` (`id`);

ALTER TABLE `copy_loans` ADD FOREIGN KEY (`delay_percent`) REFERENCES `interest_rates` (`id`);
