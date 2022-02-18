// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBuildServiceResourceUploadUrlResult {
    /**
     * Source relative path
     * 
     */
    private final @Nullable String relativePath;
    /**
     * Upload URL
     * 
     */
    private final @Nullable String uploadUrl;

    @OutputCustomType.Constructor({"relativePath","uploadUrl"})
    private GetBuildServiceResourceUploadUrlResult(
        @Nullable String relativePath,
        @Nullable String uploadUrl) {
        this.relativePath = relativePath;
        this.uploadUrl = uploadUrl;
    }

    /**
     * Source relative path
     * 
     */
    public Optional<String> getRelativePath() {
        return Optional.ofNullable(this.relativePath);
    }
    /**
     * Upload URL
     * 
     */
    public Optional<String> getUploadUrl() {
        return Optional.ofNullable(this.uploadUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildServiceResourceUploadUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String relativePath;
        private @Nullable String uploadUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildServiceResourceUploadUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relativePath = defaults.relativePath;
    	      this.uploadUrl = defaults.uploadUrl;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setUploadUrl(@Nullable String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public GetBuildServiceResourceUploadUrlResult build() {
            return new GetBuildServiceResourceUploadUrlResult(relativePath, uploadUrl);
        }
    }
}
