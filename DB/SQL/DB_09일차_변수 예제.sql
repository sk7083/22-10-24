-- 따로 변수 선언하는 방법
/*
- 변수값 선언
set @변수이름 = 변수값;
- 변수값 출력
select @변수이름;	//변수 출력

*/
set @num = 10;		-- @num에 10을 저장
select @num := 20;	-- @num에 20을 저장한 후, 출력
select @num;
select @@sql_mode;	-- 시스템 변수(글로벌 변수) sql_mode를 조회

show variables;		-- 시스템 변수들을 조회 (현재 사용중인 전역 변수들을 보여줌)

-- 데이터 형식과 형변환

-- 방법 1 실수 1.23을 정수 1로 형변환
select cast(1.23 as signed integer);
-- 방법 2 실수 1.23을 정수 1로 형변환
select convert(1.23, signed integer);














