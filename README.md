# MyRNTest


## how to run it.

I recommand openning it in VS Code.

### At the first time.
```
npm install 
```

### run it.
Connecting an emulator or device in advance of this step.

1. Open a couple of terminals.

2. one of them run:
```
npm run start
``` 

3. another of them run:
```
npm run android
```


### In addition 
If you run it on emulator, you may got white screen. To solve it, run:

``` 
adb reverse tcp:8081 tcp:8081 
adb shell input keyevent 82
```
And then click "setting" in emulator, to set debug server host and port to `127.0.0.1:8081`.



