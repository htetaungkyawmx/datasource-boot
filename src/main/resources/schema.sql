create table employee(
    id int not null,
    first_name varchar(60),
    last_name varchar(60),
    email varchar(60),
    phone_number varchar(60),
    hired_date date,
    salary float,
    primary key (id)
);