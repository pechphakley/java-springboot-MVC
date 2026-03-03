package co.istad.a01a1afternoon.controller;

import co.istad.a01a1afternoon.dto.ProductResponse;
import co.istad.a01a1afternoon.dto.UpdateProductRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {

    @GetMapping
    public List<ProductResponse> getProducts(
            @RequestParam(required = false,defaultValue = "0") int pageNumber,
            @RequestParam(required = false,defaultValue = "20") int pageSize,
            @RequestParam(required = false, defaultValue = "") String name
    ){
        log.info("Page number : {},Page size : {} , Page name : {}",pageNumber,pageSize,name    );
        return List.of();
    }

    @PostMapping
    public void createNewProduct(@RequestBody CreateProductRequest productRequest){
        log.info("createProductRequest : {}",productRequest);
    }

    @PutMapping("/{code}")
    public void updateProductByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest
    ){
        log.info("updateProductByCode : {}, updatedProductRequest : {}",code,updateProductRequest);
    }

    @PatchMapping("/{code}")
    public void updateProductPartiallyByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest
    ){
        log.info("upateProductPartiallyByCode : {}, updateProductRequest : {}" , code,updateProductRequest);
    }

    @DeleteMapping("/{code}")
    public void deleteProductByCode(@PathVariable String code){
        log.info("deleteProductByCode : {}",code);
    }



}
