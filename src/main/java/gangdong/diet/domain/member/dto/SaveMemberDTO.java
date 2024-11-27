package gangdong.diet.domain.member.dto;

import gangdong.diet.domain.member.entity.Member;
import lombok.Builder;
import lombok.Data;

@Data
public class SaveMemberDTO {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String role;

    @Builder
    public SaveMemberDTO(Long id, String username, String password, String name, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public SaveMemberDTO(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.password = member.getPassword();
        this.name = member.getName();
        this.role = member.getRole();
    }
}