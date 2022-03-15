// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.DnsKeySpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ManagedZoneDnsSecConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZoneDnsSecConfigResponse Empty = new ManagedZoneDnsSecConfigResponse();

    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
     * 
     */
    @Import(name="defaultKeySpecs", required=true)
      private final List<DnsKeySpecResponse> defaultKeySpecs;

    public List<DnsKeySpecResponse> getDefaultKeySpecs() {
        return this.defaultKeySpecs;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    @Import(name="nonExistence", required=true)
      private final String nonExistence;

    public String getNonExistence() {
        return this.nonExistence;
    }

    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public ManagedZoneDnsSecConfigResponse(
        List<DnsKeySpecResponse> defaultKeySpecs,
        String kind,
        String nonExistence,
        String state) {
        this.defaultKeySpecs = Objects.requireNonNull(defaultKeySpecs, "expected parameter 'defaultKeySpecs' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.nonExistence = Objects.requireNonNull(nonExistence, "expected parameter 'nonExistence' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private ManagedZoneDnsSecConfigResponse() {
        this.defaultKeySpecs = List.of();
        this.kind = null;
        this.nonExistence = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnsSecConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DnsKeySpecResponse> defaultKeySpecs;
        private String kind;
        private String nonExistence;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnsSecConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKeySpecs = defaults.defaultKeySpecs;
    	      this.kind = defaults.kind;
    	      this.nonExistence = defaults.nonExistence;
    	      this.state = defaults.state;
        }

        public Builder defaultKeySpecs(List<DnsKeySpecResponse> defaultKeySpecs) {
            this.defaultKeySpecs = Objects.requireNonNull(defaultKeySpecs);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder nonExistence(String nonExistence) {
            this.nonExistence = Objects.requireNonNull(nonExistence);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public ManagedZoneDnsSecConfigResponse build() {
            return new ManagedZoneDnsSecConfigResponse(defaultKeySpecs, kind, nonExistence, state);
        }
    }
}
