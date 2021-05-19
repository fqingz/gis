package org.jeecg.modules.gis.mapper;

import org.apache.ibatis.annotations.Select;
import org.jeecg.modules.gis.entity.GisImage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Description: 图片管理
 * @Author: jeecg-boot
 * @Date:   2021-05-07
 * @Version: V1.0
 */
public interface GisImageMapper extends BaseMapper<GisImage> {

    @Select("(SELECT image,create_time FROM `gis_image` order by create_time limit 1) union all (SELECT image,create_time FROM `gis_image` order by create_time desc limit 1)")
    List<GisImage> queryImgList();
}
