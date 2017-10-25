package com.xl.test;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-22
 * @description 
 * @version 1.0
 */

public class SynchronizedTest {
	public void opAccountMoney(String account, int getMoney, String execDate) {  
        DataStore store = DataStore.getStore();  
          
        UserTest user = store.getUserFromStore(account);  
  
        if (user != null) {  
  
            try {  
                user = get(user, 1000);  
                store.putUserInStore(user);  
            } catch (Exception e) {  
                // TODO Auto-generated catch block  
                System.out.println(user.getName() + "余额不足!");  
            }  
  
        }  
    }  
  
    public UserTest get(UserTest user, int money) throws Exception {  
        if (user.getMoney() >= money) {  
            sleepTest();  
            user.setMoney(user.getMoney() - money);  
            System.out.println("Thread.currentThread().getId() : "  
                    + Thread.currentThread().getId() + "      "  
                    + user.getName() + " 余额: " + user.getMoney());  
        } else {  
            throw new Exception();  
        }  
        return user;  
    }  
  
    private void sleepTest() {  
        try {  
            Thread.currentThread().sleep(100);  
        } catch (InterruptedException e2) {  
            // TODO Auto-generated catch block  
            e2.printStackTrace();  
        }  
    }  
}

