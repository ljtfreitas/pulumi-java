// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginEndpointSpekeKeyProvider {
    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing secure end-to-end data transfer with the key provider service.
     * 
     */
    private final @Nullable String certificateArn;
    /**
     * The resource ID to include in key requests.
     * 
     */
    private final String resourceId;
    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key provider service.
     * 
     */
    private final String roleArn;
    /**
     * The system IDs to include in key requests.
     * 
     */
    private final List<String> systemIds;
    /**
     * The URL of the external key provider service.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"certificateArn","resourceId","roleArn","systemIds","url"})
    private OriginEndpointSpekeKeyProvider(
        @Nullable String certificateArn,
        String resourceId,
        String roleArn,
        List<String> systemIds,
        String url) {
        this.certificateArn = certificateArn;
        this.resourceId = Objects.requireNonNull(resourceId);
        this.roleArn = Objects.requireNonNull(roleArn);
        this.systemIds = Objects.requireNonNull(systemIds);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * An Amazon Resource Name (ARN) of a Certificate Manager certificate that MediaPackage will use for enforcing secure end-to-end data transfer with the key provider service.
     * 
     */
    public Optional<String> getCertificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }
    /**
     * The resource ID to include in key requests.
     * 
     */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental MediaPackage will assume when accessing the key provider service.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The system IDs to include in key requests.
     * 
     */
    public List<String> getSystemIds() {
        return this.systemIds;
    }
    /**
     * The URL of the external key provider service.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointSpekeKeyProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateArn;
        private String resourceId;
        private String roleArn;
        private List<String> systemIds;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointSpekeKeyProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.systemIds = defaults.systemIds;
    	      this.url = defaults.url;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setSystemIds(List<String> systemIds) {
            this.systemIds = Objects.requireNonNull(systemIds);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public OriginEndpointSpekeKeyProvider build() {
            return new OriginEndpointSpekeKeyProvider(certificateArn, resourceId, roleArn, systemIds, url);
        }
    }
}
