package kr.co.swiftER.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.swiftER.vo.CSQuestionsVO;
import kr.co.swiftER.vo.FileVO;

@Mapper
@Repository
public interface CSDAO {

	public int insertArticle(CSQuestionsVO article);
	public List<CSQuestionsVO> selectArticles();
	
	// FileVO를 file 테이블에 업로드
	public int insertFile(FileVO fvo);
}
