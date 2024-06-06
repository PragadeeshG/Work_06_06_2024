create table if not exists flat_file_upload_approver(
reference_table_id Integer not null,
ds_name varchar(255) null,
appr_grp varchar(255) null,
appr_type varchar(255)  null,
appr_scope varchar(255) null,
appr_sequence Integer null,
grp_type_sequence Integer null,
custodian_grp varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint flat_file_upload_approver_pk primary key(reference_table_id));