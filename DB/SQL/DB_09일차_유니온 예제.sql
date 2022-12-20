use shoppingmall;
/*
union / union all : 검색결과에 따른 합집합
	- 속성 이름들이 같아야 함.
union : 중복을 제거
union all : 중복을 제거하지 않음 / union보다 빠름 (중복을 제거하지 않기 때문에)
*/
-- nuion 사용
select * from product where pr_amount > 10
	union
select * from product where pr_price > 10000;

-- nuion all 사용
select * from product where pr_amount > 10
	union all
select * from product where pr_price > 10000;

-- 서로 다른 table인 경우에 union한 경우.
select pr_num as 번호, pr_title as 내용 from product
	union
select pc_num as 번호, pc_name as 내용 from product_category;




























