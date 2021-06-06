package api

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
class RestController {
    @RequestMapping("/berlin-time")
    fun Get(@RequestParam(name = "isoTime") isoTime: String): BerlinTime
    {
        var result = BerlinTime.FromIsoTime(isoTime);
        return result;
    }

}
