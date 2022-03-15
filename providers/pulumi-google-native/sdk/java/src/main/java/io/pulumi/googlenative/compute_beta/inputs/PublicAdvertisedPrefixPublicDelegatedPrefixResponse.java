// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a CIDR range which can be used to assign addresses.
 * 
 */
public final class PublicAdvertisedPrefixPublicDelegatedPrefixResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublicAdvertisedPrefixPublicDelegatedPrefixResponse Empty = new PublicAdvertisedPrefixPublicDelegatedPrefixResponse();

    /**
     * The IP address range of the public delegated prefix
     * 
     */
    @Import(name="ipRange", required=true)
      private final String ipRange;

    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * The name of the public delegated prefix
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The project number of the public delegated prefix
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    /**
     * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public PublicAdvertisedPrefixPublicDelegatedPrefixResponse(
        String ipRange,
        String name,
        String project,
        String region,
        String status) {
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PublicAdvertisedPrefixPublicDelegatedPrefixResponse() {
        this.ipRange = null;
        this.name = null;
        this.project = null;
        this.region = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipRange;
        private String name;
        private String project;
        private String region;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRange = defaults.ipRange;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PublicAdvertisedPrefixPublicDelegatedPrefixResponse build() {
            return new PublicAdvertisedPrefixPublicDelegatedPrefixResponse(ipRange, name, project, region, status);
        }
    }
}
