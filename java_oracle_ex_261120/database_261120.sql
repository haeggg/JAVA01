
CREATE TABLE USERS(
    USERID             VARCHAR2(10),
    USERNAME           VARCHAR2(10),
    USERPASSWORD       VARCHAR2(10),
    USERAGE            NUMBER(5),
    USERMAIL           VARCHAR2(30)
);

select * from users;

CREATE TABLE board(
    bno                  Number(10),
    btitle               VARCHAR2(10),
    bcontent             VARCHAR2(30),
    bfilename            VARCHAR2(20),
    bfiledata            BLOB
);

DROP TABLE board;

select * from board;


CREATE TABLE User2(
    userId             VARCHAR2(10),
    userName           VARCHAR2(10),
    userPassword       VARCHAR2(30),
    userAge            NUMBER(5),
    userEmail          VARCHAR2(20)
);

select * from User2;