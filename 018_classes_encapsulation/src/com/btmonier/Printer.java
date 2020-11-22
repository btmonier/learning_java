package com.btmonier;

import java.util.concurrent.TimeUnit;

public class Printer {
    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(double tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 1.0) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(double tonerInk) {
        this.tonerLevel += tonerInk;
        if (this.tonerLevel >= 1.0) {
            System.out.println("More toner was used than needed. Capping off to 100%...");
            this.tonerLevel = 1;
        }
    }

    private void updatePages(int pageNumber) {
        this.numberOfPagesPrinted += pageNumber;
    }

    private void updateTonerLevel(double damage) {
        this.tonerLevel = this.tonerLevel - damage;
    }

    public void printerGoBrrr(int pageNumber, boolean goodQuality) {
        if (this.isDuplexPrinter) {
            for (int i = 0; i < pageNumber; i = i + 2) {
                System.out.println("=== BRRR ===");
                System.out.printf("Printing pages............ %d & %d%n", i + 1, i + 2);
                this.updatePages(2);
                this.updateTonerLevel(goodQuality ? 0.05 * 2 : 0.01 * 2);
                System.out.println("Number of pages printed... " + this.numberOfPagesPrinted);
                System.out.println("Toner level............... " + (this.tonerLevel * 100) + "%");
                System.out.println("");

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        } else {
            for (int i = 0; i < pageNumber; i++) {
                System.out.println("=== BRRR ===");
                System.out.printf("Printing page............. %d%n", i + 1);
                this.updatePages(1);
                this.updateTonerLevel(goodQuality ? 0.05 : 0.01);
                System.out.println("Number of pages printed... " + this.numberOfPagesPrinted);
                System.out.println("Toner level............... " + (this.tonerLevel * 100) + "%");
                System.out.println("");

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
