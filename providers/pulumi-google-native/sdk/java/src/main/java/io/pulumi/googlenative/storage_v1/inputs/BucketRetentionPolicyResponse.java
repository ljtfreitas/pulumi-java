// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class BucketRetentionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketRetentionPolicyResponse Empty = new BucketRetentionPolicyResponse();

    @InputImport(name="effectiveTime", required=true)
    private final String effectiveTime;

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    @InputImport(name="isLocked", required=true)
    private final Boolean isLocked;

    public Boolean getIsLocked() {
        return this.isLocked;
    }

    @InputImport(name="retentionPeriod", required=true)
    private final String retentionPeriod;

    public String getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public BucketRetentionPolicyResponse(
        String effectiveTime,
        Boolean isLocked,
        String retentionPeriod) {
        this.effectiveTime = Objects.requireNonNull(effectiveTime, "expected parameter 'effectiveTime' to be non-null");
        this.isLocked = Objects.requireNonNull(isLocked, "expected parameter 'isLocked' to be non-null");
        this.retentionPeriod = Objects.requireNonNull(retentionPeriod, "expected parameter 'retentionPeriod' to be non-null");
    }

    private BucketRetentionPolicyResponse() {
        this.effectiveTime = null;
        this.isLocked = null;
        this.retentionPeriod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effectiveTime;
        private Boolean isLocked;
        private String retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveTime = defaults.effectiveTime;
    	      this.isLocked = defaults.isLocked;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder setEffectiveTime(String effectiveTime) {
            this.effectiveTime = Objects.requireNonNull(effectiveTime);
            return this;
        }

        public Builder setIsLocked(Boolean isLocked) {
            this.isLocked = Objects.requireNonNull(isLocked);
            return this;
        }

        public Builder setRetentionPeriod(String retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }

        public BucketRetentionPolicyResponse build() {
            return new BucketRetentionPolicyResponse(effectiveTime, isLocked, retentionPeriod);
        }
    }
}