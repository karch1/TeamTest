package egovframework.example.fileDb.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.fileDb.service.FileDbVO;


// 마이바티스 : 1) 인터페이스(함수명) 2)xml(sql)
//	java.util.List; 이거 사용해야함
//	org.egovframe.rte.psl.dataaccess.mapper.Mapper; 맵퍼도 이거임

@Mapper
public interface FileDbMapper {
	public List<?> selectFileDbList(Criteria criteria);  	 // 전체조회
	public int selectFileDbListTotCnt(Criteria criteria);    // 총 개수 구하기
	public int insert(FileDbVO fileDbVO);					 // insert
	public FileDbVO selectFileDb(String uuid);				 // 상세조회
	public int delete(String uuid);							 // 삭제
}
