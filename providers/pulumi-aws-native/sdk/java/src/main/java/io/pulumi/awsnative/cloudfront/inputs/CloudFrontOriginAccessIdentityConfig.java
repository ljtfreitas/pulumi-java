// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CloudFrontOriginAccessIdentityConfig extends io.pulumi.resources.InvokeArgs {

    public static final CloudFrontOriginAccessIdentityConfig Empty = new CloudFrontOriginAccessIdentityConfig();

    @InputImport(name="comment", required=true)
        private final String comment;

    public String getComment() {
        return this.comment;
    }

    public CloudFrontOriginAccessIdentityConfig(String comment) {
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
    }

    private CloudFrontOriginAccessIdentityConfig() {
        this.comment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFrontOriginAccessIdentityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFrontOriginAccessIdentityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
        }

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public CloudFrontOriginAccessIdentityConfig build() {
            return new CloudFrontOriginAccessIdentityConfig(comment);
        }
    }
}
