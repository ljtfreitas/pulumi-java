// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudSQLInstanceInfoResponse {
    /**
     * Name of a Cloud SQL instance.
     * 
     */
    private final String displayName;
    /**
     * External IP address of a Cloud SQL instance.
     * 
     */
    private final String externalIp;
    /**
     * Internal IP address of a Cloud SQL instance.
     * 
     */
    private final String internalIp;
    /**
     * URI of a Cloud SQL instance network or empty string if the instance does not have one.
     * 
     */
    private final String networkUri;
    /**
     * Region in which the Cloud SQL instance is running.
     * 
     */
    private final String region;
    /**
     * URI of a Cloud SQL instance.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"displayName","externalIp","internalIp","networkUri","region","uri"})
    private CloudSQLInstanceInfoResponse(
        String displayName,
        String externalIp,
        String internalIp,
        String networkUri,
        String region,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName);
        this.externalIp = Objects.requireNonNull(externalIp);
        this.internalIp = Objects.requireNonNull(internalIp);
        this.networkUri = Objects.requireNonNull(networkUri);
        this.region = Objects.requireNonNull(region);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Name of a Cloud SQL instance.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * External IP address of a Cloud SQL instance.
     * 
     */
    public String getExternalIp() {
        return this.externalIp;
    }
    /**
     * Internal IP address of a Cloud SQL instance.
     * 
     */
    public String getInternalIp() {
        return this.internalIp;
    }
    /**
     * URI of a Cloud SQL instance network or empty string if the instance does not have one.
     * 
     */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Region in which the Cloud SQL instance is running.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * URI of a Cloud SQL instance.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSQLInstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String externalIp;
        private String internalIp;
        private String networkUri;
        private String region;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSQLInstanceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.uri = defaults.uri;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setExternalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }

        public Builder setInternalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public CloudSQLInstanceInfoResponse build() {
            return new CloudSQLInstanceInfoResponse(displayName, externalIp, internalIp, networkUri, region, uri);
        }
    }
}
