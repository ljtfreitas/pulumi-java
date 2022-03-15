// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebServerConfigResponse {
    /**
     * Optional. Machine type on which Airflow web server is running. It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified, composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web server parameters were manually changed to a non-standard values.
     * 
     */
    private final String machineType;

    @CustomType.Constructor
    private WebServerConfigResponse(@CustomType.Parameter("machineType") String machineType) {
        this.machineType = machineType;
    }

    /**
     * Optional. Machine type on which Airflow web server is running. It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified, composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web server parameters were manually changed to a non-standard values.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public WebServerConfigResponse build() {
            return new WebServerConfigResponse(machineType);
        }
    }
}
