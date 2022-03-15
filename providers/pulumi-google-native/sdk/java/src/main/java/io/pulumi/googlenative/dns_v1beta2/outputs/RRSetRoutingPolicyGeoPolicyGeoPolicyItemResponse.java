// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse {
    private final String kind;
    /**
     * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
     * 
     */
    private final String location;
    private final List<String> rrdatas;
    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    private final List<String> signatureRrdatas;

    @CustomType.Constructor
    private RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("rrdatas") List<String> rrdatas,
        @CustomType.Parameter("signatureRrdatas") List<String> signatureRrdatas) {
        this.kind = kind;
        this.location = location;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    public List<String> getRrdatas() {
        return this.rrdatas;
    }
    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
    */
    public List<String> getSignatureRrdatas() {
        return this.signatureRrdatas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String location;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder rrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }

        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }
        public RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse build() {
            return new RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse(kind, location, rrdatas, signatureRrdatas);
        }
    }
}
