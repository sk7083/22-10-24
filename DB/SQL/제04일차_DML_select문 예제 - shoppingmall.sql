/*
select문
[] 괄호 순서는 반드시 맞춰서 작성할 것
	[distinct] -- 행의 중복을 제거
=> [where조건절] 다음에 [from 테이블명]이 올순 없음

select 속성 또는 식(1+1)등 올 수 있다.
	[from 테이블명]
    [where 조건절] -- 조건에 맞는 결과를 조회, ==가 아닌 =를, 같지 않은 경우는 !=를 이용하여 비교
    -- 속성명1로 정렬(오름차순 | 내림차순)한 후, 속성명1의 값이 같은 행들을 속성명2로 정렬(오름차순 | 내림차순)
    -- 정렬방법이 생략되면 asc(오름차순)으로 설정됨.
    [order by 속성명1 [asc | desc], 속성명2 [asc | desc]]
    -- 검색 결과의 개수를 제한
    -- limit 번지, 개수 : 지정번지부터 개수
    -- limit 개수 : 0번지부터 개수
    [limit절]
    ;
*/

use shoppingmall;
-- member 테이블의 me_id와 me_pw 조회
select me_id, me_pw
	from member;
-- member 테이블에 있는 모든 회원 정보를 조회
-- => * = 모든이라는 뜻
select * from member;

-- member 테이블에 아이디가 abc인 회원 정보를 조회
select * from member where me_id = 'abc';

-- 관리자의 아이디를 조회
select me_id from member where me_authority = 'ADMIN';

-- 일반 회원의 아이디를 조회
select me_id from member where me_authority != 'ADMIN';
-- 위에 코드와 동일함 <> : 이것도 같지 않다란 뜻.
select me_id from member where me_authority <> 'ADMIN';

-- 회원들을 아이디순으로 오름차순으로 정렬
select * from member order by me_id;

-- 회원들을 아이디순으로 내림차순으로 정렬
select * from member order by me_id desc;

-- 회원들을 생일순으로 내림차순으로 정렬
select * from member order by me_birth desc;

-- 회원들을 아이디순으로 오름찬순으로 정렬하여 처음 2명만 조회
select * from member order by me_id limit 0, 2;

-- 회원들을 아이디순으로 오름찬순으로 정렬하여 두번째 2명만 조회
select * from member order by me_id limit 2, 2;

-- 회원들을 아이디순으로 오름찬순으로 정렬하여 세번째 2명만 조회
select * from member order by me_id limit 4, 2;
-- ★★★ n번째 x개 조회 limit (n-1)*x ,x

-- 게시글에서 조회수가 1이상 100 이하인 게시글들을 조회
select * from board where bo_views >= 1 and bo_views <= 100;
-- (위에 코드와 동일)   between : A이상 B이하
select * from board where bo_views between 1 and 100;

-- 게시글에서 카테고리번호가 1번(공지) 또는 2번(자유)인 게시글 전체를 조회
select * from board where bo_bc_num = 1 or bo_bc_num = 2;
-- (위에 코드와 동일)   속성 in(a,b) : 속성이 a 또는 b값을 가지는 경우
-- => 단, 전부 or 상태일때만 가능
select * from board where bo_bc_num in(1,2);

/* 문자열 검색
- = : 두 문자열이 동일해야 true
- like를 이용하여 문자열1이 문자열2에 있는지 확인할 수 있다.
... where 속성명 like 문자열
- _ : 한 글자를 의미
... where bo_title like '___' : 제목이 3글자인 게시글들을 가져옴
- % : 0글자 이상을 의미
... where bo_title like '공지%' : 제목이 공지로 시작하는 모든 게시글들
... where bo_title like '%공지' : 제목이 공지로 끝나는 모든 게시글들
... where bo_title like '%공지%' : 제목이 공지가 들어가는 모든 게시글들
*/

-- 2022년도에 작성된 게시글들을 조회(날짜를 문자열처럼 취급)
select * from board where bo_reg_date like '2022%';

select * from board where bo_reg_date between '2022-01-01 00:00:00' and '2022-12-12 23:59:59';

-- 카테고리가 공지사항인 게시글들을 조회 (서브 쿼리 활용)
select * from board where bo_bc_num = (select bc_num from board_category where bc_name = '공지사항');

-- 가전 제품(제품 카테고리 1번) 중 가장 비싼 제품보다 가격이 높은 제품들
-- 해당 테이블이 없기에 에러 발생
select * from product where pr_price > all(select pr_price from product where pr_pc_num = 1);

-- 가전 제품(제품 카테고리 1번) 중 가장 싼 제품보다 가격이 높은 제품들
select * from product where pr_price > any(select pr_price from product where pr_pc_num = 1);

-- 가전 제품(제품 카테고리 1번)과 같은 가격들이 있는 제품들
select * from product where pr_price = any(select pr_price from product where pr_pr_num = 1);

-- 모든 회원의 권한을 출력 (권한만 출력하기 때문에 중복이 가능)
select distinct me_authority from member;

-- A as B : A의 이름을 B로 수정(일시적) - select문으로 검색 결과를 출력할 때alter
-- => 컬럼을 수정할 때 쓰임
select distinct me_authority as '권한' from member;





