-- test 데이터베이스 생성
-- create database test;

-- 데이터베이스가 존재하지 않으면 test 데이터베이스 생성
create database if not exists test;

-- 코드가 아닌 클릭으로 만드는거 가능
-- 우측 SCHEMAS에서 우클릭 - Create Schema - 이름 입력 - Apply

-- test 데이터베이스 선택
use test;

-- test 데이터베이스 삭제하는 기능
-- drop database test;

-- test 데이터베이스가 존재하면 test 데이터베이스 삭제하는 기능
-- drop database if exists test;

-- 코드가 아닌 클릭으로 만드는거 가능
-- 우측 SCHEMAS에서 해당 데이터베이스 우클릭 - Drop Schema - Drop now

-- 테이블 생성
-- CREATE TABLE 테이블명(컬럼명1 데이터타입

-- MEMBER 테이블 생성
-- 속성으로 ID(최대 문자열13, 기본키), 비번(최대 문자열20), 이름을 가짐.
create if not exists table member(
	id varchar(13) primary key,
    pw varchar(20) not null,
    name varchar(30) not null
);

-- auto_increment : 기본키만 가능하며, 테이블 당 최대 1개만 설정할 수 있다.
-- 자동 증가하는 기능
create table if not exists board(
	num int auto_increment primary key,
    title varchar(50) not null,
	contents longtext not null,
    writer varchar(13) not null,
    -- board 테이블에 writer 속성을 member 테이블의 id와 연결(외래키 설정)
    foreign key(writer) references member(id)
);

-- board 테이블에 조회수(컬럼) 추가
alter table board add views int default 0;

-- board 테이블에 조회수(컬럼) 삭제
alter table board drop views;

-- board 테이블에 잘못된 조회수 추가
alter table board add views varchar(0);
-- board 테이블에 잘못된 조회수를 올바르게 수정
alter table board modify views int default 0;

-- 조회수 이름을 view2로 수정
alter table board change views views2 int default 0;
-- views2를 views로 수정
alter table board change views2 views int default 0;

-- board 테이블에 있는 writer 제약조건을 삭제(진한 글씨)
-- board_ibfk_1 <= 제약 조건 이름
alter table board drop constraint board_ibfk_1;

-- board 테이블에 writer와 member 테이블에 id를 외래키로 연결(제약조건 추가)
alter table board add constraint fk_board_writer foreign key(writer) references member(id);

-- 워크벤치에서 추가한 board2 테이블 삭제
drop table if exists board2;
-- ============================================
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











