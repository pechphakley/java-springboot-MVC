package co.istad.a01a1afternoon.controller;

import io.micrometer.common.KeyValue;
import co.istad.a01a1afternoon.dto.CreateProductRequest;
import co.istad.a01a1afternoon.dto.ProductResponse;
import co.istad.a01a1afternoon.dto.UpdateProductRequest;
import io.micrometer.common.KeyValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;



import java.util.List;

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
        System.out.printf("Page number : {},Page size : {} , Page name : {}",pageNumber,pageSize,name);

        return List.of();
    }

    @PostMapping
    public void createNewProduct(@RequestBody CreateProductRequest productRequest){
        System.out.printf("createProductRequest{}",productRequest);
    }

    @PutMapping("/{code}")
    public void updateProductByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest
    ){
        System.out.printf("updateProductByCode : {}, updatedProductRequest : {}",code,updateProductRequest);
    }

    @PatchMapping("/{code}")
    public void updateProductPartiallyByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest
    ){
        System.out.printf("upateProductPartiallyByCode : {}, updateProductRequest : {}" , code,updateProductRequest);
    }

    @DeleteMapping("/{code}")
    public void deleteProductByCode(@PathVariable String code){



        System.out.printf("deleteProductByCode : {}",code);;
    }



}