package com.sist.mapper;
import java.util.*;
import com.sist.dao.BoardVO;  // BoardVO의 정확한 패키지 경로를 추가하세요

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BoardMapper {
    // 목록 출력
    @Select("SELECT no, subject, name, TO_CHAR(regdate, 'YYYY-MM-DD') as dbday, hit, group_tab, num "
            + "FROM (SELECT no, subject, name, regdate, hit, group_tab, rownum as num "
            + "FROM (SELECT no, subject, name, regdate, hit, group_tab "
            + "FROM springReplyBoard ORDER BY group_id DESC, group_step ASC)) "
            + "WHERE num BETWEEN #{start} AND #{end}")
    public List<BoardVO> boardListData(Map map);

    // 총 페이지
    @Select("SELECT CEIL(COUNT(*) / 10.0) FROM springReplyBoard")
    public int boardTotalPage();

    // 상세 보기
    @Update("UPDATE springReplyBoard SET "
    		+"hit=hit+1 "
    		+"WHERE no=#{no}")
    public void hitIncrement(int no);
    
    @Select("SELECT no,name,subject,content,"
    		+"TO_CHAR(regdate,'YYYY-MM-DD') as dbday,hit "
    		+"FROM springReplyBoard "
    		+"WHERE no=#{no}")
    public BoardVO boardDetailData(int no);
    // 추가
    @Insert("INSERT INTO springReplyBoard(no, name, subject, "
            + "content, pwd, group_id) "
            + "VALUES(sr_no_seq.nextval, #{name}, #{subject}, #{content}, #{pwd}, "
            + "(SELECT NVL(MAX(group_id) + 1, 1) FROM springReplyBoard))")
    public void boardInsert(BoardVO vo);

    // 수정
    // 삭제 => 트랜잭션 적용
    // 답변 => 트랜잭션 적용
    // 찾기 => 동적 쿼리
    // AOP => 실시간 추적 (로그 파일), 실시간 인기 게시물
}
