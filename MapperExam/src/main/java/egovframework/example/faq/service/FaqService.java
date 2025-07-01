/**
 * 
 */
package egovframework.example.faq.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 *
 */
public interface FaqService {
	List<?> selectFaqList(Criteria criteria);    			// 전체조회
	int selectFaqListTotCnt(Criteria criteria);				// 총 개수 구하기
}
