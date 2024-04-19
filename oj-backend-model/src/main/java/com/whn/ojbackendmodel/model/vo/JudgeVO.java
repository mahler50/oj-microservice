package com.whn.ojbackendmodel.model.vo;

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeVO {
    private String language;
    private String code;
    private String message;
    private String time;
}
