// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.LocationHDFSAuthenticationType;
import io.pulumi.awsnative.datasync.outputs.LocationHDFSNameNode;
import io.pulumi.awsnative.datasync.outputs.LocationHDFSQopConfiguration;
import io.pulumi.awsnative.datasync.outputs.LocationHDFSTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocationHDFSResult {
    /**
     * ARN(s) of the agent(s) to use for an HDFS location.
     * 
     */
    private final @Nullable List<String> agentArns;
    /**
     * The authentication mode used to determine identity of user.
     * 
     */
    private final @Nullable LocationHDFSAuthenticationType authenticationType;
    /**
     * Size of chunks (blocks) in bytes that the data is divided into when stored in the HDFS cluster.
     * 
     */
    private final @Nullable Integer blockSize;
    /**
     * The unique identity, or principal, to which Kerberos can assign tickets.
     * 
     */
    private final @Nullable String kerberosPrincipal;
    /**
     * The identifier for the Key Management Server where the encryption keys that encrypt data inside HDFS clusters are stored.
     * 
     */
    private final @Nullable String kmsKeyProviderUri;
    /**
     * The Amazon Resource Name (ARN) of the HDFS location.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * The URL of the HDFS location that was described.
     * 
     */
    private final @Nullable String locationUri;
    /**
     * An array of Name Node(s) of the HDFS location.
     * 
     */
    private final @Nullable List<LocationHDFSNameNode> nameNodes;
    private final @Nullable LocationHDFSQopConfiguration qopConfiguration;
    /**
     * Number of copies of each block that exists inside the HDFS cluster.
     * 
     */
    private final @Nullable Integer replicationFactor;
    /**
     * The user name that has read and write permissions on the specified HDFS cluster.
     * 
     */
    private final @Nullable String simpleUser;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationHDFSTag> tags;

    @OutputCustomType.Constructor({"agentArns","authenticationType","blockSize","kerberosPrincipal","kmsKeyProviderUri","locationArn","locationUri","nameNodes","qopConfiguration","replicationFactor","simpleUser","tags"})
    private GetLocationHDFSResult(
        @Nullable List<String> agentArns,
        @Nullable LocationHDFSAuthenticationType authenticationType,
        @Nullable Integer blockSize,
        @Nullable String kerberosPrincipal,
        @Nullable String kmsKeyProviderUri,
        @Nullable String locationArn,
        @Nullable String locationUri,
        @Nullable List<LocationHDFSNameNode> nameNodes,
        @Nullable LocationHDFSQopConfiguration qopConfiguration,
        @Nullable Integer replicationFactor,
        @Nullable String simpleUser,
        @Nullable List<LocationHDFSTag> tags) {
        this.agentArns = agentArns;
        this.authenticationType = authenticationType;
        this.blockSize = blockSize;
        this.kerberosPrincipal = kerberosPrincipal;
        this.kmsKeyProviderUri = kmsKeyProviderUri;
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.nameNodes = nameNodes;
        this.qopConfiguration = qopConfiguration;
        this.replicationFactor = replicationFactor;
        this.simpleUser = simpleUser;
        this.tags = tags;
    }

    /**
     * ARN(s) of the agent(s) to use for an HDFS location.
     * 
     */
    public List<String> getAgentArns() {
        return this.agentArns == null ? List.of() : this.agentArns;
    }
    /**
     * The authentication mode used to determine identity of user.
     * 
     */
    public Optional<LocationHDFSAuthenticationType> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * Size of chunks (blocks) in bytes that the data is divided into when stored in the HDFS cluster.
     * 
     */
    public Optional<Integer> getBlockSize() {
        return Optional.ofNullable(this.blockSize);
    }
    /**
     * The unique identity, or principal, to which Kerberos can assign tickets.
     * 
     */
    public Optional<String> getKerberosPrincipal() {
        return Optional.ofNullable(this.kerberosPrincipal);
    }
    /**
     * The identifier for the Key Management Server where the encryption keys that encrypt data inside HDFS clusters are stored.
     * 
     */
    public Optional<String> getKmsKeyProviderUri() {
        return Optional.ofNullable(this.kmsKeyProviderUri);
    }
    /**
     * The Amazon Resource Name (ARN) of the HDFS location.
     * 
     */
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * The URL of the HDFS location that was described.
     * 
     */
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    /**
     * An array of Name Node(s) of the HDFS location.
     * 
     */
    public List<LocationHDFSNameNode> getNameNodes() {
        return this.nameNodes == null ? List.of() : this.nameNodes;
    }
    public Optional<LocationHDFSQopConfiguration> getQopConfiguration() {
        return Optional.ofNullable(this.qopConfiguration);
    }
    /**
     * Number of copies of each block that exists inside the HDFS cluster.
     * 
     */
    public Optional<Integer> getReplicationFactor() {
        return Optional.ofNullable(this.replicationFactor);
    }
    /**
     * The user name that has read and write permissions on the specified HDFS cluster.
     * 
     */
    public Optional<String> getSimpleUser() {
        return Optional.ofNullable(this.simpleUser);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    public List<LocationHDFSTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationHDFSResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> agentArns;
        private @Nullable LocationHDFSAuthenticationType authenticationType;
        private @Nullable Integer blockSize;
        private @Nullable String kerberosPrincipal;
        private @Nullable String kmsKeyProviderUri;
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable List<LocationHDFSNameNode> nameNodes;
        private @Nullable LocationHDFSQopConfiguration qopConfiguration;
        private @Nullable Integer replicationFactor;
        private @Nullable String simpleUser;
        private @Nullable List<LocationHDFSTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationHDFSResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.authenticationType = defaults.authenticationType;
    	      this.blockSize = defaults.blockSize;
    	      this.kerberosPrincipal = defaults.kerberosPrincipal;
    	      this.kmsKeyProviderUri = defaults.kmsKeyProviderUri;
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.nameNodes = defaults.nameNodes;
    	      this.qopConfiguration = defaults.qopConfiguration;
    	      this.replicationFactor = defaults.replicationFactor;
    	      this.simpleUser = defaults.simpleUser;
    	      this.tags = defaults.tags;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setAuthenticationType(@Nullable LocationHDFSAuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setBlockSize(@Nullable Integer blockSize) {
            this.blockSize = blockSize;
            return this;
        }

        public Builder setKerberosPrincipal(@Nullable String kerberosPrincipal) {
            this.kerberosPrincipal = kerberosPrincipal;
            return this;
        }

        public Builder setKmsKeyProviderUri(@Nullable String kmsKeyProviderUri) {
            this.kmsKeyProviderUri = kmsKeyProviderUri;
            return this;
        }

        public Builder setLocationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder setLocationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        public Builder setNameNodes(@Nullable List<LocationHDFSNameNode> nameNodes) {
            this.nameNodes = nameNodes;
            return this;
        }

        public Builder setQopConfiguration(@Nullable LocationHDFSQopConfiguration qopConfiguration) {
            this.qopConfiguration = qopConfiguration;
            return this;
        }

        public Builder setReplicationFactor(@Nullable Integer replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }

        public Builder setSimpleUser(@Nullable String simpleUser) {
            this.simpleUser = simpleUser;
            return this;
        }

        public Builder setTags(@Nullable List<LocationHDFSTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocationHDFSResult build() {
            return new GetLocationHDFSResult(agentArns, authenticationType, blockSize, kerberosPrincipal, kmsKeyProviderUri, locationArn, locationUri, nameNodes, qopConfiguration, replicationFactor, simpleUser, tags);
        }
    }
}
