package lab.goldentime.writenforget;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteNForgetTest {

    WriteNForget mWriteNForget;

    @Before
    public void init() {
        mWriteNForget = WriteNForget.getInstance();
        mWriteNForget.onCreate();
    }

    @Test
    public void loadMemoTest() {

        String returnValue = mWriteNForget.loadMemo();

        Assert.assertNotNull(returnValue);
    }
}
