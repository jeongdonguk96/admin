package io.spring.admin.domain.access

import io.spring.admin.enums.Gender
import io.spring.admin.enums.Role
import io.spring.admin.enums.UserStatus
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Access(
        var accessorIp: String,
        var accessResource: String,
        var accessYear: String,
        var accessMonth: String,
        var accessDay: String,
        var accessHour: String,
        var accessTime: LocalDateTime,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0L,
        var accessor: String? = null,
) {
}