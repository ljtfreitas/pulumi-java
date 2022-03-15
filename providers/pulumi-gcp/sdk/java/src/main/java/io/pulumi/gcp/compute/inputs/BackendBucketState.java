// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.BackendBucketCdnPolicyGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendBucketState extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketState Empty = new BackendBucketState();

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
     * Cloud CDN configuration for this Backend Bucket.
     * Structure is documented below.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<BackendBucketCdnPolicyGetArgs> cdnPolicy;

    public Output<BackendBucketCdnPolicyGetArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Output.empty() : this.cdnPolicy;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
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
     * An optional textual description of the resource; provided by the
     * client when the resource is created.
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
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    public BackendBucketState(
        @Nullable Output<String> bucketName,
        @Nullable Output<BackendBucketCdnPolicyGetArgs> cdnPolicy,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<List<String>> customResponseHeaders,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableCdn,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink) {
        this.bucketName = bucketName;
        this.cdnPolicy = cdnPolicy;
        this.creationTimestamp = creationTimestamp;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.enableCdn = enableCdn;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
    }

    private BackendBucketState() {
        this.bucketName = Output.empty();
        this.cdnPolicy = Output.empty();
        this.creationTimestamp = Output.empty();
        this.customResponseHeaders = Output.empty();
        this.description = Output.empty();
        this.enableCdn = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.selfLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<BackendBucketCdnPolicyGetArgs> cdnPolicy;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<List<String>> customResponseHeaders;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableCdn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }

        public Builder cdnPolicy(@Nullable Output<BackendBucketCdnPolicyGetArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder cdnPolicy(@Nullable BackendBucketCdnPolicyGetArgs cdnPolicy) {
            this.cdnPolicy = Output.ofNullable(cdnPolicy);
            return this;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
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

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public BackendBucketState build() {
            return new BackendBucketState(bucketName, cdnPolicy, creationTimestamp, customResponseHeaders, description, enableCdn, name, project, selfLink);
        }
    }
}
