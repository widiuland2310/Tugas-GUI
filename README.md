# Eksplorasi GUI Sederhana pada Java

Program Java sederhana yang menampilkan teks untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek (PBO).

## Informasi 5 Komponen Utama GUI yang Digunakan
1. **Top-level Container Class (`JFrame`)**
   - Kelas `SapaanGUI` mewarisi `JFrame` sebagai jendela utama aplikasi.
2. **Intermediate Container Class (`JPanel`)**
   - Menggunakan dua buah `JPanel` (`panelTeks` dan `panelTombol`) untuk mengelompokkan komponen teks dan tombol secara terpisah.
3. **Atomic Component Class (`JLabel` & `JButton`)**
   - `JLabel`: Digunakan untuk menampilkan kata-kata di layar aplikasi.
   - `JButton`: Digunakan untuk tombol aksi (**Tampilkan Kata** dan **Reset**).
4. **Layout Classes (`BorderLayout` & `FlowLayout`)**
   - `BorderLayout`: Digunakan pada `JFrame` untuk menempatkan `panelTeks` di tengah (`CENTER`) dan `panelTombol` di bagian bawah (`SOUTH`).
   - `FlowLayout`: Digunakan pada `panelTeks` dan `panelTombol` untuk menyusun komponen rata tengah secara horizontal.
5. **Event Listener (`ActionListener` & `MouseAdapter`)**
   - `ActionListener`: Meng-*override* method `actionPerformed()` untuk mengubah teks pada `JLabel` saat tombol diklik.
   - `MouseAdapter`: Menggunakan *Event Adapter Class* (`mouseEntered` dan `mouseExited`) untuk memberi efek warna saat kursor diarahkan ke tombol.
## Screenshot Program
<img width="185" height="62" alt="image" src="https://github.com/user-attachments/assets/157ad4c4-4580-485d-882a-9fcee9c3c223" />
<img width="183" height="62" alt="image" src="https://github.com/user-attachments/assets/1e9617e0-8065-4e88-88f7-fe9d133b0974" />
