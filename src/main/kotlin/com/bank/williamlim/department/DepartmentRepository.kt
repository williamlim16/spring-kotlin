package com.bank.williamlim.department

import org.springframework.stereotype.Repository
import java.util.*

@Repository
class DepartmentRepository :DepartmentDataSource{

    override fun getDepartments(): Collection<Department> {
        return listOf(
            Department(UUID.randomUUID(), "IT"),
            Department(UUID.randomUUID(), "Finance")
        )
    }

}