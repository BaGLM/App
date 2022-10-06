package com.example.app.ConfIni;

import com.example.app.Models.Municipio;
import com.example.app.Repositories.RepMun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfMun {

    @Autowired
    RepMun repMun;

    @Bean("Municipio")
    CommandLineRunner commandLineRunner(RepMun repMun) {
        if (repMun.count() == 0) {
            return args -> {
                Municipio m1 = new Municipio(1L,"Acajete");
                Municipio m2 = new Municipio(2L,"Acatlán");
                Municipio m3 = new Municipio(3L,"Acayucan");
                Municipio m4 = new Municipio(4L,"Actopan");
                Municipio m5 = new Municipio(5L,"Acula");
                Municipio m6 = new Municipio(6L,"Acultzingo");
                Municipio m7 = new Municipio(7L,"Camarón de Tejeda");
                Municipio m8 = new Municipio(8L,"Alpatlahuac");
                Municipio m9 = new Municipio(9L,"Alto Lucero de Gutiérrez Barrios");
                Municipio m10 = new Municipio(10L,"Altotonga");
                Municipio m11 = new Municipio(11L,"Alvarado");
                Municipio m12 = new Municipio(12L,"Amatitlán");
                Municipio m13 = new Municipio(13L,"Naranjos Amatlán");
                Municipio m14 = new Municipio(14L,"Amatlán de los Reyes");
                Municipio m15 = new Municipio(15L,"Ángel R. Cabada");
                Municipio m16 = new Municipio(16L,"La Antigua");
                Municipio m17 = new Municipio(17L,"Apazapan");
                Municipio m18 = new Municipio(18L,"Aquila");
                Municipio m19 = new Municipio(19L,"Astacinga");
                Municipio m20 = new Municipio(20L,"Atlahuilco");
                Municipio m21 = new Municipio(21L,"Atoyac");
                Municipio m22 = new Municipio(22L,"Atzacan");
                Municipio m23 = new Municipio(23L,"Atzalan");
                Municipio m24 = new Municipio(24L,"Tlaltetela");
                Municipio m25 = new Municipio(25L,"Ayahualulco");
                Municipio m26 = new Municipio(26L,"Banderilla");
                Municipio m27 = new Municipio(27L,"Benito Juárez");
                Municipio m28 = new Municipio(28L,"Boca del Río");
                Municipio m29 = new Municipio(29L,"Calcahualco");
                Municipio m30 = new Municipio(30L,"Camerino Z. Mendoza");
                Municipio m31 = new Municipio(31L,"Carrilo Puerto");
                Municipio m32 = new Municipio(32L,"Catemaco");
                Municipio m33 = new Municipio(33L,"Cazones de Herrera");
                Municipio m34 = new Municipio(34L,"Cerro Azul");
                Municipio m35 = new Municipio(35L,"Citlaltépetl");
                Municipio m36 = new Municipio(36L,"Coacoatzintla");
                Municipio m37 = new Municipio(37L,"Coahuitlán");
                Municipio m38 = new Municipio(38L,"Coatepec");
                Municipio m39 = new Municipio(39L,"Coatzacoalcos");
                Municipio m40 = new Municipio(40L,"Coatzintla");
                Municipio m41 = new Municipio(41L,"Coetzala");
                Municipio m42 = new Municipio(42L,"Colipa");
                Municipio m43 = new Municipio(43L,"Comapa");
                Municipio m44 = new Municipio(44L,"Córdoba");
                Municipio m45 = new Municipio(45L,"Cosamaloapan de Carpio");
                Municipio m46 = new Municipio(46L,"Cosautlán de Carvajal");
                Municipio m47 = new Municipio(47L,"Coscomatepec");
                Municipio m48 = new Municipio(48L,"Cosoleacaque");
                Municipio m49 = new Municipio(49L,"Cotaxtla");
                Municipio m50 = new Municipio(50L,"Coxquihui");
                Municipio m51 = new Municipio(51L,"Coyutla");
                Municipio m52 = new Municipio(52L,"Cuichapa");
                Municipio m53 = new Municipio(53L,"Cuitláhuac");
                Municipio m54 = new Municipio(54L,"Chacaltianguis");
                Municipio m55 = new Municipio(55L,"Chalma");
                Municipio m56 = new Municipio(56L,"Chiconamel");
                Municipio m57 = new Municipio(57L,"Chiconquiaco");
                Municipio m58 = new Municipio(58L,"Chicontepec");
                Municipio m59 = new Municipio(59L,"Chinameca");
                Municipio m60 = new Municipio(60L,"Chinampa de Gorostiza");
                Municipio m61 = new Municipio(61L,"Las Choapas");
                Municipio m62 = new Municipio(62L,"Chocamán");
                Municipio m63 = new Municipio(63L,"Chontla");
                Municipio m64 = new Municipio(64L,"Chumatlán");
                Municipio m65 = new Municipio(65L,"Emiliano Zapata");
                Municipio m66 = new Municipio(66L,"Espinal");
                Municipio m67 = new Municipio(67L,"Filomeno Mata");
                Municipio m68 = new Municipio(68L,"Fortín");
                Municipio m69 = new Municipio(69L,"Gutiérrez Zamora");
                Municipio m70 = new Municipio(70L,"Hidalgotitlán");;
                Municipio m71 = new Municipio(71L,"Huatusco");
                Municipio m72 = new Municipio(72L,"Huayacocotla");
                Municipio m73 = new Municipio(73L,"Hueyapan de Ocampo");
                Municipio m74 = new Municipio(74L,"Huiloapan de Cuauhtémoc");
                Municipio m75 = new Municipio(75L,"Ignacio de la Llave");
                Municipio m76 = new Municipio(76L,"Ilamatlán");
                Municipio m77 = new Municipio(77L,"Isla");
                Municipio m78 = new Municipio(78L,"Ixcatepec");
                Municipio m79 = new Municipio(79L,"Ixhuacán de los Reyes");
                Municipio m80 = new Municipio(80L,"Ixhuatlán del Café");
                Municipio m81 = new Municipio(81L,"Ixhuatlancillo");
                Municipio m82 = new Municipio(82L,"Ixhuatlán del Sureste");
                Municipio m83 = new Municipio(83L,"Ixhuatlán de Madero");
                Municipio m84 = new Municipio(84L,"Ixmatlahuacan");
                Municipio m85 = new Municipio(85L,"Ixtaczoquitlán");
                Municipio m86 = new Municipio(86L,"Jalacingo");
                Municipio m87 = new Municipio(87L,"Xalapa");
                Municipio m88 = new Municipio(88L,"Jalcomulco");
                Municipio m89 = new Municipio(89L,"Jáltipan");
                Municipio m90 = new Municipio(90L,"Jamapa");
                Municipio m91 = new Municipio(91L,"Jesús Carranza");
                Municipio m92 = new Municipio(92L,"Xico");
                Municipio m93 = new Municipio(93L,"Jilotepec");
                Municipio m94 = new Municipio(94L,"Juan Rodríguez Clara");
                Municipio m95 = new Municipio(95L,"Juchique de Ferrer");
                Municipio m96 = new Municipio(96L,"Landero y Coss");
                Municipio m97 = new Municipio(97L,"Lerdo de Tejada");
                Municipio m98 = new Municipio(98L,"Magdalena");
                Municipio m99 = new Municipio(99L,"Maltrata");
                Municipio m100 = new Municipio(100L,"Manlio Fabio Altamirano");
                Municipio m101 = new Municipio(101L,"Mariano Escobedo");
                Municipio m102 = new Municipio(102L,"Martínez de la Torre");
                Municipio m103 = new Municipio(103L,"Mecatlán");
                Municipio m104 = new Municipio(104L,"Mecayapan");
                Municipio m105 = new Municipio(105L,"Medellín de Bravo");
                Municipio m106 = new Municipio(106L,"Miahuatlan");
                Municipio m107 = new Municipio(107L,"Las Minas");
                Municipio m108 = new Municipio(108L,"Minatitlán");
                Municipio m109 = new Municipio(109L,"Misantla");
                Municipio m110 = new Municipio(110L,"Mixtla de Altamirano");
                Municipio m111 = new Municipio(111L,"Moloacán");
                Municipio m112 = new Municipio(112L,"Naolinco");
                Municipio m113 = new Municipio(113L,"Naranjal");
                Municipio m114 = new Municipio(114L,"Nautla");
                Municipio m115 = new Municipio(115L,"Nogales");
                Municipio m116 = new Municipio(116L,"Oluta");
                Municipio m117 = new Municipio(117L,"Omealca");
                Municipio m118 = new Municipio(118L,"Orizaba");
                Municipio m119 = new Municipio(119L,"Otatitlán");
                Municipio m120 = new Municipio(120L,"Oteapan");
                Municipio m121 = new Municipio(121L,"Ozuluama de Mascareñas");
                Municipio m122 = new Municipio(122L,"Pajapan");
                Municipio m123 = new Municipio(123L,"Pánuco");
                Municipio m124 = new Municipio(124L,"Papantla");
                Municipio m125 = new Municipio(125L,"Paso del Macho");
                Municipio m126 = new Municipio(126L,"Paso de Ovejas");
                Municipio m127 = new Municipio(127L,"La Perla");
                Municipio m128 = new Municipio(128L,"Perote");
                Municipio m129 = new Municipio(129L,"Platón Sánchez");
                Municipio m130 = new Municipio(130L,"Playa Vicente");
                Municipio m131 = new Municipio(131L,"Poza Rica de Hidalgo");
                Municipio m132 = new Municipio(132L,"Las Vigas de Ramírez");
                Municipio m133 = new Municipio(133L,"Pueblo Viejo");
                Municipio m134 = new Municipio(134L,"Puente Nacional");
                Municipio m135 = new Municipio(135L,"Rafael Delgado");
                Municipio m136 = new Municipio(136L,"Rafael Lucio");
                Municipio m137 = new Municipio(137L,"Los Reyes");
                Municipio m138 = new Municipio(138L,"Río Blanco");
                Municipio m139 = new Municipio(139L,"Saltabarranca");
                Municipio m140 = new Municipio(140L,"San Andrés Tenejapan");
                Municipio m141 = new Municipio(141L,"San Andrés Tuxtla");
                Municipio m142 = new Municipio(142L,"San Juan Evangelista");
                Municipio m143 = new Municipio(143L,"Santiago Tuxtla");
                Municipio m144 = new Municipio(144L,"Sayula de Alemán");
                Municipio m145 = new Municipio(145L,"Soconusco");
                Municipio m146 = new Municipio(146L,"Sochiapan");
                Municipio m147 = new Municipio(147L,"Soledad Atzompa");
                Municipio m148 = new Municipio(148L,"Soledad de Doblado");
                Municipio m149 = new Municipio(149L,"Soteapan");
                Municipio m150 = new Municipio(150L,"Tamalín");
                Municipio m151 = new Municipio(151L,"Tamiahua");
                Municipio m152 = new Municipio(152L,"Tampico Alto");
                Municipio m153 = new Municipio(153L,"Tancoco");
                Municipio m154 = new Municipio(154L,"Tantima");
                Municipio m155 = new Municipio(155L,"Tantoyuca");
                Municipio m156 = new Municipio(156L,"Tatatila");
                Municipio m157= new Municipio(157L,"Castillo de Teayo");
                Municipio m158 = new Municipio(158L,"Tecolutla");
                Municipio m159 = new Municipio(159L,"Tehuipango");
                Municipio m160 = new Municipio(160L,"Álamo Tempache");
                Municipio m161 = new Municipio(161L,"Tempoal");
                Municipio m162 = new Municipio(162L,"Tenampa");
                Municipio m163 = new Municipio(163L,"Tenochtitlán");
                Municipio m164 = new Municipio(164L,"Teocelo");
                Municipio m165 = new Municipio(165L,"Tepatlaxco");
                Municipio m166 = new Municipio(166L,"Tepetlán");
                Municipio m167 = new Municipio(167L,"Tepetzintla");
                Municipio m168 = new Municipio(168L,"Tequila");
                Municipio m169 = new Municipio(169L,"José Azueta");
                Municipio m170 = new Municipio(170L,"Texcatepec");
                Municipio m171 = new Municipio(171L,"Texhuacán");
                Municipio m172 = new Municipio(172L,"Texistepec");
                Municipio m173 = new Municipio(173L,"Tezonapa");
                Municipio m174 = new Municipio(174L,"Tierra Blanca");
                Municipio m175 = new Municipio(175L,"Tihuatlán");
                Municipio m176 = new Municipio(176L,"Tlacojalpan");
                Municipio m177 = new Municipio(177L,"Tlacolulan");
                Municipio m178 = new Municipio(178L,"Tlacotalpan");
                Municipio m179 = new Municipio(179L,"Tlacoltepec de Mejía");
                Municipio m180 = new Municipio(180L,"Tlachichilco");
                Municipio m181 = new Municipio(181L,"Tlalixcoyan");
                Municipio m182 = new Municipio(182L,"Tlalnelhuayocan");
                Municipio m183 = new Municipio(183L,"Tlapacoyan");
                Municipio m184 = new Municipio(184L,"Tlaquilpa");
                Municipio m185 = new Municipio(185L,"Tlilapan");
                Municipio m186 = new Municipio(186L,"Tomatlán");
                Municipio m187 = new Municipio(187L,"Tonayán");
                Municipio m188 = new Municipio(188L,"Totutla");
                Municipio m189 = new Municipio(189L,"Tuxpan");
                Municipio m190 = new Municipio(190L,"Tuxtilla");
                Municipio m191 = new Municipio(191L,"Ursulo Galván");
                Municipio m192 = new Municipio(192L,"Vega de Alatorre");
                Municipio m193 = new Municipio(193L,"Veracruz");
                Municipio m194 = new Municipio(194L,"Villa Aldama");
                Municipio m195 = new Municipio(195L,"Xoxocotla");
                Municipio m196 = new Municipio(196L,"Yanga");
                Municipio m197 = new Municipio(197L,"Yecuatla");
                Municipio m198 = new Municipio(198L,"Zacualpan");
                Municipio m199 = new Municipio(199L,"Zaragoza");
                Municipio m200 = new Municipio(200L,"Zentla");
                Municipio m201 = new Municipio(201L,"Zongolica");
                Municipio m202 = new Municipio(202L,"Zontecomatlán de López y Fuentes");
                Municipio m203 = new Municipio(203L,"Zozocolco de Hidalgo");
                Municipio m204 = new Municipio(204L,"Agua Dulce");
                Municipio m205 = new Municipio(205L,"El Higo");
                Municipio m206 = new Municipio(206L,"Nanchital de Lázaro Cárdenas del Río");
                Municipio m207 = new Municipio(207L,"Tres Valles");
                Municipio m208 = new Municipio(208L,"Carlos A. Carrillo");
                Municipio m209 = new Municipio(209L,"Tatahuicapan de Juárez");
                Municipio m210 = new Municipio(210L,"Uxpanapa");
                Municipio m211 = new Municipio(211L,"San Rafael");
                Municipio m212 = new Municipio(212L,"Santiago Sochiapan");


                repMun.saveAll(
                        List.of(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,m31,m32,m33,m34,m35,m36,m37,m38,m39,m40,m41,m42,m43,m44,m45,m46,m47,m48,m49,m50,
                                m51,m52,m53,m54,m55,m56,m57,m58,m59,m60,m61,m62,m63,m64,m65,m66,m67,m68,m69,m70,m71,m72,m73,m74,m75,m76,m77,m78,m79,m80,m81,m82,m83,m84,m85,m86,m87,m88,m89,m90,m91,m92,m93,m94,m95,m96,m97,m98,m99,m100,
                                m101,m102,m103,m104,m105,m106,m107,m108,m109,m110,m111,m112,m113,m114,m115,m116,m117,m118,m119,m120,m121,m122,m123,m124,m125,m126,m127,m128,m129,m130,m131,m132,m133,m134,m135,m136,m137,m138,m139,m140,m141,m142,m143,m144,m145,m146,m147,m148,m149,m150,
                                m151,m152,m153,m154,m155,m156,m157,m158,m159,m160,m161,m162,m163,m164,m165,m166,m167,m168,m169,m170,m171,m172,m173,m174,m175,m176,m177,m178,m179,m180,m181,m182,m183,m184,m185,m186,m187,m188,m189,m190,m191,m192,m193,m194,m195,m196,m197,m198,m199,m200,
                                m201,m202,m203,m204,m205,m206,m207,m208,m209,m210,m211,m212)
                );
            };
        }
        System.out.println("Municipios: " + repMun.count());
        return null;
    }

}
