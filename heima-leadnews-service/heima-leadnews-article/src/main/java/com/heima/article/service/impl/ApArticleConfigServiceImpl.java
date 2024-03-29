package com.heima.article.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heima.article.mapper.ApArticleConfigMapper;
import com.heima.article.service.ApArticleConfigService;
import com.heima.model.article.pojos.ApArticleConfig;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuntai
 * @Date: 2024/03/26/13:08
 * @Description: com.heima.article.service.impl
 */
public class ApArticleConfigServiceImpl extends ServiceImpl<ApArticleConfigMapper, ApArticleConfig> implements ApArticleConfigService {

    /**
     * 修改文件配置
     * @param map
     */
    @Override
    public void updateByMap(Map map) {
        Object enable = map.get("enable");
        boolean isDown = true;
        if (enable.equals(1)){
            isDown = false;
        }

        update(Wrappers.<ApArticleConfig>lambdaUpdate().eq(ApArticleConfig::getArticleId,map.get("articleId")).set(ApArticleConfig::getIsDown,isDown));
    }
}
