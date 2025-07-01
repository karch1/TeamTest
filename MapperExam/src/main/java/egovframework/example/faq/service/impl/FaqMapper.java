/**
 * 
 */
package egovframework.example.faq.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;

/**
 * @author user
 *마이바티스 :1) 인터페이스 : 메소드명 2) xml파일 : sql문
 */
@Mapper
public interface FaqMapper {
	public List<?> selectFaqList(Criteria criteria);  				//전체조회
	public int selectFaqListTotCnt(Criteria criteria);				//총 개수 구하기
	
}
