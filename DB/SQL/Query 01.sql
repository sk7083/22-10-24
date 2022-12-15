drop database if exists shoppingmall;

create database if not exists shoppingmall;

use shoppingmall;

create table if not exists member(
	me_id VARCHAR(15) PRIMARY KEY, -- 아이디
    me_pw VARCHAR(20) NOT NULL, -- 비번
    me_name VARCHAR(10) NOT NULL, -- 이름
    me_birth date NOT NULL, -- 생일
    me_authority VARCHAR(6) NOT NULL default 'member'
	-- 권한 : 회원(member), 관리자(admin)
);

-- drop table if exists product_category;
create table if not exists product_category(
	pc_num int auto_increment primary key,
    pc_name varchar(10) not null -- 제품 카테고리명
);

-- drop table if exists product;
create table if not exists product(
	pr_num int auto_increment PRIMARY KEY, -- 제품번호
    pr_title VARCHAR(50) NOT NULL, -- 제품명
    pr_contents longtext NOT NULL, -- 제품 상세
    pr_amount int not null default 0, -- 수량
    pr_price int NOT NULL, -- 가격
    pr_pc_num int not null, -- 제품 카테고리
	constraint fk_pr_pr_num 
    foreign key(pr_pc_num) 
    references product_category(pc_num)
	-- 위 외래키 지정
);

-- drop table if exists board_category;
create table if not exists board_category(
	bc_num int auto_increment primary key, -- 게시글 카테고리
    bc_name varchar(10) not null -- 게시글 카테고리명
);

-- drop table if exists board;
create table if not exists board(
	bo_num int auto_increment primary key, -- 게시글 번호
	bo_title varchar(50) not null, -- 게시글 제목
    bo_contents longtext not null, -- 게시글 내용
    bo_reg_date datetime not null default now(), -- 게시글 등록일
    bo_views int not null default 0, -- 게시글 조회수
    bo_me_id varchar(15) not null, -- 게시글 작성자
    bo_bc_num int not null, -- 게시글 카테고리 번호
	constraint fk_bo_me_id 
		foreign key(bo_me_id) 
		references member(me_id),
    constraint fk_bo_bc_num 
		foreign key(bo_bc_num) 
		references board_category(bc_num)
);

-- drop table if exists buy;
create table if not exists buy(
	bu_num varchar(20) primary key, -- 구매 번호(결재 번호)
	bu_state varchar(10) not null default '결재 완료', -- 구매 상태
    bu_amount int not null default 1, -- 구매 수량
    bu_address varchar(50) not null, -- 배송지
	bu_post_num varchar(10) not null, -- 우편번호
    bu_me_id varchar(15) not null, -- 구매 아이디
    bu_pr_num int not null, -- 구매 제품 번호
	constraint fk_bu_me_id 
		foreign key(bu_me_id) 
		references member(me_id),
    constraint fk_bu_pr_num 
		foreign key(bo_pr_num) 
		references product(pr_num)
);

-- drop table if exists inquiry;
create table if not exists inquiry(
	in_num int auto_increment primary key, -- 문의 번호
    in_content longtext not null, -- 문의 내용
    in_reply longtext, -- 문의 답변
    in_pw char(4), -- 문의 비번
    in_me_id varchar(15) not null, -- 문의 아이디
    in_pr_num int not null, -- 문의 제품
	constraint fk_in_me_id 
		foreign key(in_me_id) 
		references member(me_id),
    constraint fk_in_pr_num 
		foreign key(in_pr_num) 
		references product(pr_num)
);
