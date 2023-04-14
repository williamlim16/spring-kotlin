package com.bank.williamlim.department

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DepartmentRepositoryTest{

  private val departmentRepository = DepartmentRepository()

  @Test
  fun `should provide a collection of departments`() {
    val departments = departmentRepository.getDepartments()
    assertThat(departments).hasOnlyElementsOfType(Department::class.java)
  }

}