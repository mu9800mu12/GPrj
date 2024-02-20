package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//@JsonInclude
public class UserInfoDTO {

    private String user_id;
    private String user_name;
    private String password;
    private String email;
    private String addr1;   //주소
    private String addr2;   //상세주소
    private String reg_id;  //최초 등록자 id
    private String reg_dt;  //최초 등록일
    private String chg_id;  //최근 수정자 id
    private String chg_dt;  //최근 수정일

    private String exists_yn;

  public void setAuthNumber(int authNumber) {
   }

}