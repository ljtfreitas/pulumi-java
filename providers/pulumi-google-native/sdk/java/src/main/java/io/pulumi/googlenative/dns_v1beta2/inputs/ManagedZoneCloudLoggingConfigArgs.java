// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Logging configurations for publicly visible zones.
 * 
 */
public final class ManagedZoneCloudLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneCloudLoggingConfigArgs Empty = new ManagedZoneCloudLoggingConfigArgs();

    /**
     * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    @InputImport(name="enableLogging")
      private final @Nullable Input<Boolean> enableLogging;

    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public ManagedZoneCloudLoggingConfigArgs(
        @Nullable Input<Boolean> enableLogging,
        @Nullable Input<String> kind) {
        this.enableLogging = enableLogging;
        this.kind = kind;
    }

    private ManagedZoneCloudLoggingConfigArgs() {
        this.enableLogging = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneCloudLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableLogging;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneCloudLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
        }

        public Builder setEnableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder setEnableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
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
        public ManagedZoneCloudLoggingConfigArgs build() {
            return new ManagedZoneCloudLoggingConfigArgs(enableLogging, kind);
        }
    }
}
