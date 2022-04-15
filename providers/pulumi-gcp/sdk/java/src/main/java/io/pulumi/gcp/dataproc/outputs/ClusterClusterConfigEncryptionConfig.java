// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterClusterConfigEncryptionConfig {
    /**
     * The Cloud KMS key name to use for PD disk encryption for
     * all instances in the cluster.
     * 
     */
    private final String kmsKeyName;

    @CustomType.Constructor
    private ClusterClusterConfigEncryptionConfig(@CustomType.Parameter("kmsKeyName") String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    /**
     * The Cloud KMS key name to use for PD disk encryption for
     * all instances in the cluster.
     * 
    */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }        public ClusterClusterConfigEncryptionConfig build() {
            return new ClusterClusterConfigEncryptionConfig(kmsKeyName);
        }
    }
}
