package xyz.wongs.shumer.akkad.thread.callfutrue;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import xyz.wongs.shumer.akkad.thread.SysUser;
import xyz.wongs.shumer.akkad.thread.UserTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;


public class CallableFutrueCase {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(7);
        UserTask userTask = new UserTask();
        Future<List<SysUser>> result = executor.submit(userTask);

        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");;

        try {
            System.out.println("task运行结果"+result.get().size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("所有任务执行完毕");

    }
}
