// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZonePrivateVisibilityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigArgs Empty = new ManagedZonePrivateVisibilityConfigArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The list of VPC networks that can see this zone.
     * 
     */
    @Import(name="networks")
      private final @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

    public Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> getNetworks() {
        return this.networks == null ? Output.empty() : this.networks;
    }

    public ManagedZonePrivateVisibilityConfigArgs(
        @Nullable Output<String> kind,
        @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
        this.kind = kind;
        this.networks = networks;
    }

    private ManagedZonePrivateVisibilityConfigArgs() {
        this.kind = Output.empty();
        this.networks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder networks(@Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
            this.networks = networks;
            return this;
        }

        public Builder networks(@Nullable List<ManagedZonePrivateVisibilityConfigNetworkArgs> networks) {
            this.networks = Output.ofNullable(networks);
            return this;
        }
        public ManagedZonePrivateVisibilityConfigArgs build() {
            return new ManagedZonePrivateVisibilityConfigArgs(kind, networks);
        }
    }
}
