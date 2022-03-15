// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.BackendBucketCdnPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GetBackendBucketResult(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("cdnPolicy") BackendBucketCdnPolicyResponse cdnPolicy,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("customResponseHeaders") List<String> customResponseHeaders,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("edgeSecurityPolicy") String edgeSecurityPolicy,
        @CustomType.Parameter("enableCdn") Boolean enableCdn,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.bucketName = bucketName;
        this.cdnPolicy = cdnPolicy;
        this.creationTimestamp = creationTimestamp;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.edgeSecurityPolicy = edgeSecurityPolicy;
        this.enableCdn = enableCdn;
        this.kind = kind;
        this.name = name;
        this.selfLink = selfLink;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private BackendBucketCdnPolicyResponse cdnPolicy;
        private String creationTimestamp;
        private List<String> customResponseHeaders;
        private String description;
        private String edgeSecurityPolicy;
        private Boolean enableCdn;
        private String kind;
        private String name;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.edgeSecurityPolicy = defaults.edgeSecurityPolicy;
    	      this.enableCdn = defaults.enableCdn;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder cdnPolicy(BackendBucketCdnPolicyResponse cdnPolicy) {
            this.cdnPolicy = Objects.requireNonNull(cdnPolicy);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder customResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder edgeSecurityPolicy(String edgeSecurityPolicy) {
            this.edgeSecurityPolicy = Objects.requireNonNull(edgeSecurityPolicy);
            return this;
        }

        public Builder enableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetBackendBucketResult build() {
            return new GetBackendBucketResult(bucketName, cdnPolicy, creationTimestamp, customResponseHeaders, description, edgeSecurityPolicy, enableCdn, kind, name, selfLink);
        }
    }
}
