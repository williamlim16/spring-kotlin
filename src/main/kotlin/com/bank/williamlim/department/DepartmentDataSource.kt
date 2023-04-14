package com.bank.williamlim.department

interface DepartmentDataSource {

    fun getDepartments(): Collection<Department>

}