# Android DataBinding Example

### build.gradle (app)
```
  buildFeatures {
        dataBinding true
    }
```

```java
        ActivityMainBinding binding;

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUserAction(this);
        getSupportActionBar().show();
```


