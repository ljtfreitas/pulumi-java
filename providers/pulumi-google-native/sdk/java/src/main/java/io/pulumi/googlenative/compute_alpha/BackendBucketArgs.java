// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.BackendBucketCompressionMode;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendBucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketArgs Empty = new BackendBucketArgs();

    /**
     * Cloud Storage bucket name.
     * 
     */
    @InputImport(name="bucketName")
      private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    @InputImport(name="cdnPolicy")
      private final @Nullable Input<BackendBucketCdnPolicyArgs> cdnPolicy;

    public Input<BackendBucketCdnPolicyArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Input.empty() : this.cdnPolicy;
    }

    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    @InputImport(name="compressionMode")
      private final @Nullable Input<BackendBucketCompressionMode> compressionMode;

    public Input<BackendBucketCompressionMode> getCompressionMode() {
        return this.compressionMode == null ? Input.empty() : this.compressionMode;
    }

    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @InputImport(name="customResponseHeaders")
      private final @Nullable Input<List<String>> customResponseHeaders;

    public Input<List<String>> getCustomResponseHeaders() {
        return this.customResponseHeaders == null ? Input.empty() : this.customResponseHeaders;
    }

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @InputImport(name="enableCdn")
      private final @Nullable Input<Boolean> enableCdn;

    public Input<Boolean> getEnableCdn() {
        return this.enableCdn == null ? Input.empty() : this.enableCdn;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    public BackendBucketArgs(
        @Nullable Input<String> bucketName,
        @Nullable Input<BackendBucketCdnPolicyArgs> cdnPolicy,
        @Nullable Input<BackendBucketCompressionMode> compressionMode,
        @Nullable Input<List<String>> customResponseHeaders,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableCdn,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId) {
        this.bucketName = bucketName;
        this.cdnPolicy = cdnPolicy;
        this.compressionMode = compressionMode;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.enableCdn = enableCdn;
        this.kind = kind;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
    }

    private BackendBucketArgs() {
        this.bucketName = Input.empty();
        this.cdnPolicy = Input.empty();
        this.compressionMode = Input.empty();
        this.customResponseHeaders = Input.empty();
        this.description = Input.empty();
        this.enableCdn = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private @Nullable Input<BackendBucketCdnPolicyArgs> cdnPolicy;
        private @Nullable Input<BackendBucketCompressionMode> compressionMode;
        private @Nullable Input<List<String>> customResponseHeaders;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableCdn;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.compressionMode = defaults.compressionMode;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
        }

        public Builder setBucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setBucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder setCdnPolicy(@Nullable Input<BackendBucketCdnPolicyArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder setCdnPolicy(@Nullable BackendBucketCdnPolicyArgs cdnPolicy) {
            this.cdnPolicy = Input.ofNullable(cdnPolicy);
            return this;
        }

        public Builder setCompressionMode(@Nullable Input<BackendBucketCompressionMode> compressionMode) {
            this.compressionMode = compressionMode;
            return this;
        }

        public Builder setCompressionMode(@Nullable BackendBucketCompressionMode compressionMode) {
            this.compressionMode = Input.ofNullable(compressionMode);
            return this;
        }

        public Builder setCustomResponseHeaders(@Nullable Input<List<String>> customResponseHeaders) {
            this.customResponseHeaders = customResponseHeaders;
            return this;
        }

        public Builder setCustomResponseHeaders(@Nullable List<String> customResponseHeaders) {
            this.customResponseHeaders = Input.ofNullable(customResponseHeaders);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableCdn(@Nullable Input<Boolean> enableCdn) {
            this.enableCdn = enableCdn;
            return this;
        }

        public Builder setEnableCdn(@Nullable Boolean enableCdn) {
            this.enableCdn = Input.ofNullable(enableCdn);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }
        public BackendBucketArgs build() {
            return new BackendBucketArgs(bucketName, cdnPolicy, compressionMode, customResponseHeaders, description, enableCdn, kind, name, project, requestId);
        }
    }
}
