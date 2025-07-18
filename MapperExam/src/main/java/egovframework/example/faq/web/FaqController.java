/**
 * 
 */
package egovframework.example.faq.web;

import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import egovframework.example.common.Criteria;
import egovframework.example.faq.service.FaqService;
import lombok.extern.log4j.Log4j2;

/**
 * @author user
 *
 */
@Log4j2
@Controller
public class FaqController {
//  서비스 가져오기
	@Autowired
	private FaqService faqService;

//전체조회
	@GetMapping("/faq/faq.do")
	public String selectFaqList(@ModelAttribute Criteria criteria, Model model) {
//   1) 등차자동계산 클래스: PaginationInfo
//      - 필요정보: (1) 현재페이지번호(pageIndex),(2) 보일 개수(pageUnit): 3
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(criteria.getPageIndex());
		paginationInfo.setRecordCountPerPage(criteria.getPageUnit());
//   등차를 자동 계산: firstRecordIndex 필드에 있음
		criteria.setFirstIndex(paginationInfo.getFirstRecordIndex());

//   전체조회 서비스 메소드 실행
		List<?> faqs = faqService.selectFaqList(criteria);
		log.info("테스트 : " + faqs);
		model.addAttribute("faqs", faqs);

//   페이지 번호 그리기: 페이지 플러그인(전체테이블 행 개수 필요함)

		return "faq/faq_all";
	}
	


}
