use adlister_db;

CREATE TABLE ads (
  id int auto_increment primary key NOT NULL,
  user_id int NOT NULL,
  title VARCHAR(240),
  description VARCHAR(480),
  FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE users (
  id int auto_increment primary key NOT NULL,
  username VARCHAR(240),
  email VARCHAR(240),
  password VARCHAR(240)
);
