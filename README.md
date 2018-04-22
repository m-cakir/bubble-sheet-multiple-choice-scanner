# Add OpenCV library

```
File > Project Structure (Ctrl + Alt + Shift + S) > Libraries > + (Alt + Insert) > Select OpenCV jar file 
```

# Run Configuration

Set following parameter as VM options

Intellij (Run/Debug Configuration -> Application -> VM options)

```
-Djava.library.path=/opencv/build/lib
```
