package com.example.shelter.model;


public class Shelter {
    private int id;
    private String name;
    private String address;
    private String postcode;
    private int total_room_number;
    private int spare_room_number;
    private String remarks;

    public Shelter() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getTotal_room_number() {
        return total_room_number;
    }

    public void setTotal_room_number(int total_room_number) {
        this.total_room_number = total_room_number;
    }

    public int getSpare_room_number() {
        return spare_room_number;
    }

    public void setSpare_room_number(int spare_room_number) {
        this.spare_room_number = spare_room_number;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
