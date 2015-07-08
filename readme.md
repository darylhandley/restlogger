# RestLogger 

This is a simple app for logging rest calls to standard out. Written in Scala using the Play framework. 

## How to run it   

default port (8080)
 
- activator run
  
custom port
 
- activator "run 8900"

# Test it 

You can then test it with default port:  

curl -H "Content-Type: application/json" -X POST -d '{"hello":"world"}' http://localhost:9000/testUrl


# Notes

- currently only supports POST, but GET and DELETE support may be added later 
- you can post to any path you wish and it will log it. ex: try post to http://localhost:9000/myTotallyMadeUpNewUrl 

