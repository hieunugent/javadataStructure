# INTERNET:
## How does the internet work?
   - answer (https://developer.mozilla.org/en-US/docs/Learn/Common_questions/How_does_the_Internet_work)
   - the Internet is a large network of computers which communicate all together.
   - the router is a tiny computer has only job to signaler at a railway station it make sure the messenger is send the right one.
   - the router is reduce wire cable connect between the same amount of computer
   - the router can connect between each other
   - but the thing is can not connnect the cable between the house, so that using the telephone cable  and we need a Modem
   - the modem will turn the infomation form our network into infomation manageable by the telephone infrastructure and vice versa
   - to send message from our network we want to reach we have to connect out network to an internet Service Provider(ISP)
   - ISP is a company that manages some speacial router taht are all linked together and  can also access other ISP's routers
   - finding computer: you have to specify which one, any computer to a network has a unique  address that identified it call "IP adddress"
   - example 192.167.12.1 that is not easy to remember by human so to make easier we have domain name
## What is Domain Name?
   - the domain name read from left to right
   - TLD- top level domain : 
        - the most generic TLDs .com .org .net don't require web services to meet any particular
        - .us .fr or .se require the service to be provided in a given language or hosted in a certain country
        - . gov only allowed to be used by the government department
        - .edu TLD only for use by education
## What is HTTP?
   - Hyper text Transfer Protocol
   - WWW is about communicate between web clients and servers
   - communication by Sending HTTP Requests and HTTP Responses
## Browers and how they work?
   - is client run on a computer that contact the web server and request information
   - display the info that webserver response
   - the user interface: 
            - where the user interact with the browser address bar, back and next button ..
            - everyother part except the window where requested web page is display
   - the Browser Engine:
            - a bridge between the user interface and rendering engine
            - the input from various user interfaces, it queries and manipulate the rendering engine
   - the Rendering Engine: 
            - it is response for rendering the requested web page on the browser screen 
            - interprets the HTML, XML documents and images that are formatted using CSS and generates the layout that is displayed in the user interface
            * Internet Explorer: Trident
            * Firefox & other Mozilla browsers: Gecko
            * Chrome & Opera 15+: Blink
            * Chrome (iPhone) & Safari: Webkit
    - networkingh:
            - component of the brower which retrieves tge urls using teh common protocol HTTP or FTP
            - handle all aspects of INternet communication and security
            - may implement a cache of retrieved documents in order to reduce network traffic
    - JavaScript Intepreter:
            - the component of browser that inteprets and executes the Javascript code embedded in a website
            - the interpreted result are sent to the rendering engine for display
            - if the script is external then 1st the resource is fetched from the network. Parser keeps on hold until the script is executed
    - UI Backend:
            - is used for drawing basic widgets like combo boxes and windows
            - exposes a generic interface  that is not platform specific
            - it underneath uses operating system user interface methods
    - data Persistence/ Storage: 
            - thsi is persistence layer
            - browsers support storage mechanisms such as as localStorage, IndexedDB, WebSQL and FileSystem
            - It is a small database created on the local drive of the computer where the browser is installed 
            - It manages user data such as cache, cookies, bookmarks and preferences

    - "Parsing HTML to construct the DOM tree"--> "Render tree construction"--> "Layout of the render tree"--> "Painting the render tree"
## DNS and how it works?
- Domain Name System(DNS) is the phonebook of the internet
- DNS translates domain names to IP addresses so browsers can load internet resources
- each device connected to the internet has a unique ip address which other machines use to find the device 
- DNS servers eliminate the need for humans to memorize IP addresses such as 192.168.1.1 (in IPv4) or IP addresses such as 
2400:cb00:2048:1::c629:d7a2 (in IPv6)
    - DNS recursor
    - Root nameserver
    - TLD nameserver
    - authoritative nameserver