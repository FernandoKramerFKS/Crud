package com.kramer.crud.utilidade;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.kramer.crud.entidade.Endereco;

public class ViaCep {

public static Endereco buscarCep(String ceep) {
		
		String cep = ceep.replace("-", "").replace(".", "");

		Endereco end = new Endereco();

		String json;

		try {

			URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			StringBuilder jsonSb = new StringBuilder();

			br.lines().forEach(l -> jsonSb.append(l.trim()));

			json = jsonSb.toString();

			Map<String, String> mapa = new HashMap<>();
			Matcher matcher = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(json);
			while (matcher.find()) {
				String[] group = matcher.group().split(":");
				mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
			}

			end.setPais("Brasil");
			end.setIso("BRA");
			end.setEstado(retornaEstado(mapa.get("uf")));
			end.setUf(mapa.get("uf"));
			end.setCidade(mapa.get("localidade"));
			end.setBairro(mapa.get("bairro"));
			end.setRua(mapa.get("logradouro"));
			end.setCep(mapa.get("cep"));

		} catch (Exception e) {
			
		}

		return end;

	}

	private static String retornaEstado(String uf) {

		String estado;

		switch (uf) {
		case "AC":
			estado = "Acre";
			break;
		case "AL":
			estado = "Alagoas";
			break;
		case "AP":
			estado = "Amapá";
			break;
		case "AM":
			estado = "Amazonas";
			break;
		case "BA":
			estado = "Bahia";
			break;
		case "CE":
			estado = "Ceará";
			break;
		case "DF":
			estado = "Distrito Federal";
			break;
		case "ES":
			estado = "Espírito Santo";
			break;
		case "GO":
			estado = "Goiás";
			break;
		case "MA":
			estado = "Maranhão";
			break;
		case "MT":
			estado = "Mato Grosso";
			break;
		case "MS":
			estado = "Mato Grosso Do Sul";
			break;
		case "MG":
			estado = "Minas Gerais";
			break;
		case "PA":
			estado = "Pará";
			break;
		case "PB":
			estado = "Paraíba";
			break;
		case "PR":
			estado = "Paraná";
			break;
		case "PE":
			estado = "Peernambuco";
			break;
		case "PI":
			estado = "Piauí";
			break;
		case "RJ":
			estado = "Rio De Janeiro";
			break;
		case "RN":
			estado = "Rio Grande Do Norte";
			break;
		case "RS":
			estado = "Rio Grande Do Sul";
			break;
		case "RO":
			estado = "Rondônia";
			break;
		case "RR":
			estado = "Roraima";
			break;
		case "SC":
			estado = "Santa Catarina";
			break;
		case "SP":
			estado = "São Paulo";
			break;
		case "SE":
			estado = "Sergipe";
			break;
		case "TO":
			estado = "Tocantins";
			break;
		default:
			estado = "Estado não encontrado";
			break;
		}

		return estado;

	}
}
