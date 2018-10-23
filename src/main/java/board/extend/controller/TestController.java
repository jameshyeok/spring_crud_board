package board.extend.controller;

import board.extend.vo.TestProductVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/")
    public String test(Model model) {

        TestProductVo productVo = new TestProductVo("sample product", 10000);

        logger.info("root");
        model.addAttribute("productVo", productVo);

        return "index";
    }

    @RequestMapping(value = "/jsonResult")
    public @ResponseBody TestProductVo productVoJsonResult() {
        TestProductVo productVo = new TestProductVo("sample product", 10000);

        return productVo;
    }

}
