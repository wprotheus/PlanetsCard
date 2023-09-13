package com.wprotheus.mobile1cardplanetas.model;

import com.wprotheus.mobile1cardplanetas.R;

import java.util.ArrayList;
import java.util.List;

public class DataSetPlanetas {

    public static List<Planeta> planetas(){
        List<Planeta> planetas = new ArrayList<>();
        planetas.add(new Planeta(R.drawable.mercurio,
                "Mercúrio",
                "Mercúrio é o menor planeta do Sistema Solar e o mais próximo do Sol. " +
                        "É também o planeta mais rápido, um ano de Mercúrio (giro completo ao redor do Sol) é equivalente a 88 dias terrestres. " +
                        "Em compensação, um dia solar do planeta dura 2 anos (176 dias terrestres). " +
                        "A temperatura no planeta supera os 400 °C."));
        planetas.add(new Planeta(R.drawable.venus,
                "Vênus",
                "Vênus é o segundo planeta mais próximo do Sol. Além do Sol e da Lua é o corpo celeste mais brilhante no céu. " +
                        "Por isso, é chamado também de Estrela d'Alva, Estrela Matutina ou Vespertina, aparente no céu antes do amanhece e logo depois do entardecer. " +
                        "O ano venusiano tem uma duração menor que o dia. O giro ao redor do Sol dura 224 dias terrestres, " +
                        "enquanto o giro em torno do próprio eixo leva 243 dias para se completar."));
        planetas.add(new Planeta(R.drawable.terra,
                "Terra",
                "A Terra é o terceiro planeta do Sistema Solar, o único que apresenta água em estado líquido e oxigênio em sua atmosfera, " +
                        "o que possibilita a vida no planeta. O movimento de rotação da Terra dura 23 horas, 56 minutos e 04 segundos " +
                        "e o ano terrestre é de aproximadamente 365 dias e 6 horas. A temperatura média da Terra é de 14ºC."));
        planetas.add(new Planeta(R.drawable.marte,
                "Marte",
                "Marte é o segundo menor planeta do sistema solar. É conhecido como \"planeta vermelho\" pela coloração de sua superfície. " +
                        "Marte possui duas luas em sua órbita chamadas de Fobos e Deimos. O ano em Marte dura 687 dias terrestres e " +
                        "o dia marciano é muito parecido com o da Terra, 24 horas e 35 minutos. Sua temperatura média é de -63ºC."));
        planetas.add(new Planeta(R.drawable.jupiter,
                "Jupiter",
                "Júpiter é o maior planeta do Sistema Solar, a área da superfície é mais de 120 vezes maior que a Terra. " +
                        "Formado principalmente pelos gases hidrogênio, hélio e metano e, ainda, um pequeno núcleo sólido no interior. " +
                        "A temperatura média do planeta é de -108ºC. " +
                        "O ano de Júpiter dura 11,86 anos terrestres e o dia tem a duração de 9 horas e 50 minutos."));
        planetas.add(new Planeta(R.drawable.saturno,
                "Saturno",
                "Saturno é o segundo maior planeta do Sistema Solar. É conhecido pelos anéis formados principalmente por gelo e poeira cósmica. " +
                        "O diâmetro do planeta é de cerca de 100 000 km e nos anéis chega a 270 000 km, com apenas 150 metros de espessura. " +
                        "O Ano de Saturno dura 29,5 anos terrestres e o dia cerca de 10 horas e 35 minutos."));
        planetas.add(new Planeta(R.drawable.urano,
                "Urano",
                "Urano é um planeta gasoso e sua atmosfera é constituída, principalmente, de hidrogênio, hélio e metano, com muita formação de gelo. " +
                        "É o planeta com a superfície mais fria do Sistema Solar, sua temperatura média é de -220 ºC. " +
                        "Por conta de sua posição em relação ao Sol, seus polos passam 42 anos (terrestres) iluminados seguidos de 42 anos de escuridão."));
        planetas.add(new Planeta(R.drawable.netuno,
                "Netuno",
                "Netuno é o planeta mais distante do Sol. Um gigante gasoso, tal como Júpiter, Saturno e Urano. " +
                        "O planeta possui uma intensa atividade em sua superfície com os ventos mais fortes do Sistema Solar, chegando a 2000 km/h. " +
                        "O dia de Netuno dura cerca de 17 horas terrestres e o ano 164,79 anos na Terra. Sua temperatura média é de -201 ºC."));
        planetas.add(new Planeta(R.drawable.plutao,
                "Plutão",
                "O planeta-anão Plutão leva 6,4 dias terrestres para dar uma volta em torno de si mesmo, " +
                        "248 anos terrestres para dar uma volta em torno do sol e completar sua órbita. " +
                        "Aliás, a órbita de Plutão é a que apresenta a maior excentricidade de todas, durante 20 anos dos 248 de sua órbita ele " +
                        "fica mais próximo do sol do que Netuno devido ao fato de sua órbita ser elíptica."));
        return planetas;
    }
}
