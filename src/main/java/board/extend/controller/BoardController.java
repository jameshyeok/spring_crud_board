package board.extend.controller;

import board.extend.service.BoardService;
import board.extend.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return "redirect:/boards/list";
    }

    // read
    @RequestMapping(value = "/list")
    public String getBoardList(Model model) {
        ArrayList<HashMap<String, Object>> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "/board/list";
    }
    // update
    // delete
}
