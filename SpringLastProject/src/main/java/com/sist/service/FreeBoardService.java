package com.sist.service;
import java.util.*;
import com.sist.vo.*;
public interface FreeBoardService {
	public List<FreeBoardVO> freeboardListData(int start,int end);
	public int freeboardTotalPage();
	public void freeboardInsert(FreeBoardVO vo);
}