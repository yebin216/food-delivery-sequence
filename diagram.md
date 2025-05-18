# 음식 배달 앱 시퀀스 다이어그램

```mermaid
sequenceDiagram
    participant Customer
    participant App
    participant Server
    participant Rider

    Customer->>App: 음식 선택 및 주문
    App->>Server: 주문 요청 전송
    Server-->>App: 주문 접수 확인
    Server->>Rider: 배달 요청
    Rider-->>Server: 배달 수락
    Server->>App: 배달 예상 시간 전송
    App-->>Customer: 배달 상태 안내
```
