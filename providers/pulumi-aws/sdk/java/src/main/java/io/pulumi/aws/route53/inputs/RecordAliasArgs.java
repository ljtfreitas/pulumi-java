// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RecordAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordAliasArgs Empty = new RecordAliasArgs();

    /**
     * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
     * 
     */
    @InputImport(name="evaluateTargetHealth", required=true)
    private final Input<Boolean> evaluateTargetHealth;

    public Input<Boolean> getEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }

    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    @InputImport(name="zoneId", required=true)
    private final Input<String> zoneId;

    public Input<String> getZoneId() {
        return this.zoneId;
    }

    public RecordAliasArgs(
        Input<Boolean> evaluateTargetHealth,
        Input<String> name,
        Input<String> zoneId) {
        this.evaluateTargetHealth = Objects.requireNonNull(evaluateTargetHealth, "expected parameter 'evaluateTargetHealth' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.zoneId = Objects.requireNonNull(zoneId, "expected parameter 'zoneId' to be non-null");
    }

    private RecordAliasArgs() {
        this.evaluateTargetHealth = Input.empty();
        this.name = Input.empty();
        this.zoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> evaluateTargetHealth;
        private Input<String> name;
        private Input<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluateTargetHealth = defaults.evaluateTargetHealth;
    	      this.name = defaults.name;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder setEvaluateTargetHealth(Input<Boolean> evaluateTargetHealth) {
            this.evaluateTargetHealth = Objects.requireNonNull(evaluateTargetHealth);
            return this;
        }

        public Builder setEvaluateTargetHealth(Boolean evaluateTargetHealth) {
            this.evaluateTargetHealth = Input.of(Objects.requireNonNull(evaluateTargetHealth));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setZoneId(Input<String> zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }

        public Builder setZoneId(String zoneId) {
            this.zoneId = Input.of(Objects.requireNonNull(zoneId));
            return this;
        }
        public RecordAliasArgs build() {
            return new RecordAliasArgs(evaluateTargetHealth, name, zoneId);
        }
    }
}
