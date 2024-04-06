# Backend CRUD with Docker and Swagger

This backend project provides CRUD (Create, Read, Update, Delete) operations to manage products and categories data in a web application. It runs inside a Docker container for easy portability and management of the development environment. The API is documented using Swagger for easy understanding and testing.

## Installation and Execution with Docker

1. Ensure you have Docker installed on your machine. You can download Docker from [the official website](https://www.docker.com/get-started).

2. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/Jefer1026/Crud.git
1
Navigate to the project directory:
cd Crud

2
Build the Docker image:
docker build -t Crud .

3
Run the Docker container:
docker run -p 8080:8000 backend-crud

The server will be available at http://localhost:8000.

API Documentation with Swagger
The API of this project is documented using Swagger. You can access the API documentation at http://localhost:8080/api/v1/api-docs.

Usage
You can use this backend to perform the following operations:

Create a new product and category.
Read information of existing products and categories .
Update information of a product and category.
Delete a product or category.

For more details on how to use the API endpoints, refer to the API Documentation with Swagger section and the API Endpoints section below.

API Endpoints

The available API endpoints are as follows:

For categories:

*   `POST /api/v1/categories`: Create a new category.
*   `GET /api/v1/categories`: Get the list of all categories.
*   `GET /api/v1/categories/:id`: Get a specific category by its ID.
*   `PUT /api/v1/categories/:id`: Update information of an existing user.
*   `PUT /api/v1/categories/:id/disabled`: disable an existing category by its ID.

For products:

*   `POST /api/v1/products`: Create a new product.
*   `GET /api/v1/products`: Get the list of all products.
*   `GET /api/v1/products/:id`: Get a specific product by its ID.
*   `PUT /api/v1/products/:id`: Update information of an existing product.
*   `PUT /api/v1/products/:id/disabled`: disable an existing product by its ID.

Data Model
The project uses the following data model to represent categories:

{
  "name": "string",
}

Data Model
The project uses the following data model to represent products:
{
  "name": "string",
  "price": 0.01,
  "categoryId": 1
}

Contribution
If you wish to contribute to this project, please follow these steps:

Fork the repository.
Clone the forked repository to your local machine.
Create a new branch for your contribution.
Make your changes and submit a pull request.

License
This project is licensed under the MIT License.

Contact
If you have any questions or suggestions related to this project, please contact the development team via email: jog1026@hotmail.com.
