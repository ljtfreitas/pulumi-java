// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.aws.datasync.inputs.LocationHdfsNameNodeGetArgs;
import io.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationHdfsState extends io.pulumi.resources.ResourceArgs {

    public static final LocationHdfsState Empty = new LocationHdfsState();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @InputImport(name="agentArns")
    private final @Nullable Input<List<String>> agentArns;

    public Input<List<String>> getAgentArns() {
        return this.agentArns == null ? Input.empty() : this.agentArns;
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    @InputImport(name="blockSize")
    private final @Nullable Input<Integer> blockSize;

    public Input<Integer> getBlockSize() {
        return this.blockSize == null ? Input.empty() : this.blockSize;
    }

    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @InputImport(name="kerberosKeytab")
    private final @Nullable Input<String> kerberosKeytab;

    public Input<String> getKerberosKeytab() {
        return this.kerberosKeytab == null ? Input.empty() : this.kerberosKeytab;
    }

    /**
     * The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @InputImport(name="kerberosKrb5Conf")
    private final @Nullable Input<String> kerberosKrb5Conf;

    public Input<String> getKerberosKrb5Conf() {
        return this.kerberosKrb5Conf == null ? Input.empty() : this.kerberosKrb5Conf;
    }

    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @InputImport(name="kerberosPrincipal")
    private final @Nullable Input<String> kerberosPrincipal;

    public Input<String> getKerberosPrincipal() {
        return this.kerberosPrincipal == null ? Input.empty() : this.kerberosPrincipal;
    }

    /**
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * 
     */
    @InputImport(name="kmsKeyProviderUri")
    private final @Nullable Input<String> kmsKeyProviderUri;

    public Input<String> getKmsKeyProviderUri() {
        return this.kmsKeyProviderUri == null ? Input.empty() : this.kmsKeyProviderUri;
    }

    /**
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    @InputImport(name="nameNodes")
    private final @Nullable Input<List<LocationHdfsNameNodeGetArgs>> nameNodes;

    public Input<List<LocationHdfsNameNodeGetArgs>> getNameNodes() {
        return this.nameNodes == null ? Input.empty() : this.nameNodes;
    }

    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If QopConfiguration isn't specified, RpcProtection and DataTransferProtection default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    @InputImport(name="qopConfiguration")
    private final @Nullable Input<LocationHdfsQopConfigurationGetArgs> qopConfiguration;

    public Input<LocationHdfsQopConfigurationGetArgs> getQopConfiguration() {
        return this.qopConfiguration == null ? Input.empty() : this.qopConfiguration;
    }

    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    @InputImport(name="replicationFactor")
    private final @Nullable Input<Integer> replicationFactor;

    public Input<Integer> getReplicationFactor() {
        return this.replicationFactor == null ? Input.empty() : this.replicationFactor;
    }

    /**
     * The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @InputImport(name="simpleUser")
    private final @Nullable Input<String> simpleUser;

    public Input<String> getSimpleUser() {
        return this.simpleUser == null ? Input.empty() : this.simpleUser;
    }

    /**
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn't specified, it will default to /.
     * 
     */
    @InputImport(name="subdirectory")
    private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public LocationHdfsState(
        @Nullable Input<List<String>> agentArns,
        @Nullable Input<String> arn,
        @Nullable Input<String> authenticationType,
        @Nullable Input<Integer> blockSize,
        @Nullable Input<String> kerberosKeytab,
        @Nullable Input<String> kerberosKrb5Conf,
        @Nullable Input<String> kerberosPrincipal,
        @Nullable Input<String> kmsKeyProviderUri,
        @Nullable Input<List<LocationHdfsNameNodeGetArgs>> nameNodes,
        @Nullable Input<LocationHdfsQopConfigurationGetArgs> qopConfiguration,
        @Nullable Input<Integer> replicationFactor,
        @Nullable Input<String> simpleUser,
        @Nullable Input<String> subdirectory,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> uri) {
        this.agentArns = agentArns;
        this.arn = arn;
        this.authenticationType = authenticationType;
        this.blockSize = blockSize;
        this.kerberosKeytab = kerberosKeytab;
        this.kerberosKrb5Conf = kerberosKrb5Conf;
        this.kerberosPrincipal = kerberosPrincipal;
        this.kmsKeyProviderUri = kmsKeyProviderUri;
        this.nameNodes = nameNodes;
        this.qopConfiguration = qopConfiguration;
        this.replicationFactor = replicationFactor;
        this.simpleUser = simpleUser;
        this.subdirectory = subdirectory;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uri = uri;
    }

    private LocationHdfsState() {
        this.agentArns = Input.empty();
        this.arn = Input.empty();
        this.authenticationType = Input.empty();
        this.blockSize = Input.empty();
        this.kerberosKeytab = Input.empty();
        this.kerberosKrb5Conf = Input.empty();
        this.kerberosPrincipal = Input.empty();
        this.kmsKeyProviderUri = Input.empty();
        this.nameNodes = Input.empty();
        this.qopConfiguration = Input.empty();
        this.replicationFactor = Input.empty();
        this.simpleUser = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> agentArns;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> authenticationType;
        private @Nullable Input<Integer> blockSize;
        private @Nullable Input<String> kerberosKeytab;
        private @Nullable Input<String> kerberosKrb5Conf;
        private @Nullable Input<String> kerberosPrincipal;
        private @Nullable Input<String> kmsKeyProviderUri;
        private @Nullable Input<List<LocationHdfsNameNodeGetArgs>> nameNodes;
        private @Nullable Input<LocationHdfsQopConfigurationGetArgs> qopConfiguration;
        private @Nullable Input<Integer> replicationFactor;
        private @Nullable Input<String> simpleUser;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.arn = defaults.arn;
    	      this.authenticationType = defaults.authenticationType;
    	      this.blockSize = defaults.blockSize;
    	      this.kerberosKeytab = defaults.kerberosKeytab;
    	      this.kerberosKrb5Conf = defaults.kerberosKrb5Conf;
    	      this.kerberosPrincipal = defaults.kerberosPrincipal;
    	      this.kmsKeyProviderUri = defaults.kmsKeyProviderUri;
    	      this.nameNodes = defaults.nameNodes;
    	      this.qopConfiguration = defaults.qopConfiguration;
    	      this.replicationFactor = defaults.replicationFactor;
    	      this.simpleUser = defaults.simpleUser;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uri = defaults.uri;
        }

        public Builder setAgentArns(@Nullable Input<List<String>> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = Input.ofNullable(agentArns);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<String> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setBlockSize(@Nullable Input<Integer> blockSize) {
            this.blockSize = blockSize;
            return this;
        }

        public Builder setBlockSize(@Nullable Integer blockSize) {
            this.blockSize = Input.ofNullable(blockSize);
            return this;
        }

        public Builder setKerberosKeytab(@Nullable Input<String> kerberosKeytab) {
            this.kerberosKeytab = kerberosKeytab;
            return this;
        }

        public Builder setKerberosKeytab(@Nullable String kerberosKeytab) {
            this.kerberosKeytab = Input.ofNullable(kerberosKeytab);
            return this;
        }

        public Builder setKerberosKrb5Conf(@Nullable Input<String> kerberosKrb5Conf) {
            this.kerberosKrb5Conf = kerberosKrb5Conf;
            return this;
        }

        public Builder setKerberosKrb5Conf(@Nullable String kerberosKrb5Conf) {
            this.kerberosKrb5Conf = Input.ofNullable(kerberosKrb5Conf);
            return this;
        }

        public Builder setKerberosPrincipal(@Nullable Input<String> kerberosPrincipal) {
            this.kerberosPrincipal = kerberosPrincipal;
            return this;
        }

        public Builder setKerberosPrincipal(@Nullable String kerberosPrincipal) {
            this.kerberosPrincipal = Input.ofNullable(kerberosPrincipal);
            return this;
        }

        public Builder setKmsKeyProviderUri(@Nullable Input<String> kmsKeyProviderUri) {
            this.kmsKeyProviderUri = kmsKeyProviderUri;
            return this;
        }

        public Builder setKmsKeyProviderUri(@Nullable String kmsKeyProviderUri) {
            this.kmsKeyProviderUri = Input.ofNullable(kmsKeyProviderUri);
            return this;
        }

        public Builder setNameNodes(@Nullable Input<List<LocationHdfsNameNodeGetArgs>> nameNodes) {
            this.nameNodes = nameNodes;
            return this;
        }

        public Builder setNameNodes(@Nullable List<LocationHdfsNameNodeGetArgs> nameNodes) {
            this.nameNodes = Input.ofNullable(nameNodes);
            return this;
        }

        public Builder setQopConfiguration(@Nullable Input<LocationHdfsQopConfigurationGetArgs> qopConfiguration) {
            this.qopConfiguration = qopConfiguration;
            return this;
        }

        public Builder setQopConfiguration(@Nullable LocationHdfsQopConfigurationGetArgs qopConfiguration) {
            this.qopConfiguration = Input.ofNullable(qopConfiguration);
            return this;
        }

        public Builder setReplicationFactor(@Nullable Input<Integer> replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }

        public Builder setReplicationFactor(@Nullable Integer replicationFactor) {
            this.replicationFactor = Input.ofNullable(replicationFactor);
            return this;
        }

        public Builder setSimpleUser(@Nullable Input<String> simpleUser) {
            this.simpleUser = simpleUser;
            return this;
        }

        public Builder setSimpleUser(@Nullable String simpleUser) {
            this.simpleUser = Input.ofNullable(simpleUser);
            return this;
        }

        public Builder setSubdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder setSubdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public LocationHdfsState build() {
            return new LocationHdfsState(agentArns, arn, authenticationType, blockSize, kerberosKeytab, kerberosKrb5Conf, kerberosPrincipal, kmsKeyProviderUri, nameNodes, qopConfiguration, replicationFactor, simpleUser, subdirectory, tags, tagsAll, uri);
        }
    }
}