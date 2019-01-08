/*
 * Copyright ${2018} [Adib Rastegarnia, Rajas H.Karandikar, Douglas Comer]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package config;


import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Configuration service.
 */
public class ConfigService {

    protected Config config;


    public ConfigService() {

        config = new Config();
        readConfigFile();


    }



    public Config getConfig() {
        return this.config;
    }




    public void readConfigFile() {
        Properties prop = new Properties();
        InputStream input = null;


        try {

      input =
          new FileInputStream(
              "/app/org_dnosproject_dnos_apps/resources/config.properties");

            // load a properties file
            prop.load(input);

            config.setOnos_devices_url(prop.getProperty("ONOS_DEVICES_URL"));
            config.setOnos_hosts_url(prop.getProperty("ONOS_HOSTS_URL"));
            config.setOnos_links_url(prop.getProperty("ONOS_LINKS_URL"));
            config.setOnos_flows_url(prop.getProperty("ONOS_FLOWS_URL"));
            config.setControllerName(prop.getProperty("CONTROLLER"));
            config.setControllerIp(prop.getProperty("CONTROLLER_IP"));
            config.setGrpcPort(prop.getProperty("GRPC_PORT"));








        } catch (IOException ex) {

            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void init()

    {

    PropertyConfigurator.configure(
        "/app/org_dnosproject_dnos_apps/resources/log4j.properties");
    }



}
