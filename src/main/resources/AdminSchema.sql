CREATE TABLE BOARD (
    owner_seq  INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    owner_id VARCHAR(100) NOT NULL,
    owner_pwd VARCHAR(100) NOT NULL,
    owner_name VARCHAR(10) NOT NULL,
    owner_phone INT NOT NULL,
    sign_date TIMESTAMP NOT NULL,
    store_num INT UNSIGNED NOT NULL,
    acceptance_as_validation BOOLEAN NOT NULL
)