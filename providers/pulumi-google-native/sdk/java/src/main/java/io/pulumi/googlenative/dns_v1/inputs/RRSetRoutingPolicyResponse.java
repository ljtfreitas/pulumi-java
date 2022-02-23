// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyGeoPolicyResponse;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyWrrPolicyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A RRSetRoutingPolicy represents ResourceRecordSet data that is returned dynamically with the response varying based on configured properties such as geolocation or by weighted random selection.
 * 
 */
public final class RRSetRoutingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyResponse Empty = new RRSetRoutingPolicyResponse();

    @InputImport(name="geo", required=true)
      private final RRSetRoutingPolicyGeoPolicyResponse geo;

    public RRSetRoutingPolicyGeoPolicyResponse getGeo() {
        return this.geo;
    }

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="wrr", required=true)
      private final RRSetRoutingPolicyWrrPolicyResponse wrr;

    public RRSetRoutingPolicyWrrPolicyResponse getWrr() {
        return this.wrr;
    }

    public RRSetRoutingPolicyResponse(
        RRSetRoutingPolicyGeoPolicyResponse geo,
        String kind,
        RRSetRoutingPolicyWrrPolicyResponse wrr) {
        this.geo = Objects.requireNonNull(geo, "expected parameter 'geo' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.wrr = Objects.requireNonNull(wrr, "expected parameter 'wrr' to be non-null");
    }

    private RRSetRoutingPolicyResponse() {
        this.geo = null;
        this.kind = null;
        this.wrr = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyGeoPolicyResponse geo;
        private String kind;
        private RRSetRoutingPolicyWrrPolicyResponse wrr;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geo = defaults.geo;
    	      this.kind = defaults.kind;
    	      this.wrr = defaults.wrr;
        }

        public Builder setGeo(RRSetRoutingPolicyGeoPolicyResponse geo) {
            this.geo = Objects.requireNonNull(geo);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setWrr(RRSetRoutingPolicyWrrPolicyResponse wrr) {
            this.wrr = Objects.requireNonNull(wrr);
            return this;
        }
        public RRSetRoutingPolicyResponse build() {
            return new RRSetRoutingPolicyResponse(geo, kind, wrr);
        }
    }
}
