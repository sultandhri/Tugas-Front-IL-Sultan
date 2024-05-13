package com.example.tugas_sultandohari.data

import com.example.tugas_sultandohari.R
import com.example.tugas_sultandohari.model.Course
import com.example.tugas_sultandohari.model.Gallery
import com.example.tugas_sultandohari.model.Mentee
import com.example.tugas_sultandohari.model.Mentor

object DummyData {
    val mobileMentors = listOf(
        Mentor(
            id = 1,
            name = "Gladiator",
            nickname = "Sinopsis: Seorang jenderal Romawi, Maximus Decimus Meridius, dijebak dan dipenjarakan setelah Kaisar Commodus membunuh keluarganya. Maximus bertahan hidup dan menjadi gladiator yang legendaris, membalas dendam dan memimpin pemberontakan melawan kekaisaran.\n",
            role = "action",
            photo = R.drawable.gladi
        ),
        Mentor(
            id = 2,
            name = "Saving Private Ryan ",
            nickname = "Sinopsis: Setelah pendaratan Normandia pada Perang Dunia II, sekelompok tentara Amerika diberi misi untuk mencari dan menyelamatkan James Ryan, satu-satunya saudara yang masih hidup dari empat bersaudara yang telah tewas dalam pertempuran.\n",
            role = "action",
            photo = R.drawable.privet
        ),
        Mentor(
            id = 3,
            name = " The Green Mile",
            nickname = "Sinopsis: Di penjara Cold Mountain, seorang penjaga penjara bertemu dengan narapidana yang memiliki kekuatan gaib. Saat ia mengenal lebih dekat narapidana yang tidak bersalah ini, ia terlibat dalam kisah keajaiban, pengampunan, dan tragedi.\n",
            role = "action",
            photo = R.drawable.green
        ),
        Mentor(
            id = 4,
            name = " Forrest Gump",
            nickname = "Nab",
            role = "Sinopsis: Forrest Gump adalah seorang pria sederhana dengan kecerdasan yang rendah, tetapi hidupnya penuh dengan petualangan yang luar biasa. Melalui perjalanan hidupnya yang penuh dengan keajaiban, ia menyaksikan dan terlibat dalam peristiwa-peristiwa penting dalam sejarah Amerika.\n",
            photo = R.drawable.forestg
        ),
        Mentor(
            id = 5,
            name = "The Lord of The Rings",
            nickname = "Sinopsis: Berdasarkan novel karya J.R.R. Tolkien, kisah ini mengikuti perjalanan Frodo Baggins dan teman-temannya untuk menghancurkan Cincin Kekuatan yang jahat. Mereka menghadapi bahaya, perjuangan, dan pengkhianatan saat mereka berusaha menyelamatkan Middle-earth dari kegelapan.\n",
            role = "Fantasy",
            photo = R.drawable.lord
        )
    )

    val mobileMentees = listOf(
        Mentee(
            id = 1,
            name = "The Shawshank Redemption",
            photo = R.drawable.shawk,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 2,
            name = "The Godfather",
            photo = R.drawable.good,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 3,
            name = "The Dark Knight ",
            photo = R.drawable.betmen,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 4,
            name = "interception",
            photo = R.drawable.interception,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 5,
            name = "Forrest Gump",
            photo = R.drawable.forrestgump,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 6,
            name = "The Matrix",
            photo = R.drawable.matrix,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 7,
            name = "Schindler's List",
            photo = R.drawable.scindler,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 8,
            name = "Pulp Fiction",
            photo = R.drawable.pulp,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 9,
            name = "Goodfellas ",
            photo = R.drawable.good,
            batch = "Adventure",
            role = "action",
        ),
        Mentee(
            id = 10,
            name = "Fight Club",
            photo = R.drawable.fightclub,
            batch = "Adventure",
            role = "action",
        ),
    )

    val mobileCourses = listOf(
        Course(
            id = 1,
            name = "The Shawshank Redemption",
            photo = R.drawable.shawk,
            level = "Adventure",
        ),
        Course(
            id = 2,
            name = "Fight Club",
            photo = R.drawable.fightclub,
            level = "Adventure",
        ),
        Course(
            id = 3,
            name = "Goodfellas ",
            photo = R.drawable.good,
            level = "Adventure",
        ),
        Course(
            id = 4,
            name = "Titanic",
            photo = R.drawable.pulp,
            level = "Drama",
        ),
        Course(
            id = 5,
            name = "Pulp Fiction",
            photo = R.drawable.pulp,
            level = "Adventure",

        ),
        Course(
            id = 6,
            name = "Schindler's List",
            photo = R.drawable.scindler,
            level = "Adventure",
        ),
        Course(
            id = 7,
            name = "The Matrix",
            photo = R.drawable.matrix,
            level = "Adventure",
        ),
        Course(
            id = 8,
            name = "Doctor Strange",
            level = "Supranatural",
            photo = R.drawable.doctor
        )
    )

    val infiniteGalleries = listOf(
        Gallery(
            id = 1,
            name = "Digital Marketing",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 2,
            name = "Menjadi Designer",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 3,
            name = "Modern Android in 2024",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 4,
            name = "Iftar Inners",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 5,
            name = "Container Technology",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 6,
            name = "Filosofi Ilo",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 7,
            name = "Tips Lulus MSIB",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 8,
            name = "Fresh Graduate jadi Manager",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 9,
            name = "Kenapa IBM Academy?",
            photo = R.drawable.interception
        ),
        Gallery(
            id = 10,
            name = "Unreal Engine",
            photo = R.drawable.interception
        ),
    )
}