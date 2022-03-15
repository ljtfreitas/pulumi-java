// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Cloud SQL instance.
 * 
 */
public final class CloudSQLInstanceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudSQLInstanceInfoResponse Empty = new CloudSQLInstanceInfoResponse();

    /**
     * Name of a Cloud SQL instance.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * External IP address of a Cloud SQL instance.
     * 
     */
    @Import(name="externalIp", required=true)
      private final String externalIp;

    public String getExternalIp() {
        return this.externalIp;
    }

    /**
     * Internal IP address of a Cloud SQL instance.
     * 
     */
    @Import(name="internalIp", required=true)
      private final String internalIp;

    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * URI of a Cloud SQL instance network or empty string if the instance does not have one.
     * 
     */
    @Import(name="networkUri", required=true)
      private final String networkUri;

    public String getNetworkUri() {
        return this.networkUri;
    }

    /**
     * Region in which the Cloud SQL instance is running.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    /**
     * URI of a Cloud SQL instance.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public CloudSQLInstanceInfoResponse(
        String displayName,
        String externalIp,
        String internalIp,
        String networkUri,
        String region,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.externalIp = Objects.requireNonNull(externalIp, "expected parameter 'externalIp' to be non-null");
        this.internalIp = Objects.requireNonNull(internalIp, "expected parameter 'internalIp' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private CloudSQLInstanceInfoResponse() {
        this.displayName = null;
        this.externalIp = null;
        this.internalIp = null;
        this.networkUri = null;
        this.region = null;
        this.uri = null;
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

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder externalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }

        public Builder internalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }

        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public CloudSQLInstanceInfoResponse build() {
            return new CloudSQLInstanceInfoResponse(displayName, externalIp, internalIp, networkUri, region, uri);
        }
    }
}
