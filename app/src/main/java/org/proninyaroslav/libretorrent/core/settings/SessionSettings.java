/*
 * Copyright (C) 2016-2019 Yaroslav Pronin <proninyaroslav@mail.ru>
 *
 * This file is part of LibreTorrent.
 *
 * LibreTorrent is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LibreTorrent is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LibreTorrent.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.proninyaroslav.libretorrent.core.settings;

public class SessionSettings
{
    public static final int DEFAULT_CACHE_SIZE = 256;
    public static final int DEFAULT_ACTIVE_DOWNLOADS = 4;
    public static final int DEFAULT_ACTIVE_SEEDS = 4;
    public static final int DEFAULT_MAX_PEER_LIST_SIZE = 200;
    public static final int DEFAULT_TICK_INTERVAL = 1000;
    public static final int DEFAULT_INACTIVITY_TIMEOUT = 60;
    public static final int MIN_CONNECTIONS_LIMIT = 2;
    public static final int DEFAULT_CONNECTIONS_LIMIT = 200;
    public static final int DEFAULT_CONNECTIONS_LIMIT_PER_TORRENT = 40;
    public static final int DEFAULT_UPLOADS_LIMIT_PER_TORRENT = 4;
    public static final int DEFAULT_ACTIVE_LIMIT = 6;
    public static final int DEFAULT_DOWNLOAD_RATE_LIMIT = 0;
    public static final int DEFAULT_UPLOAD_RATE_LIMIT = 0;
    public static final boolean DEFAULT_DHT_ENABLED = true;
    public static final boolean DEFAULT_LSD_ENABLED = true;
    public static final boolean DEFAULT_UTP_ENABLED = true;
    public static final boolean DEFAULT_UPNP_ENABLED = true;
    public static final boolean DEFAULT_NATPMP_ENABLED = true;
    public static final boolean DEFAULT_ENCRYPT_IN_CONNECTIONS = true;
    public static final boolean DEFAULT_ENCRYPT_OUT_CONNECTIONS = true;
    public static final EncryptMode DEFAULT_ENCRYPT_MODE = EncryptMode.ENABLED;
    public static final boolean DEFAULT_AUTO_MANAGED = false;
    public static final String DEFAULT_INETADDRESS = "0.0.0.0";
    public static final int DEFAULT_PORT_RANGE_FIRST = 37000;
    public static final int DEFAULT_PORT_RANGE_SECOND = 57010;
    public static final ProxyType DEFAULT_PROXY_TYPE = ProxyType.NONE;
    public static final String DEFAULT_PROXY_ADDRESS = "";
    public static final int DEFAULT_PROXY_PORT = 8080;
    public static final boolean DEFAULT_PROXY_PEERS_TOO = true;
    public static final boolean DEFAULT_PROXY_REQUIRES_AUTH = false;
    public static final String DEFAULT_PROXY_LOGIN = "";
    public static final String DEFAULT_PROXY_PASSWORD = "";
    public static final boolean DEFAULT_ANONYMOUS_MODE = false;

    public int cacheSize = DEFAULT_CACHE_SIZE;
    public int activeDownloads = DEFAULT_ACTIVE_DOWNLOADS;
    public int activeSeeds = DEFAULT_ACTIVE_SEEDS;
    public int maxPeerListSize = DEFAULT_MAX_PEER_LIST_SIZE;
    public int tickInterval = DEFAULT_TICK_INTERVAL;
    public int inactivityTimeout = DEFAULT_INACTIVITY_TIMEOUT;
    public int connectionsLimit = DEFAULT_CONNECTIONS_LIMIT;
    public int connectionsLimitPerTorrent = DEFAULT_CONNECTIONS_LIMIT_PER_TORRENT;
    public int uploadsLimitPerTorrent = DEFAULT_UPLOADS_LIMIT_PER_TORRENT;
    public int activeLimit = DEFAULT_ACTIVE_LIMIT;
    public int portRangeFirst = DEFAULT_PORT_RANGE_FIRST;
    public int portRangeSecond = DEFAULT_PORT_RANGE_SECOND;
    public int downloadRateLimit = DEFAULT_DOWNLOAD_RATE_LIMIT;
    public int uploadRateLimit = DEFAULT_UPLOAD_RATE_LIMIT;
    public boolean dhtEnabled = DEFAULT_DHT_ENABLED;
    public boolean lsdEnabled = DEFAULT_LSD_ENABLED;
    public boolean utpEnabled = DEFAULT_UTP_ENABLED;
    public boolean upnpEnabled = DEFAULT_UPNP_ENABLED;
    public boolean natPmpEnabled = DEFAULT_NATPMP_ENABLED;
    public boolean encryptInConnections = DEFAULT_ENCRYPT_IN_CONNECTIONS;
    public boolean encryptOutConnections = DEFAULT_ENCRYPT_OUT_CONNECTIONS;
    public EncryptMode encryptMode = DEFAULT_ENCRYPT_MODE;
    public boolean autoManaged = DEFAULT_AUTO_MANAGED;
    public String inetAddress = DEFAULT_INETADDRESS;
    public ProxyType proxyType = DEFAULT_PROXY_TYPE;
    public String proxyAddress = DEFAULT_PROXY_ADDRESS;
    public int proxyPort = DEFAULT_PROXY_PORT;
    public boolean proxyPeersToo = DEFAULT_PROXY_PEERS_TOO;
    public boolean proxyRequiresAuth = DEFAULT_PROXY_REQUIRES_AUTH;
    public String proxyLogin = DEFAULT_PROXY_LOGIN;
    public String proxyPassword = DEFAULT_PROXY_PASSWORD;
    public boolean anonymousMode = DEFAULT_ANONYMOUS_MODE;

    public enum EncryptMode
    {
        ENABLED(0),

        FORCED(1),

        DISABLED(2);

        EncryptMode(int val)
        {
            this.val = val;
        }

        private final int val;

        public int value()
        {
            return val;
        }

        public static EncryptMode fromValue(int value)
        {
            EncryptMode[] enumValues = EncryptMode.class.getEnumConstants();
            for (EncryptMode ev : enumValues) {
                if (ev.value() == value)
                    return ev;
            }
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public enum ProxyType
    {
        NONE(0),
        SOCKS4(1),
        SOCKS5(2),
        HTTP(3);

        private final int value;

        ProxyType(int value)
        {
            this.value = value;
        }

        public static ProxyType fromValue(int value)
        {
            ProxyType[] enumValues = ProxyType.class.getEnumConstants();
            for (ProxyType ev : enumValues) {
                if (ev.value() == value) {
                    return ev;
                }
            }

            return NONE;
        }

        public int value()
        {
            return value;
        }
    }
}