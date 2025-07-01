/**
 * 
 */
package egovframework.example.faq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.faq.service.FaqService;

/**
 * @author user
 *
 */
@Service
public class FaqServiceImpl implements FaqService{
//	mapper 가져오기
	@Autowired
	FaqMapper FaqMapper;

//	전체조회
	@Override
	public List<?> selectFaqList(Criteria criteria) {
		// TODO Auto-generated method stub
		return FaqMapper.selectFaqList(criteria);
	}
//	총 개수 구하기
	@Override
	public int selectFaqListTotCnt(Criteria criteria) {
		// TODO Auto-generated method stub
		return FaqMapper.selectFaqListTotCnt(criteria);
	}
	
	
}
