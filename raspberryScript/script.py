import urllib.request, json 

# get data from REST API
with urllib.request.urlopen("http://localhost:8080/api/example") as url:
    data = json.loads(url.read().decode())

name = data['name']
url = data['url']
print(name, " ", url) 


    