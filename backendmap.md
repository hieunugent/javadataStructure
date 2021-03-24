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
# Memory management
- Memory management is the functionality of an operating system which handles or manages primary memory and moves processes back and forth between main memory and disk during execution. Memory management keeps track of each and every memory location, regardless of either it is allocated to some process or it is free. It checks how much memory is to be allocated to processes. It decides which process will get memory at what time. It tracks whenever some memory gets freed or unallocated and correspondingly it updates the status.
## three type of Memory addresses :
- Symbolic addresses:
The addresses used in a source code. The variable names, constants, and instruction labels are the basic elements of the symbolic address space.
- Relative addresses: 
At the time of compilation, a compiler converts symbolic addresses into relative addresses.
- Physical addresses:
The loader generates these addresses at the time when a program is loaded into main memory.
- Virtual and physical addresses are the same in compile-time and load-time address-binding schemes.
- Virtual and physical addresses differ in execution-time address-binding scheme.
- The set of all logical addresses generated by a program is referred to as a logical address space. The set of all physical addresses corresponding to these logical addresses is referred to as a physical address space.
## Single - partition Allocaion 
- In this type of allocation, relocation-register scheme is used to protect user processes from each other, and from changing operating-system code and data. Relocation register contains value of smallest physical address whereas limit register contains range of logical addresses. Each logical address must be less than the limit register.
## Multiple - Partition allocation
- In this type of allocation, main memory is divided into a number of fixed-sized partitions where each partition should contain only one process. When a partition is free, a process is selected from the input queue and is loaded into the free partition. When the process terminates, the partition becomes available for another process.

## PAGING       
- A computer can address more memory than the amount physically installed on the system. This extra memory is actually called virtual memory and it is a section of a hard that's set up to emulate the computer's RAM. Paging technique plays an important role in implementing virtual memory.
- Paging is a memory management technique in which process address space is broken into blocks of the same size called pages (size is power of 2, between 512 bytes and 8192 bytes). The size of the process is measured in the number of pages.
- Similarly, main memory is divided into small fixed-sized blocks of (physical) memory called frames and the size of a frame is kept the same as that of a page to have optimum utilization of the main memory and to avoid external fragmentation.
- Page address is called logical address and represented by page number and the offset. Logical Address = Page number + page offset
- Frame address is called physical address and represented by a frame number and the offset. Physical Address = Frame number + page offset
- A data structure called page map table is used to keep track of the relation between a page of a process to a frame in physical memory.
- When the system allocates a frame to any page, it translates this logical address into a physical address and create entry into the page table to be used throughout execution of the program.

- When a process is to be executed, its corresponding pages are loaded into any available memory frames. Suppose you have a program of 8Kb but your memory can accommodate only 5Kb at a given point in time, then the paging concept will come into picture. When a computer runs out of RAM, the operating system (OS) will move idle or unwanted pages of memory to secondary memory to free up RAM for other processes and brings them back when needed by the program.
- This process continues during the whole execution of the program where the OS keeps removing idle pages from the main memory and write them onto the secondary memory and bring them back when required by the program.
## Advantages and Disadvantages of Paging
- Paging reduces external fragmentation, but still suffer from internal fragmentation.
- Paging is simple to implement and assumed as an efficient memory management technique.
- Due to equal size of the pages and frames, swapping becomes very easy.
- Page table requires extra memory space, so may not be good for a system having small RAM.
# Segmentation
- Segmentation is a memory management technique in which each job is divided into several segments of different sizes, one for each module that contains pieces that perform related functions. Each segment is actually a different logical address space of the program.
- When a process is to be executed, its corresponding segmentation are loaded into non-contiguous memory though every segment is loaded into a contiguous block of available memory.
- Segmentation memory management works very similar to paging but here segments are of variable-length where as in paging pages are of fixed size.
- A program segment contains the program's main function, utility functions, data structures, and so on. The operating system maintains a segment map table for every process and a list of free memory blocks along with segment numbers, their size and corresponding memory locations in main memory. For each segment, the table stores the starting address of the segment and the length of the segment. A reference to a memory location includes a value that identifies a segment and an offset.
# Concurrrentcy
- Concurrency means executing multiple tasks at the same time but not necessarily simultaneously. In a concurrent application, two tasks can start, run, and complete in overlapping time periods i.e Task-2 can start even before Task-1 gets completed.
- In the computer science world, the way how concurrency is achieved in various processors is different. In a single core environment (i.e your processor is having a single core), concurrency is achieved via a process called context-switching. If its a multi-core environment, concurrency can be achieved through parallelism.
# parallelism
- Consider you are given two tasks of cooking and speaking to your friend over the phone. You could do these two things simultaneously. You could cook as well as speak over the phone. Now you are doing your tasks parallelly.
- Parallelism means performing two or more tasks simultaneously. Parallel computing in computer science refers to the process of performing multiple calculations simultaneously.
# Threads 
- Threads are a sequence of execution of code which can be executed independently of one another. It is the smallest unit of tasks that can be executed by an OS. A program can be single threaded or multi-threaded.
# Process
- A process is an instance of a running program. A program can have multiple processes. A process usually starts with a single thread i.e a primary thread but later down the line of execution it can create multiple threads.
# Synchronous
- Imagine you were given to write two letters one to your mom and another to your best friend. You can not at the same time write two letters unless you are a pro ambidextrous.
- In a synchronous programming model, tasks are executed one after another. Each task waits for any previous task to complete and then gets executed.
# Asynchronous
- Imagine you were given to make a sandwich and wash your clothes in a washing machine. You could put your clothes in the washing machine and without waiting for it to be done, you could go and make the sandwich. Here you performed these two tasks asynchronously.
- In an asynchronous programming model, when one task gets executed, you could switch to a different task without waiting for the previous to get completed.
# NOde JS
- more in Nodejs.org
- import the moduler before use
- require('localfile') 
- every file in node has it own scope so if want use it on other file it must be export in that file but module.exports = variable
- can not send 2 response after one resquest
# Mongoose:
- using mongoose API to create the ENDPOINT 
- this API has CRUID 

## REST API
- predefine LIBRARY
# JS
- call backfunction :  is a function that provied as an argument to another function with the intention  of having it call later on
# VIew engine 
- hbs




















