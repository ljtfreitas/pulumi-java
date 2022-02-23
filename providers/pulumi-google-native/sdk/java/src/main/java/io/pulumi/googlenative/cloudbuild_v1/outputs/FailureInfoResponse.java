// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FailureInfoResponse {
    /**
     * Explains the failure issue in more detail using hard-coded text.
     * 
     */
    private final String detail;
    /**
     * The name of the failure.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"detail","type"})
    private FailureInfoResponse(
        String detail,
        String type) {
        this.detail = Objects.requireNonNull(detail);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Explains the failure issue in more detail using hard-coded text.
     * 
     */
    public String getDetail() {
        return this.detail;
    }
    /**
     * The name of the failure.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detail;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FailureInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detail = defaults.detail;
    	      this.type = defaults.type;
        }

        public Builder setDetail(String detail) {
            this.detail = Objects.requireNonNull(detail);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FailureInfoResponse build() {
            return new FailureInfoResponse(detail, type);
        }
    }
}
