/*
* === CHALLENGE 4 - PAINT JOB =======================================
* Bob is a wall painter and he needs your help. You have to write a
* program that helps Bob calculate how many buckets of paint he
* needs to buy before going to work. Bob might also have some extra
* buckets at home. He also knows the area that he can cover with one
* bucket of paint.
*
* PART 1
* 1. Write a method named getBucketCount with 4 parameters. The
*    first parameter should be named width of type double. This
*    parameter represents the width of the wall.
* 2. The second parameter should be named height of type double.
*    This parameter represents the height of the wall.
* 3. The third parameter should be named areaPerBucket. This
*    parameter represents the area that can be covered with one
*    bucket of paint.
* 4. The fourth parameter should be named extraBuckets. This
*    parameter represents the bucket count that Bob has at home.
* 5. The method needs to return a value of type int that represents
*    the number of buckets that Bob needs to buy before going to work.
*    To calculate the bucket count, refer to the notes below.
* 6. If one of the parameters width, height or areaPerBucket is less
*    or equal to 0 or if extraBuckets is less than 0, the method needs
*    to return -1 to indicate an invalid value.
* 7. If all parameters are valid, the method needs to calculate the number
*    of buckets and return it.
*
* Examples of input/output:
* getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
* getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
* getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
*
* PART 2
* 1. Bob does not like to enter 0 for the extraBuckets parameter so he
*    needs another method.
* 2. Write another overloaded method named getBucketCount with 3 parameters
*    namely width, height, and areaPerBucket (all of type double).
* 3. This method needs to return a value of type int that represents the
*    number of buckets that Bob needs to buy before going to work. To
*    calculate the bucket count, refer to the notes below.
* 4. If one of the parameters width, height or areaPerBucket is less or equal
*    to 0, the method needs to return -1 to indicate an invalid value.
* 5. If all parameters are valid, the method needs to calculate the number
*    of buckets and return it.
*
* Examples of input/output:
* getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
* getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
* getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
*
* PART 3
* 1. In some cases, Bob does not know the width and height of the wall but he
*    knows the area of a wall. He needs you to write another method.
* 2. Write another overloaded method named getBucketCount with 2 parameters
*    namely, area and areaPerBucket (both of type double).
* 3. The method needs to return a value of type int that represents the number
*    of buckets that Bob needs to buy before going to work. To calculate the
*    bucket count, refer to the notes below.
* 4. If one of the parameters area or areaPerBucket is less or equal to 0,
*    the method needs to return -1to indicate an invalid value.
* 5. If all parameters are valid, the method needs to calculate the number
*    of buckets and return it.
*
* Examples of input/output:
* getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
* getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
* getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
*
* Do your best to help Bob...
*
* NOTE: Use the method Math.ceil to round the number of calculated buckets (double)
*       then convert it into an int before returning the value from the methods.
* NOTE: All methods should be defined as public static like we have been doing
*       so far in the course.
* NOTE: Do not add the main method to the solution code.
*/

package com.btmonier;

public class UserIOChallenge4 {
    public static void main(String[] args) {
        System.out.println("=== UNIT TESTS (PART 1) ===");
        int buckets = getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println("- Expected: (-1) | Test: " + buckets);
        buckets = getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println("- Expected: (3)  | Test: " + buckets);
        buckets = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println("- Expected: (3)  | Test: " + buckets);
        System.out.println();

        System.out.println("=== UNIT TESTS (PART 2) ===");
        buckets = getBucketCount(-3.4, 2.1, 1.5);
        System.out.println("- Expected: (-1) | Test: " + buckets);
        buckets = getBucketCount(3.4, 2.1, 1.5);
        System.out.println("- Expected: (5)  | Test: " + buckets);
        buckets = getBucketCount(7.25, 4.3, 2.35);
        System.out.println("- Expected: (14) | Test: " + buckets);
        System.out.println();

        System.out.println("=== UNIT TESTS (PART 3) ===");
        buckets = getBucketCount(3.4, 1.5);
        System.out.println("- Expected: (3)  | Test: " + buckets);
        buckets = getBucketCount(6.26, 2.2);
        System.out.println("- Expected: (3)  | Test: " + buckets);
        buckets = getBucketCount(3.26, 0.75);
        System.out.println("- Expected: (5)  | Test: " + buckets);

        buckets = getBucketCount(0.0, 2.1, 1.5, 7);
        System.out.println("- Expected: (-1) | Test: " + buckets);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;
        double buckets = wallArea / areaPerBucket;
        double bucketsNeeded = buckets - extraBuckets;

        return (int) Math.ceil(bucketsNeeded);
    }

    // Overload (part 2)
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double wallArea = width * height;

        return (int) Math.ceil(wallArea / areaPerBucket);
    }

    // Overload (part 3)
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
