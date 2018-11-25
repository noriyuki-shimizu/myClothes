-- drop all tables

drop table if exists b_screen;
drop table if exists b_menu;

drop table if exists my_clothes;
drop table if exists m_brand;
drop table if exists m_genre;
drop table if exists m_shop;
drop table if exists m_log;


-- create tables base
-- メニューマスタ
create table b_menu (
	menu_id bigserial PRIMARY KEY,
	menu_cd varchar(50) NOT NULL,
	menu_nm varchar(50) NOT NULL,
	UNIQUE ( menu_cd, menu_nm )
); 

--  画面マスタ
create table if not exists b_screen (
	screen_id bigserial PRIMARY KEY,
	screen_cd varchar(50) NOT NULL,
	screen_nm varchar(50) NOT NULL,
	menu_id int REFERENCES b_menu (menu_id),
	init_url varchar(100) NOT NULL,
	UNIQUE ( screen_cd, screen_nm )	
);


-- create tables master
-- ブランドマスタ
create table if not exists m_brand (
	brand_id serial PRIMARY KEY,
	brand_cd varchar(50) NOT NULL UNIQUE,
	brand_name varchar(50) NOT NULL,
	country varchar(20),
	details text,
	insert_date date,
	update_date date,
	delete_flg boolean NOT NULL DEFAULT false
);

-- ジャンルマスタ
create table if not exists m_genre (
	genre_id serial PRIMARY KEY,
	genre_cd varchar(15) NOT NULL UNIQUE,
	genre_name varchar(20) NOT NULL,
	insert_date date,
	update_date date,
	delete_flg boolean NOT NULL DEFAULT false
);

-- 店マスタ
create table if not exists m_shop (
	shop_id serial PRIMARY KEY,
	shop_cd varchar(10) NOT NULL UNIQUE,
	shop_name varchar(30) NOT NULL,
	postal_cd varchar(10),              -- 郵便番号
	address varchar(40),                -- 住所
	shop_url varchar(100),              -- ショップURL
	insert_date date,
	update_date date,
	delete_flg boolean NOT NULL DEFAULT false
);

-- 私の服
create table if not exists my_clothes (
	my_clothes_id bigserial PRIMARY KEY,                        -- 主キー
	brand_id int NOT NULL UNIQUE REFERENCES m_brand (brand_id), -- ブランドID
	genre_id int NOT NULL UNIQUE REFERENCES m_genre (genre_id), -- ジャンルID
	shop_id int NOT NULL UNIQUE REFERENCES m_shop (shop_id),    -- 店ID
	image_path text NOT NULL,                                   -- 画像パス 
	price int,                                                  -- 金額
	purchase_date date,                                         -- 購入日
	details text,                                               -- 備考
	insert_date date,                                           -- 挿入日時
	update_date date,                                           -- 更新日時
	delete_flg boolean NOT NULL DEFAULT false                   -- 削除フラグ
);

-- ログマスタ
create table if not exists m_log (
	log_id bigserial primary key,
	log_date date not null,
	log_value text not null
);