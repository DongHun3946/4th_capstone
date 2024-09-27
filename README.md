# 캡스톤디자인_포트홀 탐지 및 자동신고 시스템

## 👨‍🏫 프로젝트 소개

## ⏲️ 개발 기간
- 2024/09/01~
## 🧑‍🤝‍🧑 개발자 소개
- 최동훈, 이경민
## 💻 개발환경
- Version : Java 17
- IDE : IntelliJ
- Framework : SpringBoot 3.3.1
- ORM : JPA
## ⚙️ 기술 스택
- Server : 
- DataBase : 
- WS/WAS : 
## 📝 프로젝트 아키텍쳐
![image](https://github.com/user-attachments/assets/b81af55b-b2ee-42a5-b36a-88648d86acf5)


## 📝 와이어프레임(화면 구성)
- 로그인 화면
  ![image](https://github.com/user-attachments/assets/cde23140-e07c-4546-a553-71a8f8636fe5)
- 회원가입 화면
  ![image](https://github.com/user-attachments/assets/1631e538-0d31-44a9-849f-569e4ca9852a)
- 메인 화면
  ![image](https://github.com/user-attachments/assets/d70d5247-068c-4ec5-bdc9-7df6de064efa)
- 포트홀 관리 화면
  ![image](https://github.com/user-attachments/assets/a9700d45-37d8-4ee2-b8ce-dc1bde25b06a)

## 📌 주요 기능

## 📌 기능 구현 계획
- 클라이언트가 포트홀을 탐지하는 기능
1. 정확도 60%를 기준으로 탐지된 포트홀이 탐지될 때마다 사진을 저장
2. 만약 클라이언트가 정지된 상태에서 같은 포트홀을 탐지하고 있으면 사진을 무한정 저장하기 때문에 5초 딜레이간격으로 설정


- 탐지된 사진 서버(springboot)에 보내는 방법
1. 클라이언트(python)에서 Post 형식으로 서버에 지정한 url(http://localhost:8080/api/upload) 로 전송
2. 서버(springboot)에서는 Post형식으로 전송된 이미지를 /resources/static/pothole_images/ 에 저장


- 클라이언트가 서버에 포트홀 정보를 보내는 방법
1. 클라이언트(python)에서 mysql에 [사용자id, 위도, 경도, 상태(default="접수 중"), 탐지일자, 이미지파일경로] 저장


## 📌 배운점

## ✒️ API
- 사용한 API : 
