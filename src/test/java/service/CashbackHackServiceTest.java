package service;

import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalcCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfOver() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCashBackIfUnder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}
