// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverDnsSecConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverDnsSecConfigState Empty = new ResolverDnsSecConfigState();

    /**
     * The ARN for a configuration for DNSSEC validation.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * The validation status for a DNSSEC configuration. The status can be one of the following: `ENABLING`, `ENABLED`, `DISABLING` and `DISABLED`.
     * 
     */
    @Import(name="validationStatus")
      private final @Nullable Output<String> validationStatus;

    public Output<String> getValidationStatus() {
        return this.validationStatus == null ? Output.empty() : this.validationStatus;
    }

    public ResolverDnsSecConfigState(
        @Nullable Output<String> arn,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> resourceId,
        @Nullable Output<String> validationStatus) {
        this.arn = arn;
        this.ownerId = ownerId;
        this.resourceId = resourceId;
        this.validationStatus = validationStatus;
    }

    private ResolverDnsSecConfigState() {
        this.arn = Output.empty();
        this.ownerId = Output.empty();
        this.resourceId = Output.empty();
        this.validationStatus = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverDnsSecConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> validationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverDnsSecConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ownerId = defaults.ownerId;
    	      this.resourceId = defaults.resourceId;
    	      this.validationStatus = defaults.validationStatus;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder validationStatus(@Nullable Output<String> validationStatus) {
            this.validationStatus = validationStatus;
            return this;
        }

        public Builder validationStatus(@Nullable String validationStatus) {
            this.validationStatus = Output.ofNullable(validationStatus);
            return this;
        }
        public ResolverDnsSecConfigState build() {
            return new ResolverDnsSecConfigState(arn, ownerId, resourceId, validationStatus);
        }
    }
}
