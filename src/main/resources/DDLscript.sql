create table event
(
    id          bigint auto_increment
        primary key,
    event_name  varchar(50) not null,
    user_ip     varchar(39) null,
    user_status varchar(12) not null,
    date        datetime    not null
);