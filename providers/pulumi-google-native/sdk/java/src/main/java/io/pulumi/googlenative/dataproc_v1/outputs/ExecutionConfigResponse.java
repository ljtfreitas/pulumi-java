// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ExecutionConfigResponse {
    /**
     * Optional. The Cloud KMS key to use for encryption.
     * 
     */
    private final String kmsKey;
    /**
     * Optional. Tags used for network traffic control.
     * 
     */
    private final List<String> networkTags;
    /**
     * Optional. Network URI to connect workload to.
     * 
     */
    private final String networkUri;
    /**
     * Optional. Service account that used to execute workload.
     * 
     */
    private final String serviceAccount;
    /**
     * Optional. Subnetwork URI to connect workload to.
     * 
     */
    private final String subnetworkUri;

    @OutputCustomType.Constructor({"kmsKey","networkTags","networkUri","serviceAccount","subnetworkUri"})
    private ExecutionConfigResponse(
        String kmsKey,
        List<String> networkTags,
        String networkUri,
        String serviceAccount,
        String subnetworkUri) {
        this.kmsKey = Objects.requireNonNull(kmsKey);
        this.networkTags = Objects.requireNonNull(networkTags);
        this.networkUri = Objects.requireNonNull(networkUri);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.subnetworkUri = Objects.requireNonNull(subnetworkUri);
    }

    /**
     * Optional. The Cloud KMS key to use for encryption.
     * 
     */
    public String getKmsKey() {
        return this.kmsKey;
    }
    /**
     * Optional. Tags used for network traffic control.
     * 
     */
    public List<String> getNetworkTags() {
        return this.networkTags;
    }
    /**
     * Optional. Network URI to connect workload to.
     * 
     */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Optional. Service account that used to execute workload.
     * 
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. Subnetwork URI to connect workload to.
     * 
     */
    public String getSubnetworkUri() {
        return this.subnetworkUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKey;
        private List<String> networkTags;
        private String networkUri;
        private String serviceAccount;
        private String subnetworkUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetworkUri = defaults.subnetworkUri;
        }

        public Builder setKmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }

        public Builder setNetworkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setSubnetworkUri(String subnetworkUri) {
            this.subnetworkUri = Objects.requireNonNull(subnetworkUri);
            return this;
        }
        public ExecutionConfigResponse build() {
            return new ExecutionConfigResponse(kmsKey, networkTags, networkUri, serviceAccount, subnetworkUri);
        }
    }
}
