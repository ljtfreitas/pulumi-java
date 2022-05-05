// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opsworks.StackArgs;
import com.pulumi.aws.opsworks.inputs.StackState;
import com.pulumi.aws.opsworks.outputs.StackCustomCookbooksSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an OpsWorks stack resource.
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
 *         var main = new Stack(&#34;main&#34;, StackArgs.builder()        
 *             .region(&#34;us-west-1&#34;)
 *             .serviceRoleArn(aws_iam_role.getOpsworks().getArn())
 *             .defaultInstanceProfileArn(aws_iam_instance_profile.getOpsworks().getArn())
 *             .tags(Map.of(&#34;Name&#34;, &#34;foobar-stack&#34;))
 *             .customJson(&#34;&#34;&#34;
 * {
 *  &#34;foobar&#34;: {
 *     &#34;version&#34;: &#34;1.0.0&#34;
 *   }
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * OpsWorks stacks can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:opsworks/stack:Stack bar 00000000-0000-0000-0000-000000000000
 * ```
 * 
 */
@ResourceType(type="aws:opsworks/stack:Stack")
public class Stack extends com.pulumi.resources.CustomResource {
    /**
     * If set to `&#34;LATEST&#34;`, OpsWorks will automatically install the latest version.
     * 
     */
    @Export(name="agentVersion", type=String.class, parameters={})
    private Output<String> agentVersion;

    /**
     * @return If set to `&#34;LATEST&#34;`, OpsWorks will automatically install the latest version.
     * 
     */
    public Output<String> agentVersion() {
        return this.agentVersion;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * If `manage_berkshelf` is enabled, the version of Berkshelf to use.
     * 
     */
    @Export(name="berkshelfVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> berkshelfVersion;

    /**
     * @return If `manage_berkshelf` is enabled, the version of Berkshelf to use.
     * 
     */
    public Output<Optional<String>> berkshelfVersion() {
        return Codegen.optional(this.berkshelfVersion);
    }
    /**
     * Color to paint next to the stack&#39;s resources in the OpsWorks console.
     * 
     */
    @Export(name="color", type=String.class, parameters={})
    private Output</* @Nullable */ String> color;

    /**
     * @return Color to paint next to the stack&#39;s resources in the OpsWorks console.
     * 
     */
    public Output<Optional<String>> color() {
        return Codegen.optional(this.color);
    }
    /**
     * Name of the configuration manager to use. Defaults to &#34;Chef&#34;.
     * 
     */
    @Export(name="configurationManagerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationManagerName;

    /**
     * @return Name of the configuration manager to use. Defaults to &#34;Chef&#34;.
     * 
     */
    public Output<Optional<String>> configurationManagerName() {
        return Codegen.optional(this.configurationManagerName);
    }
    /**
     * Version of the configuration manager to use. Defaults to &#34;11.4&#34;.
     * 
     */
    @Export(name="configurationManagerVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> configurationManagerVersion;

    /**
     * @return Version of the configuration manager to use. Defaults to &#34;11.4&#34;.
     * 
     */
    public Output<Optional<String>> configurationManagerVersion() {
        return Codegen.optional(this.configurationManagerVersion);
    }
    /**
     * When `use_custom_cookbooks` is set, provide this sub-object as
     * described below.
     * 
     */
    @Export(name="customCookbooksSources", type=List.class, parameters={StackCustomCookbooksSource.class})
    private Output<List<StackCustomCookbooksSource>> customCookbooksSources;

    /**
     * @return When `use_custom_cookbooks` is set, provide this sub-object as
     * described below.
     * 
     */
    public Output<List<StackCustomCookbooksSource>> customCookbooksSources() {
        return this.customCookbooksSources;
    }
    /**
     * Custom JSON attributes to apply to the entire stack.
     * 
     */
    @Export(name="customJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> customJson;

    /**
     * @return Custom JSON attributes to apply to the entire stack.
     * 
     */
    public Output<Optional<String>> customJson() {
        return Codegen.optional(this.customJson);
    }
    /**
     * Name of the availability zone where instances will be created
     * by default. This is required unless you set `vpc_id`.
     * 
     */
    @Export(name="defaultAvailabilityZone", type=String.class, parameters={})
    private Output<String> defaultAvailabilityZone;

    /**
     * @return Name of the availability zone where instances will be created
     * by default. This is required unless you set `vpc_id`.
     * 
     */
    public Output<String> defaultAvailabilityZone() {
        return this.defaultAvailabilityZone;
    }
    /**
     * The ARN of an IAM Instance Profile that created instances
     * will have by default.
     * 
     */
    @Export(name="defaultInstanceProfileArn", type=String.class, parameters={})
    private Output<String> defaultInstanceProfileArn;

    /**
     * @return The ARN of an IAM Instance Profile that created instances
     * will have by default.
     * 
     */
    public Output<String> defaultInstanceProfileArn() {
        return this.defaultInstanceProfileArn;
    }
    /**
     * Name of OS that will be installed on instances by default.
     * 
     */
    @Export(name="defaultOs", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultOs;

    /**
     * @return Name of OS that will be installed on instances by default.
     * 
     */
    public Output<Optional<String>> defaultOs() {
        return Codegen.optional(this.defaultOs);
    }
    /**
     * Name of the type of root device instances will have by default.
     * 
     */
    @Export(name="defaultRootDeviceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRootDeviceType;

    /**
     * @return Name of the type of root device instances will have by default.
     * 
     */
    public Output<Optional<String>> defaultRootDeviceType() {
        return Codegen.optional(this.defaultRootDeviceType);
    }
    /**
     * Name of the SSH keypair that instances will have by default.
     * 
     */
    @Export(name="defaultSshKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultSshKeyName;

    /**
     * @return Name of the SSH keypair that instances will have by default.
     * 
     */
    public Output<Optional<String>> defaultSshKeyName() {
        return Codegen.optional(this.defaultSshKeyName);
    }
    /**
     * Id of the subnet in which instances will be created by default. Mandatory
     * if `vpc_id` is set, and forbidden if it isn&#39;t.
     * 
     */
    @Export(name="defaultSubnetId", type=String.class, parameters={})
    private Output<String> defaultSubnetId;

    /**
     * @return Id of the subnet in which instances will be created by default. Mandatory
     * if `vpc_id` is set, and forbidden if it isn&#39;t.
     * 
     */
    public Output<String> defaultSubnetId() {
        return this.defaultSubnetId;
    }
    /**
     * Keyword representing the naming scheme that will be used for instance hostnames
     * within this stack.
     * 
     */
    @Export(name="hostnameTheme", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostnameTheme;

    /**
     * @return Keyword representing the naming scheme that will be used for instance hostnames
     * within this stack.
     * 
     */
    public Output<Optional<String>> hostnameTheme() {
        return Codegen.optional(this.hostnameTheme);
    }
    /**
     * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
     * 
     */
    @Export(name="manageBerkshelf", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> manageBerkshelf;

    /**
     * @return Boolean value controlling whether Opsworks will run Berkshelf for this stack.
     * 
     */
    public Output<Optional<Boolean>> manageBerkshelf() {
        return Codegen.optional(this.manageBerkshelf);
    }
    /**
     * The name of the stack.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the stack.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the region where the stack will exist.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The name of the region where the stack will exist.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The ARN of an IAM role that the OpsWorks service will act as.
     * 
     */
    @Export(name="serviceRoleArn", type=String.class, parameters={})
    private Output<String> serviceRoleArn;

    /**
     * @return The ARN of an IAM role that the OpsWorks service will act as.
     * 
     */
    public Output<String> serviceRoleArn() {
        return this.serviceRoleArn;
    }
    @Export(name="stackEndpoint", type=String.class, parameters={})
    private Output<String> stackEndpoint;

    public Output<String> stackEndpoint() {
        return this.stackEndpoint;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Boolean value controlling whether the custom cookbook settings are
     * enabled.
     * 
     */
    @Export(name="useCustomCookbooks", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useCustomCookbooks;

    /**
     * @return Boolean value controlling whether the custom cookbook settings are
     * enabled.
     * 
     */
    public Output<Optional<Boolean>> useCustomCookbooks() {
        return Codegen.optional(this.useCustomCookbooks);
    }
    /**
     * Boolean value controlling whether the standard OpsWorks
     * security groups apply to created instances.
     * 
     */
    @Export(name="useOpsworksSecurityGroups", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useOpsworksSecurityGroups;

    /**
     * @return Boolean value controlling whether the standard OpsWorks
     * security groups apply to created instances.
     * 
     */
    public Output<Optional<Boolean>> useOpsworksSecurityGroups() {
        return Codegen.optional(this.useOpsworksSecurityGroups);
    }
    /**
     * The id of the VPC that this stack belongs to.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The id of the VPC that this stack belongs to.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stack(String name) {
        this(name, StackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stack(String name, StackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stack(String name, StackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/stack:Stack", name, args == null ? StackArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stack(String name, Output<String> id, @Nullable StackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/stack:Stack", name, state, makeResourceOptions(options, id));
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
    public static Stack get(String name, Output<String> id, @Nullable StackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stack(name, id, state, options);
    }
}
