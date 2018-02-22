#BEHAVIORAL PATTERN

##Behavioral pattern focus on methods
> Purpose of behavioral pattern is to 
> 1. decouple requester and responser 
> 2. handle request

***
#responsibility chain
request --> handler factory organized like a singly linked map
handler factory
##features
* scenario: ordered and limited handlers
* target: decouple request and handler by handler factory
* implement: implement singly ordered list of handler

*notice: one request may have no handler, or multiple handlers*

***
#Command/Action/Transaction
request --> contracted request bean factory --> handler
##features
* scenario: limited request types
* target: decouple request and handler by request bean factory
* implement: encapsulate request to bean

*notice: balance of number of handler and size of each handler*

***
#Interpreter
request --> contracted request context factory with grammar --> handler
##features
* scenario: request with logical context and costly to be encapsulated
* target: interpret request with contracted logic of context; decoupling request and handler
* implement: interpret request by a grammar tree

*notice: balance complexity and efficiency of contracted grammar*

***
#Iterator/Cursor
request contains a iterable collection --> handler
##features
* scenario: traversal an object
* target: traversal
* implement: who control iterator 

*notice:*
*who controls iteration -> iterator (internal) or requester (external)*
*who defines iteration -> iterator or aggregation*
> If iterator defines iteration, it is easy to reuse iteration, but hard to invoke private properties in aggregations

***
#Mediator
request --> mediator handler
##features
* scenario: many instances of the same object invoke each other
* target: decouple instances by collecting netlike invocations to stellate
* implement: separate behavior and handler

*notice: size and complexity of handler*

***
#Memento/Token
request --> handler
request --> memonto, record and recall history of handler
##features
* scenario: need record history of an object
* target: record and rollback history without impact object
* implement: third-party object provide history service

*notice: could be costly, consider incremental*

***
#Observer/Dependents/Publish-Subscribe
request --> handler --> passively trigger observer
observer invoke handler
##features
* scenario: object dependency exists
* target: decouple dependencies
* implement: abstract observer with an observe method

*notice: usually use asynchronous observe method* 

***
#State
request --> factory handler on state
all methods in handler switch its state
##features
* scenario: behavior depends on state; many condition branches
* target: coupling behavior with state
* implement: factory on state

*notice: number of states* 

***
#Strategy/Policy
request --> factory handler on behavior
##features
* scenario: select one behavior
* target: decouple request and behavior
* implement: factory on behavior

*notice: number of strategies*

***
#Template
request --> abstract class factory of handler
##features
* scenario: handlers has common structure and/or method
* target: decouple request and behavior
* implement: factory on handler

*notice: size of handler; add key word final to avoid override*

***
#Visitor
request --> handler & visitor
requester assign visitor via handler
handler invoke visitor
##features
* scenario: add new behavior to a stable handler
* target: not impact handler
* implement: every handler invokes visitor factory

*notice: consider which part would change frequently; hard to increase new handler*

***
#Compare
**Responsibility Chain vs. Observer**
: Responsibility Chain is ordered Observer

**State vs. Strategy vs. Template**
: State depends on state of object itself
: Strategy and Template depends on request

**Strategy vs. Template**
: Strategy is factory on behavior
: Template is factory of abstract handler