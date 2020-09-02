
package BikeRental.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="giftsend", url="{api.url.giftsend}")
public interface GiftsendService {

    @RequestMapping(method= RequestMethod.POST, path="/giftsends")
    public void giftsendCreated(@RequestBody Giftsend giftsend);

}