-- 분석 함수

/*
- lead(속성) : 속성의 다음 값을 가져옴
- lead(속성, n, x) : 속성의 다음 n개의 값을 가져오고 없으면 x로 대체함

- lag(속성) : 속성의 이전 값을 가져옴
- lead(속성, n, x) : 속성의 이전 n개의 값을 가져오고 없으면 x로 대체함

- first_value(속성) : 속성의 첫번째 값

- cume_dist() : 백분율
*/


-- 분석함수 lead
-- 현재 내 행(pr_num)을 기준으로 다음 행의 lead(pr_title) 값을 읽어옴
select *, lead(pr_title) 
	over(order by pr_num asc) as 다음행값 from product;

-- 응용 문제
select 
	row_number() over(order by pr_price desc)
    pr_title, pr_price,
	pr_price - lead(pr_price, 1, 0) 	-- 다음 행 값과의 - 마이너스한 값을 보여줌
    -- lead(pr_price, 1, 0) : pr_price의 값을 가져오되, 내 다음 행이 없을 경우 값을 0으로 처리하겟단 뜻
	over(order by pr_price desc) as 다음행값 from product;
    
-- 분석함수 lag
select 
	row_number() over(order by pr_price desc)
    pr_title, pr_price,
	pr_price - lag(pr_price, 1, 0) 	-- 다음 행 값과의 - 마이너스한 값을 보여줌
    -- lead(pr_price, 1, 0) : pr_price의 값을 가져오되, 내 다음 행이 없을 경우 값을 0으로 처리하겟단 뜻
	over(order by pr_price desc) as 다음행값 from product;

-- 분석함수 first_value
select 
	row_number() over(order by pr_price desc)
    pr_title, pr_price,
	pr_price - first_value(pr_price)
	over(order by pr_price desc) as 다음행값 from product;

-- 분석함수 cume_dist()
select 
	row_number() over(order by pr_price desc)
    pr_title, pr_price,
	cume_dist()
	over(order by pr_price desc)*100 as 백분율 from product;

-- 카테고리별 평균 가격을 구하는 쿼리
select pr_pc_num as 분류번호, avg(pr_price) as 평균가격 from product
	group by(pr_pc_num);
    
-- 위 예제를 CTE 사용하여 쿼리 작성
with product_avg(분류번호, 평균가격)
	as
	(select pr_pc_num, avg(pr_price) from product
	group by(pr_pc_num))
select * from product_avg order by 분류번호 asc;


















