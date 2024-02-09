package org.study.designpattern.proxy.image;

public class RealImage implements Image {

        private String fileName;

        public RealImage(String fileName) {
            this.fileName = fileName;
            try {
                loadFromDisk(fileName);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void display() {
            System.out.println("Displaying " + fileName);
        }

        private void loadFromDisk(String fileName) throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("Loading " + fileName);
        }
}
