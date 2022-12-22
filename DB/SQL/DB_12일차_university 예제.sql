-- 2022년 1학기 컴퓨터 개론을 수강하는 학생들 명단을 조회
select * from course
	join lecture on co_le_num = le_num
    join student on co_st_num = st_num
    where le_term like '1' and le_name like '컴퓨터 개론' and le_year = 2022;
    
-- 2022년 1학기에 2022160001 학생이 수강한 과목명을 조회
select le_name as 과목명 from course
	join lecture on co_le_num = le_num
    where co_st_num like '2022160001';
    
-- 2022년 1학기 컴퓨터 개론을 수강하는 고길동 학생의 성적을 등록하려고 한다. (학번과 강좌번호로 이용)
-- 중간은 100, 기말은 80, 출석은 100, 과제 90점이고,
-- 비율은 중간 4, 기말 4, 출석 1, 과제 1로 성적을 계산하여 총점에 저장
-- 학점은 100이하 90이상 A, 90미만 80이상 B, 80미만 70이상 C, 70미만 60이상 D, 나머지 F
    
 
DROP procedure if exists insert_score;
DELIMITER //
CREATE procedure insert_score(
	in _st_num char(10),
    in _le_num int,
    in _mid int,
    in _final int,
    in _att int,
    in _home int
)
BEGIN
	declare _total int default 0;
    declare _co_num int;
    declare _grade varchar(5);
    declare _type varchar(5);
    
    set _total = _mid * 0.4 + _final * 0.4 + _att * 0.1 + _home*0.1;
    set _co_num = (select co_num from course 
		where co_st_num = _st_num and co_le_num = _le_num);
    insert into score values(null, _mid, _final, _home, _att, _total, _co_num);

	set _type = (select co_type from course where co_num = _co_num);
    if _type = '학점' then
		if _total >= 90 and _total <= 100 then
			set _grade = 'A';
		end if;
        if _total >= 80 and _total < 90 then
			set _grade = 'B';
		end if;
        if _total >= 70 and _total < 80 then
			set _grade = 'C';
		end if;
        if _total >= 60 and _total < 70 then
			set _grade = 'D';
		end if;
        if _total >= 0 and _total < 60 then
			set _grade = 'F';
		end if;
        update course set co_grade = _grade where co_num = _co_num;
    end if;
END //
DELIMITER ;
call insert_score('2022160001', 1, 100, 80, 100, 90);
    
-- 트리거를 이용하여 성적을 추가하는 작업을 해보세요.    
-- 2022년 1학기 자바를 수강하는 고길동 학생의 성적을 등록하려고 한다. (학번과 강좌번호로 이용)
-- 중간은 100, 기말은 80, 출석은 100, 과제 90점이고,
-- 비율은 중간 4, 기말 4, 출석 1, 과제 1로 성적을 계산하여 총점에 저장
-- 학점은 100이하 90이상 A, 90미만 80이상 B, 80미만 70이상 C, 70미만 60이상 D, 나머지 F
-- 수강번호가 2번이고, 중간은 100, 기말은 80, 출석은 100, 과제 90점
-- insert전에 total과 학점을 계산하기 위한 트리거
    
DROP TRIGGER IF EXISTS insert_score;
DELIMITER //
CREATE TRIGGER insert_score before INSERT
ON score
FOR EACH ROW
BEGIN
    declare _grade varchar(5);
    declare _type varchar(5);
    declare _total int;
    
    set new.sc_total = new.sc_mid * 0.4 + new.sc_final * 0.4 + new.sc_attendance * 0.1 + new.sc_homework*0.1;

	set _total = new.sc_total;
	set _type = (select co_type from course where co_num = new.sc_co_num);
   
	if _type = '학점' then
		if _total >= 90 and _total <= 100 then
			set _grade = 'A';
		end if;
        if _total >= 80 and _total < 90 then
			set _grade = 'B';
		end if;
        if _total >= 70 and _total < 80 then
			set _grade = 'C';
		end if;
        if _total >= 60 and _total < 70 then
			set _grade = 'D';
		end if;
        if _total >= 0 and _total < 60 then
			set _grade = 'F';
		end if;
        update course set co_grade = _grade where co_num = new.sc_co_num;
    end if;
END //
DELIMITER ;
END //
DELIMITER ;
INSERT INTO score
	VALUES(null, 90, 30, 100, 100, 0, 2);
    
-- 2022년 1학기 컴퓨터 개론을 수강하는 학생이름과 학점을 조회

select st_name as 학생명, co_grade as 학점 from course
	join student on st_num = co_st_num
    join lecture on le_num = co_le_num
    where le_name like '컴퓨터 개론' and le_year = 2022 and le_term like '1';

-- 컴퓨터 공학부 학생 명단과 교수 명단을 함께 조회
select pr_name as '이름', '교수' as 직위 from professor where pr_de_num = 160
	union
select st_name as '이름', '학생' as 직위 from student join mojor on mo_st_num = st_num
	where mo_de_num = 160;
    
-- 2022160001 학생의 성적을 조회
select * from course where co_st_num = '2022160001';
    
-- 2022160001 학생의 2022년 1학기 평균 학점을 조회
-- A : 4.5 / B : 3.5 / C : 2.5 / D : 1.5 / F : 0
-- (4.5 * 3 + 1.5 * 3) / (3 + 3) => 18 / 6 => 3.0
select sum(
case
	when co_grade = 'A'
    then  4.5
    when co_grade = 'B'
    then  3.5
    when co_grade = 'C'
    then  2.5
    when co_grade = 'D'
    then  1.5
    when co_grade = 'F'
    then  0
end * le_point

) / sum(le_point) as 이수학점 from course
	join lecture on co_le_num = co_num
    where co_st_num = '2022160001' and le_year = 2022 and le_term = '1';
    
    
    
    
    
    
    
    
    
    
    
    
    