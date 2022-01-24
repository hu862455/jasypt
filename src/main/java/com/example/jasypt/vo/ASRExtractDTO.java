package com.example.jasypt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author shuaihu4
 * @date 2022年01月24日 10:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ASRExtractDTO {
    /**
     * 通话号码
     */
    private String callNumber;
    /**
     * 坐席工号
     */
    private String curuserdnNum;
    /**
     * 对话文本顺序
     */
    private Integer dialogOrder;
    /**
     * 要素拼接
     */
    private String extract;
    /**
     * 要素抽取详细信息
     */
    private List<ExtractInfo> extractInfos;
    /**
     * id
     */
    private String id;
    /**
     * 插入时间
     */
    private Integer insertTime;
    /**
     * 插入格式化时间
     */
    private String insertTimeFormat;
    /**
     * 通话文本
     */
    private String msgContent;
    /**
     * 要素类型 1地址 2公司
     */
    private Integer type;
    /**
     * 通话唯一标识uuid
     */
    private String uuid;
}
