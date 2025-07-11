package egovframework.example.gallery.service.impl;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import egovframework.example.common.Criteria;
import egovframework.example.gallery.service.GalleryService;
import egovframework.example.gallery.service.GalleryVO;
import lombok.extern.log4j.Log4j2;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:/egovframework/spring/context-aspect.xml",
		"classpath:/egovframework/spring/context-common.xml", "classpath:/egovframework/spring/context-datasource.xml",
		"classpath:/egovframework/spring/context-idgen.xml", "classpath:/egovframework/spring/context-mapper.xml",
		"classpath:/egovframework/spring/context-sqlMap.xml",
		"classpath:/egovframework/spring/context-transaction.xml" })
@Log4j2
class GalleryServiceImplTest {

	@Autowired
	GalleryService galleryService;
	
	@Test
	void testSelectGalleryList() {
//      여기서 각 메소드별 테스트하면 됩니다.: 전체조회
//      1) 테스트 조건
		Criteria criteria = new Criteria();
		criteria.setSearchKeyword(""); 	// 검색어
		criteria.setFirstIndex(0); 		// 1페이지(0)
		criteria.setPageUnit(3); 		// 화면 보일 개수(3)
		
//      2) 실제 메소드실행
		List<?> list = galleryService.selectGalleryList(criteria);
//      3) 검증(확인): 로그 , DB 확인, assert~
		log.info(list);
	}
	@Test
	void testSelectGalleryListTotCnt() {
//		여기서 각 메소드별 테스트하면 됩니다.: 전체조회
//      1) 테스트 조건
		Criteria criteria = new Criteria();
		criteria.setSearchKeyword("");
		
//      2) 실제 메소드실행
		int count = galleryService.selectGalleryListTotCnt(criteria);
//      3) 검증(확인): 로그 , DB 확인, assert~
		log.info(count);
	}
//	insert는 첨부파일이없어서 테스트 x
//	상세조회
	@Test
	void testSelectGallery() {
//		1) 테스트 조건: 
		String uuid = "12345671";
//	    2) 실제 메소드실행
		GalleryVO galleryVO = galleryService.selectGallery(uuid);
//	    3) 검증(확인): 로그 , DB 확인, assert~ (DB확인)
		log.info(galleryVO);
	}
}
