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

public class Config {
    private String onos_links_url;
    private String onos_devices_url;
    private String onos_hosts_url;
    private String onos_flows_url;
    private String controllerName;
    private String controllerIp;
    private String grpcPort;


    public Config() {

    }

    public String getGrpcPort() {
        return grpcPort;
    }

    public String getControllerIp() {
        return controllerIp;
    }

    public void setGrpcPort(String grpcPort) {
        this.grpcPort = grpcPort;
    }

    public void setControllerIp(String controllerIp) {
        this.controllerIp = controllerIp;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getControllerName() {
        return controllerName;
    }

    public String getOnos_flows_url() {
        return onos_flows_url;
    }

    public void setOnos_flows_url(String onos_flows_url) {
        this.onos_flows_url = onos_flows_url;
    }

    public String getOnos_devices_url() {
        return onos_devices_url;
    }

    public String getOnos_hosts_url() {
        return onos_hosts_url;
    }

    public String getOnos_links_url() {
        return onos_links_url;
    }

    public void setOnos_devices_url(String onos_devices_url) {
        this.onos_devices_url = onos_devices_url;
    }

    public void setOnos_hosts_url(String onos_hosts_url) {
        this.onos_hosts_url = onos_hosts_url;
    }

    public void setOnos_links_url(String onos_links_url) {
        this.onos_links_url = onos_links_url;
    }
}
