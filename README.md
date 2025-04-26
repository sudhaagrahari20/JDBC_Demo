#simple-jdbc-crud

mysql> create database jdbc_db;
Query OK, 1 row affected (0.09 sec)

mysql> use jdbc_db;
Database changed

mysql> create table register(name varchar(100), email varchar(100), password varchar(100), gender varchar(10), city varchar(50));
Query OK, 0 rows affected (0.18 sec)

mysql> desc register;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| name     | varchar(100) | YES  |     | NULL    |       |
| email    | varchar(100) | YES  |     | NULL    |       |
| password | varchar(100) | YES  |     | NULL    |       |
| gender   | varchar(10)  | YES  |     | NULL    |       |
| city     | varchar(50)  | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
5 rows in set (0.12 sec)

mysql> select * from register;
Empty set (0.07 sec)

mysql> select * from register;
+--------+------------------+-----------+--------+-------+
| name   | email            | password  | gender | city  |
+--------+------------------+-----------+--------+-------+
| sakshi | sakshi@gmail.com | sakshi123 | female | delhi |
+--------+------------------+-----------+--------+-------+
1 row in set (0.00 sec)

mysql> select * from register;
+--------+------------------+-----------+--------+--------+
| name   | email            | password  | gender | city   |
+--------+------------------+-----------+--------+--------+
| sakshi | sakshi@gmail.com | sakshi123 | female | delhi  |
| ram    | ram@gmail.com    | ram1234   | male   | amethi |
+--------+------------------+-----------+--------+--------+
2 rows in set (0.00 sec)

mysql> select * from register;
+--------+------------------+-----------+--------+--------+
| name   | email            | password  | gender | city   |
+--------+------------------+-----------+--------+--------+
| sakshi | sakshi@gmail.com | sakshi123 | female | delhi  |
| ram    | ram@gmail.com    | ram1234   | male   | amethi |
| Sudha  | sudha@gmail.com  | sudha234  | male   | mumbai |
| Annki  | annkit@gmail.com | annkit23  | male   | noida  |
+--------+------------------+-----------+--------+--------+
4 rows in set (0.00 sec)

mysql> select * from register;
+--------+------------------+-----------+--------+--------+
| name   | email            | password  | gender | city   |
+--------+------------------+-----------+--------+--------+
| sakshi | sakshi@gmail.com | sakshi123 | female | delhi  |
| ram    | ram@gmail.com    | ram1234   | male   | amethi |
| Sudha  | sudha@gmail.com  | sudha234  | male   | pune   |
| Annki  | annkit@gmail.com | annkit23  | male   | noida  |
+--------+------------------+-----------+--------+--------+
4 rows in set (0.07 sec)

mysql> select * from register;
+--------+------------------+-----------+--------+--------+
| name   | email            | password  | gender | city   |
+--------+------------------+-----------+--------+--------+
| sakshi | sakshi@gmail.com | sakshi123 | female | delhi  |
| ram    | ram@gmail.com    | ram1234   | male   | amethi |
| Sudha  | sudha@gmail.com  | sudha234  | female | pune   |
| Annki  | annkit@gmail.com | annkit23  | male   | noida  |
+--------+------------------+-----------+--------+--------+
4 rows in set (0.00 sec)

mysql> select * from register;
+--------+------------------+-----------+--------+-------+
| name   | email            | password  | gender | city  |
+--------+------------------+-----------+--------+-------+
| sakshi | sakshi@gmail.com | sakshi123 | female | delhi |
| Sudha  | sudha@gmail.com  | sudha234  | female | pune  |
| Annki  | annkit@gmail.com | annkit23  | male   | noida |
+--------+------------------+-----------+--------+-------+
3 rows in set (0.00 sec)

mysql> show tables;
+-------------------+
| Tables_in_jdbc_db |
+-------------------+
| register          |
+-------------------+
1 row in set (0.14 sec)

mysql>
