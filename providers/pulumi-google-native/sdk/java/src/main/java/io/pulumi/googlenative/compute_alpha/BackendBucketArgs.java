// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Output.empty() : this.bucketName;
    }

    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy;

    public Output<BackendBucketCdnPolicyArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Output.empty() : this.cdnPolicy;
    }

    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    @Import(name="compressionMode")
      private final @Nullable Output<BackendBucketCompressionMode> compressionMode;

    public Output<BackendBucketCompressionMode> getCompressionMode() {
        return this.compressionMode == null ? Output.empty() : this.compressionMode;
    }

    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @Import(name="customResponseHeaders")
      private final @Nullable Output<List<String>> customResponseHeaders;

    public Output<List<String>> getCustomResponseHeaders() {
        return this.customResponseHeaders == null ? Output.empty() : this.customResponseHeaders;
    }

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @Import(name="enableCdn")
      private final @Nullable Output<Boolean> enableCdn;

    public Output<Boolean> getEnableCdn() {
        return this.enableCdn == null ? Output.empty() : this.enableCdn;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    public BackendBucketArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy,
        @Nullable Output<BackendBucketCompressionMode> compressionMode,
        @Nullable Output<List<String>> customResponseHeaders,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableCdn,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId) {
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
        this.bucketName = Output.empty();
        this.cdnPolicy = Output.empty();
        this.compressionMode = Output.empty();
        this.customResponseHeaders = Output.empty();
        this.description = Output.empty();
        this.enableCdn = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy;
        private @Nullable Output<BackendBucketCompressionMode> compressionMode;
        private @Nullable Output<List<String>> customResponseHeaders;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableCdn;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;

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

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }

        public Builder cdnPolicy(@Nullable Output<BackendBucketCdnPolicyArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder cdnPolicy(@Nullable BackendBucketCdnPolicyArgs cdnPolicy) {
            this.cdnPolicy = Output.ofNullable(cdnPolicy);
            return this;
        }

        public Builder compressionMode(@Nullable Output<BackendBucketCompressionMode> compressionMode) {
            this.compressionMode = compressionMode;
            return this;
        }

        public Builder compressionMode(@Nullable BackendBucketCompressionMode compressionMode) {
            this.compressionMode = Output.ofNullable(compressionMode);
            return this;
        }

        public Builder customResponseHeaders(@Nullable Output<List<String>> customResponseHeaders) {
            this.customResponseHeaders = customResponseHeaders;
            return this;
        }

        public Builder customResponseHeaders(@Nullable List<String> customResponseHeaders) {
            this.customResponseHeaders = Output.ofNullable(customResponseHeaders);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder enableCdn(@Nullable Output<Boolean> enableCdn) {
            this.enableCdn = enableCdn;
            return this;
        }

        public Builder enableCdn(@Nullable Boolean enableCdn) {
            this.enableCdn = Output.ofNullable(enableCdn);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public BackendBucketArgs build() {
            return new BackendBucketArgs(bucketName, cdnPolicy, compressionMode, customResponseHeaders, description, enableCdn, kind, name, project, requestId);
        }
    }
}
