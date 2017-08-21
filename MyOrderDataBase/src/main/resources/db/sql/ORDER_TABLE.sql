DROP TABLE IF EXISTS ORDER_TABLE;

CREATE TABLE ORDER_TABLE (
  ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
  CLIENT VARCHAR(255) NOT NULL,
  ADDRESS VARCHAR(255) NOT NULL,
  ORDERDATE DATE NOT NULL,

  PRIMARY KEY(ID)
);