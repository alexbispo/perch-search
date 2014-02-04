package br.com.artes.lexbispo.perchsearch.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.jsonp.client.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PerchSearch implements EntryPoint {
  
  final TextBox queryField = new TextBox();
  final VerticalPanel resultsPanel = new VerticalPanel();
  
  public void onModuleLoad() {
	VerticalPanel panel = new VerticalPanel();
	queryField.setText("puppy");
	panel.add(queryField);
	final Button searchButton = new Button("Search Twitter");
	panel.add(searchButton);
	final Label errorLabel = new Label();
	panel.add(errorLabel);
	panel.add(resultsPanel);
	RootPanel.get().add(panel);
	searchButton.addClickHandler(new TwitterHandler());
  }
  
   class TwitterHandler implements ClickHandler {
	
		public void onClick(ClickEvent e) {
			
			resultsPanel.clear();
			Label label = new Label("Não foi possível conectar com o Twitter.");
			resultsPanel.add(label);
		
			// String url = "http://search.twitter.com/search.json?q=" + queryField.getText();
			// JsonpRequestBuilder jsonp = new JsonpRequestBuilder();
			// jsonp.requestObject(url, new AsyncCallback<JavaScriptObject>() {
				// public void onFailure(Throwable throwable){
					// System.out.println("Error: " + throwable);
				// }
				
				// public void onSuccess(JavaScriptObject o){
					
				// }
			// });
		}
	}
}
