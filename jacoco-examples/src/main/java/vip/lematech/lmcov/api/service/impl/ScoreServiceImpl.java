package vip.lematech.lmcov.api.service.impl;


import vip.lematech.lmcov.api.service.ScoreService;

/**
 * @version 1.0.0
 * @desc TODO
 * @created 2021/8/5 3:37 下午
 */
public class ScoreServiceImpl implements ScoreService {
    @Override
    public String getScoreLevel(int score) {
        String result;
        if (score > 90) {
            result = "优秀";
        } else if (score < 90 && score >= 75) {
            result = "良好";
        } else if (score >= 60) {
            result = "合格";
        } else if (score > 40) {
            result = "不合格";
        } else if (score >= 0) {
            result = "差";
        } else {
            result = "成绩格式不正确";
        }
        return result;
    }
}
