package com.sck.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FieldMain {

    /** 시퀀스 */
    private String seq;
    /** 구장 */
    private String fieldMainNm;
    /** 주소 */
    private String fieldAddress;
    /** 연락처 */
    private String fieldTel;
    /** 환불규정 */
    private String fieldRefund;
    /** 등록자 */
    private String regId;
    /** 등록일 */
    private String regDate;
    /** 수정자 */
    private String modId;
    /** 수정일 */
    private String modDate;
    /** 삭제여부 */
    private String delYn;

}
