package br.edu.infnet.nuvemtp3.service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class S3Service {

    private AmazonS3 s3aws;

    @Value("${aws.key}")
    private String key;

    @Value("${aws.secret}")
    private String secret;

    @Value("${aws.region}")
    private String region;

    @Value("${aws.bucketName}")
    private String bucket;


    @PostConstruct
    private void iniciarS3() {

        BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(key, secret);
        AWSStaticCredentialsProvider awsStaticCredentialsProvider = new AWSStaticCredentialsProvider(basicAWSCredentials);
        s3aws = AmazonS3ClientBuilder.standard()
                .withRegion(region)
                .withCredentials(awsStaticCredentialsProvider)
                .build();
    }

    public List<String> listar() {

        List<String> nameFiles = new ArrayList<>();
        ObjectListing objectListing = s3aws.listObjects(bucket);
        List<S3ObjectSummary> objectSummaries = objectListing.getObjectSummaries();

        if (objectSummaries != null) {
            for (S3ObjectSummary s3obj : objectSummaries) {
                String nameFile = s3obj.getKey();
                nameFiles.add(nameFile);
            }
        }
        return nameFiles;
    }

    public void salvarS3(File file) {
        String nameFile = file.getName();
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucket, nameFile, file);
        s3aws.putObject(putObjectRequest);
    }

    public void salvarS3(MultipartFile multipartFile) {
        try {
            File file = converterS3(multipartFile);
            salvarS3(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File converterS3(MultipartFile multipartFile) throws IOException {
        File fileConvert = new File(multipartFile.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(fileConvert);
        fos.write(multipartFile.getBytes());
        fos.close();
        return fileConvert;
    }

    public void deletarS3(String nameFile) {
        s3aws.deleteObject(bucket, nameFile);
    }

    public File baixarS3(String nameFile) throws IOException {
        S3Object object = s3aws.getObject(bucket, nameFile);
        S3ObjectInputStream objectContent = object.getObjectContent();
        byte[] bytes = objectContent.readAllBytes();

        File file = File.createTempFile("temp", nameFile);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        objectContent.close();
        fos.close();
        return file;
    }

}
