package br.edu.infnet.nuvemat.controller;

import br.edu.infnet.nuvemat.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@RestController
@RequestMapping("bucket")
public class S3RestController {

    @Autowired
    private S3Service s3Service;

    //BUCKET - LISTAR
    @GetMapping("listar")
    public List<String> listar() {
        return s3Service.listar();
    }

    //SALVA OS ARQUIVOS NO S3
    @PostMapping("enviar")
    public String fileUpload(@RequestPart(value = "file") MultipartFile file) {
        s3Service.salvarS3(file);
        return "O arquivo " + file.getName() + " foi salvo com sucesso!!!";
    }

    //BAIXA OS ARQUIVOS NO S3
    @GetMapping(value = "/baixar/{nameFile}")
    public HttpEntity<byte[]> baixarArquivo(@PathVariable("nameFile") String nameFile) throws IOException {
        File file = s3Service.baixarS3(nameFile);
        byte[] bytes = Files.readAllBytes(file.toPath());

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        header.setContentLength(bytes.length);
        header.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + nameFile.replace(" ", "_"));
        return new HttpEntity<byte[]>(bytes, header);
    }

    //DELETA OS ARQUIVOS NO S3
    @DeleteMapping("deletar/{nameFile}")
    public String fileDelete(@RequestPart(value = "nameFile") String nameFile) { //OLHAR
        s3Service.deletarS3(nameFile);
        return "O arquivo " + nameFile + " foi deletado com sucesso!!!";
    }


}
