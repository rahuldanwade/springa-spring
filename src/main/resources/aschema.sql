create table users(
	username varchar_ignorecase(50) not null primary key,
	password varchar_ignorecase(50) not null,
	enabled boolean not null
);

create table authorities (
	username varchar_ignorecase(50) not null,
	authority varchar_ignorecase(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

insert into users(username, password, enabled)
values("neev", "neev", true);

insert into users(username, password, enabled)
values("rahul", "rahul", true);

insert into users(username, password, enabled)
values("pratima", "pratima", true);

insert into authorities(username, authority)
values("neev","ROLE_ADMIN",);

insert into authorities(username, authority)
values("rahul","ROLE_USER",);

insert into authorities(username, authority)
values("pratima","ROLE_ADMIN",);