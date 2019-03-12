package com.neusoft.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.entity.ContactRecord;
import com.neusoft.entity.vo.AnalConstituteVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 交往记录 交往记录 服务类
 * </p>
 *
 * @author CDHong
 * @since 2018-11-22
 */
public interface IAnalConstituteService extends IService<AnalConstituteVo> {
    List<AnalConstituteVo> analConstitutePage(Page page,String searchAnaly);
}
