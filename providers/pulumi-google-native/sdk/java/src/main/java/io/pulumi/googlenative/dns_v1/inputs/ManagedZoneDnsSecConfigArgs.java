// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.enums.ManagedZoneDnsSecConfigNonExistence;
import io.pulumi.googlenative.dns_v1.enums.ManagedZoneDnsSecConfigState;
import io.pulumi.googlenative.dns_v1.inputs.DnsKeySpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneDnsSecConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneDnsSecConfigArgs Empty = new ManagedZoneDnsSecConfigArgs();

    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
     * 
     */
    @InputImport(name="defaultKeySpecs")
      private final @Nullable Input<List<DnsKeySpecArgs>> defaultKeySpecs;

    public Input<List<DnsKeySpecArgs>> getDefaultKeySpecs() {
        return this.defaultKeySpecs == null ? Input.empty() : this.defaultKeySpecs;
    }

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    @InputImport(name="nonExistence")
      private final @Nullable Input<ManagedZoneDnsSecConfigNonExistence> nonExistence;

    public Input<ManagedZoneDnsSecConfigNonExistence> getNonExistence() {
        return this.nonExistence == null ? Input.empty() : this.nonExistence;
    }

    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<ManagedZoneDnsSecConfigState> state;

    public Input<ManagedZoneDnsSecConfigState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public ManagedZoneDnsSecConfigArgs(
        @Nullable Input<List<DnsKeySpecArgs>> defaultKeySpecs,
        @Nullable Input<String> kind,
        @Nullable Input<ManagedZoneDnsSecConfigNonExistence> nonExistence,
        @Nullable Input<ManagedZoneDnsSecConfigState> state) {
        this.defaultKeySpecs = defaultKeySpecs;
        this.kind = kind;
        this.nonExistence = nonExistence;
        this.state = state;
    }

    private ManagedZoneDnsSecConfigArgs() {
        this.defaultKeySpecs = Input.empty();
        this.kind = Input.empty();
        this.nonExistence = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnsSecConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DnsKeySpecArgs>> defaultKeySpecs;
        private @Nullable Input<String> kind;
        private @Nullable Input<ManagedZoneDnsSecConfigNonExistence> nonExistence;
        private @Nullable Input<ManagedZoneDnsSecConfigState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnsSecConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKeySpecs = defaults.defaultKeySpecs;
    	      this.kind = defaults.kind;
    	      this.nonExistence = defaults.nonExistence;
    	      this.state = defaults.state;
        }

        public Builder setDefaultKeySpecs(@Nullable Input<List<DnsKeySpecArgs>> defaultKeySpecs) {
            this.defaultKeySpecs = defaultKeySpecs;
            return this;
        }

        public Builder setDefaultKeySpecs(@Nullable List<DnsKeySpecArgs> defaultKeySpecs) {
            this.defaultKeySpecs = Input.ofNullable(defaultKeySpecs);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setNonExistence(@Nullable Input<ManagedZoneDnsSecConfigNonExistence> nonExistence) {
            this.nonExistence = nonExistence;
            return this;
        }

        public Builder setNonExistence(@Nullable ManagedZoneDnsSecConfigNonExistence nonExistence) {
            this.nonExistence = Input.ofNullable(nonExistence);
            return this;
        }

        public Builder setState(@Nullable Input<ManagedZoneDnsSecConfigState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable ManagedZoneDnsSecConfigState state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public ManagedZoneDnsSecConfigArgs build() {
            return new ManagedZoneDnsSecConfigArgs(defaultKeySpecs, kind, nonExistence, state);
        }
    }
}
