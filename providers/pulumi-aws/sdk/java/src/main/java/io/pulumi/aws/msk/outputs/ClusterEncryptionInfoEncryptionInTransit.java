// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterEncryptionInfoEncryptionInTransit {
    /**
     * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS`.
     * 
     */
    private final @Nullable String clientBroker;
    /**
     * Whether data communication among broker nodes is encrypted. Default value: `true`.
     * 
     */
    private final @Nullable Boolean inCluster;

    @OutputCustomType.Constructor({"clientBroker","inCluster"})
    private ClusterEncryptionInfoEncryptionInTransit(
        @Nullable String clientBroker,
        @Nullable Boolean inCluster) {
        this.clientBroker = clientBroker;
        this.inCluster = inCluster;
    }

    /**
     * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS`.
     * 
     */
    public Optional<String> getClientBroker() {
        return Optional.ofNullable(this.clientBroker);
    }
    /**
     * Whether data communication among broker nodes is encrypted. Default value: `true`.
     * 
     */
    public Optional<Boolean> getInCluster() {
        return Optional.ofNullable(this.inCluster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionInfoEncryptionInTransit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientBroker;
        private @Nullable Boolean inCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionInfoEncryptionInTransit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientBroker = defaults.clientBroker;
    	      this.inCluster = defaults.inCluster;
        }

        public Builder setClientBroker(@Nullable String clientBroker) {
            this.clientBroker = clientBroker;
            return this;
        }

        public Builder setInCluster(@Nullable Boolean inCluster) {
            this.inCluster = inCluster;
            return this;
        }
        public ClusterEncryptionInfoEncryptionInTransit build() {
            return new ClusterEncryptionInfoEncryptionInTransit(clientBroker, inCluster);
        }
    }
}