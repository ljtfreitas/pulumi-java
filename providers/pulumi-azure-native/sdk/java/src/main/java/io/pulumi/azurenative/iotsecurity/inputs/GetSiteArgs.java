// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSiteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSiteArgs Empty = new GetSiteArgs();

    /**
     * Scope of the query (IoT Hub, /providers/Microsoft.Devices/iotHubs/myHub)
     * 
     */
    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetSiteArgs(String scope) {
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetSiteArgs() {
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public GetSiteArgs build() {
            return new GetSiteArgs(scope);
        }
    }
}
