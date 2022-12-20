use shoppingmall;

select
	row_number() over(order by pr_amount desc) as 보유량순위,
	pr_title as 제품명,
    pr_amount as 보유량
 from product;
 
 /*
 select
	row_number<=순위 변수 함수() over(order by pr_amount desc) <= 괄호 안에 조건 as 보유량순위,
	pr_title as 제품명,
    pr_amount as 보유량
 from product;
 */
 /*
 -- 순위 함수 : row_number(), dense_rank(), rank()
 row_number() :
		- 같은 값이 있을 때 등수가 서로 다름
   dense_rank() :
		- 같은 값이 있을 때 등수가 같음
        - 같은 값이 있는 행 다음 등수는 같은 값이 있는 등수 +1
	rank() :
		- 같은 값이 있을 때 등수가 같음
		- 같은 값이 있는 행 다음 등수는 같은 값이 있는 등수 + 같은 값이 있는 개수
	ntile(n) :
		- 등수를 총 n등까지 분할
 */
 
 -- 순위 변수 row_number 사용
select
	row_number() over(order by pr_price desc) as 가격순위,
	pr_title as 제품명,
    pr_price as 제품가격
 from product;
 
  -- 순위 변수 dense_rank 사용
  select
	dense_rank() over(order by pr_price desc) as 가격순위,
	pr_title as 제품명,
    pr_price as 제품가격
 from product;
 
  -- 순위 변수 rank 사용
   select
	rank() over(order by pr_price desc) as 가격순위,
	pr_title as 제품명,
    pr_price as 제품가격
 from product;
 
   -- 순위 변수 ntile(n) 사용
   select
	ntile(3) over(order by pr_price desc) as 가격순위,
	pr_title as 제품명,
    pr_price as 제품가격
 from product;

 select * from product;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 