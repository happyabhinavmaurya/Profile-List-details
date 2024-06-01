package com.happy.profile.model.data

data class User(
    val id: String,
    val profileImage: String,
    val firstName: String,
    val lastName: String,
    val bio: String,
    val dob: String,
    val email: String
)

val userList = listOf(
    User("1", "https://picsum.photos/200/300?random=1", "Emma", "Johnson", "Coffee lover and dog mom.", "1992-03-15", "emma.johnson@example.com"),
    User("2", "https://picsum.photos/200/300?random=2", "Noah", "Smith", "Passionate about music and travel.", "1988-11-28", "noah.smith@example.com"),
    User("3", "https://picsum.photos/200/300?random=3", "Olivia", "Brown", "Software engineer and avid reader.", "1995-07-12", "olivia.brown@example.com"),
    User("4", "https://picsum.photos/200/300?random=4", "Liam", "Jones", "Outdoor enthusiast and amateur photographer.", "1990-02-09", "liam.jones@example.com"),
    User("5", "https://picsum.photos/200/300?random=5", "Ava", "Garcia", "Fitness instructor and health advocate.", "1993-09-21", "ava.garcia@example.com"),
    User("6", "https://picsum.photos/200/300?random=6", "William", "Miller", "Tech geek and gamer at heart.", "1987-06-05", "william.miller@example.com"),
    User("7", "https://picsum.photos/200/300?random=7", "Sophia", "Davis", "Artist and fashion enthusiast.", "1996-12-03", "sophia.davis@example.com"),
    User("8", "https://picsum.photos/200/300?random=8", "James", "Rodriguez", "Sports fanatic and aspiring writer.", "1989-08-18", "james.rodriguez@example.com"),
    User("9", "https://picsum.photos/200/300?random=9", "Isabella", "Wilson", "Foodie and aspiring chef.", "1991-04-25", "isabella.wilson@example.com"),
    User("10", "https://picsum.photos/200/300?random=10", "Henry", "Martinez", "Musician and coffee connoisseur.", "1994-01-10", "henry.martinez@example.com"),
    User("11", "https://picsum.photos/200/300?random=11", "Mia", "Anderson", "Yoga instructor and nature lover.", "1997-05-30", "mia.anderson@example.com"),
    User("12", "https://picsum.photos/200/300?random=12", "Alexander", "Taylor", "Tech entrepreneur and avid traveler.", "1986-09-02", "alexander.taylor@example.com"),
    User("13", "https://picsum.photos/200/300?random=13", "Charlotte", "Thomas", "Bookworm and film buff.", "1998-07-27", "charlotte.thomas@example.com"),
    User("14", "https://picsum.photos/200/300?random=14", "Daniel", "Hernandez", "Engineer and DIY enthusiast.", "1985-12-14", "daniel.hernandez@example.com"),
    User("15", "https://picsum.photos/200/300?random=15", "Amelia", "Moore", "Animal lover and volunteer at the local shelter.", "1999-06-19", "amelia.moore@example.com"),
    User("16", "https://picsum.photos/200/300?random=16", "Benjamin", "Martin", "Outdoor adventurer and rock climber.", "1984-03-22", "benjamin.martin@example.com"),
    User("17", "https://picsum.photos/200/300?random=17", "Harper", "Jackson", "Fashion designer and trendsetter.", "2000-11-08", "harper.jackson@example.com"),
    User("18", "https://picsum.photos/200/300?random=18", "Mason", "White", "Sports journalist and avid runner.", "1983-05-01", "mason.white@example.com"),
    User("19", "https://picsum.photos/200/300?random=19", "Evelyn", "Harris", "Teacher and passionate about education.", "2001-02-13", "evelyn.harris@example.com"),
    User("20", "https://picsum.photos/200/300?random=20", "Elijah", "Clark", "Software developer and video game enthusiast.", "1982-07-07", "elijah.clark@example.com")
)
