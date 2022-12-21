USE CGV;
-- 예매한 영화이름, 영화관, 좌석이름, 상영일, 상영시간을 조회하는 뷰 생성
CREATE VIEW TICKET_DETAIL
AS
SELECT MO_TITLE, SS_DATE, SS_TIME, CI_NAME, SE_NAME, TI_ME_ID FROM ticketing
	JOIN ticketing_seat ON TI_NUM = ts_ti_num
    JOIN SEAT ON SE_NUM = ts_se_num
    JOIN screen_schedule ON SS_NUM = TI_SS_NUM
    JOIN MOVIE ON MO_NUM = SS_MO_NUM
    JOIN CINEMA ON CI_NAME = SS_CI_NUM;

SELECT * FROM TICKET_DETAIL;


CREATE VIEW TICKET_DETAIL2
AS
SELECT * FROM ticketing
	JOIN ticketing_seat ON TI_NUM = ts_ti_num
    JOIN SEAT ON SE_NUM = ts_se_num
    JOIN screen_schedule ON SS_NUM = TI_SS_NUM
    JOIN MOVIE ON MO_NUM = SS_MO_NUM
    JOIN CINEMA ON CI_NAME = SS_CI_NUM;

SELECT * FROM TICKET_DETAIL2;

-- abc회원이 영화 예매를 위해 사용한 금액은?
select sum(se_price) as `예매 금액` from TICKET_DETAIL2;














