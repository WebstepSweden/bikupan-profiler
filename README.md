# Bikupan

This is only a first draft of the micro service architecture. Will implement a few methods stubbed methods within
the next days.

## Build
- You need JDK 1.8
- Maven

Just run `mvn clean install` from the root of the project


## Start server

Just run the

`RunBootstrap`

class within your IDE or you can just or from the console run

`java -jar bikupan-service-0.0.1-SNAPSHOT-standalone.jar server ../src/test/resources/bikupan-service.yml`


## Test server

Point your browser to

`http://localhost:3010`

or

`curl -v http://localhost:3010´ for fetching the root page.
Will return:

```
< HTTP/1.1 200 OK
< Date: Wed, 30 Apr 2014 12:11:18 GMT
< Last-Modified: Wed, 30 Apr 2014 10:44:00 GMT
< Content-Type: text/html; charset=UTF-8
< ETag: "d81de5f14034c30bb15bc2e302f90a73"
< Content-Length: 235
<
<!doctype html>
<html lang="en" ng-app="LotteryAdmin">
<head>
    <meta charset="utf-8">
    <title>Bikupan</title>
    <link rel="stylesheet" href="app/css/las.css"/>
</head>
<body>
	Bikupan is here
<!--Components-->

</body>
</html>

```

Point your browser to

`http://localhost:3010/api/computer/says`

or

`curl -v http://localhost:3010/api/computer/says` for fetching the API
Will return:

```
> GET /api/computer/says HTTP/1.1
> User-Agent: curl/7.30.0
> Host: localhost:3010
> Accept: */*
>
< HTTP/1.1 200 OK
< Date: Wed, 30 Apr 2014 12:12:04 GMT
< Content-Type: application/json; charset=UTF-8
< Vary: Accept-Encoding
< Transfer-Encoding: chunked
<
* Connection #0 to host localhost left intact
{"message":"Says hello to Uzi"}
```

## Front development

Web root is located at `src/main/resources/assets`

## Backend development
