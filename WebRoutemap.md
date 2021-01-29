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
        - .gov only allowed to be used by the government department
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
# Elements:
- form: an HTML form for user input
- input: an input control 
- textarea: a multiline input control
- label: is a lablel for an input
- fieldset: related element in form 
- legend: a caption for a fieldset element
- select: a drop-down list
- optgroup: a group of related options in a drop-down list
- option: an option in a drop-down list
- button: 
- datalist: alist of predefined options for input control
- output: defines the result of a calculation

# Accessibility:
- provide the user a good way to navigate and interact with  your site, make HTMl code as sematic as possible 
- non-sematic : div span
- sematic form table article
# SEO:
- tags for SEO that will affect how your website perform on the internet
- using <title> tag how searches see your page in google and BIng
- Meta Description tags
- Header tags
- Alt tags for images
# CSS:
## position : 
- relative  to it normal position, 
- static is by default according to normal flow, 
- fixed is relative to viewport same place when pages is scrolled
- absolute is relative to nearest positioned ancestor
## Specificity:
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
## Media Queries:
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
- DOM manipulation:
        - to gain familiarity with the core DOM APIs, and the other APIs commonly associated with DOM and document manipulation 
        - Navigator:represent the state and identify  of teh browser exist on the web, can use this object to retrieve things like the user's preferred language, a media stream from the users webcame,etc
        - Window: is the browser tap taht a web page is loaded into, is object window in js, manipulate the doccument loaded into that window store data spaecific to that document on the client-side, attach an event handler to current window 
        - Document: is the actual page loaded into the window, can using this object to manipulate the HTML CSS 
                - element node: an element as it exist in the DOM
                - root node: top node in the tree which in the case of hTMl is always HTML
                - child node: a node directly inside another node 
                - descendant node : a node anywhere inside another node
                - parent node: a node which has a node inside
                - sibling nodes: nodes that sit on the same level in the DOM
                - Tex node : a node containing a text string
                - querySelector()
                - querySelectorAll()
                - getElementById()
                - getElementByTagName()
