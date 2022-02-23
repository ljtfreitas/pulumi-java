// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDBProxyEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDBProxyEndpointArgs Empty = new GetDBProxyEndpointArgs();

    /**
     * The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
     * 
     */
    @InputImport(name="dBProxyEndpointName", required=true)
        private final String dBProxyEndpointName;

    public String getDBProxyEndpointName() {
        return this.dBProxyEndpointName;
    }

    public GetDBProxyEndpointArgs(String dBProxyEndpointName) {
        this.dBProxyEndpointName = Objects.requireNonNull(dBProxyEndpointName, "expected parameter 'dBProxyEndpointName' to be non-null");
    }

    private GetDBProxyEndpointArgs() {
        this.dBProxyEndpointName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDBProxyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dBProxyEndpointName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDBProxyEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dBProxyEndpointName = defaults.dBProxyEndpointName;
        }

        public Builder setDBProxyEndpointName(String dBProxyEndpointName) {
            this.dBProxyEndpointName = Objects.requireNonNull(dBProxyEndpointName);
            return this;
        }
        public GetDBProxyEndpointArgs build() {
            return new GetDBProxyEndpointArgs(dBProxyEndpointName);
        }
    }
}
