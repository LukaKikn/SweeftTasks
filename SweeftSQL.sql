CREATE TABLE teacher(
    TeacherID varchar(10) PRIMARY KEY, 
    t_name varchar(30),
    t_lastname varchar(30), 
    t_gender varchar(6), 
    t_subject varchar(20)
);

CREATE TABLE pupil(
    PupilID varchar(15) PRIMARY KEY, 
    s_name varchar(35),
    s_lastname varchar(35), 
    s_gender varchar(6), 
    s_class varchar(20)
);  

CREATE TABLE ClassStudentRelation(
    PupilID varchar(15) NOT NULL,
    TeacherID varchar(14) NOT NULL,
    FOREIGN KEY (PupilID) REFERENCES pupil(PupilID), 
    FOREIGN KEY (TeacherID) REFERENCES teacher(TeacherID),
    UNIQUE (PupilID, TeacherID)
);
insert into teacher(TeacherID, t_name,t_lastname,t_gender,t_subject)
values 
(1,'Davit', 'Davitadze', 'Male', 'History'),
(2,'Gela', 'Gelashvili', 'Male', 'Math'),
(3,'Bakuri', 'Bakuradze', 'Male', 'Art');

insert into pupil(PupilID, s_name,s_lastname,s_gender)
values 
(1,'Giorgi', 'Giorgadze', 'Male'),
(2,'Nika', 'Dadiani', 'Male'),
(3,'Gurami', 'Guramishvili', 'Male'),
(4,'Gulo', 'Guliashvili', 'Female');

insert into ClassStudentRelation(TeacherID,PupilID)
values
(1,2),
(1,3),
(2,3),
(2,1),
(3,1),
(3,2),
(3,3);
SELECT t_name FROM ClassStudentRelation c 
INNER JOIN pupil p ON c.PupilID=p.PupilID
INNER JOIN teacher t ON c.TeacherID= t.TeacherID
WHERE p.s_name ='Giorgi'