package org.gucardev.mixed.feign_transaction.client;

import org.gucardev.mixed.feign_transaction.aspect.RollbackApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@CustomFeignAnnotation(rollbackUrl = "/ExampleClient/lookups?rollback=true")
@FeignClient(name = "exampleClient", url = "http://localhost:8080")
public interface ExampleClient {

    @RollbackApi(rollbackUrl = "/example/lookups?rollback=true")
    @GetMapping("/example")
    String getExample();

    @GetMapping("/example2")
    String getExample2();
}
