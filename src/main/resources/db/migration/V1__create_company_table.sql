CREATE TABLE companies (
                           id BIGSERIAL PRIMARY KEY,
                           corporate_name VARCHAR(255) NOT NULL,
                           trade_name VARCHAR(255),
                           document VARCHAR(20) NOT NULL,
                           state_registration VARCHAR(30),
                           municipal_registration VARCHAR(30),
                           email VARCHAR(255),
                           phone VARCHAR(20),
                           active VARCHAR(1),
                           status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
                           created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

                           CONSTRAINT uk_companies_document UNIQUE (document)
);

CREATE INDEX idx_companies_corporate_name
    ON companies (corporate_name);

CREATE INDEX idx_companies_trade_name
    ON companies (trade_name);