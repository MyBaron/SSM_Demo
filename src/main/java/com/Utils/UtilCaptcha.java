package com.test.Utils;

import com.octo.captcha.CaptchaFactory;
import com.octo.captcha.component.image.backgroundgenerator.GradientBackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.UniColorBackgroundGenerator;
import com.octo.captcha.component.image.color.RandomRangeColorGenerator;
import com.octo.captcha.component.image.color.SingleColorGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.NonLinearTextPaster;
import com.octo.captcha.component.image.textpaster.RandomTextPaster;
import com.octo.captcha.component.image.wordtoimage.ComposedWordToImage;
import com.octo.captcha.component.word.wordgenerator.ComposeDictionaryWordGenerator;
import com.octo.captcha.component.word.wordgenerator.RandomWordGenerator;
import com.octo.captcha.engine.GenericCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;
import com.octo.captcha.service.captchastore.FastHashMapCaptchaStore;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import com.octo.captcha.service.image.ImageCaptchaService;
import com.octo.captcha.service.multitype.GenericManageableCaptchaService;

import java.awt.*;

public class UtilCaptcha {
    private static class SingletonHolder {
        private static ImageCaptchaService imageCaptchaService = new DefaultManageableImageCaptchaService(
                new FastHashMapCaptchaStore(),
                new GenericCaptchaEngine(
                        new GimpyFactory[]{new GimpyFactory(
                                new RandomWordGenerator("123456789ABCE"),
                                new ComposedWordToImage(
                                        new RandomFontGenerator(20, 20, new Font[]{new Font("Arial", 20, 20)}),
                                        new GradientBackgroundGenerator(90, 30, new SingleColorGenerator(new Color(235, 255, 255)), new SingleColorGenerator(new Color(255, 195, 230))),
                                        new NonLinearTextPaster(4, 4, new Color(11, 11, 11))
                                )
                        )}
                ),
                180,
                180000,
                20000
        );
    }
    private UtilCaptcha(){}
    public static ImageCaptchaService getInstance(){
        return SingletonHolder.imageCaptchaService;
    }
}
