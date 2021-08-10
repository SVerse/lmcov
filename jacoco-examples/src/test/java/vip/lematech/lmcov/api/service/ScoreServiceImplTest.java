package vip.lematech.lmcov.api.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import vip.lematech.lmcov.api.service.impl.ScoreServiceImpl;

/**
 * @version 1.0.0
 * @desc TODO
 * @created 2021/8/5 3:38 下午
 */
public class ScoreServiceImplTest {
    @Test
    public void testScore(){
        ScoreService scoreService = new ScoreServiceImpl();
        String level = scoreService.getScoreLevel(100);
        Assert.assertEquals(level,"优秀");
    }
}
