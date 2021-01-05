package com.sck.domain;

import java.util.List;

public class FieldSub {

    /** 시퀀스 */
    private String seq;
    /** 구장 시퀀스 */
    private String fieldSeq;
    /** 구장명 */
    private String fieldSubNm;
    /** 대여품 */
    private String fieldRental;
    /** 샤워시설 */
    private String fieldShower;
    /** 주차시설 */
    private String fieldParking;
    /** 음료판매 */
    private String fieldDrink;
    /** 구장정보 */
    private String fieldInfo;
    /** 구장순서 */
    private String orderNo;
    /** 등록자 */
    private String regId;
    /** 등록일자 */
    private String regDate;
    /** 수정자 */
    private String modId;
    /** 수정일자 */
    private String modDate;
    /** 구장 이미지 시퀀스 */

    /** 삭제여부 */
    private String delYn;

    /** 부모리스트(Field) */
    private List<FieldMain> fieldMainList;

}
