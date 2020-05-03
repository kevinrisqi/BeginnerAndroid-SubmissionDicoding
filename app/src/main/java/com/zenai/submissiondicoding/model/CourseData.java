package com.zenai.submissiondicoding.model;

import com.zenai.submissiondicoding.R;

import java.util.ArrayList;

public class CourseData {

    private static String[] courseName = {
      "Memulai Pemrograman Dengan Kotlin",
      "Belajar Prinsip Pemrograman SOLID",
      "Belajar Membuat Aplikasi Android untuk Pemula",
      "Belajar Fundamental Aplikasi Android",
      "Belajar Android Material Design",
      "Belajar Android Jetpack Pro",
      "Menjadi Android Developer Expert",
      "Memulai Pemrograman Dengan Swift",
      "Belajar Membuat Aplikasi iOS untuk Pemula",
      "Belajar Fundamental Aplikasi iOS",
      "Menjadi iOS Developer Expert",
      "Memulai Pemrograman Dengan Dart",
      "Belajar Membuat Aplikasi Flutter untuk Pemula",
      "Belajar Fundamental Aplikasi Flutter",
      "Menjadi Flutter Developer Expert"
    };

    private static String[] courseDetail = {
      "Kelas pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming (OOP) menggunakan Kotlin.",
      "Pelajari kelima prinsip desain yang merupakan pedoman untuk rancangan kode yang baik pada pemrograman berorientasi objek (OOP).",
      "Pelajari cara membuat aplikasi pertamamu dengan Android Studio. Kelas ini mengajarkan dasar Android mulai dari Intent sampai RecyclerView.",
      "Pelajari skill Android dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan. Mulai dari design pattern, testing, API sampai database.",
      "Pelajari konsep dan implementasi desain visual, gerak, dan interaksi lintas perangkat untuk menciptakan pengalaman aplikasi yang indah.",
      "Pelajari Android Jetpack dengan berbagai fitur canggih dan sudah diimplementasikan 80% dari 1000 aplikasi terbaik di Google Play Store.",
      "Tingkatkan skill kamu menjadi seorang Android expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri.",
      "Belajar bahasa Swift buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) dalam mengembangkan iOS dan OS X.",
      "Pelajari cara membuat aplikasi pertamamu dengan XCode. Kelas ini mengajarkan dasar iOS mulai dari Controller sampai TableViews.",
      "Pelajari skill iOS dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan. Mulai dari SwiftUI, testing, API sampai database.",
      "Tingkatkan skill kamu menjadi seorang iOS expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri.",
      "Kelas Pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming (OOP) menggunakan Dart.",
      "Pelajari cara membuat aplikasi multi-platform pertamamu menggunakan Flutter. Kelas ini mengajarkan mulai dari fundamental hingga widget.",
      "Pelajari skill Flutter dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan seperti advance layouts, interactive widgets dan backend.",
      "Tingkatkan skill kamu menjadi seorang Flutter expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri.",
    };

