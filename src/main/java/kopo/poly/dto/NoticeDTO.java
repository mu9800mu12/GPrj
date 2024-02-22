package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {

    private String notice_seq;
    private String title;
    private String notice_yn;
    private String contents;
    private String user_id;
    private String read_cnt;
    private String reg_id;
    private String reg_dt;
    private String chg_id;
    private String chg_dt;
}
