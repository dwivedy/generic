package com.example.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GetArticle {

	public ArrayList getArticles() {
		ArrayList allArticles = null;
		try {

			InputStream input = new URL(
					"http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=ae52c8fb987d44ada7f842ad13b11150")
							.openStream();

			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> jsonMap = mapper.readValue(input, Map.class);

			// check for status code
			if (jsonMap.get("status").equals("OK")) {

				allArticles = (ArrayList) jsonMap.get("results");

			}

		} catch (MalformedURLException e) {
			return allArticles;
		} catch (IOException e) {
			return allArticles;
		}

		return allArticles;

	}

}// class
