# Microservices with Spring Security

- 應用OAuth 2.0到微服務架構中
- 使用Keycloak架設Authorization Server
- 使用Spring Security架設Resource Server

## Keycloak
- 啟動keycloak: 到根目錄開啟PowerShell執行命令

    ```bin/kc.sh start-dev --http-port 5500```
- 開啟瀏覽器，進入localhost:5500，創建admin
- 建立client，取得client ID與client secret，用以取得access_token