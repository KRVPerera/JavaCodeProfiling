/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.krv.ballerinalang;

import org.apache.commons.math3.util.Pair;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@OperationsPerInvocation(MyBenchmark.N)
@State(Scope.Thread)
public class MyBenchmark {

    public static final int N = 10000;

    //    static List<Integer> sourceList = new ArrayList<>();
    static Set<Pair<Integer, Integer>> intPairSet = new HashSet<>();
    static Random rand = new Random();

//    static {
//        for (int i = 0; i < N; i++) {
//            sourceList.add(i);
//        }
//    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .forks(1)
                .jvmArgs("-ea")
                .shouldFailOnError(false) // switch to "true" to fail the complete run
                .build();

        new Runner(opt).run();
    }

//    @Benchmark
//    public void testforEachMethod() {
//        sourceList.forEach(this::simpleDouble);
//    }
//
//    @Benchmark
//    public void testSimpleForEachMethod() {
//        for (int number : sourceList) {
//            simpleDouble(number);
//        }
//    }

    @TearDown(Level.Iteration)
    public void check() {
        intPairSet.clear();
        int randomIntA = rand.nextInt(N / 10);
        int randomIntB = rand.nextInt(N / 10);

        for (int i = 0; i < N; i++) {
            intPairSet.add(new Pair<>(randomIntA, randomIntB));
        }
    }

    // TODO: extract out random pair generation
    @Benchmark
    public void testSearchAndInsert() {
        for (int i = 0; i < N / 10; i++) {
            int randomIntA = rand.nextInt(N / 10);
            int randomIntB = rand.nextInt(N / 10);
            Pair pair = new Pair(randomIntA, randomIntB);
            if (intPairSet.contains(pair)) {
                return;
            }
            intPairSet.add(pair);
        }
    }

//    private void simpleDouble(int num) {
//        int y = num * 2;
//    }

    @Benchmark
    public void testOnlyInsert() {
        for (int i = 0; i < N / 10; i++) {
            int randomIntA = rand.nextInt(N / 10);
            int randomIntB = rand.nextInt(N / 10);
            Pair pair = new Pair(randomIntA, randomIntB);
            if (!intPairSet.add(pair)) {
                return;
            }
        }
    }
}
