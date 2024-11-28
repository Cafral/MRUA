package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calculos")

public class CinematicaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double aceleracion = Double.parseDouble(req.getParameter("aceleracion"));
        Double velocidadIni = Double.parseDouble(req.getParameter("velocidadini"));
        Double tiempoAdi = Double.parseDouble(req.getParameter("tiempoadi"));

        //Variable para velocidad determinada
        Double velocidadFin = 83.00;


        //Calculo del tiempo en alcanzar una velocidad x
        Double tiempox = (velocidadFin - velocidadIni)/aceleracion;

        //Distancia recorrido en ese tiempo
        Double distancia = velocidadIni * tiempox + ((aceleracion * Math.pow(tiempox, 2))/2);

        //Velocidad final con 5 segundos adicionales
        Double tiempo5Adi = tiempox + tiempoAdi;
        Double velocidadFinalCon5Adi = 2 * (distancia/tiempo5Adi) - velocidadIni;

        //Distancia total recorrida en esos 5 segundos adicionales
        Double distanciaTotalCon5Adi = velocidadIni * tiempo5Adi + (aceleracion * Math.pow(tiempo5Adi, 2))/2;

        req.setAttribute("velocidadFinal", velocidadFin);
        req.setAttribute("tiempox", tiempox);
        req.setAttribute("distancia", distancia);
        req.setAttribute("velocidadFinalCon5Adi", velocidadFinalCon5Adi);
        req.setAttribute("distanciaTotalCon5Adi", distanciaTotalCon5Adi);

        req.getRequestDispatcher("/resultado.jsp").forward(req, resp);
    }
}
