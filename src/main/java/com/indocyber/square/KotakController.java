package com.indocyber.square;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class KotakController {

    @GetMapping
    @ResponseBody
    public ResponseEntity<String> buatKotak(@RequestBody int nomor) {
        KotakMaker kotakMaker = new KotakMaker(nomor);
        String kotakSummary = "Square : " + kotakMaker.kotakValidator();

//        String[] kotakFlatArray = kotakMaker.kotakValidator().split("(?<=\\G.{" + nomor + "})");
//        String kotakReal = "";
//
//        for (String piece : kotakFlatArray) {
//            kotakReal = kotakReal + piece + "\n";
//        }
//        kotakSummary = kotakSummary + "\n" + kotakReal;

        return new ResponseEntity<>(kotakSummary, HttpStatus.OK);
    }
}
