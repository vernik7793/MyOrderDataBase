DROP TABLE IF EXISTS ORDERLINE_TABLE;

CREATE TABLE ORDERLINE_TABLE (
  ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
  ID_ORDER BIGINT NOT NULL,
  GOODS VARCHAR(255) NOT NULL,
  COUNT INT NOT NULL,
  PRICE DOUBLE NOT NULL,

  PRIMARY KEY(ID)
)