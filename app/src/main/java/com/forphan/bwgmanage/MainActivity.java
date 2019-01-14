package com.forphan.bwgmanage;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;
import android.os.Message;

import com.forphan.bwgmanage.bwg.CommandResult;
import com.forphan.bwgmanage.bwg.ServerInfo;
import com.google.gson.Gson;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String url_tail = "veid=653418&api_key=private_3uenjkbQ14xnGIMINCKAc63u";
    String url_head = "https://api.64clouds.com/v1/";
    String selections[] = {"getServiceInfo?","basicShell/exec?command=","restart"};
    String command = "echo hello";
    String path;
    int flag = 0;

    TextView text_info;
    EditText edit_command;


    @SuppressLint("HandlerLeak")
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                String string = (String) message.obj;
                Log.i("iiiiiii",string);
                ServerInfo bean = new Gson().fromJson(string,ServerInfo.class);
                String hostname = bean.getHostname();
                String location = bean.getNode_location();
                String os = bean.getOs();List<String> ip = bean.getIp_addresses();
                String email = bean.getEmail();
                String info = "Hostname:" + hostname + "\nIP_address:" + ip.get(0) + "\nLocation:" + location + "\nOperatingSystem:" + os + "\nEmail_address:" + email;text_info.setText(info);
            } else if (message.what == 1) {
                String string = (String) message.obj;
                CommandResult bean = new Gson().fromJson(string,CommandResult.class);
                String result = command + "\n\n" + bean.getError() + "\n\n" + bean.getMessage();
                text_info.setText(result);
        }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_select_basic = findViewById(R.id.bt_basic);
        Button button_select_runing = findViewById(R.id.bt_command);
        text_info = findViewById(R.id.tv_show_info);
        edit_command = findViewById(R.id.et_command);

        //init path
        path = url_head + selections[0] + url_tail;

        button_select_runing.setOnClickListener(new MyListener());
        button_select_basic.setOnClickListener(new MyListener());
    }

    class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            if(view.getId() == R.id.bt_basic){
                path = url_head + selections[0] + url_tail;
                Log.i("ppppppp",path);
                text_info.setText("loading");
                //开启子线程,获取传输数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String string = HttpUtils.getJson(path);
                        Message message = new Message();
                        message.what = 0;
                        message.obj = string;
                        handler.sendMessage(message);
                    }
                }).start();
            } else if(view.getId() == R.id.bt_command){
                String str = edit_command.getText().toString();
                if (str.equals("")) {
                    command = "echo hello";
                } else {
                    command = str;
                }
                Log.i("cccc", "onClick: " + command + str);
                path = url_head + selections[1] + command+ "&" + url_tail;
                Log.i("pppp", "onClick: " + path);
                text_info.setText("loading");
                //开启子线程,获取传输数据
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String string = HttpUtils.getJson(path);
                        Message message = new Message();
                        message.what = 1;
                        message.obj = string;
                        handler.sendMessage(message);
                    }
                }).start();
            }
        }
    }
}
