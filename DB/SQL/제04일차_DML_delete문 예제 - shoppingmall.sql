/*
-- delete문
delete from 테이블명 where 조건절;
-- 조건절에는 일반적으로 기본키가 옴
*/

-- 3번 카테고리인 문의를 제거하는 쿼리문
delete from board_category where bc_num = 3;
select * from board_category;
-- 만약 카테고리를 추가할 경우 3번에 추가되는 것이 아닌 4번부터 만들게 됨 (삭제를 기억하고 있음)

















