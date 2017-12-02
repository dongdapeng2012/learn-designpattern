# STUDENT<br/>

## App Design<br/>
At the beginning, give the app ability to learn new knowledges<br/>
So that app can output by itself<br/>
<br/>
## Code Standard<br/>
### Controller<br/>
Controller handles session, input validation, routing service, logs<br/>
Controller must not handle business logic<br/>
Controller must have bean, input, output<br/>
Controller must extends BaseController<br/>
BaseController @Autowired all services<br/>
Forbidden cross invoke between any two controllers<br/>
<br/>
### Service<br/>
Service handles business logic only<br/>
Service must not involve session<br/>
Service must have bean, input, output<br/>
Service must extends BaseService<br/>
BaseService @Autowired all daos<br/>
Forbidden cross invoke between any two services<br/>
<br/>
### Dao<br/>
Dao handles data request only<br/>
Dao must have bean, input, output<br/>
Dao must extends BaseDao<br/>
Forbidden cross invoke between any two daos<br/>