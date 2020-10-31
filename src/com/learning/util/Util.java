package com.learning.util;

import java.time.Duration;
import java.time.LocalDateTime;

public class Util {
	public static void printTimeElapsed(LocalDateTime t) {
		LocalDateTime now = LocalDateTime.now();
		
		Duration d = Duration.between(t, now);
		System.out.println("Time elapsed: " + d.toNanos() + " ns");
	}
}
