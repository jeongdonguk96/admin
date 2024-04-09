package io.spring.admin.domain.member

import io.spring.admin.domain.board.Board
import io.spring.admin.entity.BaseEntity
import io.spring.admin.enums.Gender
import io.spring.admin.enums.Role
import io.spring.admin.enums.UserStatus
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Member(
        var username: String,
        var password: String,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0L,
        @Enumerated(EnumType.STRING)
        var role: Role = Role.NORMAL,
        @Enumerated(EnumType.STRING)
        var userStatus: UserStatus = UserStatus.ACTIVE,
        @Enumerated(EnumType.STRING)
        var gender: Gender = Gender.NONE,
        var email: String? = null,
        var domain: String? = null,
        var birth: String? = null,
        var oldPassword1: Int = 0,
        var oldPassword2: Int = 0,
        var loginFailCount: Int = 0,
        var passwordModifiedDate: LocalDateTime? = null,
        var lastLoginDate: LocalDateTime? = null,
        @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY)
        var boardList: MutableList<Board> = ArrayList(),
) : BaseEntity() {

}