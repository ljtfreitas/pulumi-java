// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cfg.OrganizationConformancePackArgs;
import com.pulumi.aws.cfg.inputs.OrganizationConformancePackState;
import com.pulumi.aws.cfg.outputs.OrganizationConformancePackInputParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Config Organization Conformance Pack. More information can be found in the [Managing Conformance Packs Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/conformance-pack-organization-apis.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. Example conformance pack templates may be found in the [AWS Config Rules Repository](https://github.com/awslabs/aws-config-rules/tree/master/aws-config-conformance-packs).
 * 
 * &gt; **NOTE:** This resource must be created in the Organization master account or a delegated administrator account, and the Organization must have all features enabled. Every Organization account except those configured in the `excluded_accounts` argument must have a Configuration Recorder with proper IAM permissions before the Organization Conformance Pack will successfully create or update. See also the `aws.cfg.Recorder` resource.
 * 
 * ## Example Usage
 * ### Using Template Body
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
 *         var exampleOrganization = new Organization(&#34;exampleOrganization&#34;, OrganizationArgs.builder()        
 *             .awsServiceAccessPrincipals(&#34;config-multiaccountsetup.amazonaws.com&#34;)
 *             .featureSet(&#34;ALL&#34;)
 *             .build());
 * 
 *         var exampleOrganizationConformancePack = new OrganizationConformancePack(&#34;exampleOrganizationConformancePack&#34;, OrganizationConformancePackArgs.builder()        
 *             .inputParameters(OrganizationConformancePackInputParameter.builder()
 *                 .parameterName(&#34;AccessKeysRotatedParameterMaxAccessKeyAge&#34;)
 *                 .parameterValue(&#34;90&#34;)
 *                 .build())
 *             .templateBody(&#34;&#34;&#34;
 * Parameters:
 *   AccessKeysRotatedParameterMaxAccessKeyAge:
 *     Type: String
 * Resources:
 *   IAMPasswordPolicy:
 *     Properties:
 *       ConfigRuleName: IAMPasswordPolicy
 *       Source:
 *         Owner: AWS
 *         SourceIdentifier: IAM_PASSWORD_POLICY
 *     Type: AWS::Config::ConfigRule
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Using Template S3 URI
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
 *         var exampleOrganization = new Organization(&#34;exampleOrganization&#34;, OrganizationArgs.builder()        
 *             .awsServiceAccessPrincipals(&#34;config-multiaccountsetup.amazonaws.com&#34;)
 *             .featureSet(&#34;ALL&#34;)
 *             .build());
 * 
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .bucket(exampleBucketV2.getId())
 *             .key(&#34;example-key&#34;)
 *             .content(&#34;&#34;&#34;
 * Resources:
 *   IAMPasswordPolicy:
 *     Properties:
 *       ConfigRuleName: IAMPasswordPolicy
 *       Source:
 *         Owner: AWS
 *         SourceIdentifier: IAM_PASSWORD_POLICY
 *     Type: AWS::Config::ConfigRule
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleOrganizationConformancePack = new OrganizationConformancePack(&#34;exampleOrganizationConformancePack&#34;, OrganizationConformancePackArgs.builder()        
 *             .templateS3Uri(Output.tuple(exampleBucketV2.getBucket(), exampleBucketObjectv2.getKey()).apply(values -&gt; {
 *                 var bucket = values.t1;
 *                 var key = values.t2;
 *                 return String.format(&#34;s3://%s/%s&#34;, bucket,key);
 *             }))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Config Organization Conformance Packs can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cfg/organizationConformancePack:OrganizationConformancePack example example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/organizationConformancePack:OrganizationConformancePack")
public class OrganizationConformancePack extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the organization conformance pack.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the organization conformance pack.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Amazon S3 bucket where AWS Config stores conformance pack templates. Delivery bucket must begin with `awsconfigconforms` prefix. Maximum length of 63.
     * 
     */
    @Export(name="deliveryS3Bucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryS3Bucket;

    /**
     * @return Amazon S3 bucket where AWS Config stores conformance pack templates. Delivery bucket must begin with `awsconfigconforms` prefix. Maximum length of 63.
     * 
     */
    public Output<Optional<String>> deliveryS3Bucket() {
        return Codegen.optional(this.deliveryS3Bucket);
    }
    /**
     * The prefix for the Amazon S3 bucket. Maximum length of 1024.
     * 
     */
    @Export(name="deliveryS3KeyPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryS3KeyPrefix;

    /**
     * @return The prefix for the Amazon S3 bucket. Maximum length of 1024.
     * 
     */
    public Output<Optional<String>> deliveryS3KeyPrefix() {
        return Codegen.optional(this.deliveryS3KeyPrefix);
    }
    /**
     * Set of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack. Maximum of 1000 accounts.
     * 
     */
    @Export(name="excludedAccounts", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> excludedAccounts;

    /**
     * @return Set of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack. Maximum of 1000 accounts.
     * 
     */
    public Output<Optional<List<String>>> excludedAccounts() {
        return Codegen.optional(this.excludedAccounts);
    }
    /**
     * Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `template_body` or in the template stored in Amazon S3 if using `template_s3_uri`.
     * 
     */
    @Export(name="inputParameters", type=List.class, parameters={OrganizationConformancePackInputParameter.class})
    private Output</* @Nullable */ List<OrganizationConformancePackInputParameter>> inputParameters;

    /**
     * @return Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `template_body` or in the template stored in Amazon S3 if using `template_s3_uri`.
     * 
     */
    public Output<Optional<List<OrganizationConformancePackInputParameter>>> inputParameters() {
        return Codegen.optional(this.inputParameters);
    }
    /**
     * The name of the organization conformance pack. Must begin with a letter and contain from 1 to 128 alphanumeric characters and hyphens.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the organization conformance pack. Must begin with a letter and contain from 1 to 128 alphanumeric characters and hyphens.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A string containing full conformance pack template body. Maximum length of 51200. Drift detection is not possible with this argument.
     * 
     */
    @Export(name="templateBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateBody;

    /**
     * @return A string containing full conformance pack template body. Maximum length of 51200. Drift detection is not possible with this argument.
     * 
     */
    public Output<Optional<String>> templateBody() {
        return Codegen.optional(this.templateBody);
    }
    /**
     * Location of file, e.g., `s3://bucketname/prefix`, containing the template body. The uri must point to the conformance pack template that is located in an Amazon S3 bucket in the same region as the conformance pack. Maximum length of 1024. Drift detection is not possible with this argument.
     * 
     */
    @Export(name="templateS3Uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateS3Uri;

    /**
     * @return Location of file, e.g., `s3://bucketname/prefix`, containing the template body. The uri must point to the conformance pack template that is located in an Amazon S3 bucket in the same region as the conformance pack. Maximum length of 1024. Drift detection is not possible with this argument.
     * 
     */
    public Output<Optional<String>> templateS3Uri() {
        return Codegen.optional(this.templateS3Uri);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationConformancePack(String name) {
        this(name, OrganizationConformancePackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationConformancePack(String name, @Nullable OrganizationConformancePackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationConformancePack(String name, @Nullable OrganizationConformancePackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/organizationConformancePack:OrganizationConformancePack", name, args == null ? OrganizationConformancePackArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationConformancePack(String name, Output<String> id, @Nullable OrganizationConformancePackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/organizationConformancePack:OrganizationConformancePack", name, state, makeResourceOptions(options, id));
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
    public static OrganizationConformancePack get(String name, Output<String> id, @Nullable OrganizationConformancePackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationConformancePack(name, id, state, options);
    }
}
