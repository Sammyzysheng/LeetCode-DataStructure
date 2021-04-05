## Initialize
```java
HashMap<Integer,String> hashMap=new HashMap<Integer,String> ();
```
## Add new key-value pair
```java
//Normal
hashMap.put(key,value);
//add new key-value pair if key is absent
hashMap.putIfAbsent(key,value);
```
## Retrieve value
```java
//Normal
hashMap.get(key);
//Default a value if no value with the key found
hashMap.getOrDefault(key,defaultvalue);
//Combined with put
hashMap.put(key,hashMap.getOrDefault(key,0)+1);
```

## Iteration
```java
//key value iterate1
hashMap.forEach((k,v)->{});
//key value iterate2
for (Map.Entry<keytype, valuetype> entry : hashMap.entrySet()){};
entry.getKey();
entry.getValue();
//keys values
hashMap.getKeys();
hashMap.values();

```
