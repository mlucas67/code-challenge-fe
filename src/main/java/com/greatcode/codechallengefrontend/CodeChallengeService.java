package com.greatcode.codechallengefrontend;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by marshall.lucas on 8/14/2017.
 */
@Service
public class CodeChallengeService {

    public boolean validateMinMax(Integer min, Integer max) {
        // Make sure min and max are between 1 and 200.
        // No need to text max >= 1 since it is tested to be >= min which is already >= 1
        return ((min >= 1) && (min <= 200) && (max >= min) && (max <= 200));
    }

    public Result callWebService(Rang rang) {
        RestTemplate restTemplate = new RestTemplate();

        Result result = restTemplate.postForObject("http://localhost:8081/api/v1.0/convert", rang, Result.class);
        return result;
    }

}
