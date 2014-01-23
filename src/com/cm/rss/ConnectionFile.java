package com.cm.rss;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionFile {
	//build functionality to connect to a website and pull data back and test for internet connection


			static Boolean _conn = false; //always assume there's no connection
			static String _connectionType = "Unavailable"; //unavailable by default
			
			public static String getConnnectionType(Context context){ //runs function
				netInfo(context);
				return _connectionType;
			}
			
			public static Boolean getConnectionStatus(Context context){ //returns boolean
				netInfo(context);
				return _conn; //returns connection status
			}
			
			//test Internet connection on android device
			private static void netInfo(Context context){
				//creating 2 values representing if connected and what type of connection
				ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo netInfos = cm.getActiveNetworkInfo();//gets dynamic network info.
				if(netInfos != null){
					if(netInfos.isConnected()){
						_connectionType = netInfos.getTypeName();//if there's a connection and what type it is
						_conn = true;//actually do have a connection
				}
			
			}
		}	
			
		}