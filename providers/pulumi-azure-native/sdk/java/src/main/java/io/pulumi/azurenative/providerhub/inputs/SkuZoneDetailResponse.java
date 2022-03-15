// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.SkuCapabilityResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SkuZoneDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuZoneDetailResponse Empty = new SkuZoneDetailResponse();

    @Import(name="capabilities")
      private final @Nullable List<SkuCapabilityResponse> capabilities;

    public List<SkuCapabilityResponse> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }

    @Import(name="name")
      private final @Nullable List<String> name;

    public List<String> getName() {
        return this.name == null ? List.of() : this.name;
    }

    public SkuZoneDetailResponse(
        @Nullable List<SkuCapabilityResponse> capabilities,
        @Nullable List<String> name) {
        this.capabilities = capabilities;
        this.name = name;
    }

    private SkuZoneDetailResponse() {
        this.capabilities = List.of();
        this.name = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuZoneDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SkuCapabilityResponse> capabilities;
        private @Nullable List<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuZoneDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.name = defaults.name;
        }

        public Builder capabilities(@Nullable List<SkuCapabilityResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder name(@Nullable List<String> name) {
            this.name = name;
            return this;
        }
        public SkuZoneDetailResponse build() {
            return new SkuZoneDetailResponse(capabilities, name);
        }
    }
}
