CREATE TABLE companies (
                           id BIGSERIAL PRIMARY KEY,
                           corporate_name VARCHAR(255) NOT NULL,
                           trade_name VARCHAR(255),
                           document VARCHAR(20) NOT NULL UNIQUE,
                           state_registration VARCHAR(20),
                           municipal_registration VARCHAR(20),
                           email VARCHAR(255),
                           phone VARCHAR(20),
                           active BOOLEAN NOT NULL DEFAULT TRUE,
                           created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);