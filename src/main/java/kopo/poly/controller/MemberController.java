package kopo.poly.controller;

import kopo.poly.service.IMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Slf4j
@Controller
public class MemberController {

    @Resource(name = "MemberService")
    private IMemberService userInfoService;
}