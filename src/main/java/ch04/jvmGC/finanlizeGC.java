package ch04.jvmGC;

public class finanlizeGC {
    public static finanlizeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("我还活着！");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize is executed");
        finanlizeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new finanlizeGC();
        //对象第一次拯救自己
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("不要 我要死了");
        }
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();

        }else {
            System.out.println("不要 我要死了");
        }
    }
}
