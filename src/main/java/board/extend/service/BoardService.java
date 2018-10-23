package board.extend.service;

import board.extend.dao.BoardDAO;
import board.extend.util.PageNavi;
import board.extend.vo.BoardVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class BoardService {

    @Inject
    BoardDAO boardDAO;

    // create
    public void registerBoard(BoardVO boardVO) {
        boardDAO.registerBoard(boardVO);
    }

    // read
    public HashMap<String, Object> selectOneBoard(int bno) {
        return boardDAO.selectOneBoard(bno);
    }

    // update
    public void updateBoard(BoardVO boardVO) {
        boardDAO.updateBoard(boardVO);
    }

    // delete
    public void deleteBoard(int bno) {
        boardDAO.deleteBoard(bno);
    }

    // board all list
    public ArrayList<HashMap<String, Object>> getBoardList(PageNavi pageNavi) {
        return (ArrayList<HashMap<String, Object>>)boardDAO.getBoardList(pageNavi);
    }

}
