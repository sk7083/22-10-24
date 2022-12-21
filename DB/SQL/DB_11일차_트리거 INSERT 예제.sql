-- 예매를 하면, 해당 영화 상영시간의 예매 가능 좌석을 수정해주는 트리거를 생성하고, 테스트
-- TICKETING 테이블에 데이터가 추가되면 트리거 동작

USE CGV;

-- 제품을 구매했을 때 동작하는 트리거
DROP TRIGGER IF EXISTS INSERT_TICKETING;
DELIMITER //
CREATE TRIGGER INSERT_TICKETING AFTER INSERT
ON TICKETING
FOR EACH ROW
BEGIN
update screen_schedule
	SET SS_POSSIBLE_SEAT = SS_POSSOBLE_SEAT - NEW.TI_AMOUNT
WHERE SS_NUM = NEW.TI_SS_NUM;
END //
DELIMITER ;
insert INTO ticketing(TI_AMOUNT, TI_ME_ID, TI_SS_NUM, TI_TOTAL_PRICE)
	VALUES(1, 'abc', 26, 10000);



















