CREATE TABLE movie(
        id BIGSERIAL PRIMARY KEY,
        name TEXT NOT NULL,
        release_date DATE not null,
        unique (name)
);
