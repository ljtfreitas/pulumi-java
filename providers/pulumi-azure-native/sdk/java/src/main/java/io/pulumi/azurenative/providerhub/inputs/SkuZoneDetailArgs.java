// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.SkuCapabilityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkuZoneDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuZoneDetailArgs Empty = new SkuZoneDetailArgs();

    @Import(name="capabilities")
      private final @Nullable Output<List<SkuCapabilityArgs>> capabilities;

    public Output<List<SkuCapabilityArgs>> getCapabilities() {
        return this.capabilities == null ? Output.empty() : this.capabilities;
    }

    @Import(name="name")
      private final @Nullable Output<List<String>> name;

    public Output<List<String>> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SkuZoneDetailArgs(
        @Nullable Output<List<SkuCapabilityArgs>> capabilities,
        @Nullable Output<List<String>> name) {
        this.capabilities = capabilities;
        this.name = name;
    }

    private SkuZoneDetailArgs() {
        this.capabilities = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuZoneDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SkuCapabilityArgs>> capabilities;
        private @Nullable Output<List<String>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuZoneDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.name = defaults.name;
        }

        public Builder capabilities(@Nullable Output<List<SkuCapabilityArgs>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(@Nullable List<SkuCapabilityArgs> capabilities) {
            this.capabilities = Output.ofNullable(capabilities);
            return this;
        }

        public Builder name(@Nullable Output<List<String>> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable List<String> name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public SkuZoneDetailArgs build() {
            return new SkuZoneDetailArgs(capabilities, name);
        }
    }
}
