use shoppingmall;

/*
LENGTH(문자열) : 바이트 수를 반환
concat(문자열1, 문자열2, ...) : 문자열을 이어줌
INSTR(기준_문자열, 부분_문자열) : 기준 문자열에서 부분 문자열을 찾아 그시작 위치를 반환
*/

-- 제품명에 TV가 들어가는 제품들을 조회
-- 방법 1
select * from product
	where pr_title like '%TV%';
-- 방법 2 concat() 사용
select * from product
	where pr_title like concat('%','TV','%');
-- 방법 2의 경우엔 변수를 넣어서 조회하는 것도 가능    
set @a = 'TV';
select @a;
select * from product
	where pr_title like concat('%',@a,'%');

-- 금액 표현 format : 3자리수마다 , 를 붙임 ex : 10,000
-- format(숫자, 소수점 수)
select format(10000000, 0);

-- 파일명이 주어졌을 때 확장자를 추출하는 예제
-- right('파일명', 오른쪽에서부터 숫자만큼의 길이를 출력 (. 포함)
select right('test.txt', 4);

-- 날짜함수
-- ADDDATE(날짜, 차이) : 날짜를 기준으로 차이를 더함
-- SUBDATE(날짜, 차이) : 날짜를 기준으로 차이를 뺌
-- 하루 뒤를 나타내는 예제
select adddate(now(), interval 1 day);
-- 일주일 후를 나타내는 예제
select adddate(now(), interval 1 week);
-- 한달 후를 나타내는 예제
select adddate(now(), interval 1 month);
-- 1년 후를 나타내는 예제
select adddate(now(), interval 1 year);

-- 하루 전을 나타내는 예제
select subdate(now(), interval 1 day);
-- 일주일 전을 나타내는 예제
select subdate(now(), interval 1 week);
-- 한달 전을 나타내는 예제
select subdate(now(), interval 1 month);
-- 1년 전을 나타내는 예제
select subdate(now(), interval 1 year);









