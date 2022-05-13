package kopo.poly.persistance.mapper;

import kopo.poly.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMemberMapper {

    public void register(MemberDTO dto) throws Exception;
}
