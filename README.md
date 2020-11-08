Fork (with only minor changes) of [project of same name](https://github.com/proninyaroslav/libretorrent). Changes will be described in this section; other sections are from original readme and may not reflect fork changes.

The license is unchanged (GPL-3.0 License).

The only functional changes are:
- Button in file/directory selector to cycle through app specific storage directories (meaning you can use the app without storage permissions; without the button, you can't navigate through the filesystem to these directories).
- Setting to turn off reminders about not granting storage permission (if storing data in app specific storage directories).
- Remove ACRA crash reporting. This is simply a personal preference.

Using release signing based on "gradle.properties" in your gradle config directory (which usually defaults to "~/.gradle").
Add the following lines to that file `
keystoreFile=C:\\somewhere\\key.jks
keystorePassword=<keystore password>
keystoreAlias=<key alias>
keystoreAliasPassword=<key password>
`

---

[![Crowdin](https://d322cqt584bo4o.cloudfront.net/libretorrent/localized.svg)](https://crowdin.com/project/libretorrent)
[![Chat - Telegram](https://img.shields.io/badge/chat-Telegram-blue.svg)](https://t.me/LibreTorrent)
[<img alt="Coverity Scan Build Status" src="https://scan.coverity.com/projects/14421/badge.svg">](https://scan.coverity.com/projects/proninyaroslav-libretorrent)

LibreTorrent
=====================
[<img alt="Get it on F-Droid" height="80" src="https://tachibanagenerallaboratories.github.io/images/badges/F-Droid/get-it-on.png">](https://f-droid.org/app/org.proninyaroslav.libretorrent)
[<img alt="Get it on AFH" height="80" src="https://tachibanagenerallaboratories.github.io/images/badges/Android%20File%20Host/android-file-host-badge.png">](https://www.androidfilehost.com/?w=files&flid=246723)
[<img alt="Get it on Google Play" height="80" src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png">](https://play.google.com/store/apps/details?id=org.proninyaroslav.libretorrent)
[<img alt="Get it on XDA Labs" height="80" src="https://tachibanagenerallaboratories.github.io/images/badges/XDA%20Labs/xda-labs-badge.png">](https://labs.xda-developers.com/store/app/org.proninyaroslav.libretorrent)
[<img alt="Get it on APKMirror" height="80" src="https://raw.githubusercontent.com/proninyaroslav/TachibanaGeneralLaboratories.github.io/master/images/badges/APKMirror/get-it-on-apkmirror.png">](https://www.apkmirror.com/apk/proninyaroslav/libretorrent)
[<img alt="Get it on Aptoide" height="80" src="https://raw.githubusercontent.com/proninyaroslav/TachibanaGeneralLaboratories.github.io/master/images/badges/Aptoide/get-it-on-aptoide.png">](https://libretorrent.en.aptoide.com/app)

**Mirror:** https://proninyaroslav.ru/ftp/libretorrent/

**Issues**: https://gitlab.com/proninyaroslav/libretorrent/issues

LibreTorrent is a Free as in Freedom torrent client for Android 4+, based on libtorrent (Java wrapper [libtorrent4j](https://github.com/aldenml/libtorrent4j)) lib.

Overview
---

Already implemented features (help is highly desired!):

 - DHT, PeX, encryption, LSD, UPnP, NAT-PMP, µTP
 - IP filtering (eMule dat and PeerGuardian)
 - Ability to fine tune (network settings, power management, battery control, UI settings, etc.)
 - Supports torrents with large number of files and big files
 - HTTP\S and magnet links support
 - Support proxy for trackers and peers
 - Ability to move files while downloading
 - Ability to automatic movement of files to another directory or to an external drive at the end of download
 - Ability to specify file and folder priorities
 - Ability to select which files to download
 - Ability to download sequentially
 - Material Design
 - Tablet optimized UI
 - Scheduling
 - RSS manager
 - Android TV support
 - Ability to create torrents
 - Streaming of any selected files
 - And more

Donation
---

If you like LibreTorrent you can support author with these methods. If you have problems with payment or you want to donate in another way, contact me: `proninyaroslav@mail.ru`. Thank you!

 - **PayPal**: [![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GWWYZSCKPAB2Q)
 - **Yandex Money**: `410011738561939`
 - **WebMoney**: 
     - **WMZ**: `Z335461926163`
     - **WMR**: `R151579576467`
 - **Amazon.com eGift Cards**: just choose your amount and type e-mail `proninyaroslav@mail.ru`
in the gift card details https://smile.amazon.com/gp/product/B004LLIKVU/
 - **Liberapay**: [![liberapay](https://liberapay.com/assets/widgets/donate.svg)](https://liberapay.com/proninyaroslav/donate)
 - **Bitcoin**: `1Af9DgxtWvVp6bFiYQw2MeWtRzTXshRYpB`
 - **Nano**: `nano_1b13t35x5dwu39xcs3xj4ozfsniozfnxdqwjijy6efnkda6sc3hqie914fja`

Translations
---

You can help translate the app here: [https://crowdin.com/project/libretorrent](https://crowdin.com/project/libretorrent)

 - **Azerbaijani** *(thanks Khan27)*
 - **Basque** *(thanks dabid)*
 - **Brazilian Portuguese** *(thanks Wolfterro)*
 - **Catalan** *(thanks amontero)*
 - **Chinese Traditional** *(thanks lzmxya)*
 - **Chinese** *(thanks yanglw, Xu Eric and Tan Yongle)*
 - **Czech** *(thanks HarryPhoon, novas78)*
 - **English**
 - **French** *(thanks Valentin Orient, boby23)*
 - **German** *(thanks vanitasvitae)*
 - **Greek** *(thanks Spyros3000, skyhirules)*
 - **Hindi** *(thanks Lino Joseph)*
 - **Hungarian** *(thanks Ephyx)*
 - **Italian** *(thanks Gabrielelulo2, GiovaGa)*
 - **Japanese** *(thanks mamarama9904)*
 - **Korean** *(thanks jjjhitel)*
 - **Lithuanian** *(thanks techwebpd)*
 - **Malayalam** *(thanks Lino Joseph)*
 - **Norwegian Bokmål** *(thanks comradekingu)*
 - **Polish** *(thanks Azaradel)*
 - **Romanian** *(thanks georgenetu, Silviu200530)*
 - **Russian**
 - **Serbian (Cyrillic)** *(thanks veles330)*
 - **Spanish** *(thanks ed10vi, MS-PC)*
 - **Swedish** *(thanks JAMALDIN01)*
 - **Tamil** *(thanks Lino Joseph)*
 - **Turkish** *(thanks oersen)*
 - **Ukrainian** *(thanks SensDeViata)*

Contributors
---

See [CONTRIBUTING.md](CONTRIBUTING.md)

Screenshots
---

![phone](/art/screenshots/phone.png) ![phone dark](/art/screenshots/phone_dark.png) ![rss](/art/screenshots/rss.png) ![create torrent](/art/screenshots/create_torrent.png) ![session log](/art/screenshots/session_log.png) ![tablet](/art/screenshots/tablet.png)

License
---
[![Large GPLv3 logo with “Free as in Freedom”](https://www.gnu.org/graphics/gplv3-with-text-136x68.png)](http://www.gnu.org/licenses/gpl-3.0.en.html)

    Copyright (C) 2016 Yaroslav Pronin <proninyaroslav@mail.ru>
    This file is part of LibreTorrent.
    LibreTorrent is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
