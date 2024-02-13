package com.sist.vo;

import lombok.Data;
import java.util.*;
@Data
public class MemberVO {
	private int enabled;
	private String userId,userName,userPwd,sex,birthday,email,post,addr1,addr2,
	               phone,content,reg_dbday,mod_dbday,last_dbday;
	private Date regdate,modifydate,lastLogin;
}
