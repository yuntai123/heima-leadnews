package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.pojos.ApArticleConfig;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuntai
 * @Date: 2024/03/26/13:06
 * @Description: com.heima.article.service
 */
public interface ApArticleConfigService extends IService<ApArticleConfig> {
    /**
     * 修改文章配置
     * @param map
     */
    public void updateByMap(Map map);
}
