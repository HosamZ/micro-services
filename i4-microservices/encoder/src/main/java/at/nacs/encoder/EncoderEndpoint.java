package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {

  private final Encoder encoder;

  private final EncoderClient encoderClient;

  @PostMapping
  String encode(@RequestBody String message) {
    return encoder.encode(message);
  }

  @GetMapping
  List<String> encode() {
    return encoderClient.encode();
  }
}
