package com.dev.azeem.ktor.recipe.repository

import com.dev.azeem.ktor.recipe.models.ApiResponse
import com.dev.azeem.ktor.recipe.models.Recipe

class RecipeRepositoryImpl : RecipeRepository {

    override val recipes = listOf(
        Recipe(
            id = 1,
            name = "Classic Margherita Pizza",
            ingredients = listOf(
                "Pizza dough",
                "Tomato sauce",
                "Fresh mozzarella cheese",
                "Fresh basil leaves",
                "Olive oil",
                "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Preheat the oven to 475°F (245°C).",
                "Roll out the pizza dough and spread tomato sauce evenly.",
                "Top with slices of fresh mozzarella and fresh basil leaves.",
                "Drizzle with olive oil and season with salt and pepper.",
                "Bake in the preheated oven for 12-15 minutes or until the crust is golden brown.",
                "Slice and serve hot."
            ),
            prepTimeMinutes = 20,
            cookTimeMinutes = 15,
            servings = 4,
            difficulty = "Easy",
            cuisine = "Italian",
            caloriesPerServing = 300,
            image = "/images/classic-margherita-pizza.webp"
        ),
        Recipe(
            id = 2,
            name = "Vegetarian Stir-Fry",
            ingredients = listOf(
                "Tofu, cubed",
                "Broccoli florets",
                "Carrots, sliced",
                "Bell peppers, sliced",
                "Soy sauce",
                "Ginger, minced",
                "Garlic, minced",
                "Sesame oil",
                "Cooked rice for serving"
            ),
            instructions = listOf(
                "In a wok, heat sesame oil over medium-high heat.",
                "Add minced ginger and garlic, sauté until fragrant.",
                "Add cubed tofu and stir-fry until golden brown.",
                "Add broccoli, carrots, and bell peppers. Cook until vegetables are tender-crisp.",
                "Pour soy sauce over the stir-fry and toss to combine.",
                "Serve over cooked rice."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 20,
            servings = 3,
            difficulty = "Medium",
            cuisine = "Asian",
            caloriesPerServing = 250,
            image = "/images/vegetarian-stir-fry.webp"
        ),
        Recipe(
            id = 3,
            name = "Chocolate Chip Cookies",
            ingredients = listOf(
                "All-purpose flour",
                "Butter, softened",
                "Brown sugar",
                "White sugar",
                "Eggs",
                "Vanilla extract",
                "Baking soda",
                "Salt",
                "Chocolate chips"
            ),
            instructions = listOf(
                "Preheat the oven to 350°F (175°C).",
                "In a bowl, cream together softened butter, brown sugar, and white sugar.",
                "Beat in eggs one at a time, then stir in vanilla extract.",
                "Combine flour, baking soda, and salt. Gradually add to the wet ingredients.",
                "Fold in chocolate chips.",
                "Drop rounded tablespoons of dough onto ungreased baking sheets.",
                "Bake for 10-12 minutes or until edges are golden brown.",
                "Allow cookies to cool on the baking sheet for a few minutes before transferring to a wire rack."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 10,
            servings = 24,
            difficulty = "Easy",
            cuisine = "American",
            caloriesPerServing = 150,
            image = "/images/chocolate-chip-cookies.webp"
        ),
        Recipe(
            id = 4,
            name = "Chicken Alfredo Pasta",
            ingredients = listOf(
                "Fettuccine pasta",
                "Chicken breast, sliced",
                "Heavy cream",
                "Parmesan cheese, grated",
                "Garlic, minced",
                "Butter",
                "Salt and pepper to taste",
                "Fresh parsley for garnish"
            ),
            instructions = listOf(
                "Cook fettuccine pasta according to package instructions.",
                "In a pan, sauté sliced chicken in butter until fully cooked.",
                "Add minced garlic and cook until fragrant.",
                "Pour in heavy cream and grated Parmesan cheese. Stir until the cheese is melted.",
                "Season with salt and pepper to taste.",
                "Combine the Alfredo sauce with cooked pasta.",
                "Garnish with fresh parsley before serving."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 20,
            servings = 4,
            difficulty = "Medium",
            cuisine = "Italian",
            caloriesPerServing = 500,
            image = "/images/chicken-alfredo-pasta.webp"
        ),
        Recipe(
            id = 5,
            name = "Mango Salsa Chicken",
            ingredients = listOf(
                "Chicken thighs",
                "Mango, diced",
                "Red onion, finely chopped",
                "Cilantro, chopped",
                "Lime juice",
                "Jalapeño, minced",
                "Salt and pepper to taste",
                "Cooked rice for serving"
            ),
            instructions = listOf(
                "Season chicken thighs with salt and pepper.",
                "Grill or bake chicken until fully cooked.",
                "In a bowl, combine diced mango, chopped red onion, cilantro, minced jalapeño, and lime juice.",
                "Dice the cooked chicken and mix it with the mango salsa.",
                "Serve over cooked rice."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 25,
            servings = 3,
            difficulty = "Easy",
            cuisine = "Mexican",
            caloriesPerServing = 380,
            image = "/images/mango-salsa-chicken.webp"
        ),
        Recipe(
            id = 6,
            name = "Quinoa Salad with Avocado",
            ingredients = listOf(
                "Quinoa, cooked",
                "Avocado, diced",
                "Cherry tomatoes, halved",
                "Cucumber, diced",
                "Red bell pepper, diced",
                "Feta cheese, crumbled",
                "Lemon vinaigrette dressing",
                "Salt and pepper to taste"
            ),
            instructions = listOf(
                "In a large bowl, combine cooked quinoa, diced avocado, halved cherry tomatoes, diced cucumber, diced red bell pepper, and crumbled feta cheese.",
                "Drizzle with lemon vinaigrette dressing and toss to combine.",
                "Season with salt and pepper to taste.",
                "Chill in the refrigerator before serving."
            ),
            prepTimeMinutes = 20,
            cookTimeMinutes = 15,
            servings = 4,
            difficulty = "Easy",
            cuisine = "Mediterranean",
            caloriesPerServing = 280,
            image = "/images/quinoa-salad-with-avocado.webp"
        ),
        Recipe(
            id = 7,
            name = "Tomato Basil Bruschetta",
            ingredients = listOf(
                "Baguette, sliced",
                "Tomatoes, diced",
                "Fresh basil, chopped",
                "Garlic cloves, minced",
                "Balsamic glaze",
                "Olive oil",
                "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Preheat the oven to 375°F (190°C).",
                "Place baguette slices on a baking sheet and toast in the oven until golden brown.",
                "In a bowl, combine diced tomatoes, chopped fresh basil, minced garlic, and a drizzle of olive oil.",
                "Season with salt and pepper to taste.",
                "Top each toasted baguette slice with the tomato-basil mixture.",
                "Drizzle with balsamic glaze before serving."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 10,
            servings = 6,
            difficulty = "Easy",
            cuisine = "Italian",
            caloriesPerServing = 120,
            image = "/images/tomato-basil-bruschetta.webp"
        ),
        Recipe(
            id = 8,
            name = "Beef and Broccoli Stir-Fry",
            ingredients = listOf(
                "Beef sirloin, thinly sliced",
                "Broccoli florets",
                "Soy sauce",
                "Oyster sauce",
                "Sesame oil",
                "Garlic, minced",
                "Ginger, minced",
                "Cornstarch",
                "Cooked white rice for serving"
            ),
            instructions = listOf(
                "In a bowl, mix soy sauce, oyster sauce, sesame oil, and cornstarch to create the sauce.",
                "In a wok, stir-fry thinly sliced beef until browned. Remove from the wok.",
                "Stir-fry broccoli florets, minced garlic, and minced ginger in the same wok.",
                "Add the cooked beef back to the wok and pour the sauce over the mixture.",
                "Stir until everything is coated and heated through.",
                "Serve over cooked white rice."
            ),
            prepTimeMinutes = 20,
            cookTimeMinutes = 15,
            servings = 4,
            difficulty = "Medium",
            cuisine = "Asian",
            caloriesPerServing = 380,
            image = "/images/beef-and-broccoli-stir-fry.webp"
        ),
        Recipe(
            id = 9,
            name = "Caprese Salad",
            ingredients = listOf(
                "Tomatoes, sliced",
                "Fresh mozzarella cheese, sliced",
                "Fresh basil leaves",
                "Balsamic glaze",
                "Extra virgin olive oil",
                "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Arrange alternating slices of tomatoes and fresh mozzarella on a serving platter.",
                "Tuck fresh basil leaves between the slices.",
                "Drizzle with balsamic glaze and extra virgin olive oil.",
                "Season with salt and pepper to taste.",
                "Serve immediately as a refreshing salad."
            ),
            prepTimeMinutes = 10,
            cookTimeMinutes = 0,
            servings = 2,
            difficulty = "Easy",
            cuisine = "Italian",
            caloriesPerServing = 200,
            image = "/images/caprese-salad.webp"
        ),
        Recipe(
            id = 10,
            name = "Shrimp Scampi Pasta",
            ingredients = listOf(
                "Linguine pasta",
                "Shrimp, peeled and deveined",
                "Garlic, minced",
                "White wine",
                "Lemon juice",
                "Red pepper flakes",
                "Fresh parsley, chopped",
                "Salt and pepper to taste"
            ),
            instructions = listOf(
                "Cook linguine pasta according to package instructions.",
                "In a skillet, sauté minced garlic in olive oil until fragrant.",
                "Add shrimp and cook until pink and opaque.",
                "Pour in white wine and lemon juice. Simmer until the sauce slightly thickens.",
                "Season with red pepper flakes, salt, and pepper.",
                "Toss cooked linguine in the shrimp scampi sauce.",
                "Garnish with chopped fresh parsley before serving."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 20,
            servings = 3,
            difficulty = "Medium",
            cuisine = "Italian",
            caloriesPerServing = 400,
            image = "/images/shrimp-scampi-pasta.webp"
        ),
        Recipe(
            id = 11,
            name = "Chicken Biryani",
            ingredients = listOf(
                "Basmati rice",
                "Chicken, cut into pieces",
                "Onions, thinly sliced",
                "Tomatoes, chopped",
                "Yogurt",
                "Ginger-garlic paste",
                "Biryani masala",
                "Green chilies, sliced",
                "Fresh coriander leaves",
                "Mint leaves",
                "Ghee",
                "Salt to taste"
            ),
            instructions = listOf(
                "Marinate chicken with yogurt, ginger-garlic paste, biryani masala, and salt.",
                "In a pot, sauté sliced onions until golden brown. Remove half for later use.",
                "Layer marinated chicken, chopped tomatoes, half of the fried onions, and rice in the pot.",
                "Top with ghee, green chilies, fresh coriander leaves, mint leaves, and the remaining fried onions.",
                "Cover and cook on low heat until the rice is fully cooked and aromatic.",
                "Serve hot, garnished with additional coriander and mint leaves."
            ),
            prepTimeMinutes = 30,
            cookTimeMinutes = 45,
            servings = 6,
            difficulty = "Medium",
            cuisine = "Pakistani",
            caloriesPerServing = 550,
            image = "/images/chicken-biryani.webp"
        ),
        Recipe(
            id = 12,
            name = "Chicken Karahi",
            ingredients = listOf(
                "Chicken, cut into pieces",
                "Tomatoes, chopped",
                "Green chilies, sliced",
                "Ginger, julienned",
                "Garlic, minced",
                "Coriander powder",
                "Cumin powder",
                "Red chili powder",
                "Garam masala",
                "Cooking oil",
                "Fresh coriander leaves",
                "Salt to taste"
            ),
            instructions = listOf(
                "In a wok (karahi), heat cooking oil and sauté minced garlic until golden brown.",
                "Add chicken pieces and cook until browned on all sides.",
                "Add chopped tomatoes, green chilies, ginger, and spices. Cook until tomatoes are soft.",
                "Cover and simmer until the chicken is tender and the oil separates from the masala.",
                "Garnish with fresh coriander leaves and serve hot with naan or rice."
            ),
            prepTimeMinutes = 20,
            cookTimeMinutes = 30,
            servings = 4,
            difficulty = "Easy",
            cuisine = "Pakistani",
            caloriesPerServing = 420,
            image = "/images/chicken-karahi.webp"
        ),
        Recipe(
            id = 13,
            name = "Aloo Keema",
            ingredients = listOf(
                "Ground beef",
                "Potatoes, peeled and diced",
                "Onions, finely chopped",
                "Tomatoes, chopped",
                "Ginger-garlic paste",
                "Cumin powder",
                "Coriander powder",
                "Turmeric powder",
                "Red chili powder",
                "Cooking oil",
                "Fresh coriander leaves",
                "Salt to taste"
            ),
            instructions = listOf(
                "In a pan, heat cooking oil and sauté chopped onions until golden brown.",
                "Add ginger-garlic paste and sauté until fragrant.",
                "Add ground beef and cook until browned. Drain excess oil if needed.",
                "Add diced potatoes, chopped tomatoes, and spices. Mix well.",
                "Cover and simmer until the potatoes are tender and the masala is well-cooked.",
                "Garnish with fresh coriander leaves and serve hot with naan or rice."
            ),
            prepTimeMinutes = 25,
            cookTimeMinutes = 35,
            servings = 5,
            difficulty = "Medium",
            cuisine = "Pakistani",
            caloriesPerServing = 380,
            image = "/images/aloo-keema.webp"
        ),
        Recipe(
            id = 14,
            name = "Chapli Kebabs",
            ingredients = listOf(
                "Ground beef",
                "Onions, finely chopped",
                "Tomatoes, finely chopped",
                "Green chilies, chopped",
                "Coriander leaves, chopped",
                "Pomegranate seeds",
                "Ginger-garlic paste",
                "Cumin powder",
                "Coriander powder",
                "Red chili powder",
                "Egg",
                "Cooking oil",
                "Salt to taste"
            ),
            instructions = listOf(
                "In a large bowl, mix ground beef, chopped onions, tomatoes, green chilies, coriander leaves, and pomegranate seeds.",
                "Add ginger-garlic paste, cumin powder, coriander powder, red chili powder, and salt. Mix well.",
                "Add an egg to bind the mixture and form into round flat kebabs.",
                "Heat cooking oil in a pan and shallow fry the kebabs until browned on both sides.",
                "Serve hot with naan or mint chutney."
            ),
            prepTimeMinutes = 30,
            cookTimeMinutes = 20,
            servings = 4,
            difficulty = "Medium",
            cuisine = "Pakistani",
            caloriesPerServing = 320,
            image = "/images/chapli-kebabs.webp"
        ),
        Recipe(
            id = 15,
            name = "Saag (Spinach) with Makki di Roti",
            ingredients = listOf(
                "Mustard greens, washed and chopped",
                "Spinach, washed and chopped",
                "Cornmeal (makki ka atta)",
                "Onions, finely chopped",
                "Green chilies, chopped",
                "Ginger, grated",
                "Ghee",
                "Salt to taste"
            ),
            instructions = listOf(
                "Boil mustard greens and spinach until tender. Drain and blend into a coarse paste.",
                "In a pan, sauté chopped onions, green chilies, and grated ginger in ghee until golden brown.",
                "Add the greens paste and cook until it thickens.",
                "Meanwhile, knead cornmeal with water to make a dough. Roll into rotis (flatbreads).",
                "Cook the rotis on a griddle until golden brown.",
                "Serve hot saag with makki di roti and a dollop of ghee."
            ),
            prepTimeMinutes = 40,
            cookTimeMinutes = 30,
            servings = 3,
            difficulty = "Medium",
            cuisine = "Pakistani",
            caloriesPerServing = 280,
            image = "/images/saag-with-makki-di-roti.webp"
        ),
        Recipe(
            id = 16,
            name = "Japanese Ramen Soup",
            ingredients = listOf(
                "Ramen noodles",
                "Chicken broth",
                "Soy sauce",
                "Mirin",
                "Sesame oil",
                "Shiitake mushrooms, sliced",
                "Bok choy, chopped",
                "Green onions, sliced",
                "Soft-boiled eggs",
                "Grilled chicken slices",
                "Norwegian seaweed (nori)"
            ),
            instructions = listOf(
                "Cook ramen noodles according to package instructions and set aside.",
                "In a pot, combine chicken broth, soy sauce, mirin, and sesame oil. Bring to a simmer.",
                "Add sliced shiitake mushrooms and chopped bok choy. Cook until vegetables are tender.",
                "Divide the cooked noodles into serving bowls and ladle the hot broth over them.",
                "Top with green onions, soft-boiled eggs, grilled chicken slices, and nori.",
                "Serve hot and enjoy the authentic Japanese ramen!"
            ),
            prepTimeMinutes = 20,
            cookTimeMinutes = 25,
            servings = 2,
            difficulty = "Medium",
            cuisine = "Japanese",
            caloriesPerServing = 480,
            image = "/images/japanese-ramen-soup.webp"
        ),
        Recipe(
            id = 17,
            name = "Moroccan Chickpea Tagine",
            ingredients = listOf(
                "Chickpeas, cooked",
                "Tomatoes, chopped",
                "Carrots, diced",
                "Onions, finely chopped",
                "Garlic, minced",
                "Cumin",
                "Coriander",
                "Cinnamon",
                "Paprika",
                "Vegetable broth",
                "Olives",
                "Fresh cilantro, chopped"
            ),
            instructions = listOf(
                "In a tagine or large pot, sauté chopped onions and minced garlic until softened.",
                "Add diced carrots, chopped tomatoes, and cooked chickpeas.",
                "Season with cumin, coriander, cinnamon, and paprika. Stir to coat.",
                "Pour in vegetable broth and bring to a simmer. Cook until carrots are tender.",
                "Stir in olives and garnish with fresh cilantro before serving.",
                "Serve this flavorful Moroccan dish with couscous or crusty bread."
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 30,
            servings = 4,
            difficulty = "Easy",
            cuisine = "Moroccan",
            caloriesPerServing = 320,
            image = "/images/moroccan-chickpea-tagine.webp"
        ),
        Recipe(
            id = 18,
            name = "Korean Bibimbap",
            ingredients = listOf(
                "Cooked white rice",
                "Beef bulgogi (marinated and grilled beef slices)",
                "Carrots, julienned and sautéed",
                "Spinach, blanched and seasoned",
                "Zucchini, sliced and grilled",
                "Bean sprouts, blanched",
                "Fried egg",
                "Gochujang (Korean red pepper paste)",
                "Sesame oil",
                "Toasted sesame seeds"
            ),
            instructions = listOf(
                "Arrange cooked white rice in a bowl.",
                "Top with beef bulgogi, sautéed carrots, seasoned spinach, grilled zucchini, and blanched bean sprouts.",
                "Place a fried egg on top and drizzle with gochujang and sesame oil.",
                "Sprinkle with toasted sesame seeds before serving.",
                "Mix everything together before enjoying this delicious Korean bibimbap!",
                "Feel free to customize with additional vegetables or protein."
            ),
            prepTimeMinutes = 30,
            cookTimeMinutes = 20,
            servings = 2,
            difficulty = "Medium",
            cuisine = "Korean",
            caloriesPerServing = 550,
            image = "/images/korean-bibimbap.webp"
        ),
        Recipe(
            id = 19,
            name = "Greek Moussaka",
            ingredients = listOf(
                "Eggplants, sliced",
                "Ground lamb or beef",
                "Onions, finely chopped",
                "Garlic, minced",
                "Tomatoes, crushed",
                "Red wine",
                "Cinnamon",
                "Allspice",
                "Nutmeg",
                "Olive oil",
                "Milk",
                "Flour",
                "Parmesan cheese",
                "Egg yolks"
            ),
            instructions = listOf(
                "Preheat oven to 375°F (190°C).",
                "Sauté sliced eggplants in olive oil until browned. Set aside.",
                "In the same pan, cook chopped onions and minced garlic until softened.",
                "Add ground lamb or beef and brown. Stir in crushed tomatoes, red wine, and spices.",
                "In a separate saucepan, make béchamel sauce: melt butter, whisk in flour, add milk, and cook until thickened.",
                "Remove from heat and stir in Parmesan cheese and egg yolks.",
                "In a baking dish, layer eggplants and meat mixture. Top with béchamel sauce.",
                "Bake for 40-45 minutes until golden brown. Let it cool before slicing.",
                "Serve slices of moussaka warm and enjoy this Greek classic!"
            ),
            prepTimeMinutes = 45,
            cookTimeMinutes = 45,
            servings = 6,
            difficulty = "Medium",
            cuisine = "Greek",
            caloriesPerServing = 420,
            image = "/images/greek-moussaka.webp"
        ),
        Recipe(
            id = 20,
            name = "Butter Chicken (Murgh Makhani)",
            ingredients = listOf(
                "Chicken thighs, boneless and skinless",
                "Yogurt",
                "Ginger-garlic paste",
                "Garam masala",
                "Kashmiri red chili powder",
                "Tomato puree",
                "Butter",
                "Heavy cream",
                "Kasuri methi (dried fenugreek leaves)",
                "Sugar",
                "Salt to taste"
            ),
            instructions = listOf(
                "Marinate chicken thighs in a mixture of yogurt, ginger-garlic paste, garam masala, and Kashmiri red chili powder.",
                "In a pan, melt butter and sauté the marinated chicken until browned.",
                "Add tomato puree and cook until the oil separates. Stir in heavy cream.",
                "Sprinkle kasuri methi, sugar, and salt. Simmer until the chicken is fully cooked.",
                "Serve this creamy butter chicken over rice or with naan for an authentic Pakistani/Indian experience."
            ),
            prepTimeMinutes = 30,
            cookTimeMinutes = 25,
            servings = 4,
            difficulty = "Medium",
            cuisine = "Pakistani",
            caloriesPerServing = 480,
            image = "/images/butter-chicken.webp"
        ),
        Recipe(
            id = 21,
            name = "Thai Green Curry",
            ingredients = listOf(
                "Chicken thighs, boneless and skinless",
                "Green curry paste",
                "Coconut milk",
                "Fish sauce",
                "Sugar",
                "Eggplant, sliced",
                "Bell peppers, sliced",
                "Basil leaves",
                "Jasmine rice for serving"
            ),
            instructions = listOf(
                "In a pot, simmer green curry paste in coconut milk.",
                "Add chicken, fish sauce, and sugar. Cook until chicken is tender.",
                "Stir in sliced eggplant and bell peppers. Simmer until vegetables are cooked.",
                "Garnish with fresh basil leaves.",
                "Serve hot over jasmine rice and enjoy this Thai classic!"
            ),
            prepTimeMinutes = 20,
            cookTimeMinutes = 30,
            servings = 4,
            difficulty = "Medium",
            cuisine = "Thai",
            caloriesPerServing = 480,
            image = "/images/thai-green-curry.webp"
        ),
        Recipe(
            id = 22,
            name = "Mango Lassi",
            ingredients = listOf(
                "Ripe mango, peeled and diced",
                "Yogurt",
                "Milk",
                "Honey",
                "Cardamom powder",
                "Ice cubes"
            ),
            instructions = listOf(
                "In a blender, combine diced mango, yogurt, milk, honey, and cardamom powder.",
                "Blend until smooth and creamy.",
                "Add ice cubes and blend again until the lassi is chilled.",
                "Pour into glasses and garnish with a sprinkle of cardamom.",
                "Enjoy this refreshing Mango Lassi!"
            ),
            prepTimeMinutes = 10,
            cookTimeMinutes = 0,
            servings = 2,
            difficulty = "Easy",
            cuisine = "Indian",
            caloriesPerServing = 180,
            image = "/images/mango-lassi.webp"
        ),
        Recipe(
            id = 23,
            name = "Italian Tiramisu",
            ingredients = listOf(
                "Espresso, brewed and cooled",
                "Ladyfinger cookies",
                "Mascarpone cheese",
                "Heavy cream",
                "Sugar",
                "Cocoa powder"
            ),
            instructions = listOf(
                "In a bowl, whip heavy cream until stiff peaks form.",
                "In another bowl, mix mascarpone cheese and sugar until smooth.",
                "Gently fold the whipped cream into the mascarpone mixture.",
                "Dip ladyfinger cookies into brewed espresso and layer them in a serving dish.",
                "Spread a layer of the mascarpone mixture over the cookies.",
                "Repeat layers and finish with a dusting of cocoa powder.",
                "Chill in the refrigerator for a few hours before serving.",
                "Indulge in the decadence of this classic Italian Tiramisu!"
            ),
            prepTimeMinutes = 30,
            cookTimeMinutes = 0,
            servings = 6,
            difficulty = "Medium",
            cuisine = "Italian",
            caloriesPerServing = 350,
            image = "/images/italian-tiramisu.webp"
        ),
        Recipe(
            id = 24,
            name = "Turkish Kebabs",
            ingredients = listOf(
                "Ground lamb or beef",
                "Onions, grated",
                "Garlic, minced",
                "Parsley, finely chopped",
                "Cumin",
                "Coriander",
                "Red pepper flakes",
                "Salt and pepper to taste",
                "Flatbread for serving",
                "Tahini sauce"
            ),
            instructions = listOf(
                "In a bowl, mix ground meat, grated onions, minced garlic, chopped parsley, and spices.",
                "Form the mixture into kebab shapes and grill until fully cooked.",
                "Serve the kebabs on flatbread with a drizzle of tahini sauce.",
                "Enjoy these flavorful Turkish Kebabs with your favorite sides."
            ),
            prepTimeMinutes = 25,
            cookTimeMinutes = 15,
            servings = 4,
            difficulty = "Easy",
            cuisine = "Turkish",
            caloriesPerServing = 280,
            image = "/images/turkish-kebabs.webp"
        ),
        Recipe(
            id = 25,
            name = "Blueberry Banana Smoothie",
            ingredients = listOf(
                "Blueberries, fresh or frozen",
                "Banana, peeled and sliced",
                "Greek yogurt",
                "Almond milk",
                "Honey",
                "Chia seeds (optional)"
            ),
            instructions = listOf(
                "In a blender, combine blueberries, banana, Greek yogurt, almond milk, and honey.",
                "Blend until smooth and creamy.",
                "Add chia seeds for extra nutrition and blend briefly.",
                "Pour into a glass and enjoy this nutritious Blueberry Banana Smoothie!"
            ),
            prepTimeMinutes = 10,
            cookTimeMinutes = 0,
            servings = 1,
            difficulty = "Easy",
            cuisine = "Smoothie",
            caloriesPerServing = 220,
            image = "/images/blueberry-banana-smoothie.webp"
        ),
        Recipe(
            id = 26,
            name = "Mexican Street Corn (Elote)",
            ingredients = listOf(
                "Corn on the cob",
                "Mayonnaise",
                "Cotija cheese, crumbled",
                "Chili powder",
                "Lime wedges"
            ),
            instructions = listOf(
                "Grill or roast corn on the cob until kernels are charred.",
                "Brush each cob with mayonnaise, then sprinkle with crumbled Cotija cheese and chili powder.",
                "Serve with lime wedges for squeezing over the top.",
                "Enjoy this delicious and flavorful Mexican Street Corn!"
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 15,
            servings = 4,
            difficulty = "Easy",
            cuisine = "Mexican",
            caloriesPerServing = 180,
            image = "/images/mexican-street-corn.webp"
        ),
        Recipe(
            id = 27,
            name = "Russian Borscht",
            ingredients = listOf(
                "Beets, peeled and shredded",
                "Cabbage, shredded",
                "Potatoes, diced",
                "Onions, finely chopped",
                "Carrots, grated",
                "Tomato paste",
                "Beef or vegetable broth",
                "Garlic, minced",
                "Bay leaves",
                "Sour cream for serving"
            ),
            instructions = listOf(
                "In a pot, sauté chopped onions and garlic until softened.",
                "Add shredded beets, cabbage, diced potatoes, grated carrots, and tomato paste.",
                "Pour in broth and add bay leaves. Simmer until vegetables are tender.",
                "Serve hot with a dollop of sour cream on top.",
                "Enjoy the hearty and comforting flavors of Russian Borscht!"
            ),
            prepTimeMinutes = 30,
            cookTimeMinutes = 40,
            servings = 6,
            difficulty = "Medium",
            cuisine = "Russian",
            caloriesPerServing = 220,
            image = "/images/russian-borscht.webp"
        ),
        Recipe(
            id = 28,
            name = "South Indian Masala Dosa",
            ingredients = listOf(
                "Dosa batter (fermented rice and urad dal batter)",
                "Potatoes, boiled and mashed",
                "Onions, finely chopped",
                "Mustard seeds",
                "Cumin seeds",
                "Curry leaves",
                "Turmeric powder",
                "Green chilies, chopped",
                "Ghee",
                "Coconut chutney for serving"
            ),
            instructions = listOf(
                "In a pan, heat ghee and add mustard seeds, cumin seeds, and curry leaves.",
                "Add chopped onions, green chilies, and turmeric powder. Sauté until onions are golden brown.",
                "Mix in boiled and mashed potatoes. Cook until well combined and seasoned.",
                "Spread dosa batter on a hot griddle to make thin pancakes.",
                "Place a spoonful of the potato mixture in the center, fold, and serve hot.",
                "Pair with coconut chutney for a delicious South Indian meal."
            ),
            prepTimeMinutes = 40,
            cookTimeMinutes = 20,
            servings = 4,
            difficulty = "Medium",
            cuisine = "Indian",
            caloriesPerServing = 320,
            image = "/images/masala-dosa.webp"
        ),
        Recipe(
            id = 29,
            name = "Lebanese Falafel Wrap",
            ingredients = listOf(
                "Falafel balls",
                "Whole wheat or regular wraps",
                "Tomatoes, diced",
                "Cucumbers, sliced",
                "Red onions, thinly sliced",
                "Lettuce, shredded",
                "Tahini sauce",
                "Fresh parsley, chopped"
            ),
            instructions = listOf(
                "Warm falafel balls according to package instructions.",
                "Place a generous serving of falafel in the center of each wrap.",
                "Top with diced tomatoes, sliced cucumbers, red onions, shredded lettuce, and fresh parsley.",
                "Drizzle with tahini sauce and wrap tightly.",
                "Enjoy this Lebanese Falafel Wrap filled with fresh and flavorful ingredients!"
            ),
            prepTimeMinutes = 15,
            cookTimeMinutes = 10,
            servings = 2,
            difficulty = "Easy",
            cuisine = "Lebanese",
            caloriesPerServing = 400,
            image = "/images/lebanese-falafel-wrap.webp"
        ),
        Recipe(
            id = 30,
            name = "Brazilian Caipirinha",
            ingredients = listOf(
                "Cachaça (Brazilian sugarcane spirit)",
                "Lime, cut into wedges",
                "Granulated sugar",
                "Ice cubes"
            ),
            instructions = listOf(
                "In a glass, muddle lime wedges with granulated sugar to release the juice.",
                "Fill the glass with ice cubes.",
                "Pour cachaça over the ice and stir well.",
                "Sip and enjoy the refreshing taste of the Brazilian Caipirinha!",
                "Adjust sugar and lime to suit your taste preferences."
            ),
            prepTimeMinutes = 5,
            cookTimeMinutes = 0,
            servings = 1,
            difficulty = "Easy",
            cuisine = "Brazilian",
            caloriesPerServing = 150,
            image = "/images/brazilian-caipirinha.webp"
        ),
    )

    override suspend fun getAllRecipes(
        page: Int,
        limit: Int
    ): ApiResponse {
        return ApiResponse(
            status = "Success",
            message = "OK",
            prevPage = calculatePage(
                recipes = recipes,
                page = page,
                limit = limit
            )["prevPage"],
            nextPage = calculatePage(
                recipes = recipes,
                page = page,
                limit = limit
            )["nextPage"],
            recipes = provideRecipes(
                recipes = recipes,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchRecipes(name: String?): ApiResponse {
        return ApiResponse(
            status = "Success",
            message = "OK",
            recipes = findRecipes(query = name)
        )
    }

    private fun provideRecipes(
        recipes: List<Recipe>,
        page: Int,
        limit: Int
    ): List<Recipe> {
        val allRecipes = recipes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allRecipes.size)
        return allRecipes[page - 1]
    }

    private fun calculatePage(
        recipes: List<Recipe>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allRecipes = recipes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allRecipes.size)
        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allRecipes.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun findRecipes(query: String?): List<Recipe> {
        val foundRecipes = mutableListOf<Recipe>()
        return if (!query.isNullOrEmpty()) {
            recipes.forEach { recipe ->
                if (recipe.name.lowercase().contains(query.lowercase())) {
                    foundRecipes.add(recipe)
                }
            }
            foundRecipes
        } else {
            emptyList()
        }
    }

}