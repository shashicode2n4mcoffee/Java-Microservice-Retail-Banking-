
-- banking_core_service.banking_core_user definition
CREATE TABLE banking_core_user (
    id SERIAL NOT NULL,
    email varchar(255) DEFAULT NULL,
    first_name varchar(255) DEFAULT NULL,
    customerIdentificationNumber varchar(255) DEFAULT NULL,
    last_name varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
);

-- banking_core_service.banking_core_account definition

CREATE TABLE banking_core_account (
    id SERIAL NOT NULL,
    actual_balance decimal(19, 2) DEFAULT NULL,
    available_balance decimal(19, 2) DEFAULT NULL,
    number varchar(255) DEFAULT NULL,
    status varchar(255) DEFAULT NULL,
    type varchar(255) DEFAULT NULL,
    user_id bigint DEFAULT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES banking_core_user (id)
);

-- banking_core_service.banking_core_utility_account definition
create table banking_core_utility_account(
id serial primary key,
number varchar(255) default null,
provider_name varchar(255) default null
)