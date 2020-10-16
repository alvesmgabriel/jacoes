/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import core.Acao;
import data.ProcessaCsv;

/**
 *
 * @author gabriel
 */
// /home/gabriel/Documentos/010-ifsp/00-aula/bcc-lpo3/ativos
public class TesteAcoes {
    public static void main(String[] args) {
        ProcessaCsv csv = new ProcessaCsv("/home/gabriel/Downloads/PETR4.SA.csv");
        Acao petrobras = new Acao("PETR4");
        petrobras.addSerieCandles(csv.gerarSerieCandles());
        System.out.println(petrobras.toString());
    }
}
