/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/30/24, 2:26 AM
 *
 */
create table public.routes
(
    id         bigint       not null
        primary key,
    created_at timestamp(6) not null,
    updated_at timestamp(6),
    path       varchar(255)
);

alter table public.routes
    owner to postgres;

create table public.callbacks
(
    id         bigint       not null
        primary key,
    created_at timestamp(6) not null,
    updated_at timestamp(6),
    payload    varchar(255),
    type       varchar(255),
    route_id   bigint
        constraint fkflaako9w4qxs012l0nwa7v0kr
            references public.routes
);

alter table public.callbacks
    owner to postgres;

create table public.routes_callbacks
(
    routes_id    bigint not null
        constraint fkspidm306thsgx15n9pm1n6vf
            references public.routes,
    callbacks_id bigint not null
        constraint uk6i27k1gegiasrwv3ekbfx7rti
            unique
        constraint fk5fkdc4uf88csosf7ladb9uu0a
            references public.callbacks
);

alter table public.routes_callbacks
    owner to postgres;

create table public.users
(
    id         bigint       not null
        primary key,
    created_at timestamp(6) not null,
    updated_at timestamp(6),
    email      varchar(255)
        constraint uk6dotkott2kjsp8vw4d0m25fb7
            unique,
    name       varchar(255),
    password   varchar(255)
);

alter table public.users
    owner to postgres;