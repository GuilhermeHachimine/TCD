package com.arvind.foodizone.data

import com.arvind.foodizone.model.Categories

object CategoriesRepository {

    fun getCategoriesData(): List<Categories> {
        return listOf(
            Categories(
                id = 1,
                name = "Hamburguers",
                image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "category_burgers.png"
            ),
            Categories(
                id = 2,
                name = "Pizzas",
                image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "category_fries.png"
            ),
            Categories(
                id = 3,
                name = "Saudavel",
                image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "category_beverages.png"
            ),
            Categories(
                id = 4,
                name = "Combo refeições",
                image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "category_combo_meals.png"
            ),
            Categories(
                id = 5,
                name = "Refeições",
                image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "category_happy_meals.png"
            ),
            Categories(
                id = 6,
                name = "Sobremesas",
                image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "category_desserts.png"
            )
        )
    }
}