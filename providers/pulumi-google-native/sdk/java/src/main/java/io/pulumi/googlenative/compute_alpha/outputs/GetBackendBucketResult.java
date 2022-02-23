// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.BackendBucketCdnPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBackendBucketResult {
    /**
     * Cloud Storage bucket name.
     * 
     */
    private final String bucketName;
    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    private final BackendBucketCdnPolicyResponse cdnPolicy;
    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    private final String compressionMode;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    private final List<String> customResponseHeaders;
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    private final String description;
    /**
     * The resource URL for the edge security policy associated with this backend bucket.
     * 
     */
    private final String edgeSecurityPolicy;
    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    private final Boolean enableCdn;
    /**
     * Type of the resource.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;

    @OutputCustomType.Constructor({"bucketName","cdnPolicy","compressionMode","creationTimestamp","customResponseHeaders","description","edgeSecurityPolicy","enableCdn","kind","name","selfLink","selfLinkWithId"})
    private GetBackendBucketResult(
        String bucketName,
        BackendBucketCdnPolicyResponse cdnPolicy,
        String compressionMode,
        String creationTimestamp,
        List<String> customResponseHeaders,
        String description,
        String edgeSecurityPolicy,
        Boolean enableCdn,
        String kind,
        String name,
        String selfLink,
        String selfLinkWithId) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.cdnPolicy = Objects.requireNonNull(cdnPolicy);
        this.compressionMode = Objects.requireNonNull(compressionMode);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
        this.description = Objects.requireNonNull(description);
        this.edgeSecurityPolicy = Objects.requireNonNull(edgeSecurityPolicy);
        this.enableCdn = Objects.requireNonNull(enableCdn);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
    }

    /**
     * Cloud Storage bucket name.
     * 
     */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    public BackendBucketCdnPolicyResponse getCdnPolicy() {
        return this.cdnPolicy;
    }
    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    public String getCompressionMode() {
        return this.compressionMode;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    public List<String> getCustomResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The resource URL for the edge security policy associated with this backend bucket.
     * 
     */
    public String getEdgeSecurityPolicy() {
        return this.edgeSecurityPolicy;
    }
    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    public Boolean getEnableCdn() {
        return this.enableCdn;
    }
    /**
     * Type of the resource.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private BackendBucketCdnPolicyResponse cdnPolicy;
        private String compressionMode;
        private String creationTimestamp;
        private List<String> customResponseHeaders;
        private String description;
        private String edgeSecurityPolicy;
        private Boolean enableCdn;
        private String kind;
        private String name;
        private String selfLink;
        private String selfLinkWithId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.compressionMode = defaults.compressionMode;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.edgeSecurityPolicy = defaults.edgeSecurityPolicy;
    	      this.enableCdn = defaults.enableCdn;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setCdnPolicy(BackendBucketCdnPolicyResponse cdnPolicy) {
            this.cdnPolicy = Objects.requireNonNull(cdnPolicy);
            return this;
        }

        public Builder setCompressionMode(String compressionMode) {
            this.compressionMode = Objects.requireNonNull(compressionMode);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setCustomResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEdgeSecurityPolicy(String edgeSecurityPolicy) {
            this.edgeSecurityPolicy = Objects.requireNonNull(edgeSecurityPolicy);
            return this;
        }

        public Builder setEnableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public GetBackendBucketResult build() {
            return new GetBackendBucketResult(bucketName, cdnPolicy, compressionMode, creationTimestamp, customResponseHeaders, description, edgeSecurityPolicy, enableCdn, kind, name, selfLink, selfLinkWithId);
        }
    }
}
