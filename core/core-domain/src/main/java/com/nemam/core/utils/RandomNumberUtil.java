package com.nemam.core.utils;

import java.util.Random;

public class RandomNumberUtil {

    private RandomNumberUtil() {

    }

    /**
     * 랜덤한 숫자 생성
     */
    public static String generateRandomNumber(int size) {
        if (size < 0) {
            return "";
        }
        Random random = new Random();

        // StringBuilder를 사용하여 랜덤한 6자리 숫자 생성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(random.nextInt(10));
        }

        // 생성된 문자열 반환
        return sb.toString();
    }

}
