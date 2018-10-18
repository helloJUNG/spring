package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data //도메인은 마이바티즈 리턴타입이라 가장먼저 설계!
public class Board {

	private Integer bno;
	private String title,content,writer;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date regdate,updatedate;
	
}
