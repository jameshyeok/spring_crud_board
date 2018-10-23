package board.extend.controller;

import board.extend.service.BoardService;
import board.extend.util.PageNavi;
import board.extend.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/boards")
public class BoardController {

    @Inject
    private BoardService boardService;

    // main
    @RequestMapping(value = "/")
    public String mainPage() {
        return "index";
    }

    // create
    @RequestMapping(value = "/register")
    public String registerBoard(BoardVO boardVO, Model model, RedirectAttributes rttr) throws Exception {
        boardService.registerBoard(boardVO);
        model.addAttribute("result", "success");
        rttr.addFlashAttribute("result", "success");
        return "redirect:/boards/listAll";
    }

    // read
    @RequestMapping(value = "/listAll")
    public String getBoardList(@RequestParam("page") Integer page,  Model model) {
        PageNavi pageNavi = new PageNavi();
        ArrayList<HashMap<String, Object>> boardList = boardService.getBoardList(pageNavi);
        model.addAttribute("boardList", boardList);
        return "board/listAll";
    }

    @RequestMapping(value = "/list")
    public String selectOneBoard(@RequestParam("bno") int bno, Model model) {
        HashMap<String, Object> board = boardService.selectOneBoard(bno);
        model.addAttribute("board", board);
        return "/board/list";
    }
    // update
    // delete
}
