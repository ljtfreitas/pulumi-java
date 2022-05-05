// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.athena.DatabaseArgs;
import com.pulumi.aws.athena.inputs.DatabaseState;
import com.pulumi.aws.athena.outputs.DatabaseAclConfiguration;
import com.pulumi.aws.athena.outputs.DatabaseEncryptionConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Athena database.
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleDatabase = new Database(&#34;exampleDatabase&#34;, DatabaseArgs.builder()        
 *             .name(&#34;database_name&#34;)
 *             .bucket(exampleBucketV2.getBucket())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Athena Databases can be imported using their name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:athena/database:Database example example
 * ```
 * 
 *  Certain resource arguments, like `encryption_configuration` and `bucket`, do not have an API method for reading the information after creation. If the argument is set in the Terraform configuration on an imported resource, Terraform will always show a difference. To workaround this behavior, either omit the argument from the Terraform configuration or use [`ignore_changes`](https://www.terraform.io/docs/configuration/meta-arguments/lifecycle.html#ignore_changes) to hide the difference, e.g., terraform resource &#34;aws_athena_database&#34; &#34;example&#34; {
 * 
 *  name
 * 
 *  = &#34;database_name&#34;
 * 
 *  bucket = aws_s3_bucket.example.bucket
 * 
 * # There is no API for reading bucket
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [bucket]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:athena/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * 
     */
    @Export(name="aclConfiguration", type=DatabaseAclConfiguration.class, parameters={})
    private Output</* @Nullable */ DatabaseAclConfiguration> aclConfiguration;

    /**
     * @return Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * 
     */
    public Output<Optional<DatabaseAclConfiguration>> aclConfiguration() {
        return Codegen.optional(this.aclConfiguration);
    }
    /**
     * Name of S3 bucket to save the results of the query execution.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucket;

    /**
     * @return Name of S3 bucket to save the results of the query execution.
     * 
     */
    public Output<Optional<String>> bucket() {
        return Codegen.optional(this.bucket);
    }
    /**
     * Description of the database.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Description of the database.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
     * 
     */
    @Export(name="encryptionConfiguration", type=DatabaseEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ DatabaseEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
     * 
     */
    public Output<Optional<DatabaseEncryptionConfiguration>> encryptionConfiguration() {
        return Codegen.optional(this.encryptionConfiguration);
    }
    /**
     * The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
     * 
     */
    @Export(name="expectedBucketOwner", type=String.class, parameters={})
    private Output</* @Nullable */ String> expectedBucketOwner;

    /**
     * @return The AWS account ID that you expect to be the owner of the Amazon S3 bucket.
     * 
     */
    public Output<Optional<String>> expectedBucketOwner() {
        return Codegen.optional(this.expectedBucketOwner);
    }
    /**
     * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * Name of the database to create.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the database to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A key-value map of custom metadata properties for the database definition.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> properties;

    /**
     * @return A key-value map of custom metadata properties for the database definition.
     * 
     */
    public Output<Optional<Map<String,String>>> properties() {
        return Codegen.optional(this.properties);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, @Nullable DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, @Nullable DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/database:Database", name, state, makeResourceOptions(options, id));
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
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
