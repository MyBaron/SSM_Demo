package com.Controller;


import com.test.Utils.UtilCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("/captcha")
public class captcha {


    @RequestMapping("/images")
    public void images(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");

        BufferedImage imageChallengeForID = UtilCaptcha.getInstance().getImageChallengeForID(request.getSession(true).getId());
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(imageChallengeForID, "jpg", outputStream);

        try {
            outputStream.flush();
        } finally {
            outputStream.close();
        }

    }

}
