-- V1__update_column_customer_identification_number.sql

-- Rename the column
ALTER TABLE banking_core_user RENAME COLUMN customerIdentificationNumber TO customer_identification_number;
