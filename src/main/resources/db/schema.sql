-- drop all tables

drop table if exists m_brand;
drop table if exists m_genre;
drop table if exists m_shop;
drop table if exists m_log;
drop table if exists my_clothes;



-- create tables

-- 私の服
create table if not exists my_clothes (
	my_clothes_id bigserial PRIMARY KEY, -- 主キー
	brand_id int NOT NULL UNIQUE,        -- ブランドID
	genre_id int NOT NULL UNIQUE,        -- ジャンルID
	shop_id int NOT NULL UNIQUE,         -- 店ID
	image_path text NOT NULL,            -- 画像パス 
	price money,                         -- 金額
	purchase_date date,                  -- 購入日
	details text,                        -- 備考
	insert_date date,                    -- 挿入日時
	update_date date,                    -- 更新日時
	delete_flg boolean NOT NULL          -- 削除フラグ
);

-- ブランドマスタ
create table if not exists m_brand (
	brand_id serial PRIMARY KEY,
	brand_cd varchar(50) NOT NULL UNIQUE,
	brand_name varchar(50) NOT NULL,
	insert_date date,
	update_date date,
	delete_flg boolean NOT NULL
);

-- ジャンルマスタ
create table if not exists m_genre (
	genre_id serial PRIMARY KEY,
	genre_cd varchar(15) NOT NULL UNIQUE,
	genre_name varchar(20) NOT NULL,
	insert_date date,
	update_date date,
	delete_flg boolean NOT NULL
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
	delete_flg boolean NOT NULL
);

-- ログマスタ
create table if not exists m_log (
	log_id bigserial primary key,
	log_date date not null,
	log_value text not null
);