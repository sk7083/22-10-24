use shoppingmall;

-- with rollup 절
-- sum(컬럼) 해당 컬럼의 합을 나타냄
-- 카테고리별 수량 확인하기 with rollup 사용
select pr_pc_num as '카테고리 번호', sum(pr_amount) as 수량 
	from product group by pr_pc_num with rollup;

use cgv;
select ss_mo_num, ss_ci_num, sum(ss_possible_seat) as '예매 가능 총 좌석'
	from screen_schedule
	group by ss_mo_num, ss_ci_num
    with rollup;

















