// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dms.EndpointArgs;
import com.pulumi.aws.dms.inputs.EndpointState;
import com.pulumi.aws.dms.outputs.EndpointElasticsearchSettings;
import com.pulumi.aws.dms.outputs.EndpointKafkaSettings;
import com.pulumi.aws.dms.outputs.EndpointKinesisSettings;
import com.pulumi.aws.dms.outputs.EndpointMongodbSettings;
import com.pulumi.aws.dms.outputs.EndpointS3Settings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DMS (Data Migration Service) endpoint resource. DMS endpoints can be created, updated, deleted, and imported.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new Endpoint(&#34;test&#34;, EndpointArgs.builder()        
 *             .certificateArn(&#34;arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012&#34;)
 *             .databaseName(&#34;test&#34;)
 *             .endpointId(&#34;test-dms-endpoint-tf&#34;)
 *             .endpointType(&#34;source&#34;)
 *             .engineName(&#34;aurora&#34;)
 *             .extraConnectionAttributes(&#34;&#34;)
 *             .kmsKeyArn(&#34;arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012&#34;)
 *             .password(&#34;test&#34;)
 *             .port(3306)
 *             .serverName(&#34;test&#34;)
 *             .sslMode(&#34;none&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;test&#34;))
 *             .username(&#34;test&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Endpoints can be imported using the `endpoint_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dms/endpoint:Endpoint test test-dms-endpoint-tf
 * ```
 * 
 */
@ResourceType(type="aws:dms/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    /**
     * ARN for the certificate.
     * 
     */
    @Export(name="certificateArn", type=String.class, parameters={})
    private Output<String> certificateArn;

    /**
     * @return ARN for the certificate.
     * 
     */
    public Output<String> certificateArn() {
        return this.certificateArn;
    }
    /**
     * Name of the endpoint database.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return Name of the endpoint database.
     * 
     */
    public Output<Optional<String>> databaseName() {
        return Codegen.optional(this.databaseName);
    }
    /**
     * Configuration block for OpenSearch settings. See below.
     * 
     */
    @Export(name="elasticsearchSettings", type=EndpointElasticsearchSettings.class, parameters={})
    private Output</* @Nullable */ EndpointElasticsearchSettings> elasticsearchSettings;

    /**
     * @return Configuration block for OpenSearch settings. See below.
     * 
     */
    public Output<Optional<EndpointElasticsearchSettings>> elasticsearchSettings() {
        return Codegen.optional(this.elasticsearchSettings);
    }
    /**
     * ARN for the endpoint.
     * 
     */
    @Export(name="endpointArn", type=String.class, parameters={})
    private Output<String> endpointArn;

    /**
     * @return ARN for the endpoint.
     * 
     */
    public Output<String> endpointArn() {
        return this.endpointArn;
    }
    /**
     * Database endpoint identifier. Identifiers must contain from 1 to 255 alphanumeric characters or hyphens, begin with a letter, contain only ASCII letters, digits, and hyphens, not end with a hyphen, and not contain two consecutive hyphens.
     * 
     */
    @Export(name="endpointId", type=String.class, parameters={})
    private Output<String> endpointId;

    /**
     * @return Database endpoint identifier. Identifiers must contain from 1 to 255 alphanumeric characters or hyphens, begin with a letter, contain only ASCII letters, digits, and hyphens, not end with a hyphen, and not contain two consecutive hyphens.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * Type of endpoint. Valid values are `source`, `target`.
     * 
     */
    @Export(name="endpointType", type=String.class, parameters={})
    private Output<String> endpointType;

    /**
     * @return Type of endpoint. Valid values are `source`, `target`.
     * 
     */
    public Output<String> endpointType() {
        return this.endpointType;
    }
    /**
     * Type of engine for the endpoint. Valid values are `aurora`, `aurora-postgresql`, `azuredb`, `db2`, `docdb`, `dynamodb`, `elasticsearch`, `kafka`, `kinesis`, `mariadb`, `mongodb`, `mysql`, `opensearch`, `oracle`, `postgres`, `redshift`, `s3`, `sqlserver`, `sybase`.
     * 
     */
    @Export(name="engineName", type=String.class, parameters={})
    private Output<String> engineName;

    /**
     * @return Type of engine for the endpoint. Valid values are `aurora`, `aurora-postgresql`, `azuredb`, `db2`, `docdb`, `dynamodb`, `elasticsearch`, `kafka`, `kinesis`, `mariadb`, `mongodb`, `mysql`, `opensearch`, `oracle`, `postgres`, `redshift`, `s3`, `sqlserver`, `sybase`.
     * 
     */
    public Output<String> engineName() {
        return this.engineName;
    }
    /**
     * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib).
     * 
     */
    @Export(name="extraConnectionAttributes", type=String.class, parameters={})
    private Output<String> extraConnectionAttributes;

    /**
     * @return Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib).
     * 
     */
    public Output<String> extraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }
    /**
     * Configuration block for Kafka settings. See below.
     * 
     */
    @Export(name="kafkaSettings", type=EndpointKafkaSettings.class, parameters={})
    private Output</* @Nullable */ EndpointKafkaSettings> kafkaSettings;

    /**
     * @return Configuration block for Kafka settings. See below.
     * 
     */
    public Output<Optional<EndpointKafkaSettings>> kafkaSettings() {
        return Codegen.optional(this.kafkaSettings);
    }
    /**
     * Configuration block for Kinesis settings. See below.
     * 
     */
    @Export(name="kinesisSettings", type=EndpointKinesisSettings.class, parameters={})
    private Output</* @Nullable */ EndpointKinesisSettings> kinesisSettings;

    /**
     * @return Configuration block for Kinesis settings. See below.
     * 
     */
    public Output<Optional<EndpointKinesisSettings>> kinesisSettings() {
        return Codegen.optional(this.kinesisSettings);
    }
    /**
     * ARN for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output<String> kmsKeyArn;

    /**
     * @return ARN for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Configuration block for MongoDB settings. See below.
     * 
     */
    @Export(name="mongodbSettings", type=EndpointMongodbSettings.class, parameters={})
    private Output</* @Nullable */ EndpointMongodbSettings> mongodbSettings;

    /**
     * @return Configuration block for MongoDB settings. See below.
     * 
     */
    public Output<Optional<EndpointMongodbSettings>> mongodbSettings() {
        return Codegen.optional(this.mongodbSettings);
    }
    /**
     * Password to be used to login to the endpoint database.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return Password to be used to login to the endpoint database.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Port used by the endpoint database.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port used by the endpoint database.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Configuration block for S3 settings. See below.
     * 
     */
    @Export(name="s3Settings", type=EndpointS3Settings.class, parameters={})
    private Output</* @Nullable */ EndpointS3Settings> s3Settings;

    /**
     * @return Configuration block for S3 settings. See below.
     * 
     */
    public Output<Optional<EndpointS3Settings>> s3Settings() {
        return Codegen.optional(this.s3Settings);
    }
    /**
     * ARN of the IAM role that specifies AWS DMS as the trusted entity and has the required permissions to access the value in SecretsManagerSecret.
     * 
     */
    @Export(name="secretsManagerAccessRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretsManagerAccessRoleArn;

    /**
     * @return ARN of the IAM role that specifies AWS DMS as the trusted entity and has the required permissions to access the value in SecretsManagerSecret.
     * 
     */
    public Output<Optional<String>> secretsManagerAccessRoleArn() {
        return Codegen.optional(this.secretsManagerAccessRoleArn);
    }
    /**
     * Full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the endpoint connection details. Supported only for `engine_name` as `oracle` and `postgres`.
     * 
     */
    @Export(name="secretsManagerArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretsManagerArn;

    /**
     * @return Full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the endpoint connection details. Supported only for `engine_name` as `oracle` and `postgres`.
     * 
     */
    public Output<Optional<String>> secretsManagerArn() {
        return Codegen.optional(this.secretsManagerArn);
    }
    /**
     * Host name of the server.
     * 
     */
    @Export(name="serverName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverName;

    /**
     * @return Host name of the server.
     * 
     */
    public Output<Optional<String>> serverName() {
        return Codegen.optional(this.serverName);
    }
    /**
     * ARN used by the service access IAM role for dynamodb endpoints.
     * 
     */
    @Export(name="serviceAccessRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccessRole;

    /**
     * @return ARN used by the service access IAM role for dynamodb endpoints.
     * 
     */
    public Output<Optional<String>> serviceAccessRole() {
        return Codegen.optional(this.serviceAccessRole);
    }
    /**
     * SSL mode to use for the connection. Valid values are `none`, `require`, `verify-ca`, `verify-full`
     * 
     */
    @Export(name="sslMode", type=String.class, parameters={})
    private Output<String> sslMode;

    /**
     * @return SSL mode to use for the connection. Valid values are `none`, `require`, `verify-ca`, `verify-full`
     * 
     */
    public Output<String> sslMode() {
        return this.sslMode;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * User name to be used to login to the endpoint database.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output</* @Nullable */ String> username;

    /**
     * @return User name to be used to login to the endpoint database.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
