// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.datasync.inputs.LocationHdfsNameNodeArgs;
import io.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationHdfsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationHdfsArgs Empty = new LocationHdfsArgs();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @Import(name="agentArns", required=true)
      private final Output<List<String>> agentArns;

    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }

    /**
     * The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<String> authenticationType;

    public Output<String> getAuthenticationType() {
        return this.authenticationType == null ? Output.empty() : this.authenticationType;
    }

    /**
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    @Import(name="blockSize")
      private final @Nullable Output<Integer> blockSize;

    public Output<Integer> getBlockSize() {
        return this.blockSize == null ? Output.empty() : this.blockSize;
    }

    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="kerberosKeytab")
      private final @Nullable Output<String> kerberosKeytab;

    public Output<String> getKerberosKeytab() {
        return this.kerberosKeytab == null ? Output.empty() : this.kerberosKeytab;
    }

    /**
     * The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="kerberosKrb5Conf")
      private final @Nullable Output<String> kerberosKrb5Conf;

    public Output<String> getKerberosKrb5Conf() {
        return this.kerberosKrb5Conf == null ? Output.empty() : this.kerberosKrb5Conf;
    }

    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="kerberosPrincipal")
      private final @Nullable Output<String> kerberosPrincipal;

    public Output<String> getKerberosPrincipal() {
        return this.kerberosPrincipal == null ? Output.empty() : this.kerberosPrincipal;
    }

    /**
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * 
     */
    @Import(name="kmsKeyProviderUri")
      private final @Nullable Output<String> kmsKeyProviderUri;

    public Output<String> getKmsKeyProviderUri() {
        return this.kmsKeyProviderUri == null ? Output.empty() : this.kmsKeyProviderUri;
    }

    /**
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    @Import(name="nameNodes", required=true)
      private final Output<List<LocationHdfsNameNodeArgs>> nameNodes;

    public Output<List<LocationHdfsNameNodeArgs>> getNameNodes() {
        return this.nameNodes;
    }

    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If QopConfiguration isn't specified, RpcProtection and DataTransferProtection default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    @Import(name="qopConfiguration")
      private final @Nullable Output<LocationHdfsQopConfigurationArgs> qopConfiguration;

    public Output<LocationHdfsQopConfigurationArgs> getQopConfiguration() {
        return this.qopConfiguration == null ? Output.empty() : this.qopConfiguration;
    }

    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    @Import(name="replicationFactor")
      private final @Nullable Output<Integer> replicationFactor;

    public Output<Integer> getReplicationFactor() {
        return this.replicationFactor == null ? Output.empty() : this.replicationFactor;
    }

    /**
     * The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Import(name="simpleUser")
      private final @Nullable Output<String> simpleUser;

    public Output<String> getSimpleUser() {
        return this.simpleUser == null ? Output.empty() : this.simpleUser;
    }

    /**
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn't specified, it will default to /.
     * 
     */
    @Import(name="subdirectory")
      private final @Nullable Output<String> subdirectory;

    public Output<String> getSubdirectory() {
        return this.subdirectory == null ? Output.empty() : this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public LocationHdfsArgs(
        Output<List<String>> agentArns,
        @Nullable Output<String> authenticationType,
        @Nullable Output<Integer> blockSize,
        @Nullable Output<String> kerberosKeytab,
        @Nullable Output<String> kerberosKrb5Conf,
        @Nullable Output<String> kerberosPrincipal,
        @Nullable Output<String> kmsKeyProviderUri,
        Output<List<LocationHdfsNameNodeArgs>> nameNodes,
        @Nullable Output<LocationHdfsQopConfigurationArgs> qopConfiguration,
        @Nullable Output<Integer> replicationFactor,
        @Nullable Output<String> simpleUser,
        @Nullable Output<String> subdirectory,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
        this.authenticationType = authenticationType;
        this.blockSize = blockSize;
        this.kerberosKeytab = kerberosKeytab;
        this.kerberosKrb5Conf = kerberosKrb5Conf;
        this.kerberosPrincipal = kerberosPrincipal;
        this.kmsKeyProviderUri = kmsKeyProviderUri;
        this.nameNodes = Objects.requireNonNull(nameNodes, "expected parameter 'nameNodes' to be non-null");
        this.qopConfiguration = qopConfiguration;
        this.replicationFactor = replicationFactor;
        this.simpleUser = simpleUser;
        this.subdirectory = subdirectory;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private LocationHdfsArgs() {
        this.agentArns = Output.empty();
        this.authenticationType = Output.empty();
        this.blockSize = Output.empty();
        this.kerberosKeytab = Output.empty();
        this.kerberosKrb5Conf = Output.empty();
        this.kerberosPrincipal = Output.empty();
        this.kmsKeyProviderUri = Output.empty();
        this.nameNodes = Output.empty();
        this.qopConfiguration = Output.empty();
        this.replicationFactor = Output.empty();
        this.simpleUser = Output.empty();
        this.subdirectory = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> agentArns;
        private @Nullable Output<String> authenticationType;
        private @Nullable Output<Integer> blockSize;
        private @Nullable Output<String> kerberosKeytab;
        private @Nullable Output<String> kerberosKrb5Conf;
        private @Nullable Output<String> kerberosPrincipal;
        private @Nullable Output<String> kmsKeyProviderUri;
        private Output<List<LocationHdfsNameNodeArgs>> nameNodes;
        private @Nullable Output<LocationHdfsQopConfigurationArgs> qopConfiguration;
        private @Nullable Output<Integer> replicationFactor;
        private @Nullable Output<String> simpleUser;
        private @Nullable Output<String> subdirectory;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
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
        }

        public Builder agentArns(Output<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }

        public Builder agentArns(List<String> agentArns) {
            this.agentArns = Output.of(Objects.requireNonNull(agentArns));
            return this;
        }

        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = Output.ofNullable(authenticationType);
            return this;
        }

        public Builder blockSize(@Nullable Output<Integer> blockSize) {
            this.blockSize = blockSize;
            return this;
        }

        public Builder blockSize(@Nullable Integer blockSize) {
            this.blockSize = Output.ofNullable(blockSize);
            return this;
        }

        public Builder kerberosKeytab(@Nullable Output<String> kerberosKeytab) {
            this.kerberosKeytab = kerberosKeytab;
            return this;
        }

        public Builder kerberosKeytab(@Nullable String kerberosKeytab) {
            this.kerberosKeytab = Output.ofNullable(kerberosKeytab);
            return this;
        }

        public Builder kerberosKrb5Conf(@Nullable Output<String> kerberosKrb5Conf) {
            this.kerberosKrb5Conf = kerberosKrb5Conf;
            return this;
        }

        public Builder kerberosKrb5Conf(@Nullable String kerberosKrb5Conf) {
            this.kerberosKrb5Conf = Output.ofNullable(kerberosKrb5Conf);
            return this;
        }

        public Builder kerberosPrincipal(@Nullable Output<String> kerberosPrincipal) {
            this.kerberosPrincipal = kerberosPrincipal;
            return this;
        }

        public Builder kerberosPrincipal(@Nullable String kerberosPrincipal) {
            this.kerberosPrincipal = Output.ofNullable(kerberosPrincipal);
            return this;
        }

        public Builder kmsKeyProviderUri(@Nullable Output<String> kmsKeyProviderUri) {
            this.kmsKeyProviderUri = kmsKeyProviderUri;
            return this;
        }

        public Builder kmsKeyProviderUri(@Nullable String kmsKeyProviderUri) {
            this.kmsKeyProviderUri = Output.ofNullable(kmsKeyProviderUri);
            return this;
        }

        public Builder nameNodes(Output<List<LocationHdfsNameNodeArgs>> nameNodes) {
            this.nameNodes = Objects.requireNonNull(nameNodes);
            return this;
        }

        public Builder nameNodes(List<LocationHdfsNameNodeArgs> nameNodes) {
            this.nameNodes = Output.of(Objects.requireNonNull(nameNodes));
            return this;
        }

        public Builder qopConfiguration(@Nullable Output<LocationHdfsQopConfigurationArgs> qopConfiguration) {
            this.qopConfiguration = qopConfiguration;
            return this;
        }

        public Builder qopConfiguration(@Nullable LocationHdfsQopConfigurationArgs qopConfiguration) {
            this.qopConfiguration = Output.ofNullable(qopConfiguration);
            return this;
        }

        public Builder replicationFactor(@Nullable Output<Integer> replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }

        public Builder replicationFactor(@Nullable Integer replicationFactor) {
            this.replicationFactor = Output.ofNullable(replicationFactor);
            return this;
        }

        public Builder simpleUser(@Nullable Output<String> simpleUser) {
            this.simpleUser = simpleUser;
            return this;
        }

        public Builder simpleUser(@Nullable String simpleUser) {
            this.simpleUser = Output.ofNullable(simpleUser);
            return this;
        }

        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder subdirectory(@Nullable String subdirectory) {
            this.subdirectory = Output.ofNullable(subdirectory);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public LocationHdfsArgs build() {
            return new LocationHdfsArgs(agentArns, authenticationType, blockSize, kerberosKeytab, kerberosKrb5Conf, kerberosPrincipal, kmsKeyProviderUri, nameNodes, qopConfiguration, replicationFactor, simpleUser, subdirectory, tags, tagsAll);
        }
    }
}
