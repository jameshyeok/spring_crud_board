package board.extend.dao;

import board.extend.vo.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Repository
public class BoardDAO {

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "board.extend.sql.board";


    // create
    public void registerBoard(BoardVO boardVO) {
        sqlSession.insert(namespace + ".registerBoard", boardVO);
    }

    // read
    public HashMap<String, Object> selectOneBoard(int bno) {
        return sqlSession.selectOne(namespace + ".selectOneBoard", bno);
    }

    // update
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update(namespace + ".updateBoard", boardVO);
    }

    // delete
    public void deleteBoard(int bno) {
        sqlSession.delete(namespace + ".deleteBoard", bno);
    }

    // board all list
    public List<HashMap<String, Object>> getBoardList() {
        return sqlSession.selectList(namespace + ".getBoardList");
    }
}
