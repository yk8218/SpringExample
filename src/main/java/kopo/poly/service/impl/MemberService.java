package kopo.poly.service.impl;

import kopo.poly.dto.MemberDTO;
import kopo.poly.persistance.mapper.IMemberMapper;
import kopo.poly.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MemberService")
public class MemberService implements IMemberService {

    private final IMemberMapper memberMapper;

    @Autowired
    public MemberService(IMemberMapper memberMapper) {
        this.memberMapper = memberMapper;}

    @Override
    public void register(MemberDTO dto) throws Exception {

    }
}
