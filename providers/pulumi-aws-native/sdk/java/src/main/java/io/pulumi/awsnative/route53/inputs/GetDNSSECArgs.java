// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDNSSECArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDNSSECArgs Empty = new GetDNSSECArgs();

    /**
     * The unique string (ID) used to identify a hosted zone.
     * 
     */
    @InputImport(name="hostedZoneId", required=true)
        private final String hostedZoneId;

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    public GetDNSSECArgs(String hostedZoneId) {
        this.hostedZoneId = Objects.requireNonNull(hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
    }

    private GetDNSSECArgs() {
        this.hostedZoneId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDNSSECArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostedZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDNSSECArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
        }

        public Builder setHostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        public GetDNSSECArgs build() {
            return new GetDNSSECArgs(hostedZoneId);
        }
    }
}
