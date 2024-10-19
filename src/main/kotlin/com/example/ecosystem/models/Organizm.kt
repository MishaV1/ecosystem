package com.example.ecosystem.models

import com.example.ecosystem.models.enums.TypeOrganizm

data class Organizm(val id: Int, val name: String, val type: TypeOrganizm, val health: Int, val food_id: Int )
