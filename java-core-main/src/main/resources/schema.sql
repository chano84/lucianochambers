CREATE TABLE MESSAGES (
	id long,
	from_id long,
	to_id long,
 	content varchar(50)
);

CREATE TABLE CONTACTS (
	id long,
	name VARCHAR(100),
	is_group bit,
	description varchar(100)
);

CREATE TABLE GROUP_CONTACTS (
	id_group long,
	id_contact long
);

CREATE TABLE NOTIFICATIONS (
	id long auto_increment,
	message_id long,
	contact_id long
);