package com.kcs.auto.adverts.servlets;

import com.kcs.auto.adverts.service.AdvertsService;
import com.kcs.auto.adverts.service.impl.AdvertsServiceImpl;
import com.kcs.auto.adverts.vo.Advert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Askew on 3/10/2017.
 */
@WebServlet(value = "/advertDetailed")
public class AdvertDetailedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AdvertsService advertsService = new AdvertsServiceImpl();
        int advertId = Integer.parseInt(req.getParameter("id"));

        Advert advert = advertsService.getAdvert(advertId);

        req.setAttribute("advert", advert);
        req.getRequestDispatcher("advertDetailed.jsp").forward(req, resp);

    }
}
