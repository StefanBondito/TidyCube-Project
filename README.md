# TidyCube-Project
## _TidyCube_, An Inventory Manager Application

## Apa itu TidyCube?
TidyCube merupakan sebuah prototype aplikasi untuk pengaturan penyimpan suatu produk dimana pengguna, yaitu pemilik toko, dapat mengurus jumlah produk yang saat ini sedang dimiliki olehnya, dapat mengatur penjualan produknya kepada pelanggan, dan mencatat pembelian dari produsen untuk mengisi kembali penyimpanannya.

Untuk mengetahui lebih lanjut tentang cara kerja aplikasi TidyCube, silahkan membuka Manual Guide untuk TidyCube pada link berikut ini: 
https://docs.google.com/document/d/1VUbDNIUwL37poVznXfQW1FuTwGPM1RS6q6rcazFkr0A/edit?usp=sharing

## Features
- Sistem login dan logout untuk menjaga data-data penting
- Tampilan layar depan yang berisi total penyimpanan, penjualan, dan keuntungan, serta riwayat transaksi dari toko
> Menunjukkan total penyimpanan, hasil penjualan, dan keuntungan yang sudah didapatkan. Isi-isi ini diambil dari transaksi riwayat yang ditampilkan juga dibawahnya
- Tabel penyimpanan agar pengguna bisa memasukkan, memperbarui, menghapus data produk
> Menampilkan form 'Inventory Menu' dimana pengguna dapat memasukkan input atau data yang diperlukan mengenai sebuah produk dan bisa memilih untuk memasukkan, memperbarui, atau menghapus data. Terdapat juga tabel data 'Inventory List' disebelahnya untuk melihat penyimpanan produk yang sudah ada saat ini
- Sales agar pengguna bisa membuat entry transaksi yang dilakukan dengan pembeli
> Menampilkan form agar pengguna bisa memasukkan ID produk yang terjual beserta jumlahnya. Setelah dimasukkan, pengguna bisa memasukkan lagi ID produk lainnya atau langsung menyelesaikan form. Form ini nanti akan ditampilkan di riwayat transaksi.
- Fungsi restock yang memudahkan pengguna untuk mencatat pengisian kembali jumlah produk
> Menampilkan form dimana pengguna hanya perlu memasukkan ID produk dan jumlah yang ingin ditambahkan untuk produk tersebut.

## Technologies Used
TidyCube menggunakan beberapa aplikasi pemrograman dalam pembuatannya, antara lain:
- Java
- Eclipse IDE
- Apache NetBeans
- XAMPP
- MySql Server


## Installation
TidyCube saat ini membutuhkan aplikasi Apache NetBeans dan XAMPP untuk dijalankan.
- Buat clone repository ini ke desktop anda atau unduh repository ini dalam bentuk .zip file
- Buka aplikasi Apache NetBeans
- import repository ini ke dalam aplikasi Apache NetBeans sebagai project baru dengan import melalui .zip file atau import java project setelah di extract
- Buka XAMPP dan nyalakan Apache serta MySql
- Buka http://localhost/phpmyadmin/ di browser anda
- Buat sebuah database baru dengan nama yang sama dengan file .sql di .zip
- Pilihlah menu import dan masukkan file .sql tadi
- Kembalilah ke Apache NetBeans dan jalankan project

## Extensions
Berikut ini beberapa link download program yang dibutuhkan untuk menjalankan aplikasi TidyCube
| Programs | Source |
| ------ | ------ |
| mysql-connector-j-8.0.31 | https://dev.mysql.com/downloads/connector/j/ |
| Apache NetBeans | https://netbeans.apache.org/download/index.html |
| XAMPP | https://www.apachefriends.org/download.html |


## License

MIT


