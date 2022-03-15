// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedZoneDnsSecState extends io.pulumi.resources.ResourceArgs {

    public static final HostedZoneDnsSecState Empty = new HostedZoneDnsSecState();

    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @Import(name="hostedZoneId")
      private final @Nullable Output<String> hostedZoneId;

    public Output<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Output.empty() : this.hostedZoneId;
    }

    /**
     * Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
     * 
     */
    @Import(name="signingStatus")
      private final @Nullable Output<String> signingStatus;

    public Output<String> getSigningStatus() {
        return this.signingStatus == null ? Output.empty() : this.signingStatus;
    }

    public HostedZoneDnsSecState(
        @Nullable Output<String> hostedZoneId,
        @Nullable Output<String> signingStatus) {
        this.hostedZoneId = hostedZoneId;
        this.signingStatus = signingStatus;
    }

    private HostedZoneDnsSecState() {
        this.hostedZoneId = Output.empty();
        this.signingStatus = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneDnsSecState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostedZoneId;
        private @Nullable Output<String> signingStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneDnsSecState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.signingStatus = defaults.signingStatus;
        }

        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder hostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Output.ofNullable(hostedZoneId);
            return this;
        }

        public Builder signingStatus(@Nullable Output<String> signingStatus) {
            this.signingStatus = signingStatus;
            return this;
        }

        public Builder signingStatus(@Nullable String signingStatus) {
            this.signingStatus = Output.ofNullable(signingStatus);
            return this;
        }
        public HostedZoneDnsSecState build() {
            return new HostedZoneDnsSecState(hostedZoneId, signingStatus);
        }
    }
}
