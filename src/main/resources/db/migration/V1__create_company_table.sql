CREATE TABLE companies (
                           idrecno BIGSERIAL PRIMARY KEY,
                           name VARCHAR(150) NOT NULL,
                           document VARCHAR(20) NOT NULL UNIQUE,
                           email VARCHAR(150),
                           phone VARCHAR(20),
                           active BOOLEAN NOT NULL DEFAULT TRUE,
                           created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                           updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);