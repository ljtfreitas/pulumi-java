// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZoneReverseLookupConfigResponse {
    private final String kind;

    @OutputCustomType.Constructor({"kind"})
    private ManagedZoneReverseLookupConfigResponse(String kind) {
        this.kind = Objects.requireNonNull(kind);
    }

    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneReverseLookupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneReverseLookupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public ManagedZoneReverseLookupConfigResponse build() {
            return new ManagedZoneReverseLookupConfigResponse(kind);
        }
    }
}
