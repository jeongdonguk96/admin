package io.spring.admin.domain.access_statistics

import io.spring.admin.entity.BaseEntity
import io.spring.admin.enums.LoginType
import io.spring.admin.enums.StatisticsType
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class AccessStatistics(
        var accessorCount: String,
        var accessResource: String,
        var statisticsStamp: LocalDateTime,
        @Enumerated(EnumType.STRING)
        var loginType: LoginType,
        @Enumerated(EnumType.STRING)
        var statisticsType: StatisticsType,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0L,
) : BaseEntity() {


}