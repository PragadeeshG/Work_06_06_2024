create table if not exists flat_file_upload(
upload_id Integer not null,
ds_name varchar(255) null,
file_name varchar(255) null,
uploaded_by varchar(255) null,
remarks varchar(255) null,
next_action varchar(255) null,
approval_required char null,
auto_approval varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint flat_file_upload_pk primary key(upload_id));
