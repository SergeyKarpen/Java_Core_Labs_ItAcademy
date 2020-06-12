package labs.itacademy.skarpen.Thread;


public  class  Thread_Task_1 {
    /**
     * Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
     * Некоторые из них можна выдавать на руки некоторые только в читальный зал.
     * Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
     */



    public static void main(String[] args) throws InterruptedException {

      float d = (float) 1.3;
      char s = '\u005B';
      int then = 8;
        /**
         /* Scanner scanner = new Scanner(System.in);
         int input = scanner.nextInt();
         if (scanner.hasNextInt())
         {

         Thread thread = new Thread(new Runner());
         Thread thread2 = new Thread(new Runner());
         Thread thread3 = new Thread(new Runner());
         thread.start();
         thread.join(2000);
         thread2.start();
         thread3.start();
         thread3.join(1000);

         }

         }

         class Runner implements Runnable {
         BooksInTheLibrary books1 = new BooksInTheLibrary("Hamlet", 1, false, true);
         BooksInTheLibrary books2 = new BooksInTheLibrary("Bible", 2, false, true);
         BooksInTheLibrary books3 = new BooksInTheLibrary("Chepolina", 3, true, true);
         BooksInTheLibrary books4 = new BooksInTheLibrary("Planet control", 4, false, true);
         BooksInTheLibrary books5 = new BooksInTheLibrary("All about elephants", 5, true, true);
         List<BooksInTheLibrary> books = new ArrayList<>(Arrays.asList(books1, books2, books3, books4, books5));

         @Override public void run() {
         BooksInTheLibrary booRandom = books.get((int) (Math.random() * books.size()));
         synchronized (this) {
         while (!booRandom.isInLibrary()) {
         System.out.println(" Ожидайте ещё 5 секунд книгу отдали на руки " + booRandom.getNameBook());
         try {
         Thread.currentThread().join(5000);
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         }
         }
         booRandom.setInLibrary(false);


         if (booRandom.isReadingInTheHall()) {
         System.out.println(booRandom.getNameBook() + " Это книга только для  чтения в зале ");
         try {
         Thread.currentThread().join(5000);
         System.out.println(" Книгу вернули " + booRandom.getNameBook());
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         } else {
         System.out.println(booRandom.getNameBook() + " Книга выдается как на зал так и домой ");
         try {
         Thread.currentThread().join(10000);
         System.out.println(" Книгу вернули " + booRandom.getNameBook());
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         }
         booRandom.setInLibrary(false);
         */
    }
}

