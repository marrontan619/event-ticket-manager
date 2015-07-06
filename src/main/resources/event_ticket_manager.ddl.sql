-- Project Name : event_ticket_manager
-- Date/Time    : 2015/07/06 16:18:14
-- Author       : marrontan619
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- 参加者
create table participant (
  participant_id VARCHAR(32) not null comment '参加者ID'
  , event_id INT not null comment 'イベントID'
  , rank SMALLINT comment '順位'
  , constraint participant_PKC primary key (participant_id,event_id)
) comment '参加者' ;

-- 貸借
create table loan (
  loan_id INT not null comment '貸借ID'
  , ticket_id INT not null comment 'チケットID'
  , lender_id VARCHAR(32) not null comment '貸与者ID'
  , borrower_id VARCHAR(32) not null comment '借用者ID'
  , cleared_flag BOOLEAN default false not null comment '精算済みフラグ'
  , note TEXT comment '備考'
  , constraint loan_PKC primary key (loan_id,ticket_id,lender_id,borrower_id)
) comment '貸借' ;

-- チケット
create table ticket (
  ticket_id INT not null AUTO_INCREMENT comment 'チケットID'
  , event_id INT not null comment 'イベントID'
  , published_flag BOOLEAN default false not null comment '発券済みフラグ'
  , price INT comment '額面'
  , owner_id VARCHAR(256) comment '所有者ID'
  , user_id VARCHAR(256) comment '使用予定者ID'
  , note TEXT comment '備考'
  , constraint ticket_PKC primary key (ticket_id,event_id)
) comment 'チケット' ;

-- イベント
create table event (
  event_id INT not null AUTO_INCREMENT comment 'イベントID'
  , event_name VARCHAR(256) not null comment 'イベント名'
  , event_date DATETIME comment '日時'
  , location VARCHAR(128) comment '場所'
  , url VARCHAR(512) comment 'URL'
  , participant_id TEXT comment '参加者ID'
  , description TEXT comment '説明'
  , constraint event_PKC primary key (event_id)
) comment 'イベント' ;

-- ユーザー
create table users (
  id VARCHAR(32) not null comment 'ID'
  , password VARCHAR(32) not null comment 'パスワード'
  , user_name VARCHAR(128) not null comment '名前'
  , constraint users_PKC primary key (id)
) comment 'ユーザー' ;

