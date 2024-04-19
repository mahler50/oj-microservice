package com.whn.ojbackendmodel.model.dto.questionsubmit;

import com.whn.ojbackendcommon.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryPageRequest extends PageRequest {
    private String title;
    private String language;
}
