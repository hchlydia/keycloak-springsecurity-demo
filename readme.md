# Microservices with Spring Security

- 應用OAuth 2.0到微服務架構中
- 使用Keycloak架設Authorization Server
- 使用Spring Security架設Resource Server

## Keycloak
- 啟動keycloak: 到根目錄開啟PowerShell執行命令

    ```bin/kc.sh start-dev --http-port 5500```
- 開啟瀏覽器，進入localhost:5500，創建admin
- 建立client，取得client ID與client secret，用以取得access_token

## Spring Security
- 導入依賴: ``spring-boot-starter-security``、``spring-boot-starter-oauth2-resource-server``
- ``application.yml``中設置Keycloak的公鑰
  ```yaml=
  spring:
    security:
      oauth2:
        resourceserver:
          jwt:
            jwk-set-uri: #填上Keycloak公鑰的位置
  ```
- Keycloak's public key: Realm settings > Endpoints > OpenID Endpoint Configuration > jwk-uri
- 配置Spring Security的Configuration
- request都要帶上Authorization Header，value即為access_token(Bearer)