- Fetch API:
        - diff from jQuery.ajax():
                - fetch wont reject on http error status
                - fetch can receive cross site cookie
                - fetch wont sent cookies
        - supplying resquest options:
                - method can optionally accept a second parameter, and init object that allows you to control a number of different setting
        - Send a Request to a Server
                - open("GET", "ajax_info.txt, true); specifies the type of request,
                                - method: the type of request: GET or POST
                                - url: the server (file) location
                                - async: true(asynchronous) or false(sychronous)
                - send();  sends the request to the server used for GET
                - sent(string): sends the request to the server used for POST
                -POST over GET for cached file is not an option, sending a large amount of dta to the server, sending user input, POST is more robust and secure than GET
        - Synchronous Request
        - Server REsponse:
                - onreadystatechange : defines a function to be called when the readystate property changes
                - readyState :
                        - holds the statis of the  XMLHTTPRequest
                        - 0 : request not initialized
                        - 1: server connecttion established
                        - 2: request received
                        - 3: processing request
                        - 4: request finished and response is ready
                - status:
                        - 200: OK
                        - 403: Forbidden
                        - 404: page not found
                - statusText:
                        Returns the status-text
                - property:
                - responseText get teh response data as a string
                - responseXML get teh response data as XML data
                - methods:
                - getResponseHeader(): return specific header information form the server resource
                - getAllResponseHeaders(): return all the header information from the server resource
- ES6:
        - let keyword
        - const keyword
        - arrow function 
        - class classname{constructor(){....}} not an object it is a template for javascript object
        - promise
        - .find()
        - .findIndex()
        - Number.isInteger(), isSafeInteger(), isFinite(), isNaN()
- modular Javascript:
        - dependdent on the import and export
- Hoisting is  default behabvior of moving declarations to the top
        - variable can use before it declare
        - overlooked behavior of javaScript
        - using let variable before it is declared will result in ReferenceError
        - to avoid bugs, always declare all variables at the beginning of every scope
- "use strict" can not use undeclared variables
        - write secure mode
        - using an oject without declaring it is not allowed
        - deleting a variable is not allowed
        - deleting a function is not allowed
        - deleting an undeletable property is not allowed
        - duplicating a paramenter name is not allowed
        - octal numeric literal are not allowed
        - octal  escapse character are not allowed
        - writing to a read-only, get-only property is not allowed
        - argumnets with can not use as variable
        - for security reasons, eval() is not allowed to create variable in the scope from which it was called
        - for "this" in strict mode it will return underfined and functions in normal mode will return the global object
- Prototypes:
        - object constructor:
- Shadow DOM:
        -  is a key part of this, providing a way to attach a hidden separated DOM to an element
        - shadow host : the regular DOm node that the shadow DOM is attached to
        - shadow tree:  The DOM tree inside teh shadow DOM
        - Shadow boundary: the place where the shadow DOM ends, and the regular DOM begins
        - shadow root: the root node of the shadow tree
- basic usage:
        - element.attachShadow() with mode : 'open', 'closed'
        - element.shadowRoot;
- Event Bubbling :
        - event propagation model wherein listeners are fired from the target of the event, up
- Capturing phase: the event goes down to the element
- target phase : the event reached the target elemnet
- bubbling phase: the event bubbles up from the element.
# Web Security Knowlege:
## HTTP :  
        - send data between a web browser and a website
        - no one else can access the data, Because it used TLS protocol to encrypt communication
- How it work ?
        - uses encryption communication protoco, Named Transport Layer Security
        - was known as Secure Sockets Layer(SSL)
        - encryption uses two keys:   
                - public key: this shared between the browser and website
                - private key : this key used to decrypt information encrypted by the public key and it not shared out of the server
- TLS ?
        - the most protocol in use and designed to facilitate privacy, data security for communications over the internet
        - the use case o TLS is encrypting the communication between  applicaiton and servers, emails, messaging voice by Use (VoIP)
        - must install the TLS and SSL certification
        - TLS handshake step
        - determind the version of the TLS will use during  the session
        - authenticate the identity of the server by using TLS certificate
        - generate the session key for use during the session after the handshake process ended
- SSL? 
        - secure Socket Layer. an encryption base internet security protocol, it was founded for the ensuting of the integrity and privacy of the connections of the internet by Netscape
- CORS?
        - Crossing Origin Resource SHaring is Machanism that uses HTTP header to specify which outer origin have access to the local asset and 
        - how can access it  that is mean we can make a white list for the allowed crossing origins that has access to our assets
        - when the site makes a get request to get resource from the out server, the browser add a header that contain s the origin like http://www.example.com
        - server receives req and searches in it white list Access-Control-Allow-Origin: *
        - if the server specifies the methods it will compare the request  method with its example
- OWASP?
        - security knowlege framework
        - static code analysis
        - code reviews
        - security automation testing
        - penetration test
- Content Security Policy:
        - is an added layer of security that helps to detect and mitigate certain type of attacks, including cross site scripting and data injection attacks        
# CSS Architecture:
- Efficiency: to reduce the time spent thinking about how things should be done and increase the time doing things
- Consistency: want to make sure all developers are on the same page
## CSS Global:
- rule that apply crosswise to all components
- use tokens to keep the design consistent across all compoments and reduce the size of their CSS
## BEM:
- Blocks ELements Modifiers is naming methodology aimed at creating resusable components
- block__element--modifier
## Utilitty Class
- todo only one thing
# CSS preprocessor:
- is the program that lets you generate CSS from the preprocessor's own unique Syntax
- many preprocessors , but the most css preprocessor will add some feature that dont exist in pure CSS, such as mixin, nesting, selector, inheritance selector, 
- must install css compiler on your web server OR compile to dev environment then upload compiled css file to webserver
# npm script
- open source developers from every continent use npm to share and borrow packages, adn many organization use npm to manage private development as well
- three distinct components (the website, the command line interface, the registry)
## website: 
- to discover packages, set up profiels and manage other aspects of your npm experience: can set up  organization to manage access to public or private package
## CLI:
- runs from terminal, and is how most developer interact with npm 
## Registry:
- a large public database of JavaScript software and the meta-information surrounding it
## Task Runner
# WebPack
## Core Concepts:
- Entry: An entry point indicated which module webpack should use to begin building out its internal dependency graph, webpack will figure out which other modules and libraries that entry point depends on
        - Usage: entry: string | [string]  // single Entry syntax
        - entry : {<entryChunkName> string| [string]}{}
- Output: propety tells webpack where to emit the bundle it creates and how to name these files, it default  to ./dist/main.js for main output file and to the ./dist folder for any other generate file
        - can configure this part of the process by specifying an output field in your configuration: webpack.config.js.
        - output.filename and output.path properties to tell webpack the name of our bundle and where we want ro be emmited to
- Loaders:
        - out of the box, webpack only understands JavaScript and JSON files. Loaders allow webpack to process other types of files and convert them into valid modules that can be consumed by your application and added to the dependency graph
        - 
- Plugins:
- Mode
- Browser Compatibility
# Modern CSS:
## CSS Moduler: 
- all class names nad animation names are scopeb locally by default
- is not in offical spec but rather a process in build step with help of webpack that changes class names and selector to be scoped
# ReactjS- Redux:
## Redux:
 - Redux is a pattern and library for managing and updating application state, suing event called "actions"
 - Redux helps manage global state - state that is needed across many parts of your application
 - need Redux 
        - when haev large amount of application state that are needed in many place in the app
        - the app state is updated frequently overtime
        - logic to update that state may be complex
        - the app has a medium or a large-sized codebase, and might be worked on the many people
- react-redux package
- redux toolkit: is our recommended approach for writing Resuc logic, builds in our suggested best practices, simplifies most REDux task, prevent common mistakes , and make it easier to write Redux application
- redux devtool extension
        - show a history of the changes to state your Redux store over time
        - this allows you to debug your application effectively, including using powerful techniques like time travel debug
- state management:
        - state: the source of truth that drives our app
        - view: a declaretive description of the UI based on the current state
        - actions, the events that occur in the app based on uper input , and trigger unpdates in the state
        - multiple components that need to share and use the same state
        - immutable it can never ve changed: your code must make copies of existing objects/arrays, and then modify the copies
- Teminology:
        - Actions: you can think of an action as an event that describes something that happened in the application
        - actions creator is function that creates and return an action object
- reducers: receives the current state and an action object : can think it as an event listener which handles events based on the received action (event ) type - logic step  check to see if the reducer cares about this action: if so make a copy of the state update the copy with new values and return it - otherwise, return the existing state unchanged: 
```javascript
                const initialState = { value: 0 }
                function counterReducer(state = initialState, action) {
                // Check to see if the reducer cares about this action
                if (action.type === 'counter/increment') {
                // If so, make a copy of `state`
                return {
                ...state,
                // and update the copy with the new value
                value: state.value + 1
                }
                }
                // otherwise return the existing state unchanged
                return state
                }
```
- store : is created by passing in a reducer, and has a method called getState that return the current state value
```javascript
import { configureStore } from '@reduxjs/toolkit'

const store = configureStore({ reducer: counterReducer })

console.log(store.getState())
// {value: 0}
```
- Dispatch 
        - teh redux store has a method called dispatch . the only way to update the state is to call store.dispatch() and pass in an action object
        - can think of dispatching actions as "triggering an event"
```javascript
store.dispatch({ type: 'counter/increment' })

console.log(store.getState())
// {value: 1}
```
- Selectors:
        - are functions that know how to extract specific pieces of information form a store state value, As an application grows bigger this can help avoid repeating logic as different parts of the app need to read the same date:

```javascript
const selectCounterValue = state => state.value

const currentValue = selectCounterValue(store.getState())
console.log(currentValue)
// 2
```
## Redux Application Data Flow
- one way data flow:
        -- State describes the condition of the app at a specific point in time
        -- the UI is rendered based on that state
        -- when something happens, the state is updated based on what occurred
        -- the UI re-renders based on the new state
- more detail step:
        -- initial setup
        -- Update
- create the feature
- create the store
- any React componet can use data from the redux store as needed:
        - any componet can read any data that is in the redux store
        - multiple components can read the same data, even at the same time
        - componets should extract the smallest amount of data they need to rednder themselves
        - components can combine values from props state, and the Redux store to determind what UI they need to render, they can read multiple piece of  data form the rtore nad reshape the daya as needed fir display
        - any component can dispatch  actions to cause state updates
- redux action creators can prepare action objects with the right contents
        - createSlice and createAction can accept a prepare callback that return the action payload
        - Unique Id and other random value should be put in the action, not calculated in the reuducer
- Reducers should contain the actual state update logic
        - Reducers can contain whatever logic is needed to calculate the next state
        - Action objects should contain just enough info to describe what happened
## Async Logic and Data Fetching
- You can write reusable "selector" functions to encapsulate reading values from the Redux state
Selectors are functions that get the Redux state as an argument, and return some data
- Redux uses plugins called "middleware" to enable async logic
        - The standard async middleware is called redux-thunk, which is included in Redux Toolkit
        - Thunk functions receive dispatch and getState as arguments, and can use those as part of async logic
- You can dispatch additional actions to help track the loading status of an API call
        - The typical pattern is dispatching a "pending" action before the call, then either a "success" containing the data or a "failure" action containing the error
        - Loading state should usually be stored as an enum, like 'idle' | 'loading' | 'succeeded' | 'failed'
- Redux Toolkit has a createAsyncThunk API that dispatches these actions for you
        - createAsyncThunk accepts a "payload creator" callback that should return a Promise, and generates pending/fulfilled/rejected action types automatically
        - Generated action creators like fetchPosts dispatch those actions based on the Promise you return
        - You can listen for these action types in createSlice using the extraReducers field, and update the state in reducers based on those actions.
        - Action creators can be used to automatically fill in the keys of the extraReducers object so the slice knows what actions to listen for.
- React middleware come in when we want to have async logic interact with the store by dispatch or checking the current store state, allow different kind os async logic to interact with the store . this allows you to write code that can dispatch actions and check the store state , while keeping that logic separate fom UI
- the most common async middleware is REDUX-THUNK- write plain functions that may contain async logic directly
- redux toolkits configureStore function automatically sets up the thunk middleware by default, adn we recommend using thunks as the standard approach for writing  async logic with redux
- Thunk Functions
        - one the thunk middleware has been added to the redux store, it allow you to pass thunk functions directly to store.dispatch. A thunk function will always be called with (dispatch, getState) as its arguments, and you can use them inside the thunk as needed
        - Thunk typically dispatch plain actions using action creator like dispatch(increment())
# AJAX:



                






        
