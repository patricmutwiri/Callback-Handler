/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 1:38 PM
 *
 */

CREATE TABLE IF NOT EXISTS users (id serial PRIMARY KEY, name text NOT NULL, email text NOT NULL, password text NOT NULL);
create table if not exists public.callbacks
(
    id      bigint not null
        primary key,
    payload varchar(255),
    route   varchar(255),
    type    varchar(255)
);

alter table public.callbacks
    owner to postgres;

