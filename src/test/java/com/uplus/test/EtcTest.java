package com.uplus.test;

import com.uplus.test.cust.domain.ProdKdCd;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EtcTest {

  @Test
  public void test(){
    assertThat("P".equals(ProdKdCd.P));
  }

}
