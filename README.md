# ๐ฌ ๋ฃจ๋น Loobie
ํ๋ก์ ํธ ์งํ ๊ธฐ๊ฐ `21.05 ~ 21.08`

<img width="360" alt="แแณแแณแแตแซแแฃแบ 2021-09-09 แแฉแแฅแซ 1 51 02" src="https://user-images.githubusercontent.com/54282927/132551452-f4dff15d-2509-40ee-852d-579eafc811d5.png">
<br>

# Intro 
#### ์๋ก์ด ์์์ ๋งค์ผ ์ ํด์ฃผ๋ ์๋ํ [์ฝํ์ธ  ๊ตฌ๋ ์๋น์ค](https://blog.stibee.com/%EC%BD%98%ED%85%90%EC%B8%A0-%EA%B5%AC%EB%8F%85-%EC%8B%9C%EB%8C%80%EC%9D%98-%EB%89%B4%EC%8A%A4%EB%A0%88%ED%84%B0-134addfefba2)

#### ๊ธฐ๋ฅ
- ์น ์คํฌ๋ํ(web scraping)์ผ๋ก ๊ฐ ์ฌ์ดํธ์ ํธ๋ ๋ ๋ด์ค๋ฅผ ํ ๊ณณ์ ๋ชจ์์ค๋ค.
- ํด๋น ์น์ ํตํด์ ๋น์ผ ํธ๋ ๋ ๋ด์ค ํน์ ๋ ์ง๋ก ์ง๋ ๋ด์ค๋ค์ ๊ฒ์ํด ๋ณผ ์ ์๋ค.
- ์ด๋ฉ์ผ ๊ตฌ๋์ ํ  ๊ฒฝ์ฐ, ๋งค์ผ ์ค์  7์ ๋น์ผ ํธ๋ ๋ ๋ด์ค๋ฅผ ๋ฐ์ ๋ณผ ์ ์๋ค. 
  
#### ์๋ ์ค์ผ์ค๋ง ๊ธฐ๋ฅ 
- python : crontab (๋ด์ค ์น ์คํฌ๋ํ ํ S3 ์๋ก๋) 
- spring : @Scheduler (S3์์ ๋ด์ค ๋ค์ด๋ก๋ ํ ์ ์ ์๊ฒ ์ด๋ฉ์ผ๋ก ๋ฐ์ก)


<br>

# Stack
- Backend : Java 11, SpringBoot 2.4.5, Grdale 6.8.1, JUnit4 
- Frontend : Thymeleaf, Bootstrap(html+css)
- Web Scraping : Python 3.8.3
- DevOps : AWS EC2(Linux AMI2), RDS(MariaDB), S3

<br>

# Project Structure
<img width="850" alt="loobie_projectแแฎแแฉ" src="https://user-images.githubusercontent.com/54282927/131255662-cf79dc24-b41f-4ec8-a904-b87e0c4bfc7f.png">

<br>

# View
- ์น์ผ๋ก ๋ด์ค ๋ณด๊ธฐ / ๋ด์ค ๊ตฌ๋ํ๊ธฐ 
<img width="850" alt="แแณแแณแแตแซแแฃแบ 2021-08-30 แแฉแแฅแซ 12 40 59" src="https://user-images.githubusercontent.com/54282927/132550524-b9b169e5-b792-4050-a8c5-7039d5138141.png">

<br>

- ๊ตฌ๋์ ์ด๋ฉ์ผ๋ก ๋ด์ค ๋ฐ์ก
<img width="850" alt="แแณแแณแแตแซแแฃแบ 2021-08-30 แแฉแแฅแซ 12 44 41" src="https://user-images.githubusercontent.com/54282927/131256574-d9547d57-ac1b-4e8c-8de2-75cb5a963469.png">


<br>

# Blog
 
~~~ 
๐ก ์์ธํ ํ๋ก์ ํธ ๋ด์ฉ์ ๋ธ๋ก๊ทธ์์ ๋ณผ ์ ์์ต๋๋ค.
~~~

- [Spring, Python์ผ๋ก ๋ง๋  ์๋ํ ์ฝํ์ธ  ๊ตฌ๋ ์๋น์ค (๋ฃจ๋น LOOBIE)](https://loosie.tistory.com/442)


<br>

# ์ฐธ๊ณ ํ ๊ฐ์ ๋ฐ ์์ 
- [๊ฐ์ฒด์งํฅ์ ์ฌ์ค๊ณผ ์คํด](http://www.yes24.com/Product/Goods/18249021)
- [์๋ฐ ORM ํ์ค JPA ํ๋ก๊ทธ๋๋ฐ - ๊ธฐ๋ณธํธ](https://www.inflearn.com/course/ORM-JPA-Basic/dashboard)
- [์ค์ ! ์คํ๋ง ๋ถํธ์ JPA ํ์ฉ1 - ์น ์ ํ๋ฆฌ์ผ์ด์ ๊ฐ๋ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1/dashboard)
- [์คํ๋ง๊ณผ JPA ๊ธฐ๋ฐ ์น ์ ํ๋ฆฌ์ผ์ด์ ๊ฐ๋ฐ](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-JPA-%EC%9B%B9%EC%95%B1/dashboard)
- [์คํ๋ง ๋ถํธ์ AWS๋ก ํผ์ ๊ตฌํํ๋ ์น ์๋น์ค](https://jojoldu.tistory.com/463)
- [Python์ผ๋ก ์น ์คํฌ๋ํผ ๋ง๋ค๊ธฐ](https://nomadcoders.co/python-for-beginners)
- [ํ์ด์ฌ ๋ฌด๋ฃ ๊ฐ์ (ํ์ฉํธ3) - ์น ์คํฌ๋ํ (5์๊ฐ)](https://www.inflearn.com/course/%ED%8C%8C%EC%9D%B4%EC%8D%AC-%EC%9B%B9-%EC%8A%A4%ED%81%AC%EB%9E%98%ED%95%91/dashboard)

---
์ต์ข ์์  2021.09.09 ยฉ loosie
