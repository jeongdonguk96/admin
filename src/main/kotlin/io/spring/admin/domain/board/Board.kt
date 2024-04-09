package io.spring.admin.domain.board

import io.spring.admin.domain.member.Member
import io.spring.admin.entity.BaseEntity
import io.spring.admin.enums.*
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Board(
        var title: String,
        var contents: String,
        @Enumerated(EnumType.STRING)
        var category: Category,
        @ManyToOne(fetch = FetchType.LAZY)
        var writer: Member,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0L,
        @Enumerated(EnumType.STRING)
        var boardStatus: BoardStatus = BoardStatus.VISIBLE,
) : BaseEntity() {
}