# LAPTOP INVENTORY REST API

## Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## About the Project

!Laptop Store

Welcome to the Laptop Store Inventory REST API! This project allows you to manage laptop inventory data through a simple and efficient API built using Java Spring Boot and MySQL. Whether you’re a developer, a store owner, or just curious, this README will guide you through the setup, usage, and customization of the API.


## Features

- Insertion of Laptop Records
- Retrieval of Laptop Records based on Name, ID and All Records
- Updation of Laptop Records 
- Deletion of Laptop Records
- Database Integration with Spring Boot

## Technologies Used

- **API Tool**: POSTMAN
- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **Other**: Spring Tool Suit, Maven

## Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites

Ensure you have the following installed:

- Java JDK 8 or higher
- Maven
- MySQL
- POSTMAN

### Installation

1. **Clone the repository**
    ```sh
    git clone https://github.com/sathishsegu/Laptop-Inventory-REST-API.git
    cd Laptop-Inventory-REST-API
    ```

2. **Configure the Database**
    - Create a MySQL database named `laptop_inventory`
    - Update the database configuration in `src/main/resources/application.properties`
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/laptop_inventory
      spring.datasource.username=your-username
      spring.datasource.password=your-password
      spring.jpa.hibernate.ddl-auto=update
      ```

3. **Install Dependencies**
    ```sh
    mvn clean install
    ```

4. **Run the Application**
    ```sh
    mvn spring-boot:run
    ```

## Usage

1. Open your POSTMAN and navigate to Method Type.
2. Change it accordingly for CRUD operations.
3. Explore every CRUD Operations like GET POST PUT DELETE.

## Contributing

Contributions are what make the open source community such an amazing place to be, learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/your-feature`)
3. Commit your Changes (`git commit -m 'Add some feature'`)
4. Push to the Branch (`git push origin feature/your-feature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

Your Name - [@your-twitter-handle](https://twitter.com/your-twitter-handle) - your-email@example.com

Project Link: [https://github.com/your-username/tunetastic](https://github.com/sathishsegu/Laptop-Inventory-REST-API)
