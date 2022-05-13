package kopo.poly.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MemberDTO {

    private String user_id;
    private String user_pw;
    private String user_name;
    private int user_age;
    private Date join_dt;

    @Override
    public String toString() {
        return "MemberDTO [userId=" + user_id + ", userPW=" + user_pw + ", userName=" + user_name + ", userAge=" + user_age +", joinDate="
                + join_dt + "]";
    }
}

