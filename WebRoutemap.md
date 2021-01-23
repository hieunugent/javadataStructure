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
## What is Web Hosting?
- is a service that allows organizations and individuals to ppst a website or web page onto the internet
- website are hosted or stored on special computer called servers
- type of services of the web host offer: website builder, shareed hosting, dedicated hosting, collocated hosting
# HTML:
## learn the basics:
# Forms
- <input type=""> with type such as text, radio, checkbox, submit, button
- <lable> define a label for many form element
- attributes: 
                - action attribute:
                                 - defines the action to be performed when the form is submitted 
                                 - the form  data is sent to a file on the server when the user clicks on the submit button
                                 - ex: action="/action_page.php" it will sent this file contain a server-side script that handles the form data
                - accept-charset:
                        - specifies the character encodings used for form submission
                - autocomplete: whether a form should have autocomplete on or off
                - enctype: how the form-data should be encoded when submitting it to the server
                - method: the HTTP method to use when sending form-data
                - name: the name of the form 
                - novalidate: that the form should not be validated when submitted
                - rel: the relationship between a linked resource and the current document
                - target: where to display the responsethat is received after submitting the form 
- Elements:
        - <form> : an HTML form for user input
        - <input>: an input control 
        - <textarea> a multiline input control
        - <label> is a lablel for an input
        - <fieldset> related element in form 
        - <legend> a caption for a fieldset element
        - <select> a drop-down list
        - <optgroup> a group of related options in a drop-down list
        - <option> an option in a drop-down list
        - <button> 
        - <datalist> alist of predefined options for input control
        - <output> defines the result of a calculation

- Accessibility:
        - provide the user a good way to navigate and interact with  your site, make HTMl code as sematic as possible 
        - non-sematic : div span
        - sematic form table article
- SEO:
        - tags for SEO that will affect how your website perform on the internet
        - using <title> tag how searches see your page in google and BIng
        - Meta Description tags
        - Header tags
        - Alt tags for images
# CSS:
- position : 
        - relative  to it normal position, 
        - static is by default according to normal flow, 
        - fixed is relative to viewport same place when pages is scrolled
        - absolute is relative to nearest positioned ancestor
- Specificity:
        - there are two or more conflicting CSS rules that point to same element, will follow the Hierarchy rule
                - Inline style :attached directly to the element to be style
                - IDs: an I is a unique identifier the page element
                - Classes, attributes and pseudo-classes: .classes, [atributes], pseudo-classes such as :hover, :focus
                - Elements and pseudo-elements: h1, div, ... :before, :after
        - Equal specificity: latest rule count
        - the more specific than will be applied 
        - contextual selector are more specifich than single element selector : the embedded style sheet is closer to the element to be styled
        - A class selector beats any number of element selectors :  a class selector such as .intro beats h1, p, div, 
        - the universal selector and inherited values have a specificity of 0
- Media Queries:
        - use to response to media types
        - such as : 
                - width and height of the viewport
                - w and h of device
                - orientation
                - resolution
        - @media not|only mediatype and (expressions){
                CSS-code;
        }
        - mediatype: 
                - all: used for all media type devices
                - print: used for printers
                - screen: used for computer screens, * screen
                - speech: used for screenreader that read the page out loud
- Float: 
        - property that is used for positioning and formatting content let an image float left to the text in a containner
        - left right none inherit
- Clear:
        - what elements can float beside the cleared element  and on which side
        - if the element is taller than the element containing it, and it is floated, it will overflower ougtside the container using {overflow : auto} to fix
- display:
        - if/how an element is displayed
        - value is : block , inline
- visibility:
        - whether or not an element should be 
- Box Model:(is used when talking about design an layout)
        - consists of margins, borders, padding nad actual content
        - content is the box where text and image appear
        - padding is transparent, clears an area around content
        - border is area around padding
        - margin clears an area outside the border, margin is transparent
- CSS Grid:
        - using base layout systemt, with row and columns , without ahving using the floats and positioning
        - set display to grid or inline-grid
        - attribute : grid-column-gap, grid-row-gap, grid-gap
        - grid-template-columns: defines the number of columns in your grid layout
        - grid-template-row: defines the number of rows
        - grid items, grid container contains grid items by default has one grid items but can style the grid items so will span multiple columns and row
        - grid-column defines on which column to places an items short hand for column start column end
        - grid-row short hand for grid-row-start  grid-row-end
        - ex: grid-row: 1 / 4  is start at row 1 end on row 4
        - ex :grid-row : 1/ span 2 start at row 1 and span 2 rows
        - grid-area: start row / start col / end row / end col 
        - grid-template-areas named grid items can be referred by this property of the grid container
- CSS FLexBox:
        - block for sections a webpage
        - Inline for text
        - table for two dimensional table data
        - positioned, for explicit position of an element
        - propeties: flex-direction, flex-wrap, flex-flow, justify-content, align-items, align-items, align-content
        - flex items: order , flex-grow, flex-shrink, flex-basis, flex, align-self
        - flex responsive : display: flex, flex directtion

