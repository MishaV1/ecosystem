package com.example.ecosystem.controllers

import com.example.ecosystem.models.Organizm
import com.example.ecosystem.models.enums.TypeOrganizm
import org.hibernate.internal.util.collections.CollectionHelper.listOf
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("organizms")
class OrganizmController {

    @GetMapping("list")
    fun listOrganizms(): List<Organizm> {
        return listOf(Organizm(1, "черат", TypeOrganizm.BIRD, 9, 2),
            Organizm(2, "водоросль", TypeOrganizm.PLANT, 2, 0))
    }
}