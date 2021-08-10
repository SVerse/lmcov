package vip.lematech.lmcov.api.service;

/**
 * @version 1.0.0
 * @desc TODO
 * @created 2021/8/5 3:35 下午
 */
public interface ScoreService {
    /**
     * 分数所属水平层次
     * @param score
     * @return
     */
    public String getScoreLevel(int score);
}