# JavaScript
## instroduction:
- getELementById(): document.getElementById("demo").innerHTML ="hello javascript";
- place inside the <script>
-  Js vs Java language:
        - resembles Java but does not have Java static typing and stong type check
        - js follows most java expression syntax, naming convention and basic control flow constructs
        - JS also support function without any apecial declarative requirements
        - dont need to declare all var, classes ,and methods
        - dont have to concern with whether methods are public private protected
        - Java is class based programming language designed for fast execution and type safety
        - type safety means that you cant cast a java integer into an object reference or access private memory by corrupting Java Bytecodes, Class-based model means that programming consist exclusive  of calss and their methpd
        - inheritance nad strong type resquires tightly coupled object hiearchies
        - java more complex than javascript
- JavaScript and ECMAScript
        - The ECMAScript specification is a set of requirements for implemenitn EcmaScript. 
        - ES doc is not intended to help scipt programmers. use js doc for information when writing scripts
        - js doc descripber aspects of language that are appropriate for a js progammer
## basic:
- comments  : // /***/ 
- Declarations: var let const
- Data types:
        - primitives
                - Boolean
                - null
                - undefined
                - Number
                - BigInt
                - String
                - Symbol
        - Object

- Converting string to number:
        - parseInt()
        - parserFloat()

- Literals
        - Array
        - Boolean
        - Floating-point
        - Numeric
        - Object
        - RegExp
        - String
- Exception handling statements
        - throw expression
        - try ... catch
        - try{ 
        -       func(param) // this may throe an error
        -}catch (e){
        -       handleError(e) // if an error occurrde, handle it
        -}finally{ 
        -       closeMyfile() // always close the resource
        - }
- Regular expression
        - let re = /ab+c/;
        - let re = new RegExp('ab+');
        - Character classes \, ., \cX, \d, \D, \fooo, [\d]
        - AsserTions : ^, $, x(?=y), include boundaries, which indicate the beginnings and ending of lines and words, and other patterns indicating in some way that a match is posible
        - sepecial character such as * then using Backslash 
        - exec() return array info or null on mismatch
        - test() return true false
        - match() return all of matches capturing or null
        - matchAll() iterator containing all of the matches
        - search() test for a match in a string return index match 
        - replace() search match and replce match 
        - replaceAll() search all  and replace all
        - split() used regular expression or a fixed string to break a string into an array of substrings
- class-based vs. prototype-based languages
        - object-oriented languages: classes and instances
        - class defines all of the properties that characterize a certain set of object
        - an Instance, on the other hand, is the instantiation of a class
        - subclasses and inheritance
        - js all object can inherit from another object
        - define and create a set of object with constructor functions
        - uising new to creation of new object
        - construction of object hierarchy :
                                 - java :construct an object hierachy by using class definitions to define subclasses of existing classes
                                 - js: construct by assigning an object as the prototype associated with a constructor function
        - Inheritance model: 
                                - java: by following the class chain
                                - js: by followign prototype chain
        - extension of properties:
                                - java": class definition specifies all properties of all instances of a class. Cannot add properties dynamically at run time
                                - js: constructor function or prototype specifies an initial set of properties. can add or remove dynamically to individual objects or to the entire set of object
- Promise:
        - is an object representing the eventual completion or failure of an asynchronous operation
        - a promise is return object to which you attach callbacks, instead of passing callbacks into a function
        - chaining : const promise = dosomething();
        -            const promise2= promise.then(successCallback, failureCallBack)
        - it is possible to chain after a failure such as catch
        - you migght recall seeing failurecallback three times in the pyramid of doom earlier compared to only once at the end of the promise chain 
        - Rejection event: whenever a promise is rejected , one of two events  is sent to the global scope:
                - rejectionhandled: sent when promise is rejected, after that rekection has been handled by the executors reject function
                - unhandledredjection: sent when a promise is rejected but there is no rejection handler availabler
        - there make it possible to offer fallback error handing for promises, as well as to help debug issues with your promise managemen. these handlers are globalper context, so all errors will go to the same event handlers, regardless of source 
        - one case of special usefulness when writing code for node.js its common that modules you include in your project may have unhandle rejected promises
        logged to the console by the Node.js runtime by adding handler in node.js
        - process.on("unhandledRejection", (reason, promise)=> {
                // the code what todo and should do here
        })
        - in an ideal world all asynchronous functions would already return promises. unforturnately, some APIs still expect success and or failure callbacks to be passed in the old way
        - .resolve(), .reject()
        - .all(), .race() tools for running asynchronous operation in parallel
        - composeAsync() will accept any number of functions as arguments, and will return a new function that accepts an initial valeu to be passed through the composition pipeline
        - Timming 
        - Nesting


                






        
