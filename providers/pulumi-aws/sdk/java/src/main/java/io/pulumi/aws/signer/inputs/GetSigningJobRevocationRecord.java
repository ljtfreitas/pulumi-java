// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSigningJobRevocationRecord extends io.pulumi.resources.InvokeArgs {

    public static final GetSigningJobRevocationRecord Empty = new GetSigningJobRevocationRecord();

    @InputImport(name="reason", required=true)
    private final String reason;

    public String getReason() {
        return this.reason;
    }

    @InputImport(name="revokedAt", required=true)
    private final String revokedAt;

    public String getRevokedAt() {
        return this.revokedAt;
    }

    @InputImport(name="revokedBy", required=true)
    private final String revokedBy;

    public String getRevokedBy() {
        return this.revokedBy;
    }

    public GetSigningJobRevocationRecord(
        String reason,
        String revokedAt,
        String revokedBy) {
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.revokedAt = Objects.requireNonNull(revokedAt, "expected parameter 'revokedAt' to be non-null");
        this.revokedBy = Objects.requireNonNull(revokedBy, "expected parameter 'revokedBy' to be non-null");
    }

    private GetSigningJobRevocationRecord() {
        this.reason = null;
        this.revokedAt = null;
        this.revokedBy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobRevocationRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String reason;
        private String revokedAt;
        private String revokedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobRevocationRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reason = defaults.reason;
    	      this.revokedAt = defaults.revokedAt;
    	      this.revokedBy = defaults.revokedBy;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setRevokedAt(String revokedAt) {
            this.revokedAt = Objects.requireNonNull(revokedAt);
            return this;
        }

        public Builder setRevokedBy(String revokedBy) {
            this.revokedBy = Objects.requireNonNull(revokedBy);
            return this;
        }
        public GetSigningJobRevocationRecord build() {
            return new GetSigningJobRevocationRecord(reason, revokedAt, revokedBy);
        }
    }
}
