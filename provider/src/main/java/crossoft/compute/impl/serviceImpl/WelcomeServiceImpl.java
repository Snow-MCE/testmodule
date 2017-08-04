package crossoft.compute.impl.serviceImpl;

import crossoft.compute.api.WelcomeService;
import org.springframework.stereotype.Component;

/**
 * Created by ervin on 2017/7/9.
 */
@Component
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String getWelcomeMessage(String userName) {
        long sum = 0;
        for( int i = 0; i < 10000; i++ ){
            sum += i;
        }
        return "consumer -->welcome to spring boot dubbo," + userName;
    }
}
