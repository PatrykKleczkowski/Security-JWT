-- CREATE TABLE IF NOT EXISTS `role` (
--   `role_id` INT NOT NULL AUTO_INCREMENT,
--   `role_name` VARCHAR(45) NOT NULL,
--   PRIMARY KEY (`role_id`));
--
--  CREATE TABLE IF NOT EXISTS `user` (
--   `user_id` INT NOT NULL AUTO_INCREMENT,
--   `first_name` VARCHAR(45) NOT NULL,
--   `last_name` VARCHAR(45) NOT NULL,
--   `role_id` INT NOT NULL,
--   PRIMARY KEY (`user_id`, `role_id`),
--   INDEX `fk_user_role_idx` (`role_id` ASC),
--   CONSTRAINT `fk_user_role`
--     FOREIGN KEY (`role_id`)
--     REFERENCES `mydatabase`.`role` (`role_id`)
--     ON DELETE NO ACTION
--     ON UPDATE NO ACTION);

Create table role(
 id INT NOT NULL AUTO_INCREMENT,
  role_name VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));
);

Create table User (
user_id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  password VARCHAR(20) NOT NULL,
  Primary Key (user_id)
  );

Create table User_roles (
users_user_id int not null,
roles_id int not null
);

    
insert into role (role_name) values ("ROLE_USER");
insert into role (role_name) values ("ROLE_SELLER");
insert into role (role_name) values ("ROLE_SUPER_ADMIN");

insert into user (username, last_name, password) values ("Patryk", "Kleczkowski", "lol123");
insert into user (username, last_name, password) values ("Carl", "Johnson", "lol123");
insert into user (username, last_name, password) values ("Janusz", "Tracz", "lol123");

insert into User_roles (users_user_id, roles_id) values (1,1);
insert into User_roles (users_user_id, roles_id) values (2,2);
insert into User_roles (users_user_id, roles_id) values (3,3);






