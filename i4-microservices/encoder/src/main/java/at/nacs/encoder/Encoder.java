package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Encoder {

  private final RestTemplate restTemplate;
  private final EncoderClient encoderClient;

//  @Value("${morse.url}")
//  private String morseUrl;

  public String encode(String message) {
    message = message.replaceAll(" ", "");
    String[] lettersArray = message.split("");
    List<String> letters = List.of(lettersArray);
    return letters.stream()
                  .map(e -> encoderClient.encode(e))
                  .collect(Collectors.joining());
  }

//  private Function<String, String> toMorse()
//  {
//    return letter -> restTemplate.postForObject(morseUrl, letter, String.class);
//  }
}