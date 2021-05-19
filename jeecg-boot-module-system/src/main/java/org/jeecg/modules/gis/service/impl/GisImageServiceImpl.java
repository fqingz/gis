package org.jeecg.modules.gis.service.impl;

import org.jeecg.modules.gis.entity.GisImage;
import org.jeecg.modules.gis.mapper.GisImageMapper;
import org.jeecg.modules.gis.service.IGisImageService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 图片管理
 * @Author: jeecg-boot
 * @Date:   2021-05-07
 * @Version: V1.0
 */
@Service
public class GisImageServiceImpl extends ServiceImpl<GisImageMapper, GisImage> implements IGisImageService {

    @Override
    public List<GisImage> queryImgList() {
        return this.baseMapper.queryImgList();
    }
}
