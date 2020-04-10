```
# JMH version: 1.23
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.krv.ballerinalang.MyBenchmark.testHashSetContainsAndAdd

# Run progress: 0.00% complete, ETA 00:16:40
# Fork: 1 of 5
# Warmup Iteration   1: 306.363 ns/op
# Warmup Iteration   2: 878.228 ns/op
# Warmup Iteration   3: 280.103 ns/op
# Warmup Iteration   4: 289.277 ns/op
# Warmup Iteration   5: 274.598 ns/op
Iteration   1: 277.199 ns/op
Iteration   2: 132.683 ns/op
Iteration   3: 196.475 ns/op
Iteration   4: 693.717 ns/op
Iteration   5: 686.991 ns/op

# Run progress: 10.00% complete, ETA 00:21:42
# Fork: 2 of 5
# Warmup Iteration   1: 191.381 ns/op
# Warmup Iteration   2: 213.116 ns/op
# Warmup Iteration   3: 605.250 ns/op
# Warmup Iteration   4: 213.135 ns/op
# Warmup Iteration   5: 277.415 ns/op
Iteration   1: 205.416 ns/op
Iteration   2: 276.740 ns/op
Iteration   3: 282.713 ns/op
Iteration   4: 280.326 ns/op
Iteration   5: 193.884 ns/op

# Run progress: 20.00% complete, ETA 00:18:29
# Fork: 3 of 5
# Warmup Iteration   1: 252.737 ns/op
# Warmup Iteration   2: 630.799 ns/op
# Warmup Iteration   3: 361.512 ns/op
# Warmup Iteration   4: 257.368 ns/op
# Warmup Iteration   5: 100.936 ns/op
Iteration   1: 274.777 ns/op
Iteration   2: 282.125 ns/op
Iteration   3: 116.768 ns/op
Iteration   4: 194.462 ns/op
Iteration   5: 203.584 ns/op

# Run progress: 30.00% complete, ETA 00:16:05
# Fork: 4 of 5
# Warmup Iteration   1: 642.266 ns/op
# Warmup Iteration   2: 157.969 ns/op
# Warmup Iteration   3: 109.131 ns/op
# Warmup Iteration   4: 213.780 ns/op
# Warmup Iteration   5: 717.512 ns/op
Iteration   1: 302.264 ns/op
Iteration   2: 646.413 ns/op
Iteration   3: 1913.607 ns/op
Iteration   4: 219.483 ns/op
Iteration   5: 670.567 ns/op

# Run progress: 40.00% complete, ETA 00:15:28
# Fork: 5 of 5
# Warmup Iteration   1: 253.977 ns/op
# Warmup Iteration   2: 700.003 ns/op
# Warmup Iteration   3: 438.245 ns/op
# Warmup Iteration   4: 222.801 ns/op
# Warmup Iteration   5: 221.212 ns/op
Iteration   1: 241.593 ns/op
Iteration   2: 1279.192 ns/op
Iteration   3: 1018.449 ns/op
Iteration   4: 373.530 ns/op
Iteration   5: 288.588 ns/op
```
```
Result "org.krv.ballerinalang.MyBenchmark.testHashSetContainsAndAdd":
  450.062 ±(99.9%) 313.695 ns/op [Average]
  (min, avg, max) = (116.768, 450.062, 1913.607), stdev = 418.774
  CI (99.9%): [136.367, 763.757] (assumes normal distribution)
```

```
# JMH version: 1.23
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.krv.ballerinalang.MyBenchmark.testHashSetOnlyAdd

# Run progress: 50.00% complete, ETA 00:13:42
# Fork: 1 of 5
# Warmup Iteration   1: 262.439 ns/op
# Warmup Iteration   2: 393.469 ns/op
# Warmup Iteration   3: 192.015 ns/op
# Warmup Iteration   4: 646.411 ns/op
# Warmup Iteration   5: 632.391 ns/op
Iteration   1: 259.473 ns/op
Iteration   2: 254.895 ns/op
Iteration   3: 272.428 ns/op
Iteration   4: 184.217 ns/op
Iteration   5: 666.163 ns/op

# Run progress: 60.00% complete, ETA 00:10:42
# Fork: 2 of 5
# Warmup Iteration   1: 296.484 ns/op
# Warmup Iteration   2: 219.183 ns/op
# Warmup Iteration   3: 541.035 ns/op
# Warmup Iteration   4: 121.693 ns/op
# Warmup Iteration   5: 224.784 ns/op
Iteration   1: 264.020 ns/op
Iteration   2: 120.414 ns/op
Iteration   3: 182.018 ns/op
Iteration   4: 659.113 ns/op
Iteration   5: 614.343 ns/op

# Run progress: 70.00% complete, ETA 00:07:49
# Fork: 3 of 5
# Warmup Iteration   1: 226.823 ns/op
# Warmup Iteration   2: 504.339 ns/op
# Warmup Iteration   3: 544.709 ns/op
# Warmup Iteration   4: 518.734 ns/op
# Warmup Iteration   5: 112.975 ns/op
Iteration   1: 190.185 ns/op
Iteration   2: 688.544 ns/op
Iteration   3: 643.969 ns/op
Iteration   4: 638.440 ns/op
Iteration   5: 256.104 ns/op

# Run progress: 80.00% complete, ETA 00:05:07
# Fork: 4 of 5
# Warmup Iteration   1: 261.677 ns/op
# Warmup Iteration   2: 748.476 ns/op
# Warmup Iteration   3: 304.527 ns/op
# Warmup Iteration   4: 336.351 ns/op
# Warmup Iteration   5: 115.334 ns/op
Iteration   1: 178.816 ns/op
Iteration   2: 691.231 ns/op
Iteration   3: 653.298 ns/op
Iteration   4: 113.962 ns/op
Iteration   5: 253.702 ns/op

# Run progress: 90.00% complete, ETA 00:02:32
# Fork: 5 of 5
# Warmup Iteration   1: 251.080 ns/op
# Warmup Iteration   2: 589.389 ns/op
# Warmup Iteration   3: 104.219 ns/op
# Warmup Iteration   4: 739.429 ns/op
# Warmup Iteration   5: 692.670 ns/op
Iteration   1: 264.296 ns/op
Iteration   2: 269.178 ns/op
Iteration   3: 115.419 ns/op
Iteration   4: 184.630 ns/op
Iteration   5: 696.932 ns/op
```

```
Result "org.krv.ballerinalang.MyBenchmark.testHashSetOnlyAdd":
  372.632 ±(99.9%) 169.550 ns/op [Average]
  (min, avg, max) = (113.962, 372.632, 696.932), stdev = 226.344
  CI (99.9%): [203.082, 542.182] (assumes normal distribution)
```


```# Run complete. Total time: 00:25:04```

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.


| Benchmark                             | Mode |Cnt| Score | Error    | Units |
| --------------------------------------|------|---|-------|----------|-------|
| MyBenchmark.testHashSetContainsAndAdd | avgt |25 |450.062|± 313.695 | ns/op |
| MyBenchmark.testHashSetOnlyAdd        | avgt |25 |372.632|± 169.550 | ns/op |