    private static String[] courseExplanation = {
      "Kotlin merupakan bahasa utama yang digunakan dalam pengembangan Android. Saat ini, Kotlin sudah stabil dan banyak digunakan oleh industri, seperti Gojek, Netflix, Twitter dan masih banyak lagi. Selain pengembangan Android, Kotlin dapat digunakan untuk berbagai macam pengembangan aplikasi, baik itu server atau backend, maupun website. Bahkan saat ini tengah dikembangkan Kotlin/Native, yang memungkinkan developer untuk menggunakannya sebagai bahasa pemrograman dalam pengembangan aplikasi di platform lain seperti embedded system, desktop, macOS, dan iOS. Banyaknya komunitas yang berkontribusi untuk Kotlin membuat bahasa ini berkembang sangat pesat. Kotlin dinobatkan sebagai “Fastest growing languages” oleh GitHub Octoverse 2018 mengalahkan Rust, Go, dll. Kelas ini disusun oleh expert developer kami berkolaborasi dengan Deny Prasetyo (Senior Software and Infrastructure Engineer, Gojek). Materi dalam kelas ini disesuaikan untuk Anda yang ingin memahami konsep-konsep dasar Kotlin, functional programming, Object-Oriented Programming (OOP), concurrency pada Kotlin, dan lain-lain.",
      "Semua orang bisa membuat kode program selama dia tahu suatu bahasa pemrograman. Tetapi membuat kode program yang mudah dimengerti, mudah dikelola, dan mudah dikembangkan adalah tantangan yang nyata, bahkan untuk seorang yang sudah menjadi programmer sekali pun. Tergantung dari paradigma apa yang dipakai, pasti ada solusi yang bisa digunakan untuk menyelesaikan problem tersebut. Di dalam paradigma OOP (object oriented programming atau pemrograman berorientasi object), dikenal prinsip SOLID yang memiliki tujuan untuk membuat kode program lebih mudah dimengerti, mudah dikelola, dan mudah dikembangkan. Robert C Martin (Uncle Bob) adalah seorang engineer dan instructor dari Amerika mengenalkan SOLID di papernya yang berjudul Design Principle and Design Pattern pada tahun 2000. Di dalam kelas ini akan dibahas mengenai lima prinsip utama dalam SOLID yaitu Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, dan Dependency Inversion. Akan dibahas juga mengenai pilar utama dalam OOP dan hubungan antar objek. Kurikulum telah disusun dan diverifikasi oleh tim expert Dicoding bersama praktisi industri agar materi yang disajikan terstruktur dan komprehensif.",
      "Android semakin digandrungi. Per Maret 2018 ada lebih dari 3,6 juta aplikasi Android di Google Play Store (data Statista). Di indonesia sendiri pada bulan Maret 2019 sebanyak 93,5% konsumen memilih platform Android untuk sistem operasi peranti mobile mereka (data Statcounter). Ini menandakan bahwa kebutuhan akan Android developer, semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan (data LinkedIn Emerging Jobs Report 2019). Dicoding sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
      "Android semakin digandrungi. Per Maret 2018 ada lebih dari 3,6 juta aplikasi Android di Google Play Store (data Statista). Di indonesia sendiri pada bulan Maret 2019 sebanyak 93,5% konsumen memilih platform Android untuk sistem operasi peranti mobile mereka (data Statcounter). Ini menandakan bahwa kebutuhan akan Android developer, semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan (data LinkedIn Emerging Jobs Report 2019). Dicoding sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
      "Android semakin digandrungi. Per Maret 2018 ada lebih dari 3,6 juta aplikasi Android di Google Play Store (data Statista). Di indonesia sendiri pada bulan Maret 2019 sebanyak 93,5% konsumen memilih platform Android untuk sistem operasi peranti mobile mereka (data Statcounter). Ini menandakan bahwa kebutuhan akan Android developer, semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan (data LinkedIn Emerging Jobs Report 2019). Dicoding sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
      "Android Jetpack terinspirasi oleh Support Library, seperangkat komponen untuk memudahkan pemanfaatan fitur Android terbaru sembari tetap menjaga kompatibilitas dengan versi-versi sebelumnya. Google memperkenalkan Architecture Components sebagai bagian dari Android Jetpack yang dirancang untuk memudahkan penanganan data dalam menghadapi perubahan siklus hidup aplikasi. Sejak Google perkenalkan pada I/O 2018, banyak sekali dari perusahaan IT yang telah mengadopsinya. Google menyatakan bahwa Android Jetpack digunakan oleh 80% dari 1000 aplikasi terbaik Google Play Store. Perusahaan seperti LinkedIn, Traveloka dan Kakao Corporation (KakaoTalk) menjumpai lebih sedikit bug dan sukses menghemat waktu pengembangan sehingga dapat lebih berfokus pada apa yang membuat aplikasi mereka unik. Dicoding sebagai satu-satunya Google Developers Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
      "Tingkatkan skill kamu menjadi seorang Android expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri",
      "Sejak dikenalkan di Apple Wordwide Developer Conference (WWDC) di tahun 2014, Swift telah menjadi bahasa resmi yang didukung oleh Apple Inc. untuk pengembangan aplikasi iOS, iPadOs, macOS, watchOS, tvOS, Linux, dan OS X. Swift merupakan bahasa pemrograman yang modern, cepat dan type-safe. Di tahun 2018, Swift telah mengalahkan Objective-C sebagai bahasa pemrograman yang digunakan untuk iOS dan platform Apple lainnya. Menurut survei yang dilakukan Stack Overflow, Swift menjadi bahasa pemrograman yang paling disukai tahun 2019. Dibandingkan dengan 2018, pecinta Swift naik dari 65% menjadi 69%. Kelas ini membahas tuntas dasar Swift sebagai fondasi untuk Anda yang ingin mengembangkan kemampuan pengembangan aplikasi iOS beserta plaftorm Apple lainnya. Kurikulum telah disusun dan diverifikasi oleh tim expert Dicoding bersama praktisi industri agar materi yang disajikan terstruktur dan komprehensif.",
      "Menjadi iOS developer merupakan pekerjaan yang diimpikan bagi banyak orang. Menurut data dari Indeed, salah satu platform pencari pekerjaan terbesar di dunia, tingkat kepuasan menjadi iOS developer itu 13% lebih tinggi dibandingkan dengan profesi Android Developer. The iOS Developer Community Survey menemukan bahwa di tahun 2020, 75.5% dari developer masih menggunakan codebase terpisah ketika aplikasinya perlu dapat dijalankan di berbagai platform yang berbeda (seperti OS Android dan iOS). Artinya banyak tempat kerja yang masih menginginkan codebase yang terpisah dan benar-benar dibangun dari Xcode. Oleh karena ini, permintaan industri untuk seorang iOS Developer masih sangat tinggi walaupun market share pengguna mobile platform iOS hanya sebesar 26% (data Statcounter, Februari 2020). Kelas ini membahas komponen-komponen dasar yang dibutuhkan untuk membuat aplikasi iOS seperti XCode, Applications Pattern dan Architecture, Views and Windows, Storyboards, Navigation Based Applications, dan Table Views. Kurikulum telah disusun oleh tim expert Dicoding bersama praktisi industri agar materi yang disajikan terstruktur dan komprehensif.",
      "Menjadi iOS developer merupakan pekerjaan yang diimpikan bagi banyak orang. Menurut data dari Indeed, salah satu platform pencari pekerjaan terbesar di dunia, tingkat kepuasan menjadi iOS developer itu 13% lebih tinggi dibandingkan dengan profesi Android Developer. The iOS Developer Community Survey menemukan bahwa di tahun 2020, 75.5% dari developer masih menggunakan codebase terpisah ketika aplikasinya perlu dapat dijalankan di berbagai platform yang berbeda (seperti OS Android dan iOS). Artinya banyak tempat kerja yang masih menginginkan codebase yang terpisah dan benar-benar dibangun dari Xcode. Oleh karena ini, permintaan industri untuk seorang iOS Developer masih sangat tinggi walaupun market share pengguna mobile platform iOS hanya sebesar 26% (data Statcounter, Februari 2020). Kelas ini membahas komponen-komponen dasar yang dibutuhkan untuk membuat aplikasi iOS seperti XCode, Applications Pattern dan Architecture, Views and Windows, Storyboards, Navigation Based Applications, dan Table Views. Kurikulum telah disusun oleh tim expert Dicoding bersama praktisi industri agar materi yang disajikan terstruktur dan komprehensif.",
      "Menjadi iOS developer merupakan pekerjaan yang diimpikan bagi banyak orang. Menurut data dari Indeed, salah satu platform pencari pekerjaan terbesar di dunia, tingkat kepuasan menjadi iOS developer itu 13% lebih tinggi dibandingkan dengan profesi Android Developer. The iOS Developer Community Survey menemukan bahwa di tahun 2020, 75.5% dari developer masih menggunakan codebase terpisah ketika aplikasinya perlu dapat dijalankan di berbagai platform yang berbeda (seperti OS Android dan iOS). Artinya banyak tempat kerja yang masih menginginkan codebase yang terpisah dan benar-benar dibangun dari Xcode. Oleh karena ini, permintaan industri untuk seorang iOS Developer masih sangat tinggi walaupun market share pengguna mobile platform iOS hanya sebesar 26% (data Statcounter, Februari 2020). Kelas ini membahas komponen-komponen dasar yang dibutuhkan untuk membuat aplikasi iOS seperti XCode, Applications Pattern dan Architecture, Views and Windows, Storyboards, Navigation Based Applications, dan Table Views. Kurikulum telah disusun oleh tim expert Dicoding bersama praktisi industri agar materi yang disajikan terstruktur dan komprehensif.",
      "Kelas Pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming (OOP) menggunakan Dart.",
      "Pelajari cara membuat aplikasi multi-platform pertamamu menggunakan Flutter. Kelas ini mengajarkan mulai dari fundamental hingga widget.",
      "Pelajari skill Flutter dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan seperti advance layouts, interactive widgets dan backend.",
      "Tingkatkan skill kamu menjadi seorang Flutter expert dengan kurikulum yang fokus pada case study dan best practice dari pelaku industri."
    };

