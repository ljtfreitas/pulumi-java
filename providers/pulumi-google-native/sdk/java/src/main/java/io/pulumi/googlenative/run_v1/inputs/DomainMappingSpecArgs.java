// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.enums.DomainMappingSpecCertificateMode;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The desired state of the Domain Mapping.
 * 
 */
public final class DomainMappingSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingSpecArgs Empty = new DomainMappingSpecArgs();

    /**
     * The mode of the certificate.
     * 
     */
    @Import(name="certificateMode")
      private final @Nullable Output<DomainMappingSpecCertificateMode> certificateMode;

    public Output<DomainMappingSpecCertificateMode> getCertificateMode() {
        return this.certificateMode == null ? Output.empty() : this.certificateMode;
    }

    /**
     * If set, the mapping will override any mapping set before this spec was set. It is recommended that the user leaves this empty to receive an error warning about a potential conflict and only set it once the respective UI has given such a warning.
     * 
     */
    @Import(name="forceOverride")
      private final @Nullable Output<Boolean> forceOverride;

    public Output<Boolean> getForceOverride() {
        return this.forceOverride == null ? Output.empty() : this.forceOverride;
    }

    /**
     * The name of the Knative Route that this DomainMapping applies to. The route must exist.
     * 
     */
    @Import(name="routeName")
      private final @Nullable Output<String> routeName;

    public Output<String> getRouteName() {
        return this.routeName == null ? Output.empty() : this.routeName;
    }

    public DomainMappingSpecArgs(
        @Nullable Output<DomainMappingSpecCertificateMode> certificateMode,
        @Nullable Output<Boolean> forceOverride,
        @Nullable Output<String> routeName) {
        this.certificateMode = certificateMode;
        this.forceOverride = forceOverride;
        this.routeName = routeName;
    }

    private DomainMappingSpecArgs() {
        this.certificateMode = Output.empty();
        this.forceOverride = Output.empty();
        this.routeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainMappingSpecCertificateMode> certificateMode;
        private @Nullable Output<Boolean> forceOverride;
        private @Nullable Output<String> routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.forceOverride = defaults.forceOverride;
    	      this.routeName = defaults.routeName;
        }

        public Builder certificateMode(@Nullable Output<DomainMappingSpecCertificateMode> certificateMode) {
            this.certificateMode = certificateMode;
            return this;
        }

        public Builder certificateMode(@Nullable DomainMappingSpecCertificateMode certificateMode) {
            this.certificateMode = Output.ofNullable(certificateMode);
            return this;
        }

        public Builder forceOverride(@Nullable Output<Boolean> forceOverride) {
            this.forceOverride = forceOverride;
            return this;
        }

        public Builder forceOverride(@Nullable Boolean forceOverride) {
            this.forceOverride = Output.ofNullable(forceOverride);
            return this;
        }

        public Builder routeName(@Nullable Output<String> routeName) {
            this.routeName = routeName;
            return this;
        }

        public Builder routeName(@Nullable String routeName) {
            this.routeName = Output.ofNullable(routeName);
            return this;
        }
        public DomainMappingSpecArgs build() {
            return new DomainMappingSpecArgs(certificateMode, forceOverride, routeName);
        }
    }
}
