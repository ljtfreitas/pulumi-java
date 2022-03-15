// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointKafkaSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointKafkaSettingsArgs Empty = new EndpointKafkaSettingsArgs();

    /**
     * Kafka broker location. Specify in the form broker-hostname-or-ip:port.
     * 
     */
    @Import(name="broker", required=true)
      private final Output<String> broker;

    public Output<String> getBroker() {
        return this.broker;
    }

    /**
     * Shows detailed control information for table definition, column definition, and table and column changes in the Kafka message output. The default is `false`.
     * 
     */
    @Import(name="includeControlDetails")
      private final @Nullable Output<Boolean> includeControlDetails;

    public Output<Boolean> getIncludeControlDetails() {
        return this.includeControlDetails == null ? Output.empty() : this.includeControlDetails;
    }

    /**
     * Include NULL and empty columns for records migrated to the endpoint. The default is `false`.
     * 
     */
    @Import(name="includeNullAndEmpty")
      private final @Nullable Output<Boolean> includeNullAndEmpty;

    public Output<Boolean> getIncludeNullAndEmpty() {
        return this.includeNullAndEmpty == null ? Output.empty() : this.includeNullAndEmpty;
    }

    /**
     * Shows the partition value within the Kafka message output unless the partition type is `schema-table-type`. The default is `false`.
     * 
     */
    @Import(name="includePartitionValue")
      private final @Nullable Output<Boolean> includePartitionValue;

    public Output<Boolean> getIncludePartitionValue() {
        return this.includePartitionValue == null ? Output.empty() : this.includePartitionValue;
    }

    /**
     * Includes any data definition language (DDL) operations that change the table in the control data, such as `rename-table`, `drop-table`, `add-column`, `drop-column`, and `rename-column`. The default is `false`.
     * 
     */
    @Import(name="includeTableAlterOperations")
      private final @Nullable Output<Boolean> includeTableAlterOperations;

    public Output<Boolean> getIncludeTableAlterOperations() {
        return this.includeTableAlterOperations == null ? Output.empty() : this.includeTableAlterOperations;
    }

    /**
     * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for `transaction_id`, previous `transaction_id`, and `transaction_record_id` (the record offset within a transaction). The default is `false`.
     * 
     */
    @Import(name="includeTransactionDetails")
      private final @Nullable Output<Boolean> includeTransactionDetails;

    public Output<Boolean> getIncludeTransactionDetails() {
        return this.includeTransactionDetails == null ? Output.empty() : this.includeTransactionDetails;
    }

    /**
     * The output format for the records created on the endpoint. The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
     * 
     */
    @Import(name="messageFormat")
      private final @Nullable Output<String> messageFormat;

    public Output<String> getMessageFormat() {
        return this.messageFormat == null ? Output.empty() : this.messageFormat;
    }

    /**
     * The maximum size in bytes for records created on the endpoint The default is `1,000,000`.
     * 
     */
    @Import(name="messageMaxBytes")
      private final @Nullable Output<Integer> messageMaxBytes;

    public Output<Integer> getMessageMaxBytes() {
        return this.messageMaxBytes == null ? Output.empty() : this.messageMaxBytes;
    }

    /**
     * Set this optional parameter to true to avoid adding a '0x' prefix to raw data in hexadecimal format. For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal format moving from an Oracle source to a Kafka target. Use the `no_hex_prefix` endpoint setting to enable migration of RAW data type columns without adding the `'0x'` prefix.
     * 
     */
    @Import(name="noHexPrefix")
      private final @Nullable Output<Boolean> noHexPrefix;

    public Output<Boolean> getNoHexPrefix() {
        return this.noHexPrefix == null ? Output.empty() : this.noHexPrefix;
    }

    /**
     * Prefixes schema and table names to partition values, when the partition type is `primary-key-type`. Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same partition, which causes throttling. The default is `false`.
     * 
     */
    @Import(name="partitionIncludeSchemaTable")
      private final @Nullable Output<Boolean> partitionIncludeSchemaTable;

    public Output<Boolean> getPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable == null ? Output.empty() : this.partitionIncludeSchemaTable;
    }

    /**
     * The secure password you created when you first set up your MSK cluster to validate a client identity and make an encrypted connection between server and client using SASL-SSL authentication.
     * 
     */
    @Import(name="saslPassword")
      private final @Nullable Output<String> saslPassword;

    public Output<String> getSaslPassword() {
        return this.saslPassword == null ? Output.empty() : this.saslPassword;
    }

    /**
     * The secure user name you created when you first set up your MSK cluster to validate a client identity and make an encrypted connection between server and client using SASL-SSL authentication.
     * 
     */
    @Import(name="saslUsername")
      private final @Nullable Output<String> saslUsername;

    public Output<String> getSaslUsername() {
        return this.saslUsername == null ? Output.empty() : this.saslUsername;
    }

    /**
     * Set secure connection to a Kafka target endpoint using Transport Layer Security (TLS). Options include `ssl-encryption`, `ssl-authentication`, and `sasl-ssl`. `sasl-ssl` requires `sasl_username` and `sasl_password`.
     * 
     */
    @Import(name="securityProtocol")
      private final @Nullable Output<String> securityProtocol;

    public Output<String> getSecurityProtocol() {
        return this.securityProtocol == null ? Output.empty() : this.securityProtocol;
    }

    /**
     * The Amazon Resource Name (ARN) for the private certificate authority (CA) cert that AWS DMS uses to securely connect to your Kafka target endpoint.
     * 
     */
    @Import(name="sslCaCertificateArn")
      private final @Nullable Output<String> sslCaCertificateArn;

    public Output<String> getSslCaCertificateArn() {
        return this.sslCaCertificateArn == null ? Output.empty() : this.sslCaCertificateArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the client certificate used to securely connect to a Kafka target endpoint.
     * 
     */
    @Import(name="sslClientCertificateArn")
      private final @Nullable Output<String> sslClientCertificateArn;

    public Output<String> getSslClientCertificateArn() {
        return this.sslClientCertificateArn == null ? Output.empty() : this.sslClientCertificateArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the client private key used to securely connect to a Kafka target endpoint.
     * 
     */
    @Import(name="sslClientKeyArn")
      private final @Nullable Output<String> sslClientKeyArn;

    public Output<String> getSslClientKeyArn() {
        return this.sslClientKeyArn == null ? Output.empty() : this.sslClientKeyArn;
    }

    /**
     * The password for the client private key used to securely connect to a Kafka target endpoint.
     * 
     */
    @Import(name="sslClientKeyPassword")
      private final @Nullable Output<String> sslClientKeyPassword;

    public Output<String> getSslClientKeyPassword() {
        return this.sslClientKeyPassword == null ? Output.empty() : this.sslClientKeyPassword;
    }

    /**
     * Kafka topic for migration. Defaults to `kafka-default-topic`.
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Output.empty() : this.topic;
    }

    public EndpointKafkaSettingsArgs(
        Output<String> broker,
        @Nullable Output<Boolean> includeControlDetails,
        @Nullable Output<Boolean> includeNullAndEmpty,
        @Nullable Output<Boolean> includePartitionValue,
        @Nullable Output<Boolean> includeTableAlterOperations,
        @Nullable Output<Boolean> includeTransactionDetails,
        @Nullable Output<String> messageFormat,
        @Nullable Output<Integer> messageMaxBytes,
        @Nullable Output<Boolean> noHexPrefix,
        @Nullable Output<Boolean> partitionIncludeSchemaTable,
        @Nullable Output<String> saslPassword,
        @Nullable Output<String> saslUsername,
        @Nullable Output<String> securityProtocol,
        @Nullable Output<String> sslCaCertificateArn,
        @Nullable Output<String> sslClientCertificateArn,
        @Nullable Output<String> sslClientKeyArn,
        @Nullable Output<String> sslClientKeyPassword,
        @Nullable Output<String> topic) {
        this.broker = Objects.requireNonNull(broker, "expected parameter 'broker' to be non-null");
        this.includeControlDetails = includeControlDetails;
        this.includeNullAndEmpty = includeNullAndEmpty;
        this.includePartitionValue = includePartitionValue;
        this.includeTableAlterOperations = includeTableAlterOperations;
        this.includeTransactionDetails = includeTransactionDetails;
        this.messageFormat = messageFormat;
        this.messageMaxBytes = messageMaxBytes;
        this.noHexPrefix = noHexPrefix;
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
        this.saslPassword = saslPassword;
        this.saslUsername = saslUsername;
        this.securityProtocol = securityProtocol;
        this.sslCaCertificateArn = sslCaCertificateArn;
        this.sslClientCertificateArn = sslClientCertificateArn;
        this.sslClientKeyArn = sslClientKeyArn;
        this.sslClientKeyPassword = sslClientKeyPassword;
        this.topic = topic;
    }

    private EndpointKafkaSettingsArgs() {
        this.broker = Output.empty();
        this.includeControlDetails = Output.empty();
        this.includeNullAndEmpty = Output.empty();
        this.includePartitionValue = Output.empty();
        this.includeTableAlterOperations = Output.empty();
        this.includeTransactionDetails = Output.empty();
        this.messageFormat = Output.empty();
        this.messageMaxBytes = Output.empty();
        this.noHexPrefix = Output.empty();
        this.partitionIncludeSchemaTable = Output.empty();
        this.saslPassword = Output.empty();
        this.saslUsername = Output.empty();
        this.securityProtocol = Output.empty();
        this.sslCaCertificateArn = Output.empty();
        this.sslClientCertificateArn = Output.empty();
        this.sslClientKeyArn = Output.empty();
        this.sslClientKeyPassword = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointKafkaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> broker;
        private @Nullable Output<Boolean> includeControlDetails;
        private @Nullable Output<Boolean> includeNullAndEmpty;
        private @Nullable Output<Boolean> includePartitionValue;
        private @Nullable Output<Boolean> includeTableAlterOperations;
        private @Nullable Output<Boolean> includeTransactionDetails;
        private @Nullable Output<String> messageFormat;
        private @Nullable Output<Integer> messageMaxBytes;
        private @Nullable Output<Boolean> noHexPrefix;
        private @Nullable Output<Boolean> partitionIncludeSchemaTable;
        private @Nullable Output<String> saslPassword;
        private @Nullable Output<String> saslUsername;
        private @Nullable Output<String> securityProtocol;
        private @Nullable Output<String> sslCaCertificateArn;
        private @Nullable Output<String> sslClientCertificateArn;
        private @Nullable Output<String> sslClientKeyArn;
        private @Nullable Output<String> sslClientKeyPassword;
        private @Nullable Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointKafkaSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.broker = defaults.broker;
    	      this.includeControlDetails = defaults.includeControlDetails;
    	      this.includeNullAndEmpty = defaults.includeNullAndEmpty;
    	      this.includePartitionValue = defaults.includePartitionValue;
    	      this.includeTableAlterOperations = defaults.includeTableAlterOperations;
    	      this.includeTransactionDetails = defaults.includeTransactionDetails;
    	      this.messageFormat = defaults.messageFormat;
    	      this.messageMaxBytes = defaults.messageMaxBytes;
    	      this.noHexPrefix = defaults.noHexPrefix;
    	      this.partitionIncludeSchemaTable = defaults.partitionIncludeSchemaTable;
    	      this.saslPassword = defaults.saslPassword;
    	      this.saslUsername = defaults.saslUsername;
    	      this.securityProtocol = defaults.securityProtocol;
    	      this.sslCaCertificateArn = defaults.sslCaCertificateArn;
    	      this.sslClientCertificateArn = defaults.sslClientCertificateArn;
    	      this.sslClientKeyArn = defaults.sslClientKeyArn;
    	      this.sslClientKeyPassword = defaults.sslClientKeyPassword;
    	      this.topic = defaults.topic;
        }

        public Builder broker(Output<String> broker) {
            this.broker = Objects.requireNonNull(broker);
            return this;
        }

        public Builder broker(String broker) {
            this.broker = Output.of(Objects.requireNonNull(broker));
            return this;
        }

        public Builder includeControlDetails(@Nullable Output<Boolean> includeControlDetails) {
            this.includeControlDetails = includeControlDetails;
            return this;
        }

        public Builder includeControlDetails(@Nullable Boolean includeControlDetails) {
            this.includeControlDetails = Output.ofNullable(includeControlDetails);
            return this;
        }

        public Builder includeNullAndEmpty(@Nullable Output<Boolean> includeNullAndEmpty) {
            this.includeNullAndEmpty = includeNullAndEmpty;
            return this;
        }

        public Builder includeNullAndEmpty(@Nullable Boolean includeNullAndEmpty) {
            this.includeNullAndEmpty = Output.ofNullable(includeNullAndEmpty);
            return this;
        }

        public Builder includePartitionValue(@Nullable Output<Boolean> includePartitionValue) {
            this.includePartitionValue = includePartitionValue;
            return this;
        }

        public Builder includePartitionValue(@Nullable Boolean includePartitionValue) {
            this.includePartitionValue = Output.ofNullable(includePartitionValue);
            return this;
        }

        public Builder includeTableAlterOperations(@Nullable Output<Boolean> includeTableAlterOperations) {
            this.includeTableAlterOperations = includeTableAlterOperations;
            return this;
        }

        public Builder includeTableAlterOperations(@Nullable Boolean includeTableAlterOperations) {
            this.includeTableAlterOperations = Output.ofNullable(includeTableAlterOperations);
            return this;
        }

        public Builder includeTransactionDetails(@Nullable Output<Boolean> includeTransactionDetails) {
            this.includeTransactionDetails = includeTransactionDetails;
            return this;
        }

        public Builder includeTransactionDetails(@Nullable Boolean includeTransactionDetails) {
            this.includeTransactionDetails = Output.ofNullable(includeTransactionDetails);
            return this;
        }

        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = Output.ofNullable(messageFormat);
            return this;
        }

        public Builder messageMaxBytes(@Nullable Output<Integer> messageMaxBytes) {
            this.messageMaxBytes = messageMaxBytes;
            return this;
        }

        public Builder messageMaxBytes(@Nullable Integer messageMaxBytes) {
            this.messageMaxBytes = Output.ofNullable(messageMaxBytes);
            return this;
        }

        public Builder noHexPrefix(@Nullable Output<Boolean> noHexPrefix) {
            this.noHexPrefix = noHexPrefix;
            return this;
        }

        public Builder noHexPrefix(@Nullable Boolean noHexPrefix) {
            this.noHexPrefix = Output.ofNullable(noHexPrefix);
            return this;
        }

        public Builder partitionIncludeSchemaTable(@Nullable Output<Boolean> partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
            return this;
        }

        public Builder partitionIncludeSchemaTable(@Nullable Boolean partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = Output.ofNullable(partitionIncludeSchemaTable);
            return this;
        }

        public Builder saslPassword(@Nullable Output<String> saslPassword) {
            this.saslPassword = saslPassword;
            return this;
        }

        public Builder saslPassword(@Nullable String saslPassword) {
            this.saslPassword = Output.ofNullable(saslPassword);
            return this;
        }

        public Builder saslUsername(@Nullable Output<String> saslUsername) {
            this.saslUsername = saslUsername;
            return this;
        }

        public Builder saslUsername(@Nullable String saslUsername) {
            this.saslUsername = Output.ofNullable(saslUsername);
            return this;
        }

        public Builder securityProtocol(@Nullable Output<String> securityProtocol) {
            this.securityProtocol = securityProtocol;
            return this;
        }

        public Builder securityProtocol(@Nullable String securityProtocol) {
            this.securityProtocol = Output.ofNullable(securityProtocol);
            return this;
        }

        public Builder sslCaCertificateArn(@Nullable Output<String> sslCaCertificateArn) {
            this.sslCaCertificateArn = sslCaCertificateArn;
            return this;
        }

        public Builder sslCaCertificateArn(@Nullable String sslCaCertificateArn) {
            this.sslCaCertificateArn = Output.ofNullable(sslCaCertificateArn);
            return this;
        }

        public Builder sslClientCertificateArn(@Nullable Output<String> sslClientCertificateArn) {
            this.sslClientCertificateArn = sslClientCertificateArn;
            return this;
        }

        public Builder sslClientCertificateArn(@Nullable String sslClientCertificateArn) {
            this.sslClientCertificateArn = Output.ofNullable(sslClientCertificateArn);
            return this;
        }

        public Builder sslClientKeyArn(@Nullable Output<String> sslClientKeyArn) {
            this.sslClientKeyArn = sslClientKeyArn;
            return this;
        }

        public Builder sslClientKeyArn(@Nullable String sslClientKeyArn) {
            this.sslClientKeyArn = Output.ofNullable(sslClientKeyArn);
            return this;
        }

        public Builder sslClientKeyPassword(@Nullable Output<String> sslClientKeyPassword) {
            this.sslClientKeyPassword = sslClientKeyPassword;
            return this;
        }

        public Builder sslClientKeyPassword(@Nullable String sslClientKeyPassword) {
            this.sslClientKeyPassword = Output.ofNullable(sslClientKeyPassword);
            return this;
        }

        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder topic(@Nullable String topic) {
            this.topic = Output.ofNullable(topic);
            return this;
        }
        public EndpointKafkaSettingsArgs build() {
            return new EndpointKafkaSettingsArgs(broker, includeControlDetails, includeNullAndEmpty, includePartitionValue, includeTableAlterOperations, includeTransactionDetails, messageFormat, messageMaxBytes, noHexPrefix, partitionIncludeSchemaTable, saslPassword, saslUsername, securityProtocol, sslCaCertificateArn, sslClientCertificateArn, sslClientKeyArn, sslClientKeyPassword, topic);
        }
    }
}
