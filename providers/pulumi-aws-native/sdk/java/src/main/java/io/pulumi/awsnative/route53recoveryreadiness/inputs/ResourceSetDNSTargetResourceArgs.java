// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.awsnative.route53recoveryreadiness.inputs.ResourceSetTargetResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A component for DNS/routing control readiness checks.
 * 
 */
public final class ResourceSetDNSTargetResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetDNSTargetResourceArgs Empty = new ResourceSetDNSTargetResourceArgs();

    /**
     * The domain name that acts as an ingress point to a portion of the customer application.
     * 
     */
    @InputImport(name="domainName")
        private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target resource.
     * 
     */
    @InputImport(name="hostedZoneArn")
        private final @Nullable Input<String> hostedZoneArn;

    public Input<String> getHostedZoneArn() {
        return this.hostedZoneArn == null ? Input.empty() : this.hostedZoneArn;
    }

    /**
     * The Route 53 record set ID that will uniquely identify a DNS record, given a name and a type.
     * 
     */
    @InputImport(name="recordSetId")
        private final @Nullable Input<String> recordSetId;

    public Input<String> getRecordSetId() {
        return this.recordSetId == null ? Input.empty() : this.recordSetId;
    }

    /**
     * The type of DNS record of the target resource.
     * 
     */
    @InputImport(name="recordType")
        private final @Nullable Input<String> recordType;

    public Input<String> getRecordType() {
        return this.recordType == null ? Input.empty() : this.recordType;
    }

    @InputImport(name="targetResource")
        private final @Nullable Input<ResourceSetTargetResourceArgs> targetResource;

    public Input<ResourceSetTargetResourceArgs> getTargetResource() {
        return this.targetResource == null ? Input.empty() : this.targetResource;
    }

    public ResourceSetDNSTargetResourceArgs(
        @Nullable Input<String> domainName,
        @Nullable Input<String> hostedZoneArn,
        @Nullable Input<String> recordSetId,
        @Nullable Input<String> recordType,
        @Nullable Input<ResourceSetTargetResourceArgs> targetResource) {
        this.domainName = domainName;
        this.hostedZoneArn = hostedZoneArn;
        this.recordSetId = recordSetId;
        this.recordType = recordType;
        this.targetResource = targetResource;
    }

    private ResourceSetDNSTargetResourceArgs() {
        this.domainName = Input.empty();
        this.hostedZoneArn = Input.empty();
        this.recordSetId = Input.empty();
        this.recordType = Input.empty();
        this.targetResource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetDNSTargetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> hostedZoneArn;
        private @Nullable Input<String> recordSetId;
        private @Nullable Input<String> recordType;
        private @Nullable Input<ResourceSetTargetResourceArgs> targetResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetDNSTargetResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.hostedZoneArn = defaults.hostedZoneArn;
    	      this.recordSetId = defaults.recordSetId;
    	      this.recordType = defaults.recordType;
    	      this.targetResource = defaults.targetResource;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setHostedZoneArn(@Nullable Input<String> hostedZoneArn) {
            this.hostedZoneArn = hostedZoneArn;
            return this;
        }

        public Builder setHostedZoneArn(@Nullable String hostedZoneArn) {
            this.hostedZoneArn = Input.ofNullable(hostedZoneArn);
            return this;
        }

        public Builder setRecordSetId(@Nullable Input<String> recordSetId) {
            this.recordSetId = recordSetId;
            return this;
        }

        public Builder setRecordSetId(@Nullable String recordSetId) {
            this.recordSetId = Input.ofNullable(recordSetId);
            return this;
        }

        public Builder setRecordType(@Nullable Input<String> recordType) {
            this.recordType = recordType;
            return this;
        }

        public Builder setRecordType(@Nullable String recordType) {
            this.recordType = Input.ofNullable(recordType);
            return this;
        }

        public Builder setTargetResource(@Nullable Input<ResourceSetTargetResourceArgs> targetResource) {
            this.targetResource = targetResource;
            return this;
        }

        public Builder setTargetResource(@Nullable ResourceSetTargetResourceArgs targetResource) {
            this.targetResource = Input.ofNullable(targetResource);
            return this;
        }
        public ResourceSetDNSTargetResourceArgs build() {
            return new ResourceSetDNSTargetResourceArgs(domainName, hostedZoneArn, recordSetId, recordType, targetResource);
        }
    }
}
