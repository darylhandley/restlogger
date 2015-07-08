# RestLogger 

This is a simple app for logging rest calls. Written in scala using play framework. 

## How to run it   

default port (8080)
 
- activator run
  
custom port
 
- activator "run 8900"

# Test it 

You can then test it with 

curl -H "Content-Type: application/json" -X POST -d '{"hello":"world"}' http://localhost:9000/restLogger

or 

curl -H "Content-Type: application/json" -X POST -d '{"hello":"world"}' http://localhost:9000/restLogger

