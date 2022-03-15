// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDBProxyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDBProxyArgs Empty = new GetDBProxyArgs();

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyName", required=true)
      private final String dBProxyName;

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    public GetDBProxyArgs(String dBProxyName) {
        this.dBProxyName = Objects.requireNonNull(dBProxyName, "expected parameter 'dBProxyName' to be non-null");
    }

    private GetDBProxyArgs() {
        this.dBProxyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDBProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dBProxyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDBProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dBProxyName = defaults.dBProxyName;
        }

        public Builder dBProxyName(String dBProxyName) {
            this.dBProxyName = Objects.requireNonNull(dBProxyName);
            return this;
        }
        public GetDBProxyArgs build() {
            return new GetDBProxyArgs(dBProxyName);
        }
    }
}
