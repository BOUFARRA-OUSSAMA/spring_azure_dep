
# BooksFrog Backend

This is the backend application for BooksFrog, a book reading and downloading platform. It is built using Spring Boot, JPA, and MySQL.

## Prerequisites

Before running the project, ensure you have the following installed:

- Java JDK 17+
- MySQL
- Maven

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your-repo/booksfrog-backend.git
```

2. Navigate to the project directory:

```bash
cd booksfrog-backend
```

3. Update the `application.properties` file located in `src/main/resources/` with your MySQL configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/booksfrog
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

4. Build the project using Maven:

```bash
mvn clean install
```

5. Run the application:

```bash
mvn spring-boot:run
```

The server will start on `http://localhost:8080`.

## API Endpoints

### User Endpoints

- **POST** `/users/register`: Register a new user.
- **POST** `/users/login`: Log in a user.
- **GET** `/users/{id}`: Get user details by ID.

### Book Endpoints

- **GET** `/books`: Retrieve all books.
- **POST** `/books`: Add a new book.
- **GET** `/books/{id}`: Get book details by ID.

### Category Endpoints

- **GET** `/categories`: Retrieve all categories.
- **POST** `/categories`: Add a new category.

## Testing

You can use Postman or any other API testing tool to test the endpoints. Here's an example of how to test a `POST` request to create a new user:

- URL: `http://localhost:8080/users/register`
- Method: `POST`
- Body (JSON):

```json
{
    "username": "testuser",
    "email": "testuser@example.com",
    "password": "password123"
}
```
## 📚 Integrating BookScrapper into BooksFrog Backend



The `booksfrog_bookScrapper` is an external script that helps you automatically download books and scrape essential information such as the author, book description, and more. To integrate it with your backend, please refer to the repository for detailed instructions:



[booksfrog_bookScrapper Repository](https://github.com/AhmedFatrah2001/booksfrog_bookScrapper)



Ensure the downloaded data aligns with your backend database structure and logic.



### Quick Setup Steps:

1. Clone the `booksfrog_bookScrapper` repository into your backend project.

2. Follow the repository's instructions to set up the scrapper and its dependencies.

3. Ensure your backend integrates with the data stored by the scraper in the database.


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
