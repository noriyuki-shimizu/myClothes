-- drop all tables

drop table if exists my_clothes;
drop table if exists m_genre;
drop table if exists m_shop;
drop table if exists m_image;
drop table if exists m_log;



-- create tables

-- 私の服
create table if not exists my_clothes (
	my_clothes_id bigserial PRIMARY KEY,
	brand_name varchar(30) NOT NULL,
	genre_id int NOT NULL,
	shop_id int NOT NULL,
	image_id int,
	price money,
	purchase_date date,
	details text,
	delete_flg boolean NOT NULL
);

-- ジャンルマスタ
create table if not exists m_genre (
	genre_id serial PRIMARY KEY,
	genre_cd varchar(15) NOT NULL,
	genre_name varchar(20) NOT NULL,
	insert_date date NOT NULL,
	delete_flg boolean NOT NULL
);

-- 店マスタ
create table if not exists m_shop (
	shop_id serial PRIMARY KEY,
	shop_cd varchar(10) NOT NULL,
	shop_name varchar(30) NOT NULL,
	postal_cd varchar(10),
	address varchar(40),
	shop_url varchar(100),
	insert_date date NOT NULL,
	delete_flg boolean NOT NULL
);

-- 画像マスタ
create table if not exists m_image (
	image_id bigserial PRIMARY KEY,
	image_cd varchar(30) NOT NULL,
	image_pass text NOT NULL,
	insert_date date NOT NULL	
);

-- ログマスタ
create table if not exists m_log (
	log_id bigserial primary key,
	log_date date not null,
	log_value text not null
);