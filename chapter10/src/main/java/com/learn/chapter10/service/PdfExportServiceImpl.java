package com.learn.chapter10.service;

import com.learn.chapter10.domain.User;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.List;
import java.util.Map;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
@Service("pdfExportService")
public class PdfExportServiceImpl implements PdfExportService{

    @Autowired
    private UserService userService;

    @Override
    public void exportPDF(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        try{
            document.setPageSize(PageSize.A4);
            document.addTitle("用户信息");
            document.add(new Chunk("\n"));
            PdfPTable table = new PdfPTable(3);
            // 字体，定义为蓝色加粗
            Font f8 = new Font();

            f8.setColor(Color.BLUE);
            f8.setStyle(Font.BOLD);
            // 单元格
            PdfPCell cell = null;
            // 标题
            cell = new PdfPCell(new Paragraph("id", f8));
            // 居中对齐
            cell.setHorizontalAlignment(1);
            // 将单元格加入表格
            table.addCell(cell);
            cell = new PdfPCell(new Paragraph("user_name", f8));
            // 居中对齐
            cell.setHorizontalAlignment(1);
            table.addCell(cell);
            cell = new PdfPCell(new Paragraph("note", f8));
            cell.setHorizontalAlignment(1);
            table.addCell(cell);

            userService.initUserList();
            List<User> userList = userService.getUserList();

            for (User user : userList) {
                document.add(new Chunk("\n"));
                cell = new PdfPCell(new Paragraph(user.getId() + ""));
                table.addCell(cell);
                cell = new PdfPCell(new Paragraph(user.getUsername()));
                table.addCell(cell);
                String note = user.getNote() == null ? "" : user.getNote();
                cell = new PdfPCell(new Paragraph(note));
                table.addCell(cell);
            }
            // 在文档中加入表格
            document.add(table);

        }catch (Exception e){
            e.printStackTrace();
        }
//        return document;
    }
}
