use shoppingmall;

-- 제품번호, 수량, 배송지, 우편주소, 아이디가 주어지면 제품을 구매하는 프로시저를 작성
DROP PROCEDURE IF EXISTS 프로시저명;
DELIMITER //
CREATE PROCEDURE TEST1(
	IN _NUM int,
    IN _AMOUNT INT,
    IN _ADDRESS VARCHAR(50),
	IN _POST_NUM VARCHAR(30),
    IN _ID VARCHAR(15)
)
BEGIN
	declare _pr_amount int default 0;
    set _pr_amount = (select pr_amount from product where pr_num = _num);
    
	if _pr_amount >= _amount	then
	INSERT INTO BUY(bu_num, BU_AMOUNT, BU_ADDRESS, BU_POST_NUM, BU_ME_ID, BU_PR_NUM)
		values(concat(_id,right(now(), 10)),_AMOUNT, _ADDRESS, _POST_NUM, _ID, _NUM);
        update product set pr_amount = pr_amount - _amount where pr_num = _num;   
	end if;
END //
DELIMITER ;
CALL 프로시저명(1, 2, '서울시 강남', '12345', 'asd');
























