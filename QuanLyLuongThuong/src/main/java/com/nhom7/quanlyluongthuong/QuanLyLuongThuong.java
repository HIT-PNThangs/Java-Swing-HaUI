package com.nhom7.quanlyluongthuong;

import com.nhom7.quanlyluongthuong.View.DangNhap.DangNhapUI;

import java.io.IOException;
import java.sql.SQLException;

public class QuanLyLuongThuong {
    public static void main(String[] args) throws IOException, SQLException {
        new DangNhapUI().onStartGUI();
    }
}
