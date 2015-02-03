-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 03 Şub 2015, 14:25:15
-- Sunucu sürümü: 5.6.21
-- PHP Sürümü: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `basvurular`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kisiler`
--

CREATE TABLE IF NOT EXISTS `kisiler` (
`id` int(11) NOT NULL,
  `isim_soyisim` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `telefonno` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `adres` varchar(60) COLLATE utf8_turkish_ci NOT NULL,
  `il` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `dogumtarihi` date NOT NULL,
  `parola` varchar(10) COLLATE utf8_turkish_ci NOT NULL,
  `hakkindabilgi` varchar(200) COLLATE utf8_turkish_ci NOT NULL,
  `yas` int(11) NOT NULL,
  `cinsiyet` varchar(10) COLLATE utf8_turkish_ci NOT NULL,
  `medenihal` varchar(10) COLLATE utf8_turkish_ci NOT NULL,
  `eskimaas` int(11) NOT NULL,
  `kullanilanotobüsler` varchar(150) COLLATE utf8_turkish_ci NOT NULL,
  `verilenoy` int(11) NOT NULL,
  `keyboarddusunce` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `yasamakistenensehir` varchar(20) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kisiler`
--

INSERT INTO `kisiler` (`id`, `isim_soyisim`, `telefonno`, `adres`, `il`, `dogumtarihi`, `parola`, `hakkindabilgi`, `yas`, `cinsiyet`, `medenihal`, `eskimaas`, `kullanilanotobüsler`, `verilenoy`, `keyboarddusunce`, `yasamakistenensehir`) VALUES
(5, 'İlkay Günel', '(222) 222 2222', 'Ağa Paşa Caddesi', 'İzmir', '1993-01-01', 'a123', 'kod5.org da blog yazarlığı yapmaktayım.', 24, 'Erkek', 'Bekar', 2000, '[İETT, ÖHO, İOAŞ]', 8, 'güzel', 'Bursa');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kisiler`
--
ALTER TABLE `kisiler`
 ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kisiler`
--
ALTER TABLE `kisiler`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
