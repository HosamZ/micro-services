package at.nacs.encoder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("morse")
public interface EncoderClient {

  @GetMapping("/encode")
  String encode(String letter);
}