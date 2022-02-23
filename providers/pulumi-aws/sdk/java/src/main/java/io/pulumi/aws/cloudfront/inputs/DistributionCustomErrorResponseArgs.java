// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionCustomErrorResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionCustomErrorResponseArgs Empty = new DistributionCustomErrorResponseArgs();

    /**
     * The minimum amount of time you want
     * HTTP error codes to stay in CloudFront caches before CloudFront queries your
     * origin to see whether the object has been updated.
     * 
     */
    @InputImport(name="errorCachingMinTtl")
    private final @Nullable Input<Integer> errorCachingMinTtl;

    public Input<Integer> getErrorCachingMinTtl() {
        return this.errorCachingMinTtl == null ? Input.empty() : this.errorCachingMinTtl;
    }

    /**
     * The 4xx or 5xx HTTP status code that you want to
     * customize.
     * 
     */
    @InputImport(name="errorCode", required=true)
    private final Input<Integer> errorCode;

    public Input<Integer> getErrorCode() {
        return this.errorCode;
    }

    /**
     * The HTTP status code that you want CloudFront
     * to return with the custom error page to the viewer.
     * 
     */
    @InputImport(name="responseCode")
    private final @Nullable Input<Integer> responseCode;

    public Input<Integer> getResponseCode() {
        return this.responseCode == null ? Input.empty() : this.responseCode;
    }

    /**
     * The path of the custom error page (for
     * example, `/custom_404.html`).
     * 
     */
    @InputImport(name="responsePagePath")
    private final @Nullable Input<String> responsePagePath;

    public Input<String> getResponsePagePath() {
        return this.responsePagePath == null ? Input.empty() : this.responsePagePath;
    }

    public DistributionCustomErrorResponseArgs(
        @Nullable Input<Integer> errorCachingMinTtl,
        Input<Integer> errorCode,
        @Nullable Input<Integer> responseCode,
        @Nullable Input<String> responsePagePath) {
        this.errorCachingMinTtl = errorCachingMinTtl;
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.responseCode = responseCode;
        this.responsePagePath = responsePagePath;
    }

    private DistributionCustomErrorResponseArgs() {
        this.errorCachingMinTtl = Input.empty();
        this.errorCode = Input.empty();
        this.responseCode = Input.empty();
        this.responsePagePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomErrorResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> errorCachingMinTtl;
        private Input<Integer> errorCode;
        private @Nullable Input<Integer> responseCode;
        private @Nullable Input<String> responsePagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCustomErrorResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCachingMinTtl = defaults.errorCachingMinTtl;
    	      this.errorCode = defaults.errorCode;
    	      this.responseCode = defaults.responseCode;
    	      this.responsePagePath = defaults.responsePagePath;
        }

        public Builder setErrorCachingMinTtl(@Nullable Input<Integer> errorCachingMinTtl) {
            this.errorCachingMinTtl = errorCachingMinTtl;
            return this;
        }

        public Builder setErrorCachingMinTtl(@Nullable Integer errorCachingMinTtl) {
            this.errorCachingMinTtl = Input.ofNullable(errorCachingMinTtl);
            return this;
        }

        public Builder setErrorCode(Input<Integer> errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setErrorCode(Integer errorCode) {
            this.errorCode = Input.of(Objects.requireNonNull(errorCode));
            return this;
        }

        public Builder setResponseCode(@Nullable Input<Integer> responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        public Builder setResponseCode(@Nullable Integer responseCode) {
            this.responseCode = Input.ofNullable(responseCode);
            return this;
        }

        public Builder setResponsePagePath(@Nullable Input<String> responsePagePath) {
            this.responsePagePath = responsePagePath;
            return this;
        }

        public Builder setResponsePagePath(@Nullable String responsePagePath) {
            this.responsePagePath = Input.ofNullable(responsePagePath);
            return this;
        }
        public DistributionCustomErrorResponseArgs build() {
            return new DistributionCustomErrorResponseArgs(errorCachingMinTtl, errorCode, responseCode, responsePagePath);
        }
    }
}
