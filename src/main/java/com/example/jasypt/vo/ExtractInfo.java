package com.example.jasypt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shuaihu4
 * @date 2022年01月24日 10:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtractInfo {
    /**
     * 要素开始位置
     */
    private Integer begin;
    /**
     * 要素抽取内容
     */
    private String content;
    /**
     * 要素抽取类型
     */
    private String desc;
    /**
     * 要素结束位置
     */
    private Integer end;
    /**
     * 要素抽取原始完整文本
     */
    private String oriSentence;
}
