# TidyCube-Project
![logo](./Moon_light_logo_template_1.png)
## _TidyCube_, An Inventory Manager Application

## What is TidyCube?
TidyCube merupakan sebuah prototype aplikasi untuk pengaturan penyimpan suatu produk dimana pengguna, yaitu pemilik toko, dapat mengurus jumlah produk yang saat ini sedang dimiliki olehnya, dapat mengatur penjualan produknya kepada pelanggan, dan mencatat pembelian dari produsen untuk mengisi kembali penyimpanannya.

Untuk mengetahui lebih lanjut tentang cara kerja aplikasi TidyCube, silahkan membuka Manual Guide untuk TidyCube pada link berikut ini: 
https://docs.google.com/document/d/1VUbDNIUwL37poVznXfQW1FuTwGPM1RS6q6rcazFkr0A/edit?usp=sharing
<hr>
TidyCube is an application prototype to assist management for product storing where the user, the shop owner, are able to control the amount of product that they currently have, control their product sellings with customers, and list their expenses when restocking their inventories.
<br><br>
To know more about how the TidyCube Project works, please check the manual guide on the link below:
https://docs.google.com/document/d/1VUbDNIUwL37poVznXfQW1FuTwGPM1RS6q6rcazFkr0A/edit?usp=sharing

## Authors
1. Alisha Zahra Saadiya - 2501971742
2. Gregory nicolla - 2501962340
3. Stefan Bondito Giovanno - 2540122041
4. Theophilus Nathan Tanudjaja - 2502007514

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


