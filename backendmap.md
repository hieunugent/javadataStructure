# Architecture
- overview of servers, databases, routing , anything else that happens between when a client makes a request and receives a response
- Server DataBase Programming Language API

## Back-end Architecture
- the code that runs on the server, that receives requests from  the  clients, and contains the logic to send the appropriate  data back to the client
- the back end also include the database which will persistently store all of the data for the application
# What is Back end?
- The back-end is all of the technology required to process the incoming request and generate and send the response to the client. This typically includes three major parts:
        - The server. This is the computer that receives requests.
        - The app. This is the application running on the server that listens for requests, retrieves information from the database, and sends a response.
        - The database. Databases are used to organize and persist data.
## What kind of responses can a server send?
- a server might server up an HTML file , send data as JSON, or it might send back only an HTTP status code
## database:
- Databases are commonly used on the back-end of web applications. These databases provide an interface to save data in a persistent way to memory. Storing the data in a database both reduces the load on the main memory of the server CPU and allows the data to be retrieved if the server crashes or loses power.
- Many requests sent to the server might require a database query. A client might request information that is stored in the database, or a client might submit data with their request to be added to the database.
## API
- An API is a collection of clearly defined methods of communication between different software components.
- More specifically, a Web API is the interface created by the back-end: the collection of endpoints and the resources these endpoints expose.
- A Web API is defined by the types of requests that it can handle, which is determined by the routes that it defines, and the types of responses that the clients can expect to receive after hitting those routes.
- One Web API can be used to provide data for different front-ends. Since a Web API can provide data without really specifying how the data is viewed, multiple different HTML pages or mobile applications can be created to view the data from the Web API.
## Mapping out a request
Let’s make all of this a bit more concrete, by following an example of the main steps that happen when a client makes a request to the server.

1. Alice is shopping on SuperCoolShop.com. She clicks on a picture of a cover for her smartphone, and that click event makes a GET request to http://www.SuperCoolShop.com/products/66432.

Remember, GET describes the kind of request (the client is just asking for data, not changing anything). The URI (uniform resource identifier) /products/66432 specifies that the client is looking for more information about a product, and that product, has an id of 66432.

SuperCoolShop has an huge number of products, and many different categories for filtering through them, so the actual URI would be more complicated than this. But this is the general principle for how requests and resource identifiers work.

2. Alice’s request travels across the internet to one of SuperCoolShop’s servers. This is one of the slower steps in the process, because the request cannot go faster than the speed of light, and it might have a long distance to travel. For this reason, major websites with users all over the world will have many different servers, and they will direct users to the server that is closest to them!

3. The server, which is actively listening for requests from all users, receives Alice’s request!

4. Event listeners that match this request (the HTTP verb: GET, and the URI: /products/66432) are triggered. The code that runs on the server between the request and the response is called middleware.

5. In processing the request, the server code makes a database query to get more information about this smartphone case. The database contains all of the other information that Alice wants to know about this smartphone case: the name of the product, the price of the product, a few product reviews, and a string that will provide a path to the image of the product.

6. The database query is executed, and the database sends the requested data back to the server. It’s worth noting that database queries are one of the slower steps in this process. Reading and writing from static memory is fairly slow, and the database might be on a different machine than the original server. This query itself might have to go across the internet!

7. The server receives the data that it needs from the database, and it is now ready to construct and send its response back to the client. This response body has all of the information needed by the browser to show Alice more details (price, reviews, size, etc) about the phone case she’s interested in. The response header will contain an HTTP status code 200 to indicate that the request has succeeded.

8. The response travels across the internet, back to Alice’s computer.

9. Alice’s browser receives the response and uses that information to create and render the view that Alice ultimately sees!

