package crossoft.compute.impl.serviceImpl;

import crossoft.compute.api.ComputeProxyService;
import org.springframework.stereotype.Component;

/**
 * Created by ervin on 2017/7/19.
 */
@Component
public class ComputeProxyServiceImpl implements ComputeProxyService {

    @Override
    public Integer add(int a, int b) {
        int sum = 0;
        /*for( int i = 0; i < 10000; i++ ){
            sum += i;
        }*/
        return sum;
    }
}
