package com.JonasSmendes.qrcode.generator.controller;

import com.JonasSmendes.qrcode.generator.dto.qrcode.QrCodeGenerateRequest;
import com.JonasSmendes.qrcode.generator.dto.qrcode.QrCodeGenerateResponse;
import com.JonasSmendes.qrcode.generator.service.QrCodeGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @Autowired
    private final QrCodeGenerateService service;

    public QrCodeController(QrCodeGenerateService qrService) {
        this.service = qrService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate (@RequestBody QrCodeGenerateRequest request){
        try {
            var qrcode = this.service.qrCodeGenerate(request.text());
            return ResponseEntity.ok(qrcode);
        }catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
 }
