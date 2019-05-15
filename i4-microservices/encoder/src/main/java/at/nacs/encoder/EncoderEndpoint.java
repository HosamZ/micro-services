package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {

  private final Encoder encoder;

  private final EncoderClient encoderClient;

//  @PostMapping
//  String encode(@RequestBody String message) {
//    return encoder.encode(message);
//  }

  @PostMapping
  String encode(String letter)
  {
    return encoderClient.encode(letter);
  }
}
