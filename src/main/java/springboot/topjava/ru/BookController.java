package springboot.topjava.ru;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public BaseResponse showStatus() {
        return new BaseResponse("no data available", 502);
    }

    @PostMapping("/get")
    public BaseResponse get(@RequestParam(value = "id") Long id) {
        final BaseResponse response;

        response = new BaseResponse("Найдена книга с ID=" + id, 200);

        return response;
    }

//    @GetMapping
}
