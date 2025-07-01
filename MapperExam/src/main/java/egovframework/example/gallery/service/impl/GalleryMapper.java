/**
 * 
 */
package egovframework.example.gallery.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.gallery.service.GalleryVO;

/**
 * @author user
 *	코딩 순서 : VO(1번) - Mapper(인터페이스, xml) - Service(ServiceImpl)
 */
@Mapper
public interface GalleryMapper {
	public List<?> selectGalleryList(Criteria criteria);  		 // 전체조회
	public int selectGalleryListTotCnt(Criteria criteria); 		 // 총 개수 구하기
	public int insert(GalleryVO galleryVO);					 	// insert
	public GalleryVO selectGallery(String uuid);				 // 상세조회
}
