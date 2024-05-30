package umc.study.domain;

import lombok.*;

import jakarta.persistence.*;
import umc.study.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // 음식 카테고리는 보통 수정/삭제를 잘 하지 않으므로 양방향 매핑 안 함
//    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
//    private List<MemberPrefer> memberPreferList = new ArrayList<>();
}