    private static int[] courseImages = {
      R.drawable.memulai_pemrograman_dengan_kotlin_logo_071119141033,
      R.drawable.belajar_prinsip_pemrograman_solid_logo_160320152324,
      R.drawable.belajar_membuat_aplikasi_android_untuk_pemula_logo_071119140631,
      R.drawable.menjadi_android_developer_expert_logo_071119140536,
      R.drawable.belajar_android_material_design_logo_230320225229,
      R.drawable.belajar_android_jetpack_pro_logo_071119141410,
      R.drawable.menjadi_android_developer_expert_logo_240320135733,
      R.drawable.memulai_pemrograman_dengan_swift_logo_311219165842,
      R.drawable.belajar_membuat_aplikasi_ios_untuk_pemula_logo_110320143925,
      R.drawable.belajar_fundamental_aplikasi_ios_logo_230320222535,
      R.drawable.menjadi_ios_developer_expert_logo_230320222603,
      R.drawable.memulai_pemrograman_dengan_dart_logo_230320223401,
      R.drawable.belajar_membuat_aplikasi_flutter_untuk_pemula_logo_230320223038,
      R.drawable.belajar_membuat_aplikasi_flutter_untuk_pemula_logo_230320223038,
      R.drawable.belajar_membuat_aplikasi_flutter_untuk_pemula_logo_230320223038
    };

    public static ArrayList<Course> getListData(){
        ArrayList<Course> list = new ArrayList<>();
        for(int position = 0; position < courseName.length; position++){
            Course course = new Course();
            course.setName(courseName[position]);
            course.setDetail(courseDetail[position]);
            course.setPhoto(courseImages[position]);
            course.setExplanation(courseExplanation[position]);
            list.add(course);
        }
        return list;
    }
}
