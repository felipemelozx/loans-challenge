## Voting system


This project was a solution to the challenge proposed on [GitHub repository](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md), where the goal was to create a service that would 
determine which types of loans a customer could access, based on variables such as age, salary and location.

The application was developed using Java and Spring Web, and its operation is simple but efficient. The service receives
information from a customer, such as age, salary and location, and based on a series of business conditions, it determines
the types of loans that are available to the customer, as well as their respective interest rates. The loan types analyzed are:
Personal Loan, Payroll Loan and Secured Loan.
## Technology

Here are the technologies used in this project:

* Java version 17.0.0
* Spring Boot 3.4.0


## Dependencies

* Spring Boot Starters
    - spring-boot-starter-web
    - spring-boot-starter-test (scope test)

## Getting Started

### Pre-requisites

- Java 17
- Maven

### Build and Run

1. Clone the repository:
    ```bash
    git clone https://github.com/felipemelozx/loans-challenge
    cd ./loans-challenge
    ```

2. Build the project:
    ```bash
    mvn clean install
    ```
3. Run the project:
    ```bash
    mvn spring-boot:run
    ```

4. Access the application at `http://localhost:8080/customer-loans`
   use the post method and send a json in the request body like
```json
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}
```
## Features

The main features of the application are:
- Loan Processing: 
  - Evaluates salary, age, and location to determine which loans the customer can access.

- Personal Loan: 
  - For salaries up to R$ 3000 or between R$ 3000 and R$ 5000, with age < 30 years and location in SP.

- Payroll Loan: 
 - For salaries above R$ 5000.

- Secured Loan: 
    - For salaries up to R$ 3000 or between R$ 3000 and R$ 5000, with age < 30 years and location in SP.

- JSON Response: 
  - Returns available loans with their interest rates.
## Links

- Repository: https://github.com/felipemelozx/loans-challenge

## Versioning

0.0.1-SNAPSHOT

## Authors

* **Felipe**

Please follow GitHub and join us! Thanks for visiting and happy coding!
