import dataclasses.QuestionData

val listOfCapitalQuestions = listOf<QuestionData>(

    QuestionData(
        title = "What is the capital of Canada?",
        right = "Ottawa",
        trivia = "yea",
        wrong = listOf("Quebec City", "Toronto", "Vancouver", "Montreal", "Winnipeg", "Calgary")
    ),

    QuestionData(
        title = "What is the capital of Russia?",
        right = "Moscow",
        trivia = "yea",
        wrong = listOf("Vladivostok", "St. Petersburg", "Novgorod", "Tver", "Samara", "Novosibirsk", "Kazan")
    ),

    QuestionData(
        title = "What is the capital of Germany?",
        right = "Berlin",
        trivia = "yea",
        wrong = listOf("Bremen", "Cologne", "Baden", "Nuremberg", "Stuttgart", "Frankfurt", "Hamburg")
    ),

    QuestionData(
        title = "What is the capital of Egypt?",
        right = "Cairo",
        trivia = "yea",
        wrong = listOf("Fustat", "Luxor", "Alexandria", "Asyut", "Suez", "Port Said", "Damietta")
    ),

    QuestionData(
        title = "What is the capital of Iran?",
        right = "Tehran",
        trivia = "yea",
        wrong = listOf("Isfahan", "Shiraz", "Tabriz", "Kerman", "Yazd", "Rasht", "Izeh", "Ardabil")
    ),

    QuestionData(
        title = "What is the capital of Armenia?",
        right = "Yerevan",
        trivia = "yea",
        wrong = listOf("Vagharshapat", "Ashtarak", "Tsaghkadzor", "Gyumri", "Alaverdi", "Jermuk", "Meghri", "Kapan")
    ),

    QuestionData(
        title = "What is the capital of Greece?",
        right = "Athens",
        trivia = "yea",
        wrong = listOf("Thessaloniki", "Ioannina", "Pygos", "Sparti", "Kavala")
    ),

    QuestionData(
        title = "What is the capital of Tunis?",
        right = "Tunis",
        trivia = "yea",
        wrong = listOf("Sfax", "Kairouan", "Bizerte", "Gabes", "Sousse", "Monastir")
    ),

    QuestionData(
        title = "What is the capital of Spain?",
        right = "Madrid",
        trivia = "yea",
        wrong = listOf("Zaragoza", "Barcelona", "Cordoba", "Seville", "Murcia", "Valencia", "Bilbao", "Malaga")
    ),

    QuestionData(
        title = "What is the capital of Portugal?",
        right = "Lisbon",
        trivia = "yea",
        wrong = listOf("Porto", "Braga", "Aveiro", "Lagos", "Coimbra", "Evora")
    ),

    QuestionData(
        title = "What is the capital of Morocco?",
        right = "Rabat",
        trivia = "yea",
        wrong = listOf("Casablanca", "Fez", "Marrakesh", "Essaouira", "Safi", "Agadir")
    ),

    QuestionData(
        title = "What is the capital of Ethiopia?",
        right = "Addis Ababa",
        trivia = "yea",
        wrong = listOf("Jimma", "Hawassa", "Gondar", "Harar", "Dire Dawa", "Gode")
    ),

    QuestionData(
        title = "What is the capital of Yemen?",
        right = "Sana'a",
        trivia = "yea",
        wrong = listOf("Socotra", "Aden", "Taizz", "Al Mukalla", "Tarim", "Thamud")
    ),

    QuestionData(
        title = "What is the capital of Lebanon?",
        right = "Beirut",
        trivia = "yea",
        wrong = listOf("Sidon", "Tripoli", "Tyre", "Byblos", "Nabatieh", "Hasbaiyya")
    ),

    QuestionData(
        title = "What is the capital of Ghana?",
        right = "Accra",
        trivia = "yea",
        wrong = listOf("Kumasi", "Cape Coast", "Takoradi", "Tema", "Tamale", "Wa")
    ),
)

val listOfCountryQuestions = listOf(
    QuestionData(
        title = "What is the country with the biggest population?",
        right = "China",
        trivia = "yea",
        wrong = listOf("India", "USA", "Indonesia", "Pakistan", "Russia", "Egypt")
    ),

    QuestionData(
        title = "What is the country with the biggest population?",
        right = "China",
        trivia = "yea",
        wrong = listOf("India", "USA", "Indonesia", "Pakistan", "Russia", "Egypt")
    ),

    QuestionData(
        title = "In which country Arabic is an official language?",
        right = "Comoros",
        trivia = "yea",
        wrong = listOf("Iran", "Turkey", "Malta", "Spain", "South Sudan")
    ),

    QuestionData(
        title = "Which country in #1 in oil exports?",
        right = "Saudi Arabia",
        trivia = "yea",
        wrong = listOf("Russia", "Iraq", "Iran", "Azerbaijan", "UAE", "Venezuela", "Canada")
    ),

    QuestionData(
        title = "Which country in #1 in gas turbine exports?",
        right = "Germany",
        trivia = "yea",
        wrong = listOf("France", "UK", "USA", "Japan", "China", "Italy", "Canada", "South Korea")
    ),

    QuestionData(
        title = "Which country in #1 in coffee production?",
        right = "Brazil",
        trivia = "yea",
        wrong = listOf("Vietnam", "Yemen", "Colombia", "Ethiopia", "India", "Peru", "Kenya", "Laos")
    ),

    QuestionData(
        title = "Which country in #1 in potato production?",
        right = "China",
        trivia = "yea",
        wrong = listOf("Ukraine", "Russia", "North Korea", "Ireland", "India", "Bangladesh", "Poland", "Egypt")
    ),

    QuestionData(
        title = "Which country in #1 in maize exports?",
        right = "Poland",
        trivia = "yea",
        wrong = listOf("USA", "Brazil", "Argentina", "France", "Russia", "Ukraine", "Thailand", "Turkey")
    ),

    QuestionData(
        title = "Which country in #1 in wine production?",
        right = "Italy",
        trivia = "yea",
        wrong = listOf("France", "Spain", "Portugal", "Argentina", "USA", "Chile", "Thailand", "Turkey")
    ),

    QuestionData(
        title = "Which country in #1 in electricity consumption?",
        right = "China",
        trivia = "yea",
        wrong = listOf("USA", "India", "Russia", "Japan", "South Korea", "Germany", "Brazil", "Saudi Arabia")
    ),

    QuestionData(
        title = "Which country in #1 in electricity exports?",
        right = "Canada",
        trivia = "yea",
        wrong = listOf("France", "Germany", "Paraguay", "Sweden", "Czechia", "Spain")
    ),

)


val listOfQuestions = listOfCapitalQuestions + listOfCountryQuestions