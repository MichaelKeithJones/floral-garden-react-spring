CREATE DATABASE IF NOT EXISTS flowergarden_db;

CREATE USER flowergarden_user@localhost IDENTIFIED BY 'p@$$w0rd';
GRANT ALL ON flowergarden_db.* TO flowergarden_user@localhost;
