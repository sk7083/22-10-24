use shoppingmall;

-- 가격이 20000원 이상이면 비쌈, 가격이 5000이하이면 쌈, 아니면 적당이라고 분류

-- if(수식, 참, 거짓) : 수식이 참이면 두 번째 인수를 반환하고, 거짓이면 세 번째 인수를 반환
-- null 체크의 유용한 함수 if
select pr_title, pr_price,
		if(pr_price >= 20000, '비쌈',
        if(pr_price <= 5000, '쌈', '적당'
		)) as `가격 판별`
    from product;
    
-- case... when.. then... else... end 사용 예제
select pr_title, pr_price,
	case
		when pr_price >= 20000
        then '비쌈'
        when pr_price <= 5000
        then '쌈'
        else '적당'
	end as `가격 판별`
    from product;





















