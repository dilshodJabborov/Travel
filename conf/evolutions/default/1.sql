# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "Users" ("Userid" SERIAL NOT NULL PRIMARY KEY,"firstName" VARCHAR(254) DEFAULT '' NOT NULL,"lasttName" VARCHAR(254) DEFAULT '' NOT NULL,"gender" VARCHAR(254) DEFAULT '' NOT NULL,"eMail" VARCHAR(254) DEFAULT '' NOT NULL,"password" VARCHAR(254) DEFAULT '' NOT NULL,"birthYear" VARCHAR(254) DEFAULT '' NOT NULL);

# --- !Downs

drop table "Users";

