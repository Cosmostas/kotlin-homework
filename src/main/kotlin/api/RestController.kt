package api

import api.Models.BerlinTime
import api.Utils.Converters
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam

@RestController
public class RestController
{
    @GetMapping("/api/berlin-time")
    fun GetBerlinTime(@RequestParam(name = "isoTime") isoTime: String): BerlinTime
    {
        return Converters.FromIsoTime(isoTime);
    }
}
