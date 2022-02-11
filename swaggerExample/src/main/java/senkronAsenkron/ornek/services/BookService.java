package senkronAsenkron.ornek.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class BookService {

    public void add(String book){
        try {
            sleep(3);
            System.out.println("Kitap ekle çalıştı"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Async
    public void add2(String book){
        try {
            sleep(3);
            System.out.println("Asenkron Kitap ekle çalıştı "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private void sleep(int args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(args);
    }
}
