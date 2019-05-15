package at.nacs.encoder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("morse")
public interface EncoderClient {

  @GetMapping("/encode")
  List<String> encode();
